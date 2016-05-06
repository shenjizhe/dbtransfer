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
import com.ninehcom.transfer.entity.DataLeagueUpdown;
import com.ninehcom.transfer.service.DataLeagueUpdownService;
import com.ninehcom.common.util.Result;
//import com.ninehcom.transfer.jpa.repository.DataLeagueUpdownRepository;

/**
 * 的控制器
 * @author shenjizhe
 * @version 1.0.0
 */
@Api(basePath = "/transfer", value = "", description = "", produces = "application/json")
@RestController
@RequestMapping(value = "/transfer")
public class DataLeagueUpdownController {

    @Autowired
    DataLeagueUpdownService dataLeagueUpdownService;
    @ApiOperation(value = "获取所有", notes = "获取所有", position = 1)
    @RequestMapping(value = "/data-league-updown", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAllDataLeagueUpdown() {
        return dataLeagueUpdownService.selectAllDataLeagueUpdown();
    }
    @ApiOperation(value = "获取", notes = "获取", position = 2)
    @RequestMapping(value = "/data-league-updown/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result selectDataLeagueUpdownById(
        @ApiParam(value = "唯一标识")
        @PathVariable("id") int id) {
        return dataLeagueUpdownService.selectDataLeagueUpdownById(id);
    }
    @ApiOperation(value = "添加", notes = "添加", position = 3)
    @RequestMapping(value = "/data-league-updown", method = RequestMethod.POST)
    @ResponseBody
    public Result insertDataLeagueUpdown(
        @ApiParam(value = "")
        @RequestBody DataLeagueUpdown dataLeagueUpdown) {
        return dataLeagueUpdownService.insertDataLeagueUpdown(dataLeagueUpdown);
    }
    @ApiOperation(value = "修改", notes = "修改", position = 4)
    @RequestMapping(value = "/data-league-updown", method = RequestMethod.PUT)
    @ResponseBody
    public Result updateDataLeagueUpdown(
        @ApiParam(value = "")
        @RequestBody DataLeagueUpdown dataLeagueUpdown) {
        return dataLeagueUpdownService.updateDataLeagueUpdown(dataLeagueUpdown);
    }
    @ApiOperation(value = "删除", notes = "删除", position = 5)
    @RequestMapping(value = "/data-league-updown/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteDataLeagueUpdownById(
        @ApiParam(value = "唯一标识")
        @PathVariable("id") int id) {
        return dataLeagueUpdownService.deleteDataLeagueUpdownById(id);
    }
}
