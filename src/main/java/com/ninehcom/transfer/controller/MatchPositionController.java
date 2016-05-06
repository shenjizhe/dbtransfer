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
import com.ninehcom.transfer.entity.MatchPosition;
import com.ninehcom.transfer.service.MatchPositionService;
import com.ninehcom.common.util.Result;
//import com.ninehcom.transfer.jpa.repository.MatchPositionRepository;

/**
 * 的控制器
 * @author shenjizhe
 * @version 1.0.0
 */
@Api(basePath = "/transfer", value = "", description = "", produces = "application/json")
@RestController
@RequestMapping(value = "/transfer")
public class MatchPositionController {

    @Autowired
    MatchPositionService matchPositionService;
    @ApiOperation(value = "获取所有", notes = "获取所有", position = 1)
    @RequestMapping(value = "/match-position", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAllMatchPosition() {
        return matchPositionService.selectAllMatchPosition();
    }
    @ApiOperation(value = "获取", notes = "获取", position = 2)
    @RequestMapping(value = "/match-position/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result selectMatchPositionById(
        @ApiParam(value = "唯一标识")
        @PathVariable("id") int id) {
        return matchPositionService.selectMatchPositionById(id);
    }
    @ApiOperation(value = "添加", notes = "添加", position = 3)
    @RequestMapping(value = "/match-position", method = RequestMethod.POST)
    @ResponseBody
    public Result insertMatchPosition(
        @ApiParam(value = "")
        @RequestBody MatchPosition matchPosition) {
        return matchPositionService.insertMatchPosition(matchPosition);
    }
    @ApiOperation(value = "修改", notes = "修改", position = 4)
    @RequestMapping(value = "/match-position", method = RequestMethod.PUT)
    @ResponseBody
    public Result updateMatchPosition(
        @ApiParam(value = "")
        @RequestBody MatchPosition matchPosition) {
        return matchPositionService.updateMatchPosition(matchPosition);
    }
    @ApiOperation(value = "删除", notes = "删除", position = 5)
    @RequestMapping(value = "/match-position/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteMatchPositionById(
        @ApiParam(value = "唯一标识")
        @PathVariable("id") int id) {
        return matchPositionService.deleteMatchPositionById(id);
    }
}
