package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.CoachMapping;
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
 * CoachMapping的Mapper，用于Mybatis
 *
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class CoachMappingMapper extends MapperBase {

    @Autowired
    @Qualifier("jdbc_league_data_template")
    SqlSession sqlSession;

    public List<CoachMapping> selectAllCoachMapping() {
        return sqlSession.selectList("selectAllCoachMapping", null);
    }

    public CoachMapping selectCoachMappingById(int Id) {
        return sqlSession.selectOne("selectCoachMappingById", Id);
    }

    public int insertCoachMapping(CoachMapping coachMapping) {
        return sqlSession.insert("insertCoachMapping", coachMapping);
    }

    public int updateCoachMapping(CoachMapping coachMapping) {
        return sqlSession.update("updateCoachMapping", coachMapping);
    }

    public int deleteCoachMappingById(int Id) {
        return sqlSession.delete("deleteCoachMappingById", Id);
    }

    @Override
    public Map<Integer, Long> getMap() {
        List<CoachMapping> list = selectAllCoachMapping();
        Map<Integer, Long> map = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            CoachMapping item = list.get(i);
            map.put(item.getClubCoachId(), item.getDataCoachId());
        }
        return map;
    }
}
