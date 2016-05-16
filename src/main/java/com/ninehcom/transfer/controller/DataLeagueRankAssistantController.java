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
import com.ninehcom.transfer.entity.DataLeagueRankAssistant;
import com.ninehcom.transfer.service.DataLeagueRankAssistantService;
import com.ninehcom.common.util.Result;
//import com.ninehcom.transfer.jpa.repository.DataLeagueRankAssistantRepository;

/**
 * 联赛助攻榜的控制器
 * @author shenjizhe
 * @version 1.0.0
 */
@Api(basePath = "/transfer", value = "联赛助攻榜", description = "联赛助攻榜", produces = "application/json")
@RestController
@RequestMapping(value = "/transfer")
public class DataLeagueRankAssistantController {

    @Autowired
    DataLeagueRankAssistantService dataLeagueRankAssistantService;
    @ApiOperation(value = "获取所有联赛助攻榜", notes = "获取所有联赛助攻榜", position = 1)
    @RequestMapping(value = "/data-league-rank-assistant", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAllDataLeagueRankAssistant() {
        return dataLeagueRankAssistantService.selectAllDataLeagueRankAssistant();
    }
    @ApiOperation(value = "获取联赛助攻榜", notes = "获取联赛助攻榜", position = 2)
    @RequestMapping(value = "/data-league-rank-assistant/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result selectDataLeagueRankAssistantById(
        @ApiParam(value = "联赛助攻榜唯一标识")
        @PathVariable("id") int id) {
        return dataLeagueRankAssistantService.selectDataLeagueRankAssistantById(id);
    }
    @ApiOperation(value = "添加联赛助攻榜", notes = "添加联赛助攻榜", position = 3)
    @RequestMapping(value = "/data-league-rank-assistant", method = RequestMethod.POST)
    @ResponseBody
    public Result insertDataLeagueRankAssistant(
        @ApiParam(value = "联赛助攻榜")
        @RequestBody DataLeagueRankAssistant dataLeagueRankAssistant) {
        return dataLeagueRankAssistantService.insertDataLeagueRankAssistant(dataLeagueRankAssistant);
    }
    @ApiOperation(value = "修改联赛助攻榜", notes = "修改联赛助攻榜", position = 4)
    @RequestMapping(value = "/data-league-rank-assistant", method = RequestMethod.PUT)
    @ResponseBody
    public Result updateDataLeagueRankAssistant(
        @ApiParam(value = "联赛助攻榜")
        @RequestBody DataLeagueRankAssistant dataLeagueRankAssistant) {
        return dataLeagueRankAssistantService.updateDataLeagueRankAssistant(dataLeagueRankAssistant);
    }
    @ApiOperation(value = "删除联赛助攻榜", notes = "删除联赛助攻榜", position = 5)
    @RequestMapping(value = "/data-league-rank-assistant/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteDataLeagueRankAssistantById(
        @ApiParam(value = "联赛助攻榜唯一标识")
        @PathVariable("id") int id) {
        return dataLeagueRankAssistantService.deleteDataLeagueRankAssistantById(id);
    }
}
