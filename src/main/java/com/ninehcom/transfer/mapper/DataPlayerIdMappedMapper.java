package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.DataPlayerIdMapped;
import com.ninehcom.common.entity.PageParam;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * DataPlayerIdMapped的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class DataPlayerIdMappedMapper {

    @Autowired
    @Qualifier("jdbc_league_data_template")
    SqlSession sqlSession;

    public List<DataPlayerIdMapped> selectAllDataPlayerIdMapped(){
	return sqlSession.selectList("selectAllDataPlayerIdMapped", null);
    }

    public DataPlayerIdMapped selectDataPlayerIdMappedById(int Id){
	return sqlSession.selectOne("selectDataPlayerIdMappedById", Id);
    }

    public int insertDataPlayerIdMapped(DataPlayerIdMapped dataPlayerIdMapped){
	return sqlSession.insert("insertDataPlayerIdMapped", dataPlayerIdMapped);
    }

    public int updateDataPlayerIdMapped(DataPlayerIdMapped dataPlayerIdMapped){
	return sqlSession.update("updateDataPlayerIdMapped", dataPlayerIdMapped);
    }

    public int deleteDataPlayerIdMappedById(int Id){
	return sqlSession.delete("deleteDataPlayerIdMappedById", Id);
    }
}
