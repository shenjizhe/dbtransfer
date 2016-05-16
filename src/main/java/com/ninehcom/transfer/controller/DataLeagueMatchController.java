package com.ninehcom.transfer.controller;

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
import com.ninehcom.transfer.entity.DataLeagueMatch;
import com.ninehcom.transfer.service.DataLeagueMatchService;
import com.ninehcom.common.util.Result;
//import com.ninehcom.transfer.jpa.repository.DataLeagueMatchRepository;

/**
 * 赛程的控制器
 * @author shenjizhe
 * @version 1.0.0
 */
@Api(basePath = "/transfer", value = "赛程", description = "赛程", produces = "application/json")
@RestController
@RequestMapping(value = "/transfer")
public class DataLeagueMatchController {

    @Autowired
    DataLeagueMatchService dataLeagueMatchService;
    @ApiOperation(value = "获取所有赛程", notes = "获取所有赛程", position = 1)
    @RequestMapping(value = "/data-league-match", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAllDataLeagueMatch() {
        return dataLeagueMatchService.selectAllDataLeagueMatch();
    }
    @ApiOperation(value = "获取赛程", notes = "获取赛程", position = 2)
    @RequestMapping(value = "/data-league-match/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result selectDataLeagueMatchById(
        @ApiParam(value = "赛程唯一标识")
        @PathVariable("id") int id) {
        return dataLeagueMatchService.selectDataLeagueMatchById(id);
    }
    @ApiOperation(value = "添加赛程", notes = "添加赛程", position = 3)
    @RequestMapping(value = "/data-league-match", method = RequestMethod.POST)
    @ResponseBody
    public Result insertDataLeagueMatch(
        @ApiParam(value = "赛程")
        @RequestBody DataLeagueMatch dataLeagueMatch) {
        return dataLeagueMatchService.insertDataLeagueMatch(dataLeagueMatch);
    }
    @ApiOperation(value = "修改赛程", notes = "修改赛程", position = 4)
    @RequestMapping(value = "/data-league-match", method = RequestMethod.PUT)
    @ResponseBody
    public Result updateDataLeagueMatch(
        @ApiParam(value = "赛程")
        @RequestBody DataLeagueMatch dataLeagueMatch) {
        return dataLeagueMatchService.updateDataLeagueMatch(dataLeagueMatch);
    }
    @ApiOperation(value = "删除赛程", notes = "删除赛程", position = 5)
    @RequestMapping(value = "/data-league-match/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteDataLeagueMatchById(
        @ApiParam(value = "赛程唯一标识")
        @PathVariable("id") int id) {
        return dataLeagueMatchService.deleteDataLeagueMatchById(id);
    }
}
