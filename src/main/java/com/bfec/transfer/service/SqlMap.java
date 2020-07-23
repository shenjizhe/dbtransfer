package com.bfec.transfer.service;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 *
 * @author Shenjizhe
 */
@Component("sqlMap")
public class SqlMap {

    private Map<String, SqlSession> sqlMap;
    @Autowired
    @Qualifier("jdbc_league_data_template")
    SqlSession jdbc_league_dataSession;

    @Autowired
    @Qualifier("jdbc_guoan_new_template")
    SqlSession jdbc_guoan_newSession;

    @PostConstruct
    private void init() {
        sqlMap = new HashMap();
        sqlMap.put("jdbc_league_data", jdbc_league_dataSession);
        sqlMap.put("jdbc_guoan_new", jdbc_guoan_newSession);

    }

    /**
     * @return the sqlMap
     */
    public Map<String, SqlSession> getSqlMap() {
        return sqlMap;
    }

    public void put(String dsName, SqlSession session) {
        sqlMap.put(dsName, session);
    }

    public SqlSession getSession(String dsName) {
        if (!sqlMap.containsKey(dsName)) {
            return null;
        } else {
            return sqlMap.get(dsName);
        }
    }
}

