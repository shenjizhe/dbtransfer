package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.DataClub;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.transfer.interfaces.IMax;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * DataClub的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class DataClubMapper implements IMax{

    @Autowired
    @Qualifier("jdbc_league_data_template")
    SqlSession sqlSession;

    public List<DataClub> selectAllDataClub(){
	return sqlSession.selectList("selectAllDataClub", null);
    }

    public DataClub selectDataClubById(int Id){
	return sqlSession.selectOne("selectDataClubById", Id);
    }

    public int insertDataClub(DataClub dataClub){
	return sqlSession.insert("insertDataClub", dataClub);
    }

    public int updateDataClub(DataClub dataClub){
	return sqlSession.update("updateDataClub", dataClub);
    }

    public int deleteDataClubById(int Id){
	return sqlSession.delete("deleteDataClubById", Id);
    }

    @Override
    public int getMax() {
        return sqlSession.selectOne("selectDataClubMaxId");
    }
}
