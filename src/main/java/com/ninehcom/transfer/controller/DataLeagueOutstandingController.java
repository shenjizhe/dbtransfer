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
import com.ninehcom.transfer.entity.DataLeagueOutstanding;
import com.ninehcom.transfer.service.DataLeagueOutstandingService;
import com.ninehcom.common.util.Result;
//import com.ninehcom.transfer.jpa.repository.DataLeagueOutstandingRepository;

/**
 * 历史数据-中超历年最佳的控制器
 * @author shenjizhe
 * @version 1.0.0
 */
@Api(basePath = "/transfer", value = "历史数据-中超历年最佳", description = "历史数据-中超历年最佳", produces = "application/json")
@RestController
@RequestMapping(value = "/transfer")
public class DataLeagueOutstandingController {

    @Autowired
    DataLeagueOutstandingService dataLeagueOutstandingService;
    @ApiOperation(value = "获取所有历史数据-中超历年最佳", notes = "获取所有历史数据-中超历年最佳", position = 1)
    @RequestMapping(value = "/data-league-outstanding", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAllDataLeagueOutstanding() {
        return dataLeagueOutstandingService.selectAllDataLeagueOutstanding();
    }
    @ApiOperation(value = "获取历史数据-中超历年最佳", notes = "获取历史数据-中超历年最佳", position = 2)
    @RequestMapping(value = "/data-league-outstanding/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result selectDataLeagueOutstandingById(
        @ApiParam(value = "历史数据-中超历年最佳唯一标识")
        @PathVariable("id") int id) {
        return dataLeagueOutstandingService.selectDataLeagueOutstandingById(id);
    }
    @ApiOperation(value = "添加历史数据-中超历年最佳", notes = "添加历史数据-中超历年最佳", position = 3)
    @RequestMapping(value = "/data-league-outstanding", method = RequestMethod.POST)
    @ResponseBody
    public Result insertDataLeagueOutstanding(
        @ApiParam(value = "历史数据-中超历年最佳")
        @RequestBody DataLeagueOutstanding dataLeagueOutstanding) {
        return dataLeagueOutstandingService.insertDataLeagueOutstanding(dataLeagueOutstanding);
    }
    @ApiOperation(value = "修改历史数据-中超历年最佳", notes = "修改历史数据-中超历年最佳", position = 4)
    @RequestMapping(value = "/data-league-outstanding", method = RequestMethod.PUT)
    @ResponseBody
    public Result updateDataLeagueOutstanding(
        @ApiParam(value = "历史数据-中超历年最佳")
        @RequestBody DataLeagueOutstanding dataLeagueOutstanding) {
        return dataLeagueOutstandingService.updateDataLeagueOutstanding(dataLeagueOutstanding);
    }
    @ApiOperation(value = "删除历史数据-中超历年最佳", notes = "删除历史数据-中超历年最佳", position = 5)
    @RequestMapping(value = "/data-league-outstanding/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteDataLeagueOutstandingById(
        @ApiParam(value = "历史数据-中超历年最佳唯一标识")
        @PathVariable("id") int id) {
        return dataLeagueOutstandingService.deleteDataLeagueOutstandingById(id);
    }
}
