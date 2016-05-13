package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.DataLeagueRankAssistant;
import com.ninehcom.transfer.interfaces.IMax;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * DataLeagueRankAssistant的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class DataLeagueRankAssistantMapper implements IMax{

    @Autowired
    @Qualifier("jdbc_league_data_template")
    SqlSession sqlSession;

    public List<DataLeagueRankAssistant> selectAllDataLeagueRankAssistant(){
	return sqlSession.selectList("selectAllDataLeagueRankAssistant", null);
    }

    public DataLeagueRankAssistant selectDataLeagueRankAssistantById(int Id){
	return sqlSession.selectOne("selectDataLeagueRankAssistantById", Id);
    }

    public int insertDataLeagueRankAssistant(DataLeagueRankAssistant dataLeagueRankAssistant){
	return sqlSession.insert("insertDataLeagueRankAssistant", dataLeagueRankAssistant);
    }

    public int updateDataLeagueRankAssistant(DataLeagueRankAssistant dataLeagueRankAssistant){
	return sqlSession.update("updateDataLeagueRankAssistant", dataLeagueRankAssistant);
    }

    public int deleteDataLeagueRankAssistantById(int Id){
	return sqlSession.delete("deleteDataLeagueRankAssistantById", Id);
    }

    @Override
    public int getMax() {
        return sqlSession.selectOne("selectAssistantRankMaxId");
    }
}
