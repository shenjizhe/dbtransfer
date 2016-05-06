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
import com.ninehcom.transfer.entity.JudgeType;
import com.ninehcom.transfer.service.JudgeTypeService;
import com.ninehcom.common.util.Result;
//import com.ninehcom.transfer.jpa.repository.JudgeTypeRepository;

/**
 * 裁判类型的控制器
 * @author shenjizhe
 * @version 1.0.0
 */
@Api(basePath = "/transfer", value = "裁判类型", description = "裁判类型", produces = "application/json")
@RestController
@RequestMapping(value = "/transfer")
public class JudgeTypeController {

    @Autowired
    JudgeTypeService judgeTypeService;
    @ApiOperation(value = "获取所有裁判类型", notes = "获取所有裁判类型", position = 1)
    @RequestMapping(value = "/judge-type", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAllJudgeType() {
        return judgeTypeService.selectAllJudgeType();
    }
    @ApiOperation(value = "获取裁判类型", notes = "获取裁判类型", position = 2)
    @RequestMapping(value = "/judge-type/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result selectJudgeTypeById(
        @ApiParam(value = "裁判类型唯一标识")
        @PathVariable("id") int id) {
        return judgeTypeService.selectJudgeTypeById(id);
    }
    @ApiOperation(value = "添加裁判类型", notes = "添加裁判类型", position = 3)
    @RequestMapping(value = "/judge-type", method = RequestMethod.POST)
    @ResponseBody
    public Result insertJudgeType(
        @ApiParam(value = "裁判类型")
        @RequestBody JudgeType judgeType) {
        return judgeTypeService.insertJudgeType(judgeType);
    }
    @ApiOperation(value = "修改裁判类型", notes = "修改裁判类型", position = 4)
    @RequestMapping(value = "/judge-type", method = RequestMethod.PUT)
    @ResponseBody
    public Result updateJudgeType(
        @ApiParam(value = "裁判类型")
        @RequestBody JudgeType judgeType) {
        return judgeTypeService.updateJudgeType(judgeType);
    }
    @ApiOperation(value = "删除裁判类型", notes = "删除裁判类型", position = 5)
    @RequestMapping(value = "/judge-type/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteJudgeTypeById(
        @ApiParam(value = "裁判类型唯一标识")
        @PathVariable("id") int id) {
        return judgeTypeService.deleteJudgeTypeById(id);
    }
}
