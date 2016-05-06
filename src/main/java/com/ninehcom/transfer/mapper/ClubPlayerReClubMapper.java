package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.ClubPlayerReClub;
import com.ninehcom.common.entity.PageParam;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * ClubPlayerReClub的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class ClubPlayerReClubMapper {

    @Autowired
    @Qualifier("jdbc_league_data_template")
    SqlSession sqlSession;

    public List<ClubPlayerReClub> selectAllClubPlayerReClub(){
	return sqlSession.selectList("selectAllClubPlayerReClub", null);
    }

    public ClubPlayerReClub selectClubPlayerReClubById(int Id){
	return sqlSession.selectOne("selectClubPlayerReClubById", Id);
    }

    public int insertClubPlayerReClub(ClubPlayerReClub clubPlayerReClub){
	return sqlSession.insert("insertClubPlayerReClub", clubPlayerReClub);
    }

    public int updateClubPlayerReClub(ClubPlayerReClub clubPlayerReClub){
	return sqlSession.update("updateClubPlayerReClub", clubPlayerReClub);
    }

    public int deleteClubPlayerReClubById(int Id){
	return sqlSession.delete("deleteClubPlayerReClubById", Id);
    }
}
