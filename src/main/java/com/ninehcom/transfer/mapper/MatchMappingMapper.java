package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.Errlog;
import com.ninehcom.transfer.entity.MatchMapping;
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
 * MatchMapping的Mapper，用于Mybatis
 *
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class MatchMappingMapper extends MapperBase {

    @Autowired
    @Qualifier("jdbc_league_data_template")
    SqlSession sqlSession;
    @Autowired
    ErrlogMapper errlogMapper;

    public List<MatchMapping> selectAllMatchMapping() {
        return sqlSession.selectList("selectAllMatchMapping", null);
    }

    public MatchMapping selectMatchMappingById(int Id) {
        return sqlSession.selectOne("selectMatchMappingById", Id);
    }

    public int insertMatchMapping(MatchMapping matchMapping) {
        return sqlSession.insert("insertMatchMapping", matchMapping);
    }

    public int updateMatchMapping(MatchMapping matchMapping) {
        return sqlSession.update("updateMatchMapping", matchMapping);
    }

    public int deleteMatchMappingById(int Id) {
        return sqlSession.delete("deleteMatchMappingById", Id);
    }

    @Override
    public Map<Integer, Long> getMap() {
        List<MatchMapping> list = selectAllMatchMapping();
        Map<Integer, Long> map = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            MatchMapping item = list.get(i);
            map.put(item.getClubMatchId(), item.getDataMatchId());
        }
        return map;
    }
}
