package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.DataLeagueUpdown;
import com.ninehcom.common.entity.PageParam;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * DataLeagueUpdown的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class DataLeagueUpdownMapper {

    @Autowired
    @Qualifier("jdbc_league_data_template")
    SqlSession sqlSession;

    public List<DataLeagueUpdown> selectAllDataLeagueUpdown(){
	return sqlSession.selectList("selectAllDataLeagueUpdown", null);
    }

    public DataLeagueUpdown selectDataLeagueUpdownById(int Id){
	return sqlSession.selectOne("selectDataLeagueUpdownById", Id);
    }

    public int insertDataLeagueUpdown(DataLeagueUpdown dataLeagueUpdown){
	return sqlSession.insert("insertDataLeagueUpdown", dataLeagueUpdown);
    }

    public int updateDataLeagueUpdown(DataLeagueUpdown dataLeagueUpdown){
	return sqlSession.update("updateDataLeagueUpdown", dataLeagueUpdown);
    }

    public int deleteDataLeagueUpdownById(int Id){
	return sqlSession.delete("deleteDataLeagueUpdownById", Id);
    }
}
