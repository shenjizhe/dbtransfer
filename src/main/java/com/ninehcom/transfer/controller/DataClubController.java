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
import com.ninehcom.transfer.entity.DataClub;
import com.ninehcom.transfer.service.DataClubService;
import com.ninehcom.common.util.Result;
//import com.ninehcom.transfer.jpa.repository.DataClubRepository;

/**
 * 俱乐部的控制器
 * @author shenjizhe
 * @version 1.0.0
 */
@Api(basePath = "/transfer", value = "俱乐部", description = "俱乐部", produces = "application/json")
@RestController
@RequestMapping(value = "/transfer")
public class DataClubController {

    @Autowired
    DataClubService dataClubService;
    @ApiOperation(value = "获取所有俱乐部", notes = "获取所有俱乐部", position = 1)
    @RequestMapping(value = "/data-club", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAllDataClub() {
        return dataClubService.selectAllDataClub();
    }
    @ApiOperation(value = "获取俱乐部", notes = "获取俱乐部", position = 2)
    @RequestMapping(value = "/data-club/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result selectDataClubById(
        @ApiParam(value = "俱乐部唯一标识")
        @PathVariable("id") int id) {
        return dataClubService.selectDataClubById(id);
    }
    @ApiOperation(value = "添加俱乐部", notes = "添加俱乐部", position = 3)
    @RequestMapping(value = "/data-club", method = RequestMethod.POST)
    @ResponseBody
    public Result insertDataClub(
        @ApiParam(value = "俱乐部")
        @RequestBody DataClub dataClub) {
        return dataClubService.insertDataClub(dataClub);
    }
    @ApiOperation(value = "修改俱乐部", notes = "修改俱乐部", position = 4)
    @RequestMapping(value = "/data-club", method = RequestMethod.PUT)
    @ResponseBody
    public Result updateDataClub(
        @ApiParam(value = "俱乐部")
        @RequestBody DataClub dataClub) {
        return dataClubService.updateDataClub(dataClub);
    }
    @ApiOperation(value = "删除俱乐部", notes = "删除俱乐部", position = 5)
    @RequestMapping(value = "/data-club/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteDataClubById(
        @ApiParam(value = "俱乐部唯一标识")
        @PathVariable("id") int id) {
        return dataClubService.deleteDataClubById(id);
    }
}
