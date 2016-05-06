package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.JudgeType;
import com.ninehcom.common.entity.PageParam;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * JudgeType的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class JudgeTypeMapper {

    @Autowired
    @Qualifier("jdbc_league_data_template")
    SqlSession sqlSession;

    public List<JudgeType> selectAllJudgeType(){
	return sqlSession.selectList("selectAllJudgeType", null);
    }

    public JudgeType selectJudgeTypeById(int Id){
	return sqlSession.selectOne("selectJudgeTypeById", Id);
    }

    public int insertJudgeType(JudgeType judgeType){
	return sqlSession.insert("insertJudgeType", judgeType);
    }

    public int updateJudgeType(JudgeType judgeType){
	return sqlSession.update("updateJudgeType", judgeType);
    }

    public int deleteJudgeTypeById(int Id){
	return sqlSession.delete("deleteJudgeTypeById", Id);
    }
}
