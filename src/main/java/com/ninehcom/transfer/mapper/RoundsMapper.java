package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.Rounds;
import com.ninehcom.common.entity.PageParam;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * Rounds的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class RoundsMapper {

    @Autowired
    @Qualifier("jdbc_league_data_template")
    SqlSession sqlSession;

    public List<Rounds> selectAllRounds(){
	return sqlSession.selectList("selectAllRounds", null);
    }

    public Rounds selectRoundsById(int Id){
	return sqlSession.selectOne("selectRoundsById", Id);
    }

    public int insertRounds(Rounds rounds){
	return sqlSession.insert("insertRounds", rounds);
    }

    public int updateRounds(Rounds rounds){
	return sqlSession.update("updateRounds", rounds);
    }

    public int deleteRoundsById(int Id){
	return sqlSession.delete("deleteRoundsById", Id);
    }
}
