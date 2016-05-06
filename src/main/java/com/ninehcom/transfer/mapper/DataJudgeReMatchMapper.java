package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.DataJudgeReMatch;
import com.ninehcom.common.entity.PageParam;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * DataJudgeReMatch的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class DataJudgeReMatchMapper {

    @Autowired
    @Qualifier("jdbc_league_data_template")
    SqlSession sqlSession;

    public List<DataJudgeReMatch> selectAllDataJudgeReMatch(){
	return sqlSession.selectList("selectAllDataJudgeReMatch", null);
    }

    public DataJudgeReMatch selectDataJudgeReMatchById(int Id){
	return sqlSession.selectOne("selectDataJudgeReMatchById", Id);
    }

    public int insertDataJudgeReMatch(DataJudgeReMatch dataJudgeReMatch){
	return sqlSession.insert("insertDataJudgeReMatch", dataJudgeReMatch);
    }

    public int updateDataJudgeReMatch(DataJudgeReMatch dataJudgeReMatch){
	return sqlSession.update("updateDataJudgeReMatch", dataJudgeReMatch);
    }

    public int deleteDataJudgeReMatchById(int Id){
	return sqlSession.delete("deleteDataJudgeReMatchById", Id);
    }
}
