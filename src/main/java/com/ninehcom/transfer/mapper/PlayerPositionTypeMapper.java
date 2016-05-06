package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.PlayerPositionType;
import com.ninehcom.common.entity.PageParam;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * PlayerPositionType的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class PlayerPositionTypeMapper {

    @Autowired
    @Qualifier("jdbc_league_data_template")
    SqlSession sqlSession;

    public List<PlayerPositionType> selectAllPlayerPositionType(){
	return sqlSession.selectList("selectAllPlayerPositionType", null);
    }

    public PlayerPositionType selectPlayerPositionTypeById(int Id){
	return sqlSession.selectOne("selectPlayerPositionTypeById", Id);
    }

    public int insertPlayerPositionType(PlayerPositionType playerPositionType){
	return sqlSession.insert("insertPlayerPositionType", playerPositionType);
    }

    public int updatePlayerPositionType(PlayerPositionType playerPositionType){
	return sqlSession.update("updatePlayerPositionType", playerPositionType);
    }

    public int deletePlayerPositionTypeById(int Id){
	return sqlSession.delete("deletePlayerPositionTypeById", Id);
    }
}
