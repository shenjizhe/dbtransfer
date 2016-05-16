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
import com.ninehcom.transfer.entity.ClubHistoryMapping;
import com.ninehcom.transfer.service.ClubHistoryMappingService;
import com.ninehcom.common.util.Result;
//import com.ninehcom.transfer.jpa.repository.ClubHistoryMappingRepository;

/**
 * 俱乐部历史ID映射表的控制器
 * @author shenjizhe
 * @version 1.0.0
 */
@Api(basePath = "/transfer", value = "俱乐部历史ID映射表", description = "俱乐部历史ID映射表", produces = "application/json")
@RestController
@RequestMapping(value = "/transfer")
public class ClubHistoryMappingController {

    @Autowired
    ClubHistoryMappingService clubHistoryMappingService;
    @ApiOperation(value = "获取所有俱乐部历史ID映射表", notes = "获取所有俱乐部历史ID映射表", position = 1)
    @RequestMapping(value = "/club-history-mapping", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAllClubHistoryMapping() {
        return clubHistoryMappingService.selectAllClubHistoryMapping();
    }
    @ApiOperation(value = "获取俱乐部历史ID映射表", notes = "获取俱乐部历史ID映射表", position = 2)
    @RequestMapping(value = "/club-history-mapping/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result selectClubHistoryMappingById(
        @ApiParam(value = "俱乐部历史ID映射表唯一标识")
        @PathVariable("id") int id) {
        return clubHistoryMappingService.selectClubHistoryMappingById(id);
    }
    @ApiOperation(value = "添加俱乐部历史ID映射表", notes = "添加俱乐部历史ID映射表", position = 3)
    @RequestMapping(value = "/club-history-mapping", method = RequestMethod.POST)
    @ResponseBody
    public Result insertClubHistoryMapping(
        @ApiParam(value = "俱乐部历史ID映射表")
        @RequestBody ClubHistoryMapping clubHistoryMapping) {
        return clubHistoryMappingService.insertClubHistoryMapping(clubHistoryMapping);
    }
    @ApiOperation(value = "修改俱乐部历史ID映射表", notes = "修改俱乐部历史ID映射表", position = 4)
    @RequestMapping(value = "/club-history-mapping", method = RequestMethod.PUT)
    @ResponseBody
    public Result updateClubHistoryMapping(
        @ApiParam(value = "俱乐部历史ID映射表")
        @RequestBody ClubHistoryMapping clubHistoryMapping) {
        return clubHistoryMappingService.updateClubHistoryMapping(clubHistoryMapping);
    }
    @ApiOperation(value = "删除俱乐部历史ID映射表", notes = "删除俱乐部历史ID映射表", position = 5)
    @RequestMapping(value = "/club-history-mapping/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteClubHistoryMappingById(
        @ApiParam(value = "俱乐部历史ID映射表唯一标识")
        @PathVariable("id") int id) {
        return clubHistoryMappingService.deleteClubHistoryMappingById(id);
    }
}
