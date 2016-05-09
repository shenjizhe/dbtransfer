package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.PlayerMapping;
import com.ninehcom.common.entity.PageParam;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * PlayerMapping的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class PlayerMappingMapper {

    @Autowired
    @Qualifier("jdbc_league_data_template")
    SqlSession sqlSession;

    public List<PlayerMapping> selectAllPlayerMapping(){
	return sqlSession.selectList("selectAllPlayerMapping", null);
    }

    public PlayerMapping selectPlayerMappingById(int Id){
	return sqlSession.selectOne("selectPlayerMappingById", Id);
    }

    public int insertPlayerMapping(PlayerMapping playerMapping){
	return sqlSession.insert("insertPlayerMapping", playerMapping);
    }

    public int updatePlayerMapping(PlayerMapping playerMapping){
	return sqlSession.update("updatePlayerMapping", playerMapping);
    }

    public int deletePlayerMappingById(int Id){
	return sqlSession.delete("deletePlayerMappingById", Id);
    }
}
