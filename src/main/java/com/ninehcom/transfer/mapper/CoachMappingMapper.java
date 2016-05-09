package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.CoachMapping;
import com.ninehcom.common.entity.PageParam;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * CoachMapping的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class CoachMappingMapper {

    @Autowired
    @Qualifier("jdbc_league_data_template")
    SqlSession sqlSession;

    public List<CoachMapping> selectAllCoachMapping(){
	return sqlSession.selectList("selectAllCoachMapping", null);
    }

    public CoachMapping selectCoachMappingById(int Id){
	return sqlSession.selectOne("selectCoachMappingById", Id);
    }

    public int insertCoachMapping(CoachMapping coachMapping){
	return sqlSession.insert("insertCoachMapping", coachMapping);
    }

    public int updateCoachMapping(CoachMapping coachMapping){
	return sqlSession.update("updateCoachMapping", coachMapping);
    }

    public int deleteCoachMappingById(int Id){
	return sqlSession.delete("deleteCoachMappingById", Id);
    }
}
