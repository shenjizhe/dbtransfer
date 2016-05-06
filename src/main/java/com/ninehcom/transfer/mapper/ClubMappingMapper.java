package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.ClubMapping;
import com.ninehcom.common.entity.PageParam;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * ClubMapping的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class ClubMappingMapper {

    @Autowired
    @Qualifier("jdbc_league_data_template")
    SqlSession sqlSession;

    public List<ClubMapping> selectAllClubMapping(){
	return sqlSession.selectList("selectAllClubMapping", null);
    }

    public ClubMapping selectClubMappingById(int Id){
	return sqlSession.selectOne("selectClubMappingById", Id);
    }

    public int insertClubMapping(ClubMapping clubMapping){
	return sqlSession.insert("insertClubMapping", clubMapping);
    }

    public int updateClubMapping(ClubMapping clubMapping){
	return sqlSession.update("updateClubMapping", clubMapping);
    }

    public int deleteClubMappingById(int Id){
	return sqlSession.delete("deleteClubMappingById", Id);
    }
}
