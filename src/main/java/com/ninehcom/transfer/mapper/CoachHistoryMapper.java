package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.CoachHistory;
import com.ninehcom.common.entity.PageParam;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * CoachHistory的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class CoachHistoryMapper {

    @Autowired
    @Qualifier("jdbc_league_data_template")
    SqlSession sqlSession;

    public List<CoachHistory> selectAllCoachHistory(){
	return sqlSession.selectList("selectAllCoachHistory", null);
    }

    public CoachHistory selectCoachHistoryById(int Id){
	return sqlSession.selectOne("selectCoachHistoryById", Id);
    }

    public int insertCoachHistory(CoachHistory coachHistory){
	return sqlSession.insert("insertCoachHistory", coachHistory);
    }

    public int updateCoachHistory(CoachHistory coachHistory){
	return sqlSession.update("updateCoachHistory", coachHistory);
    }

    public int deleteCoachHistoryById(int Id){
	return sqlSession.delete("deleteCoachHistoryById", Id);
    }
}
