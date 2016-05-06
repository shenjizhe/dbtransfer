package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.StateType;
import com.ninehcom.common.entity.PageParam;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * StateType的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class StateTypeMapper {

    @Autowired
    @Qualifier("jdbc_league_data_template")
    SqlSession sqlSession;

    public List<StateType> selectAllStateType(){
	return sqlSession.selectList("selectAllStateType", null);
    }

    public StateType selectStateTypeById(int Id){
	return sqlSession.selectOne("selectStateTypeById", Id);
    }

    public int insertStateType(StateType stateType){
	return sqlSession.insert("insertStateType", stateType);
    }

    public int updateStateType(StateType stateType){
	return sqlSession.update("updateStateType", stateType);
    }

    public int deleteStateTypeById(int Id){
	return sqlSession.delete("deleteStateTypeById", Id);
    }
}
