package com.bfec.transfer.mapper;

import com.bfec.common.entity.ColumnEntity;
import com.bfec.common.entity.TableEntity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

/**
 * CommonMapper，用于Mybatis
 *
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class CommonMapper {

    public List select(SqlSession sqlSession, Map request) {
        return sqlSession.selectList("select", request);
    }

    public int insert(SqlSession sqlSession, String table, Map request) {
        Map map = new HashMap();
        ArrayList keys = new ArrayList(request.keySet());
        ArrayList values = new ArrayList(request.values());
        map.put("table", table);
        map.put("keys", keys);
        map.put("values", values);
        return sqlSession.insert("insert", map);
    }

    public int update(SqlSession sqlSession, String table, Map request, String condition) {
        Map map = new HashMap();
        map.put("table", table);
        map.put("map", request);
        map.put("condition", condition);
        return sqlSession.update("update", map);
    }

    public int delete(SqlSession sqlSession, String table, String condition) {
        Map map = new HashMap();
        map.put("table", table);
        map.put("condition", condition);
        return sqlSession.delete("delete", map);
    }

    public List<TableEntity> selectAllTables(SqlSession sqlSession) {
        return sqlSession.selectList("selectAllTables");
    }

    public List<ColumnEntity> selectAllColumns(SqlSession sqlSession, String tableName) {
        return sqlSession.selectList("selectAllColumns", tableName);
    }
}
