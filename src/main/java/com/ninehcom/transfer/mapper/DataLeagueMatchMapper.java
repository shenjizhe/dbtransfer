package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.DataLeagueMatch;
import com.ninehcom.common.entity.PageParam;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * DataLeagueMatch的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class DataLeagueMatchMapper {

    @Autowired
    @Qualifier("jdbc_league_data_template")
    SqlSession sqlSession;

    public List<DataLeagueMatch> selectAllDataLeagueMatch(){
	return sqlSession.selectList("selectAllDataLeagueMatch", null);
    }

    public DataLeagueMatch selectDataLeagueMatchById(int Id){
	return sqlSession.selectOne("selectDataLeagueMatchById", Id);
    }

    public int insertDataLeagueMatch(DataLeagueMatch dataLeagueMatch){
	return sqlSession.insert("insertDataLeagueMatch", dataLeagueMatch);
    }

    public int updateDataLeagueMatch(DataLeagueMatch dataLeagueMatch){
	return sqlSession.update("updateDataLeagueMatch", dataLeagueMatch);
    }

    public int deleteDataLeagueMatchById(int Id){
	return sqlSession.delete("deleteDataLeagueMatchById", Id);
    }
}
