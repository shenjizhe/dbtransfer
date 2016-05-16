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
import com.ninehcom.transfer.entity.DataLeagueReClub;
import com.ninehcom.transfer.service.DataLeagueReClubService;
import com.ninehcom.common.util.Result;
//import com.ninehcom.transfer.jpa.repository.DataLeagueReClubRepository;

/**
 * 俱乐部联赛关系的控制器
 * @author shenjizhe
 * @version 1.0.0
 */
@Api(basePath = "/transfer", value = "俱乐部联赛关系", description = "俱乐部联赛关系", produces = "application/json")
@RestController
@RequestMapping(value = "/transfer")
public class DataLeagueReClubController {

    @Autowired
    DataLeagueReClubService dataLeagueReClubService;
    @ApiOperation(value = "获取所有俱乐部联赛关系", notes = "获取所有俱乐部联赛关系", position = 1)
    @RequestMapping(value = "/data-league-re-club", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAllDataLeagueReClub() {
        return dataLeagueReClubService.selectAllDataLeagueReClub();
    }
    @ApiOperation(value = "获取俱乐部联赛关系", notes = "获取俱乐部联赛关系", position = 2)
    @RequestMapping(value = "/data-league-re-club/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result selectDataLeagueReClubById(
        @ApiParam(value = "俱乐部联赛关系唯一标识")
        @PathVariable("id") int id) {
        return dataLeagueReClubService.selectDataLeagueReClubById(id);
    }
    @ApiOperation(value = "添加俱乐部联赛关系", notes = "添加俱乐部联赛关系", position = 3)
    @RequestMapping(value = "/data-league-re-club", method = RequestMethod.POST)
    @ResponseBody
    public Result insertDataLeagueReClub(
        @ApiParam(value = "俱乐部联赛关系")
        @RequestBody DataLeagueReClub dataLeagueReClub) {
        return dataLeagueReClubService.insertDataLeagueReClub(dataLeagueReClub);
    }
    @ApiOperation(value = "修改俱乐部联赛关系", notes = "修改俱乐部联赛关系", position = 4)
    @RequestMapping(value = "/data-league-re-club", method = RequestMethod.PUT)
    @ResponseBody
    public Result updateDataLeagueReClub(
        @ApiParam(value = "俱乐部联赛关系")
        @RequestBody DataLeagueReClub dataLeagueReClub) {
        return dataLeagueReClubService.updateDataLeagueReClub(dataLeagueReClub);
    }
    @ApiOperation(value = "删除俱乐部联赛关系", notes = "删除俱乐部联赛关系", position = 5)
    @RequestMapping(value = "/data-league-re-club/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteDataLeagueReClubById(
        @ApiParam(value = "俱乐部联赛关系唯一标识")
        @PathVariable("id") int id) {
        return dataLeagueReClubService.deleteDataLeagueReClubById(id);
    }
}
