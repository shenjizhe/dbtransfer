package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.DataLeagueRankGoal;
import com.ninehcom.transfer.interfaces.IMax;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * DataLeagueRankGoal的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class DataLeagueRankGoalMapper implements IMax{

    @Autowired
    @Qualifier("jdbc_league_data_template")
    SqlSession sqlSession;

    public List<DataLeagueRankGoal> selectAllDataLeagueRankGoal(){
	return sqlSession.selectList("selectAllDataLeagueRankGoal", null);
    }

    public DataLeagueRankGoal selectDataLeagueRankGoalById(int Id){
	return sqlSession.selectOne("selectDataLeagueRankGoalById", Id);
    }

    public int insertDataLeagueRankGoal(DataLeagueRankGoal dataLeagueRankGoal){
	return sqlSession.insert("insertDataLeagueRankGoal", dataLeagueRankGoal);
    }

    public int updateDataLeagueRankGoal(DataLeagueRankGoal dataLeagueRankGoal){
	return sqlSession.update("updateDataLeagueRankGoal", dataLeagueRankGoal);
    }

    public int deleteDataLeagueRankGoalById(int Id){
	return sqlSession.delete("deleteDataLeagueRankGoalById", Id);
    }

    @Override
    public int getMax() {
        return sqlSession.selectOne("selectGoalRankMaxId");
    }
}
