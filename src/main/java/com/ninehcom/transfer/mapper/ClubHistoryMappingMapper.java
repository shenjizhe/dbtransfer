package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.ClubHistoryMapping;
import com.ninehcom.common.entity.PageParam;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * ClubHistoryMapping的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class ClubHistoryMappingMapper {

    @Autowired
    @Qualifier("jdbc_league_data_template")
    SqlSession sqlSession;

    public List<ClubHistoryMapping> selectAllClubHistoryMapping(){
	return sqlSession.selectList("selectAllClubHistoryMapping", null);
    }

    public ClubHistoryMapping selectClubHistoryMappingById(int Id){
	return sqlSession.selectOne("selectClubHistoryMappingById", Id);
    }

    public int insertClubHistoryMapping(ClubHistoryMapping clubHistoryMapping){
	return sqlSession.insert("insertClubHistoryMapping", clubHistoryMapping);
    }

    public int updateClubHistoryMapping(ClubHistoryMapping clubHistoryMapping){
	return sqlSession.update("updateClubHistoryMapping", clubHistoryMapping);
    }

    public int deleteClubHistoryMappingById(int Id){
	return sqlSession.delete("deleteClubHistoryMappingById", Id);
    }
}
