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
import com.ninehcom.transfer.entity.DataMatchStat;
import com.ninehcom.transfer.service.DataMatchStatService;
import com.ninehcom.common.util.Result;
//import com.ninehcom.transfer.jpa.repository.DataMatchStatRepository;

/**
 * 比赛统计注：数据保存格式: 主场球队/客场球队 如 2/3的控制器
 * @author shenjizhe
 * @version 1.0.0
 */
@Api(basePath = "/transfer", value = "比赛统计注：数据保存格式: 主场球队/客场球队 如 2/3", description = "比赛统计注：数据保存格式: 主场球队/客场球队 如 2/3", produces = "application/json")
@RestController
@RequestMapping(value = "/transfer")
public class DataMatchStatController {

    @Autowired
    DataMatchStatService dataMatchStatService;
    @ApiOperation(value = "获取所有比赛统计注：数据保存格式: 主场球队/客场球队 如 2/3", notes = "获取所有比赛统计注：数据保存格式: 主场球队/客场球队 如 2/3", position = 1)
    @RequestMapping(value = "/data-match-stat", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAllDataMatchStat() {
        return dataMatchStatService.selectAllDataMatchStat();
    }
    @ApiOperation(value = "获取比赛统计注：数据保存格式: 主场球队/客场球队 如 2/3", notes = "获取比赛统计注：数据保存格式: 主场球队/客场球队 如 2/3", position = 2)
    @RequestMapping(value = "/data-match-stat/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result selectDataMatchStatById(
        @ApiParam(value = "比赛统计注：数据保存格式: 主场球队/客场球队 如 2/3唯一标识")
        @PathVariable("id") int id) {
        return dataMatchStatService.selectDataMatchStatById(id);
    }
    @ApiOperation(value = "添加比赛统计注：数据保存格式: 主场球队/客场球队 如 2/3", notes = "添加比赛统计注：数据保存格式: 主场球队/客场球队 如 2/3", position = 3)
    @RequestMapping(value = "/data-match-stat", method = RequestMethod.POST)
    @ResponseBody
    public Result insertDataMatchStat(
        @ApiParam(value = "比赛统计注：数据保存格式: 主场球队/客场球队 如 2/3")
        @RequestBody DataMatchStat dataMatchStat) {
        return dataMatchStatService.insertDataMatchStat(dataMatchStat);
    }
    @ApiOperation(value = "修改比赛统计注：数据保存格式: 主场球队/客场球队 如 2/3", notes = "修改比赛统计注：数据保存格式: 主场球队/客场球队 如 2/3", position = 4)
    @RequestMapping(value = "/data-match-stat", method = RequestMethod.PUT)
    @ResponseBody
    public Result updateDataMatchStat(
        @ApiParam(value = "比赛统计注：数据保存格式: 主场球队/客场球队 如 2/3")
        @RequestBody DataMatchStat dataMatchStat) {
        return dataMatchStatService.updateDataMatchStat(dataMatchStat);
    }
    @ApiOperation(value = "删除比赛统计注：数据保存格式: 主场球队/客场球队 如 2/3", notes = "删除比赛统计注：数据保存格式: 主场球队/客场球队 如 2/3", position = 5)
    @RequestMapping(value = "/data-match-stat/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteDataMatchStatById(
        @ApiParam(value = "比赛统计注：数据保存格式: 主场球队/客场球队 如 2/3唯一标识")
        @PathVariable("id") int id) {
        return dataMatchStatService.deleteDataMatchStatById(id);
    }
}
