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
import com.ninehcom.transfer.entity.LeagueType;
import com.ninehcom.transfer.service.LeagueTypeService;
import com.ninehcom.common.util.Result;
//import com.ninehcom.transfer.jpa.repository.LeagueTypeRepository;

/**
 * 联赛类型的控制器
 * @author shenjizhe
 * @version 1.0.0
 */
@Api(basePath = "/transfer", value = "联赛类型", description = "联赛类型", produces = "application/json")
@RestController
@RequestMapping(value = "/transfer")
public class LeagueTypeController {

    @Autowired
    LeagueTypeService leagueTypeService;
    @ApiOperation(value = "获取所有联赛类型", notes = "获取所有联赛类型", position = 1)
    @RequestMapping(value = "/league-type", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAllLeagueType() {
        return leagueTypeService.selectAllLeagueType();
    }
    @ApiOperation(value = "获取联赛类型", notes = "获取联赛类型", position = 2)
    @RequestMapping(value = "/league-type/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result selectLeagueTypeById(
        @ApiParam(value = "联赛类型唯一标识")
        @PathVariable("id") int id) {
        return leagueTypeService.selectLeagueTypeById(id);
    }
    @ApiOperation(value = "添加联赛类型", notes = "添加联赛类型", position = 3)
    @RequestMapping(value = "/league-type", method = RequestMethod.POST)
    @ResponseBody
    public Result insertLeagueType(
        @ApiParam(value = "联赛类型")
        @RequestBody LeagueType leagueType) {
        return leagueTypeService.insertLeagueType(leagueType);
    }
    @ApiOperation(value = "修改联赛类型", notes = "修改联赛类型", position = 4)
    @RequestMapping(value = "/league-type", method = RequestMethod.PUT)
    @ResponseBody
    public Result updateLeagueType(
        @ApiParam(value = "联赛类型")
        @RequestBody LeagueType leagueType) {
        return leagueTypeService.updateLeagueType(leagueType);
    }
    @ApiOperation(value = "删除联赛类型", notes = "删除联赛类型", position = 5)
    @RequestMapping(value = "/league-type/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteLeagueTypeById(
        @ApiParam(value = "联赛类型唯一标识")
        @PathVariable("id") int id) {
        return leagueTypeService.deleteLeagueTypeById(id);
    }
}
