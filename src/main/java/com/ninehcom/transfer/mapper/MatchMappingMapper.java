package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.MatchMapping;
import com.ninehcom.common.entity.PageParam;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * MatchMapping的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class MatchMappingMapper {

    @Autowired
    @Qualifier("jdbc_league_data_template")
    SqlSession sqlSession;

    public List<MatchMapping> selectAllMatchMapping(){
	return sqlSession.selectList("selectAllMatchMapping", null);
    }

    public MatchMapping selectMatchMappingById(int Id){
	return sqlSession.selectOne("selectMatchMappingById", Id);
    }

    public int insertMatchMapping(MatchMapping matchMapping){
	return sqlSession.insert("insertMatchMapping", matchMapping);
    }

    public int updateMatchMapping(MatchMapping matchMapping){
	return sqlSession.update("updateMatchMapping", matchMapping);
    }

    public int deleteMatchMappingById(int Id){
	return sqlSession.delete("deleteMatchMappingById", Id);
    }
}
