package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.Leaguecalendar;
import com.ninehcom.common.entity.PageParam;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * Leaguecalendar的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class LeaguecalendarMapper {

    @Autowired
    @Qualifier("jdbc_guoan_new_template")
    SqlSession sqlSession;

    public List<Leaguecalendar> selectAllLeaguecalendar(){
	return sqlSession.selectList("selectAllLeaguecalendar", null);
    }
    
    public List<Leaguecalendar> selectLineLeaguecalendar(){
	return sqlSession.selectList("selectLineLeaguecalendar", null);
    }
    
    public List<Leaguecalendar> selectFilterLeaguecalendar(){
	return sqlSession.selectList("selectFilterLeaguecalendar", null);
    }

    public Leaguecalendar selectLeaguecalendarById(int Id){
	return sqlSession.selectOne("selectLeaguecalendarById", Id);
    }
}
