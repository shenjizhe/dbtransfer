package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.Leagueevent;
import com.ninehcom.common.entity.PageParam;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Leagueevent的Mapper，用于Mybatis
 *
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class LeagueeventMapper {

    @Autowired
    @Qualifier("jdbc_guoan_new_template")
    SqlSession sqlSession;

    public List<Leagueevent> selectAllLeagueevent() {
        return sqlSession.selectList("selectAllLeagueevent", null);
    }

    public List<Leagueevent> selectFilterLeagueevent() {
        return sqlSession.selectList("selectFilterLeagueevent", null);
    }

    public Leagueevent selectLeagueeventById(int Id) {
        return sqlSession.selectOne("selectLeagueeventById", Id);
    }
}
