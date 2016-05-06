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
import com.ninehcom.transfer.entity.DataLeagueRankPeace;
import com.ninehcom.transfer.service.DataLeagueRankPeaceService;
import com.ninehcom.common.util.Result;
//import com.ninehcom.transfer.jpa.repository.DataLeagueRankPeaceRepository;

/**
 * 的控制器
 * @author shenjizhe
 * @version 1.0.0
 */
@Api(basePath = "/transfer", value = "", description = "", produces = "application/json")
@RestController
@RequestMapping(value = "/transfer")
public class DataLeagueRankPeaceController {

    @Autowired
    DataLeagueRankPeaceService dataLeagueRankPeaceService;
    @ApiOperation(value = "获取所有", notes = "获取所有", position = 1)
    @RequestMapping(value = "/data-league-rank-peace", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAllDataLeagueRankPeace() {
        return dataLeagueRankPeaceService.selectAllDataLeagueRankPeace();
    }
    @ApiOperation(value = "获取", notes = "获取", position = 2)
    @RequestMapping(value = "/data-league-rank-peace/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result selectDataLeagueRankPeaceById(
        @ApiParam(value = "唯一标识")
        @PathVariable("id") int id) {
        return dataLeagueRankPeaceService.selectDataLeagueRankPeaceById(id);
    }
    @ApiOperation(value = "添加", notes = "添加", position = 3)
    @RequestMapping(value = "/data-league-rank-peace", method = RequestMethod.POST)
    @ResponseBody
    public Result insertDataLeagueRankPeace(
        @ApiParam(value = "")
        @RequestBody DataLeagueRankPeace dataLeagueRankPeace) {
        return dataLeagueRankPeaceService.insertDataLeagueRankPeace(dataLeagueRankPeace);
    }
    @ApiOperation(value = "修改", notes = "修改", position = 4)
    @RequestMapping(value = "/data-league-rank-peace", method = RequestMethod.PUT)
    @ResponseBody
    public Result updateDataLeagueRankPeace(
        @ApiParam(value = "")
        @RequestBody DataLeagueRankPeace dataLeagueRankPeace) {
        return dataLeagueRankPeaceService.updateDataLeagueRankPeace(dataLeagueRankPeace);
    }
    @ApiOperation(value = "删除", notes = "删除", position = 5)
    @RequestMapping(value = "/data-league-rank-peace/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteDataLeagueRankPeaceById(
        @ApiParam(value = "唯一标识")
        @PathVariable("id") int id) {
        return dataLeagueRankPeaceService.deleteDataLeagueRankPeaceById(id);
    }
}
