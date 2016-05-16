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
import com.ninehcom.transfer.entity.ClubCoachReClub;
import com.ninehcom.transfer.service.ClubCoachReClubService;
import com.ninehcom.common.util.Result;
//import com.ninehcom.transfer.jpa.repository.ClubCoachReClubRepository;

/**
 * 俱乐部教练信息的控制器
 * @author shenjizhe
 * @version 1.0.0
 */
@Api(basePath = "/transfer", value = "俱乐部教练信息", description = "俱乐部教练信息", produces = "application/json")
@RestController
@RequestMapping(value = "/transfer")
public class ClubCoachReClubController {

    @Autowired
    ClubCoachReClubService clubCoachReClubService;
    @ApiOperation(value = "获取所有俱乐部教练信息", notes = "获取所有俱乐部教练信息", position = 1)
    @RequestMapping(value = "/club-coach-re-club", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAllClubCoachReClub() {
        return clubCoachReClubService.selectAllClubCoachReClub();
    }
    @ApiOperation(value = "获取俱乐部教练信息", notes = "获取俱乐部教练信息", position = 2)
    @RequestMapping(value = "/club-coach-re-club/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result selectClubCoachReClubById(
        @ApiParam(value = "俱乐部教练信息唯一标识")
        @PathVariable("id") int id) {
        return clubCoachReClubService.selectClubCoachReClubById(id);
    }
    @ApiOperation(value = "添加俱乐部教练信息", notes = "添加俱乐部教练信息", position = 3)
    @RequestMapping(value = "/club-coach-re-club", method = RequestMethod.POST)
    @ResponseBody
    public Result insertClubCoachReClub(
        @ApiParam(value = "俱乐部教练信息")
        @RequestBody ClubCoachReClub clubCoachReClub) {
        return clubCoachReClubService.insertClubCoachReClub(clubCoachReClub);
    }
    @ApiOperation(value = "修改俱乐部教练信息", notes = "修改俱乐部教练信息", position = 4)
    @RequestMapping(value = "/club-coach-re-club", method = RequestMethod.PUT)
    @ResponseBody
    public Result updateClubCoachReClub(
        @ApiParam(value = "俱乐部教练信息")
        @RequestBody ClubCoachReClub clubCoachReClub) {
        return clubCoachReClubService.updateClubCoachReClub(clubCoachReClub);
    }
    @ApiOperation(value = "删除俱乐部教练信息", notes = "删除俱乐部教练信息", position = 5)
    @RequestMapping(value = "/club-coach-re-club/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteClubCoachReClubById(
        @ApiParam(value = "俱乐部教练信息唯一标识")
        @PathVariable("id") int id) {
        return clubCoachReClubService.deleteClubCoachReClubById(id);
    }
}
