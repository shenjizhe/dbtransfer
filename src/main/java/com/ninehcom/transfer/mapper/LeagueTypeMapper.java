package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.LeagueType;
import com.ninehcom.common.entity.PageParam;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * LeagueType的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class LeagueTypeMapper {

    @Autowired
    @Qualifier("jdbc_league_data_template")
    SqlSession sqlSession;

    public List<LeagueType> selectAllLeagueType(){
	return sqlSession.selectList("selectAllLeagueType", null);
    }

    public LeagueType selectLeagueTypeById(int Id){
	return sqlSession.selectOne("selectLeagueTypeById", Id);
    }

    public int insertLeagueType(LeagueType leagueType){
	return sqlSession.insert("insertLeagueType", leagueType);
    }

    public int updateLeagueType(LeagueType leagueType){
	return sqlSession.update("updateLeagueType", leagueType);
    }

    public int deleteLeagueTypeById(int Id){
	return sqlSession.delete("deleteLeagueTypeById", Id);
    }
}
