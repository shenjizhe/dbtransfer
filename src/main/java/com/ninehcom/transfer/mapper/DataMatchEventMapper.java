package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.DataMatchEvent;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.transfer.interfaces.IMax;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * DataMatchEvent的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class DataMatchEventMapper implements IMax{

    @Autowired
    @Qualifier("jdbc_league_data_template")
    SqlSession sqlSession;

    public List<DataMatchEvent> selectAllDataMatchEvent(){
	return sqlSession.selectList("selectAllDataMatchEvent", null);
    }

    public DataMatchEvent selectDataMatchEventById(int Id){
	return sqlSession.selectOne("selectDataMatchEventById", Id);
    }

    public int insertDataMatchEvent(DataMatchEvent dataMatchEvent){
	return sqlSession.insert("insertDataMatchEvent", dataMatchEvent);
    }

    public int updateDataMatchEvent(DataMatchEvent dataMatchEvent){
	return sqlSession.update("updateDataMatchEvent", dataMatchEvent);
    }

    public int deleteDataMatchEventById(int Id){
	return sqlSession.delete("deleteDataMatchEventById", Id);
    }

    @Override
    public int getMax() {
        return sqlSession.selectOne("selectEventMaxId", null);
    }
}
