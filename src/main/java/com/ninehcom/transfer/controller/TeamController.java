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
import com.ninehcom.transfer.entity.Team;
import com.ninehcom.transfer.service.TeamService;
import com.ninehcom.common.util.Result;
//import com.ninehcom.transfer.jpa.repository.TeamRepository;

/**
 * 球队的控制器
 * @author shenjizhe
 * @version 1.0.0
 */
@Api(basePath = "/transfer", value = "球队", description = "球队", produces = "application/json")
@RestController
@RequestMapping(value = "/transfer")
public class TeamController {

    @Autowired
    TeamService teamService;
    @ApiOperation(value = "获取所有球队", notes = "获取所有球队", position = 1)
    @RequestMapping(value = "/team", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAllTeam() {
        return teamService.selectAllTeam();
    }
    @ApiOperation(value = "获取球队", notes = "获取球队", position = 2)
    @RequestMapping(value = "/team/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result selectTeamById(
        @ApiParam(value = "球队唯一标识")
        @PathVariable("id") int id) {
        return teamService.selectTeamById(id);
    }
}
