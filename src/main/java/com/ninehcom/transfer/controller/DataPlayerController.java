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
import com.ninehcom.transfer.entity.DataPlayer;
import com.ninehcom.transfer.service.DataPlayerService;
import com.ninehcom.common.util.Result;
//import com.ninehcom.transfer.jpa.repository.DataPlayerRepository;

/**
 * 球员的控制器
 * @author shenjizhe
 * @version 1.0.0
 */
@Api(basePath = "/transfer", value = "球员", description = "球员", produces = "application/json")
@RestController
@RequestMapping(value = "/transfer")
public class DataPlayerController {

    @Autowired
    DataPlayerService dataPlayerService;
    @ApiOperation(value = "获取所有球员", notes = "获取所有球员", position = 1)
    @RequestMapping(value = "/data-player", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAllDataPlayer() {
        return dataPlayerService.selectAllDataPlayer();
    }
    @ApiOperation(value = "获取球员", notes = "获取球员", position = 2)
    @RequestMapping(value = "/data-player/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result selectDataPlayerById(
        @ApiParam(value = "球员唯一标识")
        @PathVariable("id") int id) {
        return dataPlayerService.selectDataPlayerById(id);
    }
    @ApiOperation(value = "添加球员", notes = "添加球员", position = 3)
    @RequestMapping(value = "/data-player", method = RequestMethod.POST)
    @ResponseBody
    public Result insertDataPlayer(
        @ApiParam(value = "球员")
        @RequestBody DataPlayer dataPlayer) {
        return dataPlayerService.insertDataPlayer(dataPlayer);
    }
    @ApiOperation(value = "修改球员", notes = "修改球员", position = 4)
    @RequestMapping(value = "/data-player", method = RequestMethod.PUT)
    @ResponseBody
    public Result updateDataPlayer(
        @ApiParam(value = "球员")
        @RequestBody DataPlayer dataPlayer) {
        return dataPlayerService.updateDataPlayer(dataPlayer);
    }
    @ApiOperation(value = "删除球员", notes = "删除球员", position = 5)
    @RequestMapping(value = "/data-player/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteDataPlayerById(
        @ApiParam(value = "球员唯一标识")
        @PathVariable("id") int id) {
        return dataPlayerService.deleteDataPlayerById(id);
    }
}
