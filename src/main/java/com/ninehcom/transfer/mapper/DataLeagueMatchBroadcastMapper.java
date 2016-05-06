package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.DataLeagueMatchBroadcast;
import com.ninehcom.common.entity.PageParam;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * DataLeagueMatchBroadcast的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class DataLeagueMatchBroadcastMapper {

    @Autowired
    @Qualifier("jdbc_league_data_template")
    SqlSession sqlSession;

    public List<DataLeagueMatchBroadcast> selectAllDataLeagueMatchBroadcast(){
	return sqlSession.selectList("selectAllDataLeagueMatchBroadcast", null);
    }

    public DataLeagueMatchBroadcast selectDataLeagueMatchBroadcastById(int Id){
	return sqlSession.selectOne("selectDataLeagueMatchBroadcastById", Id);
    }

    public int insertDataLeagueMatchBroadcast(DataLeagueMatchBroadcast dataLeagueMatchBroadcast){
	return sqlSession.insert("insertDataLeagueMatchBroadcast", dataLeagueMatchBroadcast);
    }

    public int updateDataLeagueMatchBroadcast(DataLeagueMatchBroadcast dataLeagueMatchBroadcast){
	return sqlSession.update("updateDataLeagueMatchBroadcast", dataLeagueMatchBroadcast);
    }

    public int deleteDataLeagueMatchBroadcastById(int Id){
	return sqlSession.delete("deleteDataLeagueMatchBroadcastById", Id);
    }
}
