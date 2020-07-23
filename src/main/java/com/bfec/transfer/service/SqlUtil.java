/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bfec.transfer.service;

import com.bfec.common.entity.ColumnEntity;
import com.bfec.common.entity.TableEntity;
import com.bfec.transfer.exceptions.WhereFormatError;
import com.bfec.transfer.mapper.CommonMapper;
import com.bfec.common.enums.ErrorCode;
import com.bfec.common.util.Result;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author Shenjizhe
 */
@Service
public class SqlUtil {

    private Map<String, Map<String, List<String>>> dstableMap;
    @Autowired
    private CommonMapper commonMapper;
    @Autowired
    @Qualifier("sqlMap")
    SqlMap sqlMap;

    @PostConstruct
    private void init() throws SQLException {
        dstableMap = new HashMap();
        for (String dsName : sqlMap.getSqlMap().keySet()) {
            initDs(dsName);
        }
    }

    private void initDs(String dsName) {
        SqlSession session = sqlMap.getSession(dsName);
        Map tableMap = new HashMap();
        List<TableEntity> tables = commonMapper.selectAllTables(session);
        List<String> columns;
        String tableName;
        for (TableEntity table : tables) {
            tableName = table.getTABLE_NAME().toLowerCase();
            columns = new ArrayList();
            List<ColumnEntity> columnList = commonMapper.selectAllColumns(session, tableName);
            for (ColumnEntity column : columnList) {
                columns.add(column.getCOLUMN_NAME().toLowerCase());
            }
            tableMap.put(tableName, columns);
        }
        dstableMap.put(dsName, tableMap);
    }

    public Result checkTable(String dsName, String tableName) {
        boolean containTable = dstableMap.get(dsName).containsKey(tableName);
        if (containTable) {
            return Result.Success();
        } else {
            HashMap map = new HashMap();
            map.put("table", tableName);
            return Result.Fail(ErrorCode.TableNotContains, map);
        }
    }

    public Result checkColumns(String dsName, String tableName, Collection<String> columns) {
        Result ret = checkTable(dsName, tableName);
        boolean success = true;
        if (ret.isSuccess()) {
            List<String> columnList = dstableMap.get(dsName).get(tableName);
            ArrayList<String> list = new ArrayList();
            for (String column : columns) {
                column = column.toLowerCase();
                if (column.startsWith("+") || column.startsWith("-")) {
                    column = column.substring(1);
                }
                if (!columnList.contains(column)) {
                    success = false;
                    list.add(column);
                }
            }

            if (success) {
                ret = Result.Success();
            } else {
                ret = Result.Fail(ErrorCode.ColumnNotContains, list);
            }
        }
        return ret;
    }

    public Result checkWhere(String dsName, String table, String text) {
        if (text == null || "".equals(text.trim())) {
            return Result.Success(null);
        }
        try {
            WhereLogic logic = new WhereLogic(text);
            List<String> columns = new ArrayList();
            for (WhereExpression exp : logic.expressionList) {
                columns.add(exp.getKey());
            }
            Result result = checkColumns(dsName, table, columns);
            if (!result.isSuccess()) {
                return result;
            }

            return Result.Success(logic);
        } catch (WhereFormatError e) {
            return Result.Fail(ErrorCode.ConditionFail, e.getSql());
        }
    }

    public class WhereExpression implements Serializable {

        private final ReleationType[] BoolArray = new ReleationType[]{
            ReleationType.NotEqual1,
            ReleationType.NotEqual2,
            ReleationType.GreatEqualThan,
            ReleationType.LessEqualThan,
            ReleationType.Equal,
            ReleationType.GreatThan,
            ReleationType.LessThan,
            ReleationType.Between,
            ReleationType.Like,};

        private String key;
        private String value;
        private ReleationType releation;
        private ValueType valueType;
        private LogicType logicType;
        private String expression;

        private void init(String text, ReleationType split) throws WhereFormatError {
            this.expression = text;
            releation = split;
            String[] list = text.split(split.value);
            key = list[0].trim();
            value = list[1].trim();
            if (value.startsWith("'")) {
                valueType = ValueType.String;
            } else {
                try {
                    Long.parseLong(value);
                    Double.parseDouble(value);
                } catch (Exception ex) {
                    throw new WhereFormatError(text);
                }
                valueType = ValueType.Number;
            }

            if (key.startsWith("and")) {
                logicType = LogicType.And;
            } else if (key.startsWith("or")) {
                logicType = LogicType.Or;
            } else {
                logicType = LogicType.None;
            }
        }

