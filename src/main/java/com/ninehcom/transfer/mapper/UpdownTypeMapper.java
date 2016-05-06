package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.UpdownType;
import com.ninehcom.common.entity.PageParam;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * UpdownType的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class UpdownTypeMapper {

    @Autowired
    @Qualifier("jdbc_league_data_template")
    SqlSession sqlSession;

    public List<UpdownType> selectAllUpdownType(){
	return sqlSession.selectList("selectAllUpdownType", null);
    }

    public UpdownType selectUpdownTypeById(int Id){
	return sqlSession.selectOne("selectUpdownTypeById", Id);
    }

    public int insertUpdownType(UpdownType updownType){
	return sqlSession.insert("insertUpdownType", updownType);
    }

    public int updateUpdownType(UpdownType updownType){
	return sqlSession.update("updateUpdownType", updownType);
    }

    public int deleteUpdownTypeById(int Id){
	return sqlSession.delete("deleteUpdownTypeById", Id);
    }
}
