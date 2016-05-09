package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.CoachHistoryMapping;
import com.ninehcom.common.entity.PageParam;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * CoachHistoryMapping的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class CoachHistoryMappingMapper {

    @Autowired
    @Qualifier("jdbc_league_data_template")
    SqlSession sqlSession;

    public List<CoachHistoryMapping> selectAllCoachHistoryMapping(){
	return sqlSession.selectList("selectAllCoachHistoryMapping", null);
    }

    public CoachHistoryMapping selectCoachHistoryMappingById(int Id){
	return sqlSession.selectOne("selectCoachHistoryMappingById", Id);
    }

    public int insertCoachHistoryMapping(CoachHistoryMapping coachHistoryMapping){
	return sqlSession.insert("insertCoachHistoryMapping", coachHistoryMapping);
    }

    public int updateCoachHistoryMapping(CoachHistoryMapping coachHistoryMapping){
	return sqlSession.update("updateCoachHistoryMapping", coachHistoryMapping);
    }

    public int deleteCoachHistoryMappingById(int Id){
	return sqlSession.delete("deleteCoachHistoryMappingById", Id);
    }
}
