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
import com.ninehcom.transfer.entity.DataLeagueRankClubHome;
import com.ninehcom.transfer.service.DataLeagueRankClubHomeService;
import com.ninehcom.common.util.Result;
//import com.ninehcom.transfer.jpa.repository.DataLeagueRankClubHomeRepository;

/**
 * 联赛主场积分榜的控制器
 * @author shenjizhe
 * @version 1.0.0
 */
@Api(basePath = "/transfer", value = "联赛主场积分榜", description = "联赛主场积分榜", produces = "application/json")
@RestController
@RequestMapping(value = "/transfer")
public class DataLeagueRankClubHomeController {

    @Autowired
    DataLeagueRankClubHomeService dataLeagueRankClubHomeService;
    @ApiOperation(value = "获取所有联赛主场积分榜", notes = "获取所有联赛主场积分榜", position = 1)
    @RequestMapping(value = "/data-league-rank-club-home", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAllDataLeagueRankClubHome() {
        return dataLeagueRankClubHomeService.selectAllDataLeagueRankClubHome();
    }
    @ApiOperation(value = "获取联赛主场积分榜", notes = "获取联赛主场积分榜", position = 2)
    @RequestMapping(value = "/data-league-rank-club-home/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result selectDataLeagueRankClubHomeById(
        @ApiParam(value = "联赛主场积分榜唯一标识")
        @PathVariable("id") int id) {
        return dataLeagueRankClubHomeService.selectDataLeagueRankClubHomeById(id);
    }
    @ApiOperation(value = "添加联赛主场积分榜", notes = "添加联赛主场积分榜", position = 3)
    @RequestMapping(value = "/data-league-rank-club-home", method = RequestMethod.POST)
    @ResponseBody
    public Result insertDataLeagueRankClubHome(
        @ApiParam(value = "联赛主场积分榜")
        @RequestBody DataLeagueRankClubHome dataLeagueRankClubHome) {
        return dataLeagueRankClubHomeService.insertDataLeagueRankClubHome(dataLeagueRankClubHome);
    }
    @ApiOperation(value = "修改联赛主场积分榜", notes = "修改联赛主场积分榜", position = 4)
    @RequestMapping(value = "/data-league-rank-club-home", method = RequestMethod.PUT)
    @ResponseBody
    public Result updateDataLeagueRankClubHome(
        @ApiParam(value = "联赛主场积分榜")
        @RequestBody DataLeagueRankClubHome dataLeagueRankClubHome) {
        return dataLeagueRankClubHomeService.updateDataLeagueRankClubHome(dataLeagueRankClubHome);
    }
    @ApiOperation(value = "删除联赛主场积分榜", notes = "删除联赛主场积分榜", position = 5)
    @RequestMapping(value = "/data-league-rank-club-home/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteDataLeagueRankClubHomeById(
        @ApiParam(value = "联赛主场积分榜唯一标识")
        @PathVariable("id") int id) {
        return dataLeagueRankClubHomeService.deleteDataLeagueRankClubHomeById(id);
    }
}
