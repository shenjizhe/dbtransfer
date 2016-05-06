package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.LeagueMatch;
import com.ninehcom.common.entity.PageParam;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * LeagueMatch的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class LeagueMatchMapper {

    @Autowired
    @Qualifier("jdbc_league_data_template")
    SqlSession sqlSession;

    public List<LeagueMatch> selectAllLeagueMatch(){
	return sqlSession.selectList("selectAllLeagueMatch", null);
    }

    public LeagueMatch selectLeagueMatchById(int Id){
	return sqlSession.selectOne("selectLeagueMatchById", Id);
    }

    public int insertLeagueMatch(LeagueMatch leagueMatch){
	return sqlSession.insert("insertLeagueMatch", leagueMatch);
    }

    public int updateLeagueMatch(LeagueMatch leagueMatch){
	return sqlSession.update("updateLeagueMatch", leagueMatch);
    }

    public int deleteLeagueMatchById(int Id){
	return sqlSession.delete("deleteLeagueMatchById", Id);
    }
}
