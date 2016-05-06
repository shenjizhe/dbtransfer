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
import com.ninehcom.transfer.entity.DataJudge;
import com.ninehcom.transfer.service.DataJudgeService;
import com.ninehcom.common.util.Result;
//import com.ninehcom.transfer.jpa.repository.DataJudgeRepository;

/**
 * 联赛裁判的控制器
 * @author shenjizhe
 * @version 1.0.0
 */
@Api(basePath = "/transfer", value = "联赛裁判", description = "联赛裁判", produces = "application/json")
@RestController
@RequestMapping(value = "/transfer")
public class DataJudgeController {

    @Autowired
    DataJudgeService dataJudgeService;
    @ApiOperation(value = "获取所有联赛裁判", notes = "获取所有联赛裁判", position = 1)
    @RequestMapping(value = "/data-judge", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAllDataJudge() {
        return dataJudgeService.selectAllDataJudge();
    }
    @ApiOperation(value = "获取联赛裁判", notes = "获取联赛裁判", position = 2)
    @RequestMapping(value = "/data-judge/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result selectDataJudgeById(
        @ApiParam(value = "联赛裁判唯一标识")
        @PathVariable("id") int id) {
        return dataJudgeService.selectDataJudgeById(id);
    }
    @ApiOperation(value = "添加联赛裁判", notes = "添加联赛裁判", position = 3)
    @RequestMapping(value = "/data-judge", method = RequestMethod.POST)
    @ResponseBody
    public Result insertDataJudge(
        @ApiParam(value = "联赛裁判")
        @RequestBody DataJudge dataJudge) {
        return dataJudgeService.insertDataJudge(dataJudge);
    }
    @ApiOperation(value = "修改联赛裁判", notes = "修改联赛裁判", position = 4)
    @RequestMapping(value = "/data-judge", method = RequestMethod.PUT)
    @ResponseBody
    public Result updateDataJudge(
        @ApiParam(value = "联赛裁判")
        @RequestBody DataJudge dataJudge) {
        return dataJudgeService.updateDataJudge(dataJudge);
    }
    @ApiOperation(value = "删除联赛裁判", notes = "删除联赛裁判", position = 5)
    @RequestMapping(value = "/data-judge/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteDataJudgeById(
        @ApiParam(value = "联赛裁判唯一标识")
        @PathVariable("id") int id) {
        return dataJudgeService.deleteDataJudgeById(id);
    }
}
