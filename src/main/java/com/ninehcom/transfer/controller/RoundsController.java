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
import com.ninehcom.transfer.entity.Rounds;
import com.ninehcom.transfer.service.RoundsService;
import com.ninehcom.common.util.Result;
//import com.ninehcom.transfer.jpa.repository.RoundsRepository;

/**
 * 轮次的控制器
 * @author shenjizhe
 * @version 1.0.0
 */
@Api(basePath = "/transfer", value = "轮次", description = "轮次", produces = "application/json")
@RestController
@RequestMapping(value = "/transfer")
public class RoundsController {

    @Autowired
    RoundsService roundsService;
    @ApiOperation(value = "获取所有轮次", notes = "获取所有轮次", position = 1)
    @RequestMapping(value = "/rounds", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAllRounds() {
        return roundsService.selectAllRounds();
    }
    @ApiOperation(value = "获取轮次", notes = "获取轮次", position = 2)
    @RequestMapping(value = "/rounds/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result selectRoundsById(
        @ApiParam(value = "轮次唯一标识")
        @PathVariable("id") int id) {
        return roundsService.selectRoundsById(id);
    }
    @ApiOperation(value = "添加轮次", notes = "添加轮次", position = 3)
    @RequestMapping(value = "/rounds", method = RequestMethod.POST)
    @ResponseBody
    public Result insertRounds(
        @ApiParam(value = "轮次")
        @RequestBody Rounds rounds) {
        return roundsService.insertRounds(rounds);
    }
    @ApiOperation(value = "修改轮次", notes = "修改轮次", position = 4)
    @RequestMapping(value = "/rounds", method = RequestMethod.PUT)
    @ResponseBody
    public Result updateRounds(
        @ApiParam(value = "轮次")
        @RequestBody Rounds rounds) {
        return roundsService.updateRounds(rounds);
    }
    @ApiOperation(value = "删除轮次", notes = "删除轮次", position = 5)
    @RequestMapping(value = "/rounds/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteRoundsById(
        @ApiParam(value = "轮次唯一标识")
        @PathVariable("id") int id) {
        return roundsService.deleteRoundsById(id);
    }
}
