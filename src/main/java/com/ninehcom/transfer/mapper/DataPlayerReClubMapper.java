package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.DataPlayerReClub;
import com.ninehcom.common.entity.PageParam;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * DataPlayerReClub的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class DataPlayerReClubMapper {

    @Autowired
    @Qualifier("jdbc_league_data_template")
    SqlSession sqlSession;

    public List<DataPlayerReClub> selectAllDataPlayerReClub(){
	return sqlSession.selectList("selectAllDataPlayerReClub", null);
    }

    public DataPlayerReClub selectDataPlayerReClubById(int Id){
	return sqlSession.selectOne("selectDataPlayerReClubById", Id);
    }

    public int insertDataPlayerReClub(DataPlayerReClub dataPlayerReClub){
	return sqlSession.insert("insertDataPlayerReClub", dataPlayerReClub);
    }

    public int updateDataPlayerReClub(DataPlayerReClub dataPlayerReClub){
	return sqlSession.update("updateDataPlayerReClub", dataPlayerReClub);
    }

    public int deleteDataPlayerReClubById(int Id){
	return sqlSession.delete("deleteDataPlayerReClubById", Id);
    }
}
