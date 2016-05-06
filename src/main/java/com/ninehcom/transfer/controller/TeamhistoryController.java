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
import com.ninehcom.transfer.entity.Teamhistory;
import com.ninehcom.transfer.service.TeamhistoryService;
import com.ninehcom.common.util.Result;
//import com.ninehcom.transfer.jpa.repository.TeamhistoryRepository;

/**
 * 球队历史的控制器
 * @author shenjizhe
 * @version 1.0.0
 */
@Api(basePath = "/transfer", value = "球队历史", description = "球队历史", produces = "application/json")
@RestController
@RequestMapping(value = "/transfer")
public class TeamhistoryController {

    @Autowired
    TeamhistoryService teamhistoryService;
    @ApiOperation(value = "获取所有球队历史", notes = "获取所有球队历史", position = 1)
    @RequestMapping(value = "/teamhistory", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAllTeamhistory() {
        return teamhistoryService.selectAllTeamhistory();
    }
    @ApiOperation(value = "获取球队历史", notes = "获取球队历史", position = 2)
    @RequestMapping(value = "/teamhistory/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result selectTeamhistoryById(
        @ApiParam(value = "球队历史唯一标识")
        @PathVariable("id") int id) {
        return teamhistoryService.selectTeamhistoryById(id);
    }
}
