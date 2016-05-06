package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.EventType;
import com.ninehcom.common.entity.PageParam;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * EventType的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class EventTypeMapper {

    @Autowired
    @Qualifier("jdbc_league_data_template")
    SqlSession sqlSession;

    public List<EventType> selectAllEventType(){
	return sqlSession.selectList("selectAllEventType", null);
    }

    public EventType selectEventTypeById(int Id){
	return sqlSession.selectOne("selectEventTypeById", Id);
    }

    public int insertEventType(EventType eventType){
	return sqlSession.insert("insertEventType", eventType);
    }

    public int updateEventType(EventType eventType){
	return sqlSession.update("updateEventType", eventType);
    }

    public int deleteEventTypeById(int Id){
	return sqlSession.delete("deleteEventTypeById", Id);
    }
}
