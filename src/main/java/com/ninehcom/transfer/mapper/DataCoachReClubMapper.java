package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.DataCoachReClub;
import com.ninehcom.common.entity.PageParam;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * DataCoachReClub的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class DataCoachReClubMapper {

    @Autowired
    @Qualifier("jdbc_league_data_template")
    SqlSession sqlSession;

    public List<DataCoachReClub> selectAllDataCoachReClub(){
	return sqlSession.selectList("selectAllDataCoachReClub", null);
    }

    public DataCoachReClub selectDataCoachReClubById(int Id){
	return sqlSession.selectOne("selectDataCoachReClubById", Id);
    }

    public int insertDataCoachReClub(DataCoachReClub dataCoachReClub){
	return sqlSession.insert("insertDataCoachReClub", dataCoachReClub);
    }

    public int updateDataCoachReClub(DataCoachReClub dataCoachReClub){
	return sqlSession.update("updateDataCoachReClub", dataCoachReClub);
    }

    public int deleteDataCoachReClubById(int Id){
	return sqlSession.delete("deleteDataCoachReClubById", Id);
    }
}
