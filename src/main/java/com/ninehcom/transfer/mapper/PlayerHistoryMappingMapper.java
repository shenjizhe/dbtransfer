package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.PlayerHistoryMapping;
import com.ninehcom.common.entity.PageParam;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * PlayerHistoryMapping的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class PlayerHistoryMappingMapper {

    @Autowired
    @Qualifier("jdbc_league_data_template")
    SqlSession sqlSession;

    public List<PlayerHistoryMapping> selectAllPlayerHistoryMapping(){
	return sqlSession.selectList("selectAllPlayerHistoryMapping", null);
    }

    public PlayerHistoryMapping selectPlayerHistoryMappingById(int Id){
	return sqlSession.selectOne("selectPlayerHistoryMappingById", Id);
    }

    public int insertPlayerHistoryMapping(PlayerHistoryMapping playerHistoryMapping){
	return sqlSession.insert("insertPlayerHistoryMapping", playerHistoryMapping);
    }

    public int updatePlayerHistoryMapping(PlayerHistoryMapping playerHistoryMapping){
	return sqlSession.update("updatePlayerHistoryMapping", playerHistoryMapping);
    }

    public int deletePlayerHistoryMappingById(int Id){
	return sqlSession.delete("deletePlayerHistoryMappingById", Id);
    }
}
