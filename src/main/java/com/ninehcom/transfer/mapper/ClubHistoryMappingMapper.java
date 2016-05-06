package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.ClubHistoryMapping;
import com.ninehcom.common.entity.PageParam;
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
 * ClubHistoryMapping的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class ClubHistoryMappingMapper implements IMapper{

    @Autowired
    @Qualifier("jdbc_league_data_template")
    SqlSession sqlSession;
    
    public void reset(List list){
        Map<Integer,Long> map = getMap();
        for (int i = 0; i < list.size(); i++) {
            IReset item = (IReset)list.get(i);
            item.set(map.get(item.get()).intValue());
        }
    }
    
    public Map<Integer,Long> getMap(){
        List<ClubHistoryMapping> list = selectAllClubHistoryMapping();
        Map<Integer,Long> map = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            ClubHistoryMapping item = list.get(i);
            map.put(item.getTeamHistoryId(), item.getClubHistoryId());
        }
        return map;
    }

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
