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
import com.ninehcom.transfer.entity.PlayerPositionType;
import com.ninehcom.transfer.service.PlayerPositionTypeService;
import com.ninehcom.common.util.Result;
//import com.ninehcom.transfer.jpa.repository.PlayerPositionTypeRepository;

/**
 * 球员类型的控制器
 * @author shenjizhe
 * @version 1.0.0
 */
@Api(basePath = "/transfer", value = "球员类型", description = "球员类型", produces = "application/json")
@RestController
@RequestMapping(value = "/transfer")
public class PlayerPositionTypeController {

    @Autowired
    PlayerPositionTypeService playerPositionTypeService;
    @ApiOperation(value = "获取所有球员类型", notes = "获取所有球员类型", position = 1)
    @RequestMapping(value = "/player-position-type", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAllPlayerPositionType() {
        return playerPositionTypeService.selectAllPlayerPositionType();
    }
    @ApiOperation(value = "获取球员类型", notes = "获取球员类型", position = 2)
    @RequestMapping(value = "/player-position-type/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result selectPlayerPositionTypeById(
        @ApiParam(value = "球员类型唯一标识")
        @PathVariable("id") int id) {
        return playerPositionTypeService.selectPlayerPositionTypeById(id);
    }
    @ApiOperation(value = "添加球员类型", notes = "添加球员类型", position = 3)
    @RequestMapping(value = "/player-position-type", method = RequestMethod.POST)
    @ResponseBody
    public Result insertPlayerPositionType(
        @ApiParam(value = "球员类型")
        @RequestBody PlayerPositionType playerPositionType) {
        return playerPositionTypeService.insertPlayerPositionType(playerPositionType);
    }
    @ApiOperation(value = "修改球员类型", notes = "修改球员类型", position = 4)
    @RequestMapping(value = "/player-position-type", method = RequestMethod.PUT)
    @ResponseBody
    public Result updatePlayerPositionType(
        @ApiParam(value = "球员类型")
        @RequestBody PlayerPositionType playerPositionType) {
        return playerPositionTypeService.updatePlayerPositionType(playerPositionType);
    }
    @ApiOperation(value = "删除球员类型", notes = "删除球员类型", position = 5)
    @RequestMapping(value = "/player-position-type/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result deletePlayerPositionTypeById(
        @ApiParam(value = "球员类型唯一标识")
        @PathVariable("id") int id) {
        return playerPositionTypeService.deletePlayerPositionTypeById(id);
    }
}
