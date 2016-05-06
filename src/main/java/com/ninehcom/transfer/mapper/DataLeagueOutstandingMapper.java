package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.DataLeagueOutstanding;
import com.ninehcom.common.entity.PageParam;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * DataLeagueOutstanding的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class DataLeagueOutstandingMapper {

    @Autowired
    @Qualifier("jdbc_league_data_template")
    SqlSession sqlSession;

    public List<DataLeagueOutstanding> selectAllDataLeagueOutstanding(){
	return sqlSession.selectList("selectAllDataLeagueOutstanding", null);
    }

    public DataLeagueOutstanding selectDataLeagueOutstandingById(int Id){
	return sqlSession.selectOne("selectDataLeagueOutstandingById", Id);
    }

    public int insertDataLeagueOutstanding(DataLeagueOutstanding dataLeagueOutstanding){
	return sqlSession.insert("insertDataLeagueOutstanding", dataLeagueOutstanding);
    }

    public int updateDataLeagueOutstanding(DataLeagueOutstanding dataLeagueOutstanding){
	return sqlSession.update("updateDataLeagueOutstanding", dataLeagueOutstanding);
    }

    public int deleteDataLeagueOutstandingById(int Id){
	return sqlSession.delete("deleteDataLeagueOutstandingById", Id);
    }
}
