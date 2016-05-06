package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.DataLeagueRankClubGuest;
import com.ninehcom.common.entity.PageParam;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * DataLeagueRankClubGuest的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class DataLeagueRankClubGuestMapper {

    @Autowired
    @Qualifier("jdbc_league_data_template")
    SqlSession sqlSession;

    public List<DataLeagueRankClubGuest> selectAllDataLeagueRankClubGuest(){
	return sqlSession.selectList("selectAllDataLeagueRankClubGuest", null);
    }

    public DataLeagueRankClubGuest selectDataLeagueRankClubGuestById(int Id){
	return sqlSession.selectOne("selectDataLeagueRankClubGuestById", Id);
    }

    public int insertDataLeagueRankClubGuest(DataLeagueRankClubGuest dataLeagueRankClubGuest){
	return sqlSession.insert("insertDataLeagueRankClubGuest", dataLeagueRankClubGuest);
    }

    public int updateDataLeagueRankClubGuest(DataLeagueRankClubGuest dataLeagueRankClubGuest){
	return sqlSession.update("updateDataLeagueRankClubGuest", dataLeagueRankClubGuest);
    }

    public int deleteDataLeagueRankClubGuestById(int Id){
	return sqlSession.delete("deleteDataLeagueRankClubGuestById", Id);
    }
}
