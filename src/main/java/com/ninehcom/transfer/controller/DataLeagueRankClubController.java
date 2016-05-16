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
import com.ninehcom.transfer.entity.DataLeagueRankClub;
import com.ninehcom.transfer.service.DataLeagueRankClubService;
import com.ninehcom.common.util.Result;
//import com.ninehcom.transfer.jpa.repository.DataLeagueRankClubRepository;

/**
 * 联赛积分榜的控制器
 * @author shenjizhe
 * @version 1.0.0
 */
@Api(basePath = "/transfer", value = "联赛积分榜", description = "联赛积分榜", produces = "application/json")
@RestController
@RequestMapping(value = "/transfer")
public class DataLeagueRankClubController {

    @Autowired
    DataLeagueRankClubService dataLeagueRankClubService;
    @ApiOperation(value = "获取所有联赛积分榜", notes = "获取所有联赛积分榜", position = 1)
    @RequestMapping(value = "/data-league-rank-club", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAllDataLeagueRankClub() {
        return dataLeagueRankClubService.selectAllDataLeagueRankClub();
    }
    @ApiOperation(value = "获取联赛积分榜", notes = "获取联赛积分榜", position = 2)
    @RequestMapping(value = "/data-league-rank-club/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result selectDataLeagueRankClubById(
        @ApiParam(value = "联赛积分榜唯一标识")
        @PathVariable("id") int id) {
        return dataLeagueRankClubService.selectDataLeagueRankClubById(id);
    }
    @ApiOperation(value = "添加联赛积分榜", notes = "添加联赛积分榜", position = 3)
    @RequestMapping(value = "/data-league-rank-club", method = RequestMethod.POST)
    @ResponseBody
    public Result insertDataLeagueRankClub(
        @ApiParam(value = "联赛积分榜")
        @RequestBody DataLeagueRankClub dataLeagueRankClub) {
        return dataLeagueRankClubService.insertDataLeagueRankClub(dataLeagueRankClub);
    }
    @ApiOperation(value = "修改联赛积分榜", notes = "修改联赛积分榜", position = 4)
    @RequestMapping(value = "/data-league-rank-club", method = RequestMethod.PUT)
    @ResponseBody
    public Result updateDataLeagueRankClub(
        @ApiParam(value = "联赛积分榜")
        @RequestBody DataLeagueRankClub dataLeagueRankClub) {
        return dataLeagueRankClubService.updateDataLeagueRankClub(dataLeagueRankClub);
    }
    @ApiOperation(value = "删除联赛积分榜", notes = "删除联赛积分榜", position = 5)
    @RequestMapping(value = "/data-league-rank-club/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteDataLeagueRankClubById(
        @ApiParam(value = "联赛积分榜唯一标识")
        @PathVariable("id") int id) {
        return dataLeagueRankClubService.deleteDataLeagueRankClubById(id);
    }
}
