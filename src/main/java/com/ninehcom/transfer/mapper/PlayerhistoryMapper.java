package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.Playerhistory;
import com.ninehcom.common.entity.PageParam;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * Playerhistory的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class PlayerhistoryMapper {

    @Autowired
    @Qualifier("jdbc_guoan_new_template")
    SqlSession sqlSession;

    public List<Playerhistory> selectAllPlayerhistory(){
	return sqlSession.selectList("selectAllPlayerhistory", null);
    }

    public Playerhistory selectPlayerhistoryById(int Id){
	return sqlSession.selectOne("selectPlayerhistoryById", Id);
    }
}
