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
import com.ninehcom.transfer.entity.DataPlayerIdMapped;
import com.ninehcom.transfer.service.DataPlayerIdMappedService;
import com.ninehcom.common.util.Result;
//import com.ninehcom.transfer.jpa.repository.DataPlayerIdMappedRepository;

/**
 * 比赛球员Id  与 amisco 数据中的比赛球员id 对应表的控制器
 * @author shenjizhe
 * @version 1.0.0
 */
@Api(basePath = "/transfer", value = "比赛球员Id  与 amisco 数据中的比赛球员id 对应表", description = "比赛球员Id  与 amisco 数据中的比赛球员id 对应表", produces = "application/json")
@RestController
@RequestMapping(value = "/transfer")
public class DataPlayerIdMappedController {

    @Autowired
    DataPlayerIdMappedService dataPlayerIdMappedService;
    @ApiOperation(value = "获取所有比赛球员Id  与 amisco 数据中的比赛球员id 对应表", notes = "获取所有比赛球员Id  与 amisco 数据中的比赛球员id 对应表", position = 1)
    @RequestMapping(value = "/data-player-id-mapped", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAllDataPlayerIdMapped() {
        return dataPlayerIdMappedService.selectAllDataPlayerIdMapped();
    }
    @ApiOperation(value = "获取比赛球员Id  与 amisco 数据中的比赛球员id 对应表", notes = "获取比赛球员Id  与 amisco 数据中的比赛球员id 对应表", position = 2)
    @RequestMapping(value = "/data-player-id-mapped/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result selectDataPlayerIdMappedById(
        @ApiParam(value = "比赛球员Id  与 amisco 数据中的比赛球员id 对应表唯一标识")
        @PathVariable("id") int id) {
        return dataPlayerIdMappedService.selectDataPlayerIdMappedById(id);
    }
    @ApiOperation(value = "添加比赛球员Id  与 amisco 数据中的比赛球员id 对应表", notes = "添加比赛球员Id  与 amisco 数据中的比赛球员id 对应表", position = 3)
    @RequestMapping(value = "/data-player-id-mapped", method = RequestMethod.POST)
    @ResponseBody
    public Result insertDataPlayerIdMapped(
        @ApiParam(value = "比赛球员Id  与 amisco 数据中的比赛球员id 对应表")
        @RequestBody DataPlayerIdMapped dataPlayerIdMapped) {
        return dataPlayerIdMappedService.insertDataPlayerIdMapped(dataPlayerIdMapped);
    }
    @ApiOperation(value = "修改比赛球员Id  与 amisco 数据中的比赛球员id 对应表", notes = "修改比赛球员Id  与 amisco 数据中的比赛球员id 对应表", position = 4)
    @RequestMapping(value = "/data-player-id-mapped", method = RequestMethod.PUT)
    @ResponseBody
    public Result updateDataPlayerIdMapped(
        @ApiParam(value = "比赛球员Id  与 amisco 数据中的比赛球员id 对应表")
        @RequestBody DataPlayerIdMapped dataPlayerIdMapped) {
        return dataPlayerIdMappedService.updateDataPlayerIdMapped(dataPlayerIdMapped);
    }
    @ApiOperation(value = "删除比赛球员Id  与 amisco 数据中的比赛球员id 对应表", notes = "删除比赛球员Id  与 amisco 数据中的比赛球员id 对应表", position = 5)
    @RequestMapping(value = "/data-player-id-mapped/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteDataPlayerIdMappedById(
        @ApiParam(value = "比赛球员Id  与 amisco 数据中的比赛球员id 对应表唯一标识")
        @PathVariable("id") int id) {
        return dataPlayerIdMappedService.deleteDataPlayerIdMappedById(id);
    }
}
