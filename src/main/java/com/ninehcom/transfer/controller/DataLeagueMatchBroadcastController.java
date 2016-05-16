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
import com.ninehcom.transfer.entity.DataLeagueMatchBroadcast;
import com.ninehcom.transfer.service.DataLeagueMatchBroadcastService;
import com.ninehcom.common.util.Result;
//import com.ninehcom.transfer.jpa.repository.DataLeagueMatchBroadcastRepository;

/**
 * 联赛转播的控制器
 * @author shenjizhe
 * @version 1.0.0
 */
@Api(basePath = "/transfer", value = "联赛转播", description = "联赛转播", produces = "application/json")
@RestController
@RequestMapping(value = "/transfer")
public class DataLeagueMatchBroadcastController {

    @Autowired
    DataLeagueMatchBroadcastService dataLeagueMatchBroadcastService;
    @ApiOperation(value = "获取所有联赛转播", notes = "获取所有联赛转播", position = 1)
    @RequestMapping(value = "/data-league-match-broadcast", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAllDataLeagueMatchBroadcast() {
        return dataLeagueMatchBroadcastService.selectAllDataLeagueMatchBroadcast();
    }
    @ApiOperation(value = "获取联赛转播", notes = "获取联赛转播", position = 2)
    @RequestMapping(value = "/data-league-match-broadcast/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result selectDataLeagueMatchBroadcastById(
        @ApiParam(value = "联赛转播唯一标识")
        @PathVariable("id") int id) {
        return dataLeagueMatchBroadcastService.selectDataLeagueMatchBroadcastById(id);
    }
    @ApiOperation(value = "添加联赛转播", notes = "添加联赛转播", position = 3)
    @RequestMapping(value = "/data-league-match-broadcast", method = RequestMethod.POST)
    @ResponseBody
    public Result insertDataLeagueMatchBroadcast(
        @ApiParam(value = "联赛转播")
        @RequestBody DataLeagueMatchBroadcast dataLeagueMatchBroadcast) {
        return dataLeagueMatchBroadcastService.insertDataLeagueMatchBroadcast(dataLeagueMatchBroadcast);
    }
    @ApiOperation(value = "修改联赛转播", notes = "修改联赛转播", position = 4)
    @RequestMapping(value = "/data-league-match-broadcast", method = RequestMethod.PUT)
    @ResponseBody
    public Result updateDataLeagueMatchBroadcast(
        @ApiParam(value = "联赛转播")
        @RequestBody DataLeagueMatchBroadcast dataLeagueMatchBroadcast) {
        return dataLeagueMatchBroadcastService.updateDataLeagueMatchBroadcast(dataLeagueMatchBroadcast);
    }
    @ApiOperation(value = "删除联赛转播", notes = "删除联赛转播", position = 5)
    @RequestMapping(value = "/data-league-match-broadcast/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteDataLeagueMatchBroadcastById(
        @ApiParam(value = "联赛转播唯一标识")
        @PathVariable("id") int id) {
        return dataLeagueMatchBroadcastService.deleteDataLeagueMatchBroadcastById(id);
    }
}
