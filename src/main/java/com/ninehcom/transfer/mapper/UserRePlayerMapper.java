package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.UserRePlayer;
import com.ninehcom.common.entity.PageParam;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * UserRePlayer的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class UserRePlayerMapper {

    @Autowired
    @Qualifier("jdbc_league_data_template")
    SqlSession sqlSession;

    public List<UserRePlayer> selectAllUserRePlayer(){
	return sqlSession.selectList("selectAllUserRePlayer", null);
    }

    public UserRePlayer selectUserRePlayerById(int Id){
	return sqlSession.selectOne("selectUserRePlayerById", Id);
    }

    public int insertUserRePlayer(UserRePlayer userRePlayer){
	return sqlSession.insert("insertUserRePlayer", userRePlayer);
    }

    public int updateUserRePlayer(UserRePlayer userRePlayer){
	return sqlSession.update("updateUserRePlayer", userRePlayer);
    }

    public int deleteUserRePlayerById(int Id){
	return sqlSession.delete("deleteUserRePlayerById", Id);
    }
}
