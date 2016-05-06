package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.PlayerLineType;
import com.ninehcom.common.entity.PageParam;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * PlayerLineType的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class PlayerLineTypeMapper {

    @Autowired
    @Qualifier("jdbc_league_data_template")
    SqlSession sqlSession;

    public List<PlayerLineType> selectAllPlayerLineType(){
	return sqlSession.selectList("selectAllPlayerLineType", null);
    }

    public PlayerLineType selectPlayerLineTypeById(int Id){
	return sqlSession.selectOne("selectPlayerLineTypeById", Id);
    }

    public int insertPlayerLineType(PlayerLineType playerLineType){
	return sqlSession.insert("insertPlayerLineType", playerLineType);
    }

    public int updatePlayerLineType(PlayerLineType playerLineType){
	return sqlSession.update("updatePlayerLineType", playerLineType);
    }

    public int deletePlayerLineTypeById(int Id){
	return sqlSession.delete("deletePlayerLineTypeById", Id);
    }
}
