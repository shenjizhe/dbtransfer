package com.bfec.transfer.mapper;

import com.bfec.transfer.entity.Translog;
import com.bfec.common.entity.PageParam;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * Translog的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class TranslogMapper {

    @Autowired
    @Qualifier("jdbc_league_data_template")
    SqlSession sqlSession;

    public List<Translog> selectAllTranslog(){
	return sqlSession.selectList("selectAllTranslog", null);
    }

    public Translog selectTranslogById(int Id){
	return sqlSession.selectOne("selectTranslogById", Id);
    }

    public int insertTranslog(Translog translog){
	return sqlSession.insert("insertTranslog", translog);
    }

    public int updateTranslog(Translog translog){
	return sqlSession.update("updateTranslog", translog);
    }

    public int deleteTranslogById(int Id){
	return sqlSession.delete("deleteTranslogById", Id);
    }
}
