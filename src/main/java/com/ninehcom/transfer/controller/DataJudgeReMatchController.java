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
import com.ninehcom.transfer.entity.DataJudgeReMatch;
import com.ninehcom.transfer.service.DataJudgeReMatchService;
import com.ninehcom.common.util.Result;
//import com.ninehcom.transfer.jpa.repository.DataJudgeReMatchRepository;

/**
 * 的控制器
 * @author shenjizhe
 * @version 1.0.0
 */
@Api(basePath = "/transfer", value = "", description = "", produces = "application/json")
@RestController
@RequestMapping(value = "/transfer")
public class DataJudgeReMatchController {

    @Autowired
    DataJudgeReMatchService dataJudgeReMatchService;
    @ApiOperation(value = "获取所有", notes = "获取所有", position = 1)
    @RequestMapping(value = "/data-judge-re-match", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAllDataJudgeReMatch() {
        return dataJudgeReMatchService.selectAllDataJudgeReMatch();
    }
    @ApiOperation(value = "获取", notes = "获取", position = 2)
    @RequestMapping(value = "/data-judge-re-match/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result selectDataJudgeReMatchById(
        @ApiParam(value = "唯一标识")
        @PathVariable("id") int id) {
        return dataJudgeReMatchService.selectDataJudgeReMatchById(id);
    }
    @ApiOperation(value = "添加", notes = "添加", position = 3)
    @RequestMapping(value = "/data-judge-re-match", method = RequestMethod.POST)
    @ResponseBody
    public Result insertDataJudgeReMatch(
        @ApiParam(value = "")
        @RequestBody DataJudgeReMatch dataJudgeReMatch) {
        return dataJudgeReMatchService.insertDataJudgeReMatch(dataJudgeReMatch);
    }
    @ApiOperation(value = "修改", notes = "修改", position = 4)
    @RequestMapping(value = "/data-judge-re-match", method = RequestMethod.PUT)
    @ResponseBody
    public Result updateDataJudgeReMatch(
        @ApiParam(value = "")
        @RequestBody DataJudgeReMatch dataJudgeReMatch) {
        return dataJudgeReMatchService.updateDataJudgeReMatch(dataJudgeReMatch);
    }
    @ApiOperation(value = "删除", notes = "删除", position = 5)
    @RequestMapping(value = "/data-judge-re-match/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteDataJudgeReMatchById(
        @ApiParam(value = "唯一标识")
        @PathVariable("id") int id) {
        return dataJudgeReMatchService.deleteDataJudgeReMatchById(id);
    }
}
