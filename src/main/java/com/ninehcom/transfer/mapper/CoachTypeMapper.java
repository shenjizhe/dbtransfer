package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.CoachType;
import com.ninehcom.common.entity.PageParam;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * CoachType的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class CoachTypeMapper {

    @Autowired
    @Qualifier("jdbc_league_data_template")
    SqlSession sqlSession;

    public List<CoachType> selectAllCoachType(){
	return sqlSession.selectList("selectAllCoachType", null);
    }

    public CoachType selectCoachTypeById(int Id){
	return sqlSession.selectOne("selectCoachTypeById", Id);
    }

    public int insertCoachType(CoachType coachType){
	return sqlSession.insert("insertCoachType", coachType);
    }

    public int updateCoachType(CoachType coachType){
	return sqlSession.update("updateCoachType", coachType);
    }

    public int deleteCoachTypeById(int Id){
	return sqlSession.delete("deleteCoachTypeById", Id);
    }
}
