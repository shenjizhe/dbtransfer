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
import com.ninehcom.transfer.entity.DataMatchPlayer;
import com.ninehcom.transfer.service.DataMatchPlayerService;
import com.ninehcom.common.util.Result;
//import com.ninehcom.transfer.jpa.repository.DataMatchPlayerRepository;

/**
 * 比赛球员的控制器
 * @author shenjizhe
 * @version 1.0.0
 */
@Api(basePath = "/transfer", value = "比赛球员", description = "比赛球员", produces = "application/json")
@RestController
@RequestMapping(value = "/transfer")
public class DataMatchPlayerController {

    @Autowired
    DataMatchPlayerService dataMatchPlayerService;
    @ApiOperation(value = "获取所有比赛球员", notes = "获取所有比赛球员", position = 1)
    @RequestMapping(value = "/data-match-player", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAllDataMatchPlayer() {
        return dataMatchPlayerService.selectAllDataMatchPlayer();
    }
    @ApiOperation(value = "获取比赛球员", notes = "获取比赛球员", position = 2)
    @RequestMapping(value = "/data-match-player/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result selectDataMatchPlayerById(
        @ApiParam(value = "比赛球员唯一标识")
        @PathVariable("id") int id) {
        return dataMatchPlayerService.selectDataMatchPlayerById(id);
    }
    @ApiOperation(value = "添加比赛球员", notes = "添加比赛球员", position = 3)
    @RequestMapping(value = "/data-match-player", method = RequestMethod.POST)
    @ResponseBody
    public Result insertDataMatchPlayer(
        @ApiParam(value = "比赛球员")
        @RequestBody DataMatchPlayer dataMatchPlayer) {
        return dataMatchPlayerService.insertDataMatchPlayer(dataMatchPlayer);
    }
    @ApiOperation(value = "修改比赛球员", notes = "修改比赛球员", position = 4)
    @RequestMapping(value = "/data-match-player", method = RequestMethod.PUT)
    @ResponseBody
    public Result updateDataMatchPlayer(
        @ApiParam(value = "比赛球员")
        @RequestBody DataMatchPlayer dataMatchPlayer) {
        return dataMatchPlayerService.updateDataMatchPlayer(dataMatchPlayer);
    }
    @ApiOperation(value = "删除比赛球员", notes = "删除比赛球员", position = 5)
    @RequestMapping(value = "/data-match-player/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteDataMatchPlayerById(
        @ApiParam(value = "比赛球员唯一标识")
        @PathVariable("id") int id) {
        return dataMatchPlayerService.deleteDataMatchPlayerById(id);
    }
}
