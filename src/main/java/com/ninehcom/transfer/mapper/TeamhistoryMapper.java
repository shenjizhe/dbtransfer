package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.Teamhistory;
import com.ninehcom.common.entity.PageParam;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * Teamhistory的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class TeamhistoryMapper {

    @Autowired
    @Qualifier("jdbc_guoan_new_template")
    SqlSession sqlSession;

    public List<Teamhistory> selectAllTeamhistory(){
	return sqlSession.selectList("selectAllTeamhistory", null);
    }

    public Teamhistory selectTeamhistoryById(int Id){
	return sqlSession.selectOne("selectTeamhistoryById", Id);
    }
}
