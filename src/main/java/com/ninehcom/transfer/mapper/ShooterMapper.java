package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.Shooter;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * Shooter的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class ShooterMapper {

    @Autowired
    @Qualifier("jdbc_guoan_new_template")
    SqlSession sqlSession;

    public List<Shooter> selectAllShooter(){
	return sqlSession.selectList("selectAllShooter", null);
    }
    
    public List<Shooter> selectFilterShooter(){
	return sqlSession.selectList("selectFilterShooter", null);
    }

    public Shooter selectShooterById(int Id){
	return sqlSession.selectOne("selectShooterById", Id);
    }
}
