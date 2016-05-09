package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.Coach;
import com.ninehcom.common.entity.PageParam;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * Coach的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class CoachMapper {

    @Autowired
    @Qualifier("jdbc_guoan_new_template")
    SqlSession sqlSession;

    public List<Coach> selectAllCoach(){
	return sqlSession.selectList("selectAllCoach", null);
    }

    public Coach selectCoachById(int Id){
	return sqlSession.selectOne("selectCoachById", Id);
    }
}
