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
import com.ninehcom.transfer.entity.Leaguedata;
import com.ninehcom.transfer.service.LeaguedataService;
import com.ninehcom.common.util.Result;
//import com.ninehcom.transfer.jpa.repository.LeaguedataRepository;

/**
 * 赛事数据的控制器
 * @author shenjizhe
 * @version 1.0.0
 */
@Api(basePath = "/transfer", value = "赛事数据", description = "赛事数据", produces = "application/json")
@RestController
@RequestMapping(value = "/transfer")
public class LeaguedataController {

    @Autowired
    LeaguedataService leaguedataService;
    @ApiOperation(value = "获取所有赛事数据", notes = "获取所有赛事数据", position = 1)
    @RequestMapping(value = "/leaguedata", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAllLeaguedata() {
        return leaguedataService.selectAllLeaguedata();
    }
    @ApiOperation(value = "获取赛事数据", notes = "获取赛事数据", position = 2)
    @RequestMapping(value = "/leaguedata/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result selectLeaguedataById(
        @ApiParam(value = "赛事数据唯一标识")
        @PathVariable("id") int id) {
        return leaguedataService.selectLeaguedataById(id);
    }
}
