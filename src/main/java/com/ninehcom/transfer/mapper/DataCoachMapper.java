package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.DataCoach;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.transfer.interfaces.IMax;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * DataCoach的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class DataCoachMapper implements IMax{

    @Autowired
    @Qualifier("jdbc_league_data_template")
    SqlSession sqlSession;

    public List<DataCoach> selectAllDataCoach(){
	return sqlSession.selectList("selectAllDataCoach", null);
    }

    public DataCoach selectDataCoachById(int Id){
	return sqlSession.selectOne("selectDataCoachById", Id);
    }

    public int insertDataCoach(DataCoach dataCoach){
	return sqlSession.insert("insertDataCoach", dataCoach);
    }

    public int updateDataCoach(DataCoach dataCoach){
	return sqlSession.update("updateDataCoach", dataCoach);
    }

    public int deleteDataCoachById(int Id){
	return sqlSession.delete("deleteDataCoachById", Id);
    }
    
    @Override
    public int getMax() {
        return sqlSession.selectOne("selectDataCoachMaxId");
    }
}
