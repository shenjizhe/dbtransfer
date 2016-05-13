package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.ShootRank;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * ShootRank的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class ShootRankMapper {

    @Autowired
    @Qualifier("jdbc_league_data_template")
    SqlSession sqlSession;

    public List<ShootRank> selectAllShootRank(){
	return sqlSession.selectList("selectAllShootRank", null);
    }

    public ShootRank selectShootRankById(int Id){
	return sqlSession.selectOne("selectShootRankById", Id);
    }

    public int insertShootRank(ShootRank shootRank){
	return sqlSession.insert("insertShootRank", shootRank);
    }

    public int updateShootRank(ShootRank shootRank){
	return sqlSession.update("updateShootRank", shootRank);
    }

    public int deleteShootRankById(int Id){
	return sqlSession.delete("deleteShootRankById", Id);
    }
}
