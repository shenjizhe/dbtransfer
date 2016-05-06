package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.DataLeagueRankClub;
import com.ninehcom.common.entity.PageParam;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * DataLeagueRankClub的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class DataLeagueRankClubMapper {

    @Autowired
    @Qualifier("jdbc_league_data_template")
    SqlSession sqlSession;

    public List<DataLeagueRankClub> selectAllDataLeagueRankClub(){
	return sqlSession.selectList("selectAllDataLeagueRankClub", null);
    }

    public DataLeagueRankClub selectDataLeagueRankClubById(int Id){
	return sqlSession.selectOne("selectDataLeagueRankClubById", Id);
    }

    public int insertDataLeagueRankClub(DataLeagueRankClub dataLeagueRankClub){
	return sqlSession.insert("insertDataLeagueRankClub", dataLeagueRankClub);
    }

    public int updateDataLeagueRankClub(DataLeagueRankClub dataLeagueRankClub){
	return sqlSession.update("updateDataLeagueRankClub", dataLeagueRankClub);
    }

    public int deleteDataLeagueRankClubById(int Id){
	return sqlSession.delete("deleteDataLeagueRankClubById", Id);
    }
}
