package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.DataLeagueRankClubHome;
import com.ninehcom.common.entity.PageParam;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * DataLeagueRankClubHome的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class DataLeagueRankClubHomeMapper {

    @Autowired
    @Qualifier("jdbc_league_data_template")
    SqlSession sqlSession;

    public List<DataLeagueRankClubHome> selectAllDataLeagueRankClubHome(){
	return sqlSession.selectList("selectAllDataLeagueRankClubHome", null);
    }

    public DataLeagueRankClubHome selectDataLeagueRankClubHomeById(int Id){
	return sqlSession.selectOne("selectDataLeagueRankClubHomeById", Id);
    }

    public int insertDataLeagueRankClubHome(DataLeagueRankClubHome dataLeagueRankClubHome){
	return sqlSession.insert("insertDataLeagueRankClubHome", dataLeagueRankClubHome);
    }

    public int updateDataLeagueRankClubHome(DataLeagueRankClubHome dataLeagueRankClubHome){
	return sqlSession.update("updateDataLeagueRankClubHome", dataLeagueRankClubHome);
    }

    public int deleteDataLeagueRankClubHomeById(int Id){
	return sqlSession.delete("deleteDataLeagueRankClubHomeById", Id);
    }
}
