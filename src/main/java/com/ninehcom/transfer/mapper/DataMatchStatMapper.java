package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.DataMatchStat;
import com.ninehcom.common.entity.PageParam;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * DataMatchStat的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class DataMatchStatMapper {

    @Autowired
    @Qualifier("jdbc_league_data_template")
    SqlSession sqlSession;

    public List<DataMatchStat> selectAllDataMatchStat(){
	return sqlSession.selectList("selectAllDataMatchStat", null);
    }

    public DataMatchStat selectDataMatchStatById(int Id){
	return sqlSession.selectOne("selectDataMatchStatById", Id);
    }

    public int insertDataMatchStat(DataMatchStat dataMatchStat){
	return sqlSession.insert("insertDataMatchStat", dataMatchStat);
    }

    public int updateDataMatchStat(DataMatchStat dataMatchStat){
	return sqlSession.update("updateDataMatchStat", dataMatchStat);
    }

    public int deleteDataMatchStatById(int Id){
	return sqlSession.delete("deleteDataMatchStatById", Id);
    }
}
