package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.DataMatchLine;
import com.ninehcom.common.entity.PageParam;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * DataMatchLine的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class DataMatchLineMapper {

    @Autowired
    @Qualifier("jdbc_league_data_template")
    SqlSession sqlSession;

    public List<DataMatchLine> selectAllDataMatchLine(){
	return sqlSession.selectList("selectAllDataMatchLine", null);
    }

    public DataMatchLine selectDataMatchLineById(int Id){
	return sqlSession.selectOne("selectDataMatchLineById", Id);
    }

    public int insertDataMatchLine(DataMatchLine dataMatchLine){
	return sqlSession.insert("insertDataMatchLine", dataMatchLine);
    }

    public int updateDataMatchLine(DataMatchLine dataMatchLine){
	return sqlSession.update("updateDataMatchLine", dataMatchLine);
    }

    public int deleteDataMatchLineById(int Id){
	return sqlSession.delete("deleteDataMatchLineById", Id);
    }
}
