package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.DataLeagueReClub;
import com.ninehcom.common.entity.PageParam;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * DataLeagueReClub的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class DataLeagueReClubMapper {

    @Autowired
    @Qualifier("jdbc_league_data_template")
    SqlSession sqlSession;

    public List<DataLeagueReClub> selectAllDataLeagueReClub(){
	return sqlSession.selectList("selectAllDataLeagueReClub", null);
    }

    public DataLeagueReClub selectDataLeagueReClubById(int Id){
	return sqlSession.selectOne("selectDataLeagueReClubById", Id);
    }

    public int insertDataLeagueReClub(DataLeagueReClub dataLeagueReClub){
	return sqlSession.insert("insertDataLeagueReClub", dataLeagueReClub);
    }

    public int updateDataLeagueReClub(DataLeagueReClub dataLeagueReClub){
	return sqlSession.update("updateDataLeagueReClub", dataLeagueReClub);
    }

    public int deleteDataLeagueReClubById(int Id){
	return sqlSession.delete("deleteDataLeagueReClubById", Id);
    }
}
