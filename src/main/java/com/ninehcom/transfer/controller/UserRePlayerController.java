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
import com.ninehcom.transfer.entity.UserRePlayer;
import com.ninehcom.transfer.service.UserRePlayerService;
import com.ninehcom.common.util.Result;
//import com.ninehcom.transfer.jpa.repository.UserRePlayerRepository;

/**
 * 的控制器
 * @author shenjizhe
 * @version 1.0.0
 */
@Api(basePath = "/transfer", value = "", description = "", produces = "application/json")
@RestController
@RequestMapping(value = "/transfer")
public class UserRePlayerController {

    @Autowired
    UserRePlayerService userRePlayerService;
    @ApiOperation(value = "获取所有", notes = "获取所有", position = 1)
    @RequestMapping(value = "/user-re-player", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAllUserRePlayer() {
        return userRePlayerService.selectAllUserRePlayer();
    }
    @ApiOperation(value = "获取", notes = "获取", position = 2)
    @RequestMapping(value = "/user-re-player/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result selectUserRePlayerById(
        @ApiParam(value = "唯一标识")
        @PathVariable("id") int id) {
        return userRePlayerService.selectUserRePlayerById(id);
    }
    @ApiOperation(value = "添加", notes = "添加", position = 3)
    @RequestMapping(value = "/user-re-player", method = RequestMethod.POST)
    @ResponseBody
    public Result insertUserRePlayer(
        @ApiParam(value = "")
        @RequestBody UserRePlayer userRePlayer) {
        return userRePlayerService.insertUserRePlayer(userRePlayer);
    }
    @ApiOperation(value = "修改", notes = "修改", position = 4)
    @RequestMapping(value = "/user-re-player", method = RequestMethod.PUT)
    @ResponseBody
    public Result updateUserRePlayer(
        @ApiParam(value = "")
        @RequestBody UserRePlayer userRePlayer) {
        return userRePlayerService.updateUserRePlayer(userRePlayer);
    }
    @ApiOperation(value = "删除", notes = "删除", position = 5)
    @RequestMapping(value = "/user-re-player/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteUserRePlayerById(
        @ApiParam(value = "唯一标识")
        @PathVariable("id") int id) {
        return userRePlayerService.deleteUserRePlayerById(id);
    }
}
