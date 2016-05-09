package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.Coachresume;
import com.ninehcom.common.entity.PageParam;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * Coachresume的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class CoachresumeMapper {

    @Autowired
    @Qualifier("jdbc_guoan_new_template")
    SqlSession sqlSession;

    public List<Coachresume> selectAllCoachresume(){
	return sqlSession.selectList("selectAllCoachresume", null);
    }

    public Coachresume selectCoachresumeById(int Id){
	return sqlSession.selectOne("selectCoachresumeById", Id);
    }
}
