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
import com.ninehcom.transfer.entity.DataLeagueRankGoal;
import com.ninehcom.transfer.service.DataLeagueRankGoalService;
import com.ninehcom.common.util.Result;
//import com.ninehcom.transfer.jpa.repository.DataLeagueRankGoalRepository;

/**
 * 联赛射手榜的控制器
 * @author shenjizhe
 * @version 1.0.0
 */
@Api(basePath = "/transfer", value = "联赛射手榜", description = "联赛射手榜", produces = "application/json")
@RestController
@RequestMapping(value = "/transfer")
public class DataLeagueRankGoalController {

    @Autowired
    DataLeagueRankGoalService dataLeagueRankGoalService;
    @ApiOperation(value = "获取所有联赛射手榜", notes = "获取所有联赛射手榜", position = 1)
    @RequestMapping(value = "/data-league-rank-goal", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAllDataLeagueRankGoal() {
        return dataLeagueRankGoalService.selectAllDataLeagueRankGoal();
    }
    @ApiOperation(value = "获取联赛射手榜", notes = "获取联赛射手榜", position = 2)
    @RequestMapping(value = "/data-league-rank-goal/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result selectDataLeagueRankGoalById(
        @ApiParam(value = "联赛射手榜唯一标识")
        @PathVariable("id") int id) {
        return dataLeagueRankGoalService.selectDataLeagueRankGoalById(id);
    }
    @ApiOperation(value = "添加联赛射手榜", notes = "添加联赛射手榜", position = 3)
    @RequestMapping(value = "/data-league-rank-goal", method = RequestMethod.POST)
    @ResponseBody
    public Result insertDataLeagueRankGoal(
        @ApiParam(value = "联赛射手榜")
        @RequestBody DataLeagueRankGoal dataLeagueRankGoal) {
        return dataLeagueRankGoalService.insertDataLeagueRankGoal(dataLeagueRankGoal);
    }
    @ApiOperation(value = "修改联赛射手榜", notes = "修改联赛射手榜", position = 4)
    @RequestMapping(value = "/data-league-rank-goal", method = RequestMethod.PUT)
    @ResponseBody
    public Result updateDataLeagueRankGoal(
        @ApiParam(value = "联赛射手榜")
        @RequestBody DataLeagueRankGoal dataLeagueRankGoal) {
        return dataLeagueRankGoalService.updateDataLeagueRankGoal(dataLeagueRankGoal);
    }
    @ApiOperation(value = "删除联赛射手榜", notes = "删除联赛射手榜", position = 5)
    @RequestMapping(value = "/data-league-rank-goal/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteDataLeagueRankGoalById(
        @ApiParam(value = "联赛射手榜唯一标识")
        @PathVariable("id") int id) {
        return dataLeagueRankGoalService.deleteDataLeagueRankGoalById(id);
    }
}
