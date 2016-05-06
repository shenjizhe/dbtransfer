package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.DataJudge;
import com.ninehcom.common.entity.PageParam;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * DataJudge的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class DataJudgeMapper {

    @Autowired
    @Qualifier("jdbc_league_data_template")
    SqlSession sqlSession;

    public List<DataJudge> selectAllDataJudge(){
	return sqlSession.selectList("selectAllDataJudge", null);
    }

    public DataJudge selectDataJudgeById(int Id){
	return sqlSession.selectOne("selectDataJudgeById", Id);
    }

    public int insertDataJudge(DataJudge dataJudge){
	return sqlSession.insert("insertDataJudge", dataJudge);
    }

    public int updateDataJudge(DataJudge dataJudge){
	return sqlSession.update("updateDataJudge", dataJudge);
    }

    public int deleteDataJudgeById(int Id){
	return sqlSession.delete("deleteDataJudgeById", Id);
    }
}
