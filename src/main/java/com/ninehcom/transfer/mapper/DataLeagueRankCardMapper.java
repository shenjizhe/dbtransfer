package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.DataLeagueRankCard;
import com.ninehcom.common.entity.PageParam;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * DataLeagueRankCard的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class DataLeagueRankCardMapper {

    @Autowired
    @Qualifier("jdbc_league_data_template")
    SqlSession sqlSession;

    public List<DataLeagueRankCard> selectAllDataLeagueRankCard(){
	return sqlSession.selectList("selectAllDataLeagueRankCard", null);
    }

    public DataLeagueRankCard selectDataLeagueRankCardById(int Id){
	return sqlSession.selectOne("selectDataLeagueRankCardById", Id);
    }

    public int insertDataLeagueRankCard(DataLeagueRankCard dataLeagueRankCard){
	return sqlSession.insert("insertDataLeagueRankCard", dataLeagueRankCard);
    }

    public int updateDataLeagueRankCard(DataLeagueRankCard dataLeagueRankCard){
	return sqlSession.update("updateDataLeagueRankCard", dataLeagueRankCard);
    }

    public int deleteDataLeagueRankCardById(int Id){
	return sqlSession.delete("deleteDataLeagueRankCardById", Id);
    }
}
