package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.Errlog;
import com.ninehcom.common.entity.PageParam;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * Errlog的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class ErrlogMapper {

    @Autowired
    @Qualifier("jdbc_league_data_template")
    SqlSession sqlSession;

    public List<Errlog> selectAllErrlog(){
	return sqlSession.selectList("selectAllErrlog", null);
    }

    public Errlog selectErrlogById(int Id){
	return sqlSession.selectOne("selectErrlogById", Id);
    }

    public int insertErrlog(Errlog errlog){
	return sqlSession.insert("insertErrlog", errlog);
    }

    public int updateErrlog(Errlog errlog){
	return sqlSession.update("updateErrlog", errlog);
    }

    public int deleteErrlogById(int Id){
	return sqlSession.delete("deleteErrlogById", Id);
    }
}
