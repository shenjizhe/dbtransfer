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
import com.ninehcom.transfer.entity.PlayerLineType;
import com.ninehcom.transfer.service.PlayerLineTypeService;
import com.ninehcom.common.util.Result;
//import com.ninehcom.transfer.jpa.repository.PlayerLineTypeRepository;

/**
 * 球员阵容类型的控制器
 * @author shenjizhe
 * @version 1.0.0
 */
@Api(basePath = "/transfer", value = "球员阵容类型", description = "球员阵容类型", produces = "application/json")
@RestController
@RequestMapping(value = "/transfer")
public class PlayerLineTypeController {

    @Autowired
    PlayerLineTypeService playerLineTypeService;
    @ApiOperation(value = "获取所有球员阵容类型", notes = "获取所有球员阵容类型", position = 1)
    @RequestMapping(value = "/player-line-type", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAllPlayerLineType() {
        return playerLineTypeService.selectAllPlayerLineType();
    }
    @ApiOperation(value = "获取球员阵容类型", notes = "获取球员阵容类型", position = 2)
    @RequestMapping(value = "/player-line-type/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result selectPlayerLineTypeById(
        @ApiParam(value = "球员阵容类型唯一标识")
        @PathVariable("id") int id) {
        return playerLineTypeService.selectPlayerLineTypeById(id);
    }
    @ApiOperation(value = "添加球员阵容类型", notes = "添加球员阵容类型", position = 3)
    @RequestMapping(value = "/player-line-type", method = RequestMethod.POST)
    @ResponseBody
    public Result insertPlayerLineType(
        @ApiParam(value = "球员阵容类型")
        @RequestBody PlayerLineType playerLineType) {
        return playerLineTypeService.insertPlayerLineType(playerLineType);
    }
    @ApiOperation(value = "修改球员阵容类型", notes = "修改球员阵容类型", position = 4)
    @RequestMapping(value = "/player-line-type", method = RequestMethod.PUT)
    @ResponseBody
    public Result updatePlayerLineType(
        @ApiParam(value = "球员阵容类型")
        @RequestBody PlayerLineType playerLineType) {
        return playerLineTypeService.updatePlayerLineType(playerLineType);
    }
    @ApiOperation(value = "删除球员阵容类型", notes = "删除球员阵容类型", position = 5)
    @RequestMapping(value = "/player-line-type/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result deletePlayerLineTypeById(
        @ApiParam(value = "球员阵容类型唯一标识")
        @PathVariable("id") int id) {
        return playerLineTypeService.deletePlayerLineTypeById(id);
    }
}
