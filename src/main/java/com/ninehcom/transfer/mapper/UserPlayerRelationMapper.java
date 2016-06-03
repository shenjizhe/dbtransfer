package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.UserPlayerRelation;
import com.ninehcom.common.entity.PageParam;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * UserPlayerRelation的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class UserPlayerRelationMapper {

    @Autowired
    @Qualifier("jdbc_guoan_new_template")
    SqlSession sqlSession;

    public List<UserPlayerRelation> selectAllUserPlayerRelation(){
	return sqlSession.selectList("selectAllUserPlayerRelation", null);
    }

    public int updateUserPlayerRelation(UserPlayerRelation userPlayerRelation){
	return sqlSession.update("updateUserPlayerRelation", userPlayerRelation);
    }
}
