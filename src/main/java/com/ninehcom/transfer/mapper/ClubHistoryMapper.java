package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.ClubHistory;
import com.ninehcom.common.entity.PageParam;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * ClubHistory的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class ClubHistoryMapper {

    @Autowired
    @Qualifier("jdbc_league_data_template")
    SqlSession sqlSession;

    public List<ClubHistory> selectAllClubHistory(){
	return sqlSession.selectList("selectAllClubHistory", null);
    }

    public ClubHistory selectClubHistoryById(int Id){
	return sqlSession.selectOne("selectClubHistoryById", Id);
    }

    public int insertClubHistory(ClubHistory clubHistory){
	return sqlSession.insert("insertClubHistory", clubHistory);
    }

    public int updateClubHistory(ClubHistory clubHistory){
	return sqlSession.update("updateClubHistory", clubHistory);
    }

    public int deleteClubHistoryById(int Id){
	return sqlSession.delete("deleteClubHistoryById", Id);
    }
}
