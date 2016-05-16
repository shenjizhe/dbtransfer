package com.ninehcom.transfer.controller;

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
import com.ninehcom.transfer.entity.DataMatchEvent;
import com.ninehcom.transfer.service.DataMatchEventService;
import com.ninehcom.common.util.Result;
//import com.ninehcom.transfer.jpa.repository.DataMatchEventRepository;

/**
 * 赛事事件的控制器
 * @author shenjizhe
 * @version 1.0.0
 */
@Api(basePath = "/transfer", value = "赛事事件", description = "赛事事件", produces = "application/json")
@RestController
@RequestMapping(value = "/transfer")
public class DataMatchEventController {

    @Autowired
    DataMatchEventService dataMatchEventService;
    @ApiOperation(value = "获取所有赛事事件", notes = "获取所有赛事事件", position = 1)
    @RequestMapping(value = "/data-match-event", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAllDataMatchEvent() {
        return dataMatchEventService.selectAllDataMatchEvent();
    }
    @ApiOperation(value = "获取赛事事件", notes = "获取赛事事件", position = 2)
    @RequestMapping(value = "/data-match-event/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result selectDataMatchEventById(
        @ApiParam(value = "赛事事件唯一标识")
        @PathVariable("id") int id) {
        return dataMatchEventService.selectDataMatchEventById(id);
    }
    @ApiOperation(value = "添加赛事事件", notes = "添加赛事事件", position = 3)
    @RequestMapping(value = "/data-match-event", method = RequestMethod.POST)
    @ResponseBody
    public Result insertDataMatchEvent(
        @ApiParam(value = "赛事事件")
        @RequestBody DataMatchEvent dataMatchEvent) {
        return dataMatchEventService.insertDataMatchEvent(dataMatchEvent);
    }
    @ApiOperation(value = "修改赛事事件", notes = "修改赛事事件", position = 4)
    @RequestMapping(value = "/data-match-event", method = RequestMethod.PUT)
    @ResponseBody
    public Result updateDataMatchEvent(
        @ApiParam(value = "赛事事件")
        @RequestBody DataMatchEvent dataMatchEvent) {
        return dataMatchEventService.updateDataMatchEvent(dataMatchEvent);
    }
    @ApiOperation(value = "删除赛事事件", notes = "删除赛事事件", position = 5)
    @RequestMapping(value = "/data-match-event/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteDataMatchEventById(
        @ApiParam(value = "赛事事件唯一标识")
        @PathVariable("id") int id) {
        return dataMatchEventService.deleteDataMatchEventById(id);
    }
}
