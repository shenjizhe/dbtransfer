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
import com.ninehcom.transfer.entity.ShootRank;
import com.ninehcom.transfer.service.ShootRankService;
import com.ninehcom.common.util.Result;
//import com.ninehcom.transfer.jpa.repository.ShootRankRepository;

/**
 * VIEW的控制器
 * @author shenjizhe
 * @version 1.0.0
 */
@Api(basePath = "/transfer", value = "VIEW", description = "VIEW", produces = "application/json")
@RestController
@RequestMapping(value = "/transfer")
public class ShootRankController {

    @Autowired
    ShootRankService shootRankService;
    @ApiOperation(value = "获取所有VIEW", notes = "获取所有VIEW", position = 1)
    @RequestMapping(value = "/shoot-rank", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAllShootRank() {
        return shootRankService.selectAllShootRank();
    }
    @ApiOperation(value = "获取VIEW", notes = "获取VIEW", position = 2)
    @RequestMapping(value = "/shoot-rank/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result selectShootRankById(
        @ApiParam(value = "VIEW唯一标识")
        @PathVariable("id") int id) {
        return shootRankService.selectShootRankById(id);
    }
    @ApiOperation(value = "添加VIEW", notes = "添加VIEW", position = 3)
    @RequestMapping(value = "/shoot-rank", method = RequestMethod.POST)
    @ResponseBody
    public Result insertShootRank(
        @ApiParam(value = "VIEW")
        @RequestBody ShootRank shootRank) {
        return shootRankService.insertShootRank(shootRank);
    }
    @ApiOperation(value = "修改VIEW", notes = "修改VIEW", position = 4)
    @RequestMapping(value = "/shoot-rank", method = RequestMethod.PUT)
    @ResponseBody
    public Result updateShootRank(
        @ApiParam(value = "VIEW")
        @RequestBody ShootRank shootRank) {
        return shootRankService.updateShootRank(shootRank);
    }
    @ApiOperation(value = "删除VIEW", notes = "删除VIEW", position = 5)
    @RequestMapping(value = "/shoot-rank/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteShootRankById(
        @ApiParam(value = "VIEW唯一标识")
        @PathVariable("id") int id) {
        return shootRankService.deleteShootRankById(id);
    }
}