        public WhereExpression(String text) throws WhereFormatError {
            ReleationType split = ReleationType.Between;
            int first = -1;
            int second = -1;
            for (ReleationType btext : BoolArray) {
                first = text.indexOf(btext.value);
                if (first >= 0) {
                    split = btext;
                    break;
                }
            }
            if (first >= 0) {
                for (ReleationType btext : BoolArray) {
                    second = text.indexOf(btext.value, first + split.value.length());
                    if (second >= 0) {
                        break;
                    }
                }
                if (second >= 0) {
                    throw new WhereFormatError(text);
                } else {
                    init(text, split);
                }
            } else {
                throw new WhereFormatError(text);
            }
        }

        /**
         * @return the key
         */
        public String getKey() {
            return key;
        }

        /**
         * @param key the key to set
         */
        public void setKey(String key) {
            this.key = key;
        }

        /**
         * @return the value
         */
        public String getValue() {
            return value;
        }

        /**
         * @param value the value to set
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * @return the releation
         */
        public ReleationType getReleation() {
            return releation;
        }

        /**
         * @param releation the releation to set
         */
        public void setReleation(ReleationType releation) {
            this.releation = releation;
        }

        /**
         * @return the valueType
         */
        public ValueType getValueType() {
            return valueType;
        }

        /**
         * @param valueType the valueType to set
         */
        public void setValueType(ValueType valueType) {
            this.valueType = valueType;
        }

        /**
         * @return the logicType
         */
        public LogicType getLogicType() {
            return logicType;
        }

        /**
         * @param logicType the logicType to set
         */
        public void setLogicType(LogicType logicType) {
            this.logicType = logicType;
        }

        /**
         * @return the expression
         */
        public String getExpression() {
            return expression;
        }

        /**
         * @param expression the expression to set
         */
        public void setExpression(String expression) {
            this.expression = expression;
        }
    }

    public class WhereLogic implements Serializable {

        private final String[] WrongWords = new String[]{"select", "update", "delete", "insert", "order by", "group by", "in"};

        private String expression;
        private List<WhereExpression> expressionList;

        private String formatText(String sql) {
            sql = sql.toLowerCase().trim().replace('\t', ' ').replace('"', '\'');
            return sql;
        }

        private String[] checkWrongWord(String sql) throws WhereFormatError {
            String[] list = sql.split("\'");
            int cv = sql.endsWith("\'") ? 0 : 1;
            if (list.length % 2 == cv) {
                for (int i = 0; i < list.length; i += 2) {
                    for (int j = 0; j < WrongWords.length; j++) {
                        if (list[i].contains(WrongWords[j])) {
                            throw new WhereFormatError(list[i]);
                        }
                    }
                }
                return list;
            } else {
                throw new WhereFormatError(sql);
            }
        }

        private String replaceBracket(String exp) throws WhereFormatError {
            String tempL = exp.replace("(", "");
            String tempR = exp.replace(")", "");
            if (tempL.length() == tempR.length()) {
                return exp.replace("(", " ").replace(")", " ");
            } else {
                throw new WhereFormatError(exp);
            }
        }

        private List<String> getExpressions(String exp) {
            List<String> exps = new ArrayList();
            String[] temps = exp.split("and");
            for (int i = 0; i < temps.length; i++) {
                String temp = temps[i];
                String[] ts = temp.split("or");
                if (ts.length == 1) {
                    exps.add(temp.trim());
                } else {
                    for (int j = 0; j < ts.length; j++) {
                        exps.add(ts[j].trim());
                    }
                }
            }
            return exps;
        }

        public WhereLogic(String text) throws WhereFormatError {
            expression = text;
            text = formatText(text);
            String[] list = checkWrongWord(text);
            text = replaceBracket(text);
            List<String> expList = getExpressions(text);
            expressionList = new ArrayList();
            for (String exp : expList) {
                expressionList.add(new WhereExpression(exp));
            }
        }

        /**
         * @return the expression
         */
        public String getExpression() {
            return expression;
        }

        /**
         * @param expression the expression to set
         */
        public void setExpression(String expression) {
            this.expression = expression;
        }

        /**
         * @return the expressionList
         */
        public List<WhereExpression> getExpressionList() {
            return expressionList;
        }

        /**
         * @param expressionList the expressionList to set
         */
        public void setExpressionList(List<WhereExpression> expressionList) {
            this.expressionList = expressionList;
        }
    }

    public enum ReleationType {

        Equal("="),
        NotEqual1("<>"),
        NotEqual2("!="),
        GreatThan(">"),
        LessThan("<"),
        GreatEqualThan(">="),
        LessEqualThan("<="),
        Between("between"),
        Like("like"),;
        private String value;

        private ReleationType(String text) {
            this.value = text;
        }

        /**
         * @return the value
         */
        public String getValue() {
            return value;
        }

        /**
         * @param value the value to set
         */
        public void setValue(String value) {
            this.value = value;
        }
    }

    public enum ValueType {

        String,
        Number
    }

    public enum LogicType {

        None,
        And,
        Or
    }
}
