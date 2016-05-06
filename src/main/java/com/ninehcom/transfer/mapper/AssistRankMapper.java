package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.AssistRank;
import com.ninehcom.common.entity.PageParam;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * AssistRank的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class AssistRankMapper {

    @Autowired
    @Qualifier("jdbc_league_data_template")
    SqlSession sqlSession;

    public List<AssistRank> selectAllAssistRank(){
	return sqlSession.selectList("selectAllAssistRank", null);
    }

    public AssistRank selectAssistRankById(int Id){
	return sqlSession.selectOne("selectAssistRankById", Id);
    }

    public int insertAssistRank(AssistRank assistRank){
	return sqlSession.insert("insertAssistRank", assistRank);
    }

    public int updateAssistRank(AssistRank assistRank){
	return sqlSession.update("updateAssistRank", assistRank);
    }

    public int deleteAssistRankById(int Id){
	return sqlSession.delete("deleteAssistRankById", Id);
    }
}
