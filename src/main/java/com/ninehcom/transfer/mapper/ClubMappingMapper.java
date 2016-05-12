package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.ClubMapping;
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
 * ClubMapping的Mapper，用于Mybatis
 *
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class ClubMappingMapper implements IMapper {

    @Autowired
    @Qualifier("jdbc_league_data_template")
    SqlSession sqlSession;

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
        List<ClubMapping> list = selectAllClubMapping();
        Map<Integer, Long> map = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            ClubMapping item = list.get(i);
            map.put(item.getTeamId(), item.getClubId());
        }
        return map;
    }

    public List<ClubMapping> selectAllClubMapping() {
        return sqlSession.selectList("selectAllClubMapping", null);
    }

    public ClubMapping selectClubMappingById(int Id) {
        return sqlSession.selectOne("selectClubMappingById", Id);
    }

    public int insertClubMapping(ClubMapping clubMapping) {
        return sqlSession.insert("insertClubMapping", clubMapping);
    }

    public int updateClubMapping(ClubMapping clubMapping) {
        return sqlSession.update("updateClubMapping", clubMapping);
    }

    public int deleteClubMappingById(int Id) {
        return sqlSession.delete("deleteClubMappingById", Id);
    }
}
