package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.Team;
import com.ninehcom.common.entity.PageParam;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * Team的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class TeamMapper {

    @Autowired
    @Qualifier("jdbc_guoan_new_template")
    SqlSession sqlSession;

    public List<Team> selectAllTeam(){
	return sqlSession.selectList("selectAllTeam", null);
    }

    public Team selectTeamById(int Id){
	return sqlSession.selectOne("selectTeamById", Id);
    }
}
