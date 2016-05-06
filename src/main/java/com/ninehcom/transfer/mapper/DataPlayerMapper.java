package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.DataPlayer;
import com.ninehcom.common.entity.PageParam;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * DataPlayer的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class DataPlayerMapper {

    @Autowired
    @Qualifier("jdbc_league_data_template")
    SqlSession sqlSession;

    public List<DataPlayer> selectAllDataPlayer(){
	return sqlSession.selectList("selectAllDataPlayer", null);
    }

    public DataPlayer selectDataPlayerById(int Id){
	return sqlSession.selectOne("selectDataPlayerById", Id);
    }

    public int insertDataPlayer(DataPlayer dataPlayer){
	return sqlSession.insert("insertDataPlayer", dataPlayer);
    }

    public int updateDataPlayer(DataPlayer dataPlayer){
	return sqlSession.update("updateDataPlayer", dataPlayer);
    }

    public int deleteDataPlayerById(int Id){
	return sqlSession.delete("deleteDataPlayerById", Id);
    }
}
