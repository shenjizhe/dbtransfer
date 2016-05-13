package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.Assist;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * Assist的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class AssistMapper {

    @Autowired
    @Qualifier("jdbc_guoan_new_template")
    SqlSession sqlSession;

    public List<Assist> selectAllAssist(){
	return sqlSession.selectList("selectAllAssist", null);
    }
    
    public List<Assist> selectFilterAssist(){
	return sqlSession.selectList("selectFilterAssist", null);
    }

    public Assist selectAssistById(int Id){
	return sqlSession.selectOne("selectAssistById", Id);
    }
}
