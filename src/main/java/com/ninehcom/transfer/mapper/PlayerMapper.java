package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.Player;
import com.ninehcom.common.entity.PageParam;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * Player的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class PlayerMapper {

    @Autowired
    @Qualifier("jdbc_guoan_new_template")
    SqlSession sqlSession;

    public List<Player> selectAllPlayer(){
	return sqlSession.selectList("selectAllPlayer", null);
    }

    public Player selectPlayerById(int Id){
	return sqlSession.selectOne("selectPlayerById", Id);
    }
}
