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
import com.ninehcom.transfer.entity.DataCoachReClub;
import com.ninehcom.transfer.service.DataCoachReClubService;
import com.ninehcom.common.util.Result;
//import com.ninehcom.transfer.jpa.repository.DataCoachReClubRepository;

/**
 * 教练与俱乐部关联关系的控制器
 * @author shenjizhe
 * @version 1.0.0
 */
@Api(basePath = "/transfer", value = "教练与俱乐部关联关系", description = "教练与俱乐部关联关系", produces = "application/json")
@RestController
@RequestMapping(value = "/transfer")
public class DataCoachReClubController {

    @Autowired
    DataCoachReClubService dataCoachReClubService;
    @ApiOperation(value = "获取所有教练与俱乐部关联关系", notes = "获取所有教练与俱乐部关联关系", position = 1)
    @RequestMapping(value = "/data-coach-re-club", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAllDataCoachReClub() {
        return dataCoachReClubService.selectAllDataCoachReClub();
    }
    @ApiOperation(value = "获取教练与俱乐部关联关系", notes = "获取教练与俱乐部关联关系", position = 2)
    @RequestMapping(value = "/data-coach-re-club/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result selectDataCoachReClubById(
        @ApiParam(value = "教练与俱乐部关联关系唯一标识")
        @PathVariable("id") int id) {
        return dataCoachReClubService.selectDataCoachReClubById(id);
    }
    @ApiOperation(value = "添加教练与俱乐部关联关系", notes = "添加教练与俱乐部关联关系", position = 3)
    @RequestMapping(value = "/data-coach-re-club", method = RequestMethod.POST)
    @ResponseBody
    public Result insertDataCoachReClub(
        @ApiParam(value = "教练与俱乐部关联关系")
        @RequestBody DataCoachReClub dataCoachReClub) {
        return dataCoachReClubService.insertDataCoachReClub(dataCoachReClub);
    }
    @ApiOperation(value = "修改教练与俱乐部关联关系", notes = "修改教练与俱乐部关联关系", position = 4)
    @RequestMapping(value = "/data-coach-re-club", method = RequestMethod.PUT)
    @ResponseBody
    public Result updateDataCoachReClub(
        @ApiParam(value = "教练与俱乐部关联关系")
        @RequestBody DataCoachReClub dataCoachReClub) {
        return dataCoachReClubService.updateDataCoachReClub(dataCoachReClub);
    }
    @ApiOperation(value = "删除教练与俱乐部关联关系", notes = "删除教练与俱乐部关联关系", position = 5)
    @RequestMapping(value = "/data-coach-re-club/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteDataCoachReClubById(
        @ApiParam(value = "教练与俱乐部关联关系唯一标识")
        @PathVariable("id") int id) {
        return dataCoachReClubService.deleteDataCoachReClubById(id);
    }
}
