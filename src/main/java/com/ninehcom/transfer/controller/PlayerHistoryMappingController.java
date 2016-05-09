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
import com.ninehcom.transfer.entity.PlayerHistoryMapping;
import com.ninehcom.transfer.service.PlayerHistoryMappingService;
import com.ninehcom.common.util.Result;
//import com.ninehcom.transfer.jpa.repository.PlayerHistoryMappingRepository;

/**
 * 球员历史映射的控制器
 * @author shenjizhe
 * @version 1.0.0
 */
@Api(basePath = "/transfer", value = "球员历史映射", description = "球员历史映射", produces = "application/json")
@RestController
@RequestMapping(value = "/transfer")
public class PlayerHistoryMappingController {

    @Autowired
    PlayerHistoryMappingService playerHistoryMappingService;
    @ApiOperation(value = "获取所有球员历史映射", notes = "获取所有球员历史映射", position = 1)
    @RequestMapping(value = "/player-history-mapping", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAllPlayerHistoryMapping() {
        return playerHistoryMappingService.selectAllPlayerHistoryMapping();
    }
    @ApiOperation(value = "获取球员历史映射", notes = "获取球员历史映射", position = 2)
    @RequestMapping(value = "/player-history-mapping/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result selectPlayerHistoryMappingById(
        @ApiParam(value = "球员历史映射唯一标识")
        @PathVariable("id") int id) {
        return playerHistoryMappingService.selectPlayerHistoryMappingById(id);
    }
    @ApiOperation(value = "添加球员历史映射", notes = "添加球员历史映射", position = 3)
    @RequestMapping(value = "/player-history-mapping", method = RequestMethod.POST)
    @ResponseBody
    public Result insertPlayerHistoryMapping(
        @ApiParam(value = "球员历史映射")
        @RequestBody PlayerHistoryMapping playerHistoryMapping) {
        return playerHistoryMappingService.insertPlayerHistoryMapping(playerHistoryMapping);
    }
    @ApiOperation(value = "修改球员历史映射", notes = "修改球员历史映射", position = 4)
    @RequestMapping(value = "/player-history-mapping", method = RequestMethod.PUT)
    @ResponseBody
    public Result updatePlayerHistoryMapping(
        @ApiParam(value = "球员历史映射")
        @RequestBody PlayerHistoryMapping playerHistoryMapping) {
        return playerHistoryMappingService.updatePlayerHistoryMapping(playerHistoryMapping);
    }
    @ApiOperation(value = "删除球员历史映射", notes = "删除球员历史映射", position = 5)
    @RequestMapping(value = "/player-history-mapping/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result deletePlayerHistoryMappingById(
        @ApiParam(value = "球员历史映射唯一标识")
        @PathVariable("id") int id) {
        return playerHistoryMappingService.deletePlayerHistoryMappingById(id);
    }
}
