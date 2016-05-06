package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.DataLeagueRankPeace;
import com.ninehcom.common.entity.PageParam;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * DataLeagueRankPeace的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class DataLeagueRankPeaceMapper {

    @Autowired
    @Qualifier("jdbc_league_data_template")
    SqlSession sqlSession;

    public List<DataLeagueRankPeace> selectAllDataLeagueRankPeace(){
	return sqlSession.selectList("selectAllDataLeagueRankPeace", null);
    }

    public DataLeagueRankPeace selectDataLeagueRankPeaceById(int Id){
	return sqlSession.selectOne("selectDataLeagueRankPeaceById", Id);
    }

    public int insertDataLeagueRankPeace(DataLeagueRankPeace dataLeagueRankPeace){
	return sqlSession.insert("insertDataLeagueRankPeace", dataLeagueRankPeace);
    }

    public int updateDataLeagueRankPeace(DataLeagueRankPeace dataLeagueRankPeace){
	return sqlSession.update("updateDataLeagueRankPeace", dataLeagueRankPeace);
    }

    public int deleteDataLeagueRankPeaceById(int Id){
	return sqlSession.delete("deleteDataLeagueRankPeaceById", Id);
    }
}
