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
import com.ninehcom.transfer.entity.MatchMapping;
import com.ninehcom.transfer.service.MatchMappingService;
import com.ninehcom.common.util.Result;
//import com.ninehcom.transfer.jpa.repository.MatchMappingRepository;

/**
 * 球赛映射的控制器
 * @author shenjizhe
 * @version 1.0.0
 */
@Api(basePath = "/transfer", value = "球赛映射", description = "球赛映射", produces = "application/json")
@RestController
@RequestMapping(value = "/transfer")
public class MatchMappingController {

    @Autowired
    MatchMappingService matchMappingService;
    @ApiOperation(value = "获取所有球赛映射", notes = "获取所有球赛映射", position = 1)
    @RequestMapping(value = "/match-mapping", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAllMatchMapping() {
        return matchMappingService.selectAllMatchMapping();
    }
    @ApiOperation(value = "获取球赛映射", notes = "获取球赛映射", position = 2)
    @RequestMapping(value = "/match-mapping/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result selectMatchMappingById(
        @ApiParam(value = "球赛映射唯一标识")
        @PathVariable("id") int id) {
        return matchMappingService.selectMatchMappingById(id);
    }
    @ApiOperation(value = "添加球赛映射", notes = "添加球赛映射", position = 3)
    @RequestMapping(value = "/match-mapping", method = RequestMethod.POST)
    @ResponseBody
    public Result insertMatchMapping(
        @ApiParam(value = "球赛映射")
        @RequestBody MatchMapping matchMapping) {
        return matchMappingService.insertMatchMapping(matchMapping);
    }
    @ApiOperation(value = "修改球赛映射", notes = "修改球赛映射", position = 4)
    @RequestMapping(value = "/match-mapping", method = RequestMethod.PUT)
    @ResponseBody
    public Result updateMatchMapping(
        @ApiParam(value = "球赛映射")
        @RequestBody MatchMapping matchMapping) {
        return matchMappingService.updateMatchMapping(matchMapping);
    }
    @ApiOperation(value = "删除球赛映射", notes = "删除球赛映射", position = 5)
    @RequestMapping(value = "/match-mapping/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteMatchMappingById(
        @ApiParam(value = "球赛映射唯一标识")
        @PathVariable("id") int id) {
        return matchMappingService.deleteMatchMappingById(id);
    }
}
