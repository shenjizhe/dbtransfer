package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.MatchVideo;
import com.ninehcom.common.entity.PageParam;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * MatchVideo的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class MatchVideoMapper {

    @Autowired
    @Qualifier("jdbc_league_data_template")
    SqlSession sqlSession;

    public List<MatchVideo> selectAllMatchVideo(){
	return sqlSession.selectList("selectAllMatchVideo", null);
    }

    public MatchVideo selectMatchVideoById(int Id){
	return sqlSession.selectOne("selectMatchVideoById", Id);
    }

    public int insertMatchVideo(MatchVideo matchVideo){
	return sqlSession.insert("insertMatchVideo", matchVideo);
    }

    public int updateMatchVideo(MatchVideo matchVideo){
	return sqlSession.update("updateMatchVideo", matchVideo);
    }

    public int deleteMatchVideoById(int Id){
	return sqlSession.delete("deleteMatchVideoById", Id);
    }
}
