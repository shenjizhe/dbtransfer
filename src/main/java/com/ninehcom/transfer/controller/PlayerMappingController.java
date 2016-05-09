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
import com.ninehcom.transfer.entity.PlayerMapping;
import com.ninehcom.transfer.service.PlayerMappingService;
import com.ninehcom.common.util.Result;
//import com.ninehcom.transfer.jpa.repository.PlayerMappingRepository;

/**
 * 球员映射的控制器
 * @author shenjizhe
 * @version 1.0.0
 */
@Api(basePath = "/transfer", value = "球员映射", description = "球员映射", produces = "application/json")
@RestController
@RequestMapping(value = "/transfer")
public class PlayerMappingController {

    @Autowired
    PlayerMappingService playerMappingService;
    @ApiOperation(value = "获取所有球员映射", notes = "获取所有球员映射", position = 1)
    @RequestMapping(value = "/player-mapping", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAllPlayerMapping() {
        return playerMappingService.selectAllPlayerMapping();
    }
    @ApiOperation(value = "获取球员映射", notes = "获取球员映射", position = 2)
    @RequestMapping(value = "/player-mapping/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result selectPlayerMappingById(
        @ApiParam(value = "球员映射唯一标识")
        @PathVariable("id") int id) {
        return playerMappingService.selectPlayerMappingById(id);
    }
    @ApiOperation(value = "添加球员映射", notes = "添加球员映射", position = 3)
    @RequestMapping(value = "/player-mapping", method = RequestMethod.POST)
    @ResponseBody
    public Result insertPlayerMapping(
        @ApiParam(value = "球员映射")
        @RequestBody PlayerMapping playerMapping) {
        return playerMappingService.insertPlayerMapping(playerMapping);
    }
    @ApiOperation(value = "修改球员映射", notes = "修改球员映射", position = 4)
    @RequestMapping(value = "/player-mapping", method = RequestMethod.PUT)
    @ResponseBody
    public Result updatePlayerMapping(
        @ApiParam(value = "球员映射")
        @RequestBody PlayerMapping playerMapping) {
        return playerMappingService.updatePlayerMapping(playerMapping);
    }
    @ApiOperation(value = "删除球员映射", notes = "删除球员映射", position = 5)
    @RequestMapping(value = "/player-mapping/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result deletePlayerMappingById(
        @ApiParam(value = "球员映射唯一标识")
        @PathVariable("id") int id) {
        return playerMappingService.deletePlayerMappingById(id);
    }
}
