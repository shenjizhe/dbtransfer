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
import com.ninehcom.transfer.entity.LeagueMatch;
import com.ninehcom.transfer.service.LeagueMatchService;
import com.ninehcom.common.util.Result;
//import com.ninehcom.transfer.jpa.repository.LeagueMatchRepository;

/**
 * VIEW的控制器
 * @author shenjizhe
 * @version 1.0.0
 */
@Api(basePath = "/transfer", value = "VIEW", description = "VIEW", produces = "application/json")
@RestController
@RequestMapping(value = "/transfer")
public class LeagueMatchController {

    @Autowired
    LeagueMatchService leagueMatchService;
    @ApiOperation(value = "获取所有VIEW", notes = "获取所有VIEW", position = 1)
    @RequestMapping(value = "/league-match", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAllLeagueMatch() {
        return leagueMatchService.selectAllLeagueMatch();
    }
    @ApiOperation(value = "获取VIEW", notes = "获取VIEW", position = 2)
    @RequestMapping(value = "/league-match/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result selectLeagueMatchById(
        @ApiParam(value = "VIEW唯一标识")
        @PathVariable("id") int id) {
        return leagueMatchService.selectLeagueMatchById(id);
    }
    @ApiOperation(value = "添加VIEW", notes = "添加VIEW", position = 3)
    @RequestMapping(value = "/league-match", method = RequestMethod.POST)
    @ResponseBody
    public Result insertLeagueMatch(
        @ApiParam(value = "VIEW")
        @RequestBody LeagueMatch leagueMatch) {
        return leagueMatchService.insertLeagueMatch(leagueMatch);
    }
    @ApiOperation(value = "修改VIEW", notes = "修改VIEW", position = 4)
    @RequestMapping(value = "/league-match", method = RequestMethod.PUT)
    @ResponseBody
    public Result updateLeagueMatch(
        @ApiParam(value = "VIEW")
        @RequestBody LeagueMatch leagueMatch) {
        return leagueMatchService.updateLeagueMatch(leagueMatch);
    }
    @ApiOperation(value = "删除VIEW", notes = "删除VIEW", position = 5)
    @RequestMapping(value = "/league-match/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteLeagueMatchById(
        @ApiParam(value = "VIEW唯一标识")
        @PathVariable("id") int id) {
        return leagueMatchService.deleteLeagueMatchById(id);
    }
}
