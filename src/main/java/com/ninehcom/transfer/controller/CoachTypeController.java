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
import com.ninehcom.transfer.entity.CoachType;
import com.ninehcom.transfer.service.CoachTypeService;
import com.ninehcom.common.util.Result;
//import com.ninehcom.transfer.jpa.repository.CoachTypeRepository;

/**
 * 教练类型的控制器
 * @author shenjizhe
 * @version 1.0.0
 */
@Api(basePath = "/transfer", value = "教练类型", description = "教练类型", produces = "application/json")
@RestController
@RequestMapping(value = "/transfer")
public class CoachTypeController {

    @Autowired
    CoachTypeService coachTypeService;
    @ApiOperation(value = "获取所有教练类型", notes = "获取所有教练类型", position = 1)
    @RequestMapping(value = "/coach-type", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAllCoachType() {
        return coachTypeService.selectAllCoachType();
    }
    @ApiOperation(value = "获取教练类型", notes = "获取教练类型", position = 2)
    @RequestMapping(value = "/coach-type/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result selectCoachTypeById(
        @ApiParam(value = "教练类型唯一标识")
        @PathVariable("id") int id) {
        return coachTypeService.selectCoachTypeById(id);
    }
    @ApiOperation(value = "添加教练类型", notes = "添加教练类型", position = 3)
    @RequestMapping(value = "/coach-type", method = RequestMethod.POST)
    @ResponseBody
    public Result insertCoachType(
        @ApiParam(value = "教练类型")
        @RequestBody CoachType coachType) {
        return coachTypeService.insertCoachType(coachType);
    }
    @ApiOperation(value = "修改教练类型", notes = "修改教练类型", position = 4)
    @RequestMapping(value = "/coach-type", method = RequestMethod.PUT)
    @ResponseBody
    public Result updateCoachType(
        @ApiParam(value = "教练类型")
        @RequestBody CoachType coachType) {
        return coachTypeService.updateCoachType(coachType);
    }
    @ApiOperation(value = "删除教练类型", notes = "删除教练类型", position = 5)
    @RequestMapping(value = "/coach-type/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteCoachTypeById(
        @ApiParam(value = "教练类型唯一标识")
        @PathVariable("id") int id) {
        return coachTypeService.deleteCoachTypeById(id);
    }
}
