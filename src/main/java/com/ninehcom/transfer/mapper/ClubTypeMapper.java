package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.ClubType;
import com.ninehcom.common.entity.PageParam;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * ClubType的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class ClubTypeMapper {

    @Autowired
    @Qualifier("jdbc_league_data_template")
    SqlSession sqlSession;

    public List<ClubType> selectAllClubType(){
	return sqlSession.selectList("selectAllClubType", null);
    }

    public ClubType selectClubTypeById(int Id){
	return sqlSession.selectOne("selectClubTypeById", Id);
    }

    public int insertClubType(ClubType clubType){
	return sqlSession.insert("insertClubType", clubType);
    }

    public int updateClubType(ClubType clubType){
	return sqlSession.update("updateClubType", clubType);
    }

    public int deleteClubTypeById(int Id){
	return sqlSession.delete("deleteClubTypeById", Id);
    }
}
