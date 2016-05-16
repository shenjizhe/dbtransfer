package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.Leaguedata;
import com.ninehcom.common.entity.PageParam;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * Leaguedata的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class LeaguedataMapper {

    @Autowired
    @Qualifier("jdbc_guoan_new_template")
    SqlSession sqlSession;

    public List<Leaguedata> selectAllLeaguedata(){
	return sqlSession.selectList("selectAllLeaguedata", null);
    }

    public Leaguedata selectLeaguedataById(int Id){
	return sqlSession.selectOne("selectLeaguedataById", Id);
    }
}
