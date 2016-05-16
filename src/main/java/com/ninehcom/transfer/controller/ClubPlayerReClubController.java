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
import com.ninehcom.transfer.entity.ClubPlayerReClub;
import com.ninehcom.transfer.service.ClubPlayerReClubService;
import com.ninehcom.common.util.Result;
//import com.ninehcom.transfer.jpa.repository.ClubPlayerReClubRepository;

/**
 * 俱乐部球员信息的控制器
 * @author shenjizhe
 * @version 1.0.0
 */
@Api(basePath = "/transfer", value = "俱乐部球员信息", description = "俱乐部球员信息", produces = "application/json")
@RestController
@RequestMapping(value = "/transfer")
public class ClubPlayerReClubController {

    @Autowired
    ClubPlayerReClubService clubPlayerReClubService;
    @ApiOperation(value = "获取所有俱乐部球员信息", notes = "获取所有俱乐部球员信息", position = 1)
    @RequestMapping(value = "/club-player-re-club", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAllClubPlayerReClub() {
        return clubPlayerReClubService.selectAllClubPlayerReClub();
    }
    @ApiOperation(value = "获取俱乐部球员信息", notes = "获取俱乐部球员信息", position = 2)
    @RequestMapping(value = "/club-player-re-club/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result selectClubPlayerReClubById(
        @ApiParam(value = "俱乐部球员信息唯一标识")
        @PathVariable("id") int id) {
        return clubPlayerReClubService.selectClubPlayerReClubById(id);
    }
    @ApiOperation(value = "添加俱乐部球员信息", notes = "添加俱乐部球员信息", position = 3)
    @RequestMapping(value = "/club-player-re-club", method = RequestMethod.POST)
    @ResponseBody
    public Result insertClubPlayerReClub(
        @ApiParam(value = "俱乐部球员信息")
        @RequestBody ClubPlayerReClub clubPlayerReClub) {
        return clubPlayerReClubService.insertClubPlayerReClub(clubPlayerReClub);
    }
    @ApiOperation(value = "修改俱乐部球员信息", notes = "修改俱乐部球员信息", position = 4)
    @RequestMapping(value = "/club-player-re-club", method = RequestMethod.PUT)
    @ResponseBody
    public Result updateClubPlayerReClub(
        @ApiParam(value = "俱乐部球员信息")
        @RequestBody ClubPlayerReClub clubPlayerReClub) {
        return clubPlayerReClubService.updateClubPlayerReClub(clubPlayerReClub);
    }
    @ApiOperation(value = "删除俱乐部球员信息", notes = "删除俱乐部球员信息", position = 5)
    @RequestMapping(value = "/club-player-re-club/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteClubPlayerReClubById(
        @ApiParam(value = "俱乐部球员信息唯一标识")
        @PathVariable("id") int id) {
        return clubPlayerReClubService.deleteClubPlayerReClubById(id);
    }
}
