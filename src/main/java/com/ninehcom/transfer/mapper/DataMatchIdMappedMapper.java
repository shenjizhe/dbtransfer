package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.DataMatchIdMapped;
import com.ninehcom.common.entity.PageParam;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * DataMatchIdMapped的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class DataMatchIdMappedMapper {

    @Autowired
    @Qualifier("jdbc_league_data_template")
    SqlSession sqlSession;

    public List<DataMatchIdMapped> selectAllDataMatchIdMapped(){
	return sqlSession.selectList("selectAllDataMatchIdMapped", null);
    }

    public DataMatchIdMapped selectDataMatchIdMappedById(int Id){
	return sqlSession.selectOne("selectDataMatchIdMappedById", Id);
    }

    public int insertDataMatchIdMapped(DataMatchIdMapped dataMatchIdMapped){
	return sqlSession.insert("insertDataMatchIdMapped", dataMatchIdMapped);
    }

    public int updateDataMatchIdMapped(DataMatchIdMapped dataMatchIdMapped){
	return sqlSession.update("updateDataMatchIdMapped", dataMatchIdMapped);
    }

    public int deleteDataMatchIdMappedById(int Id){
	return sqlSession.delete("deleteDataMatchIdMappedById", Id);
    }
}
