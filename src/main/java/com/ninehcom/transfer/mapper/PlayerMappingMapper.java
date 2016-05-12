package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.PlayerMapping;
import com.ninehcom.transfer.interfaces.IMapper;
import com.ninehcom.transfer.interfaces.IReset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * PlayerMapping的Mapper，用于Mybatis
 *
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class PlayerMappingMapper implements IMapper {

    @Autowired
    @Qualifier("jdbc_league_data_template")
    SqlSession sqlSession;

    public List<PlayerMapping> selectAllPlayerMapping() {
        return sqlSession.selectList("selectAllPlayerMapping", null);
    }

    public PlayerMapping selectPlayerMappingById(int Id) {
        return sqlSession.selectOne("selectPlayerMappingById", Id);
    }

    public int insertPlayerMapping(PlayerMapping playerMapping) {
        return sqlSession.insert("insertPlayerMapping", playerMapping);
    }

    public int updatePlayerMapping(PlayerMapping playerMapping) {
        return sqlSession.update("updatePlayerMapping", playerMapping);
    }

    public int deletePlayerMappingById(int Id) {
        return sqlSession.delete("deletePlayerMappingById", Id);
    }

    @Override
    public void reset(List list) {
        Map<Integer, Long> map = getMap();
        for (int i = 0; i < list.size(); i++) {
            IReset item = (IReset) list.get(i);
            item.set(map.get(item.get()).intValue());
        }
    }

    @Override
    public Map<Integer, Long> getMap() {
        List<PlayerMapping> list = selectAllPlayerMapping();
        Map<Integer, Long> map = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            PlayerMapping item = list.get(i);
            map.put(item.getClubPlayerId(), item.getDataPlayerId());
        }
        return map;
    }
}
