package com.ninehcom.transfer.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import com.ninehcom.transfer.entity.EventType;
import com.ninehcom.transfer.service.EventTypeService;
import com.ninehcom.common.util.Result;
//import com.ninehcom.transfer.jpa.repository.EventTypeRepository;

/**
 * 事件类型的控制器
 * @author shenjizhe
 * @version 1.0.0
 */
@Api(basePath = "/transfer", value = "事件类型", description = "事件类型", produces = "application/json")
@RestController
@RequestMapping(value = "/transfer")
public class EventTypeController {

    @Autowired
    EventTypeService eventTypeService;
    @ApiOperation(value = "获取所有事件类型", notes = "获取所有事件类型", position = 1)
    @RequestMapping(value = "/event-type", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAllEventType() {
        return eventTypeService.selectAllEventType();
    }
    @ApiOperation(value = "获取事件类型", notes = "获取事件类型", position = 2)
    @RequestMapping(value = "/event-type/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result selectEventTypeById(
        @ApiParam(value = "事件类型唯一标识")
        @PathVariable("id") int id) {
        return eventTypeService.selectEventTypeById(id);
    }
    @ApiOperation(value = "添加事件类型", notes = "添加事件类型", position = 3)
    @RequestMapping(value = "/event-type", method = RequestMethod.POST)
    @ResponseBody
    public Result insertEventType(
        @ApiParam(value = "事件类型")
        @RequestBody EventType eventType) {
        return eventTypeService.insertEventType(eventType);
    }
    @ApiOperation(value = "修改事件类型", notes = "修改事件类型", position = 4)
    @RequestMapping(value = "/event-type", method = RequestMethod.PUT)
    @ResponseBody
    public Result updateEventType(
        @ApiParam(value = "事件类型")
        @RequestBody EventType eventType) {
        return eventTypeService.updateEventType(eventType);
    }
    @ApiOperation(value = "删除事件类型", notes = "删除事件类型", position = 5)
    @RequestMapping(value = "/event-type/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteEventTypeById(
        @ApiParam(value = "事件类型唯一标识")
        @PathVariable("id") int id) {
        return eventTypeService.deleteEventTypeById(id);
    }
}
