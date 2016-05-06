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
import com.ninehcom.transfer.entity.DataPlayerReClub;
import com.ninehcom.transfer.service.DataPlayerReClubService;
import com.ninehcom.common.util.Result;
//import com.ninehcom.transfer.jpa.repository.DataPlayerReClubRepository;

/**
 * 球员历史的控制器
 * @author shenjizhe
 * @version 1.0.0
 */
@Api(basePath = "/transfer", value = "球员历史", description = "球员历史", produces = "application/json")
@RestController
@RequestMapping(value = "/transfer")
public class DataPlayerReClubController {

    @Autowired
    DataPlayerReClubService dataPlayerReClubService;
    @ApiOperation(value = "获取所有球员历史", notes = "获取所有球员历史", position = 1)
    @RequestMapping(value = "/data-player-re-club", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAllDataPlayerReClub() {
        return dataPlayerReClubService.selectAllDataPlayerReClub();
    }
    @ApiOperation(value = "获取球员历史", notes = "获取球员历史", position = 2)
    @RequestMapping(value = "/data-player-re-club/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result selectDataPlayerReClubById(
        @ApiParam(value = "球员历史唯一标识")
        @PathVariable("id") int id) {
        return dataPlayerReClubService.selectDataPlayerReClubById(id);
    }
    @ApiOperation(value = "添加球员历史", notes = "添加球员历史", position = 3)
    @RequestMapping(value = "/data-player-re-club", method = RequestMethod.POST)
    @ResponseBody
    public Result insertDataPlayerReClub(
        @ApiParam(value = "球员历史")
        @RequestBody DataPlayerReClub dataPlayerReClub) {
        return dataPlayerReClubService.insertDataPlayerReClub(dataPlayerReClub);
    }
    @ApiOperation(value = "修改球员历史", notes = "修改球员历史", position = 4)
    @RequestMapping(value = "/data-player-re-club", method = RequestMethod.PUT)
    @ResponseBody
    public Result updateDataPlayerReClub(
        @ApiParam(value = "球员历史")
        @RequestBody DataPlayerReClub dataPlayerReClub) {
        return dataPlayerReClubService.updateDataPlayerReClub(dataPlayerReClub);
    }
    @ApiOperation(value = "删除球员历史", notes = "删除球员历史", position = 5)
    @RequestMapping(value = "/data-player-re-club/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteDataPlayerReClubById(
        @ApiParam(value = "球员历史唯一标识")
        @PathVariable("id") int id) {
        return dataPlayerReClubService.deleteDataPlayerReClubById(id);
    }
}
