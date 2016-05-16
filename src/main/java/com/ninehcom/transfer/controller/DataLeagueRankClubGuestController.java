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
import com.ninehcom.transfer.entity.DataLeagueRankClubGuest;
import com.ninehcom.transfer.service.DataLeagueRankClubGuestService;
import com.ninehcom.common.util.Result;
//import com.ninehcom.transfer.jpa.repository.DataLeagueRankClubGuestRepository;

/**
 * 联赛客场积分榜的控制器
 * @author shenjizhe
 * @version 1.0.0
 */
@Api(basePath = "/transfer", value = "联赛客场积分榜", description = "联赛客场积分榜", produces = "application/json")
@RestController
@RequestMapping(value = "/transfer")
public class DataLeagueRankClubGuestController {

    @Autowired
    DataLeagueRankClubGuestService dataLeagueRankClubGuestService;
    @ApiOperation(value = "获取所有联赛客场积分榜", notes = "获取所有联赛客场积分榜", position = 1)
    @RequestMapping(value = "/data-league-rank-club-guest", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAllDataLeagueRankClubGuest() {
        return dataLeagueRankClubGuestService.selectAllDataLeagueRankClubGuest();
    }
    @ApiOperation(value = "获取联赛客场积分榜", notes = "获取联赛客场积分榜", position = 2)
    @RequestMapping(value = "/data-league-rank-club-guest/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result selectDataLeagueRankClubGuestById(
        @ApiParam(value = "联赛客场积分榜唯一标识")
        @PathVariable("id") int id) {
        return dataLeagueRankClubGuestService.selectDataLeagueRankClubGuestById(id);
    }
    @ApiOperation(value = "添加联赛客场积分榜", notes = "添加联赛客场积分榜", position = 3)
    @RequestMapping(value = "/data-league-rank-club-guest", method = RequestMethod.POST)
    @ResponseBody
    public Result insertDataLeagueRankClubGuest(
        @ApiParam(value = "联赛客场积分榜")
        @RequestBody DataLeagueRankClubGuest dataLeagueRankClubGuest) {
        return dataLeagueRankClubGuestService.insertDataLeagueRankClubGuest(dataLeagueRankClubGuest);
    }
    @ApiOperation(value = "修改联赛客场积分榜", notes = "修改联赛客场积分榜", position = 4)
    @RequestMapping(value = "/data-league-rank-club-guest", method = RequestMethod.PUT)
    @ResponseBody
    public Result updateDataLeagueRankClubGuest(
        @ApiParam(value = "联赛客场积分榜")
        @RequestBody DataLeagueRankClubGuest dataLeagueRankClubGuest) {
        return dataLeagueRankClubGuestService.updateDataLeagueRankClubGuest(dataLeagueRankClubGuest);
    }
    @ApiOperation(value = "删除联赛客场积分榜", notes = "删除联赛客场积分榜", position = 5)
    @RequestMapping(value = "/data-league-rank-club-guest/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteDataLeagueRankClubGuestById(
        @ApiParam(value = "联赛客场积分榜唯一标识")
        @PathVariable("id") int id) {
        return dataLeagueRankClubGuestService.deleteDataLeagueRankClubGuestById(id);
    }
}
