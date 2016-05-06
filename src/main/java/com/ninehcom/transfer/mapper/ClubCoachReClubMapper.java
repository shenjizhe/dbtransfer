package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.ClubCoachReClub;
import com.ninehcom.common.entity.PageParam;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * ClubCoachReClub的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class ClubCoachReClubMapper {

    @Autowired
    @Qualifier("jdbc_league_data_template")
    SqlSession sqlSession;

    public List<ClubCoachReClub> selectAllClubCoachReClub(){
	return sqlSession.selectList("selectAllClubCoachReClub", null);
    }

    public ClubCoachReClub selectClubCoachReClubById(int Id){
	return sqlSession.selectOne("selectClubCoachReClubById", Id);
    }

    public int insertClubCoachReClub(ClubCoachReClub clubCoachReClub){
	return sqlSession.insert("insertClubCoachReClub", clubCoachReClub);
    }

    public int updateClubCoachReClub(ClubCoachReClub clubCoachReClub){
	return sqlSession.update("updateClubCoachReClub", clubCoachReClub);
    }

    public int deleteClubCoachReClubById(int Id){
	return sqlSession.delete("deleteClubCoachReClubById", Id);
    }
}
