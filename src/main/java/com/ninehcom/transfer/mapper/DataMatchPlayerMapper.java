package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.DataMatchPlayer;
import com.ninehcom.common.entity.PageParam;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * DataMatchPlayer的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class DataMatchPlayerMapper {

    @Autowired
    @Qualifier("jdbc_league_data_template")
    SqlSession sqlSession;

    public List<DataMatchPlayer> selectAllDataMatchPlayer(){
	return sqlSession.selectList("selectAllDataMatchPlayer", null);
    }

    public DataMatchPlayer selectDataMatchPlayerById(int Id){
	return sqlSession.selectOne("selectDataMatchPlayerById", Id);
    }

    public int insertDataMatchPlayer(DataMatchPlayer dataMatchPlayer){
	return sqlSession.insert("insertDataMatchPlayer", dataMatchPlayer);
    }

    public int updateDataMatchPlayer(DataMatchPlayer dataMatchPlayer){
	return sqlSession.update("updateDataMatchPlayer", dataMatchPlayer);
    }

    public int deleteDataMatchPlayerById(int Id){
	return sqlSession.delete("deleteDataMatchPlayerById", Id);
    }
}
