package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.EventType;
import com.ninehcom.transfer.mapper.EventTypeMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * EventType的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class EventTypeService {

    @Autowired
    private  EventTypeMapper  eventTypeMapper;
    public Result selectAllEventType() {
        List<EventType> list = eventTypeMapper.selectAllEventType();
        return Result.Success((ArrayList)list);
    }
    public Result selectEventTypeById(int Id) {
        EventType eventType = eventTypeMapper.selectEventTypeById(Id);
        return Result.Success(eventType);
    }
    public Result insertEventType(EventType eventType) {
        int count = eventTypeMapper.insertEventType(eventType);
        return Result.Success(count);
    }
    public Result updateEventType(EventType eventType) {
        int count = eventTypeMapper.updateEventType(eventType);
        return Result.Success(count);
    }
    public Result deleteEventTypeById(int Id) {
        int count = eventTypeMapper.deleteEventTypeById(Id);
        return Result.Success(count);
    }
}
