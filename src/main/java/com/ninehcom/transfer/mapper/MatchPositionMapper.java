package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.MatchPosition;
import com.ninehcom.common.entity.PageParam;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * MatchPosition的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class MatchPositionMapper {

    @Autowired
    @Qualifier("jdbc_league_data_template")
    SqlSession sqlSession;

    public List<MatchPosition> selectAllMatchPosition(){
	return sqlSession.selectList("selectAllMatchPosition", null);
    }

    public MatchPosition selectMatchPositionById(int Id){
	return sqlSession.selectOne("selectMatchPositionById", Id);
    }

    public int insertMatchPosition(MatchPosition matchPosition){
	return sqlSession.insert("insertMatchPosition", matchPosition);
    }

    public int updateMatchPosition(MatchPosition matchPosition){
	return sqlSession.update("updateMatchPosition", matchPosition);
    }

    public int deleteMatchPositionById(int Id){
	return sqlSession.delete("deleteMatchPositionById", Id);
    }
}
