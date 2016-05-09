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
import com.ninehcom.transfer.entity.CoachMapping;
import com.ninehcom.transfer.service.CoachMappingService;
import com.ninehcom.common.util.Result;
//import com.ninehcom.transfer.jpa.repository.CoachMappingRepository;

/**
 * 教练映射的控制器
 * @author shenjizhe
 * @version 1.0.0
 */
@Api(basePath = "/transfer", value = "教练映射", description = "教练映射", produces = "application/json")
@RestController
@RequestMapping(value = "/transfer")
public class CoachMappingController {

    @Autowired
    CoachMappingService coachMappingService;
    @ApiOperation(value = "获取所有教练映射", notes = "获取所有教练映射", position = 1)
    @RequestMapping(value = "/coach-mapping", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAllCoachMapping() {
        return coachMappingService.selectAllCoachMapping();
    }
    @ApiOperation(value = "获取教练映射", notes = "获取教练映射", position = 2)
    @RequestMapping(value = "/coach-mapping/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result selectCoachMappingById(
        @ApiParam(value = "教练映射唯一标识")
        @PathVariable("id") int id) {
        return coachMappingService.selectCoachMappingById(id);
    }
    @ApiOperation(value = "添加教练映射", notes = "添加教练映射", position = 3)
    @RequestMapping(value = "/coach-mapping", method = RequestMethod.POST)
    @ResponseBody
    public Result insertCoachMapping(
        @ApiParam(value = "教练映射")
        @RequestBody CoachMapping coachMapping) {
        return coachMappingService.insertCoachMapping(coachMapping);
    }
    @ApiOperation(value = "修改教练映射", notes = "修改教练映射", position = 4)
    @RequestMapping(value = "/coach-mapping", method = RequestMethod.PUT)
    @ResponseBody
    public Result updateCoachMapping(
        @ApiParam(value = "教练映射")
        @RequestBody CoachMapping coachMapping) {
        return coachMappingService.updateCoachMapping(coachMapping);
    }
    @ApiOperation(value = "删除教练映射", notes = "删除教练映射", position = 5)
    @RequestMapping(value = "/coach-mapping/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteCoachMappingById(
        @ApiParam(value = "教练映射唯一标识")
        @PathVariable("id") int id) {
        return coachMappingService.deleteCoachMappingById(id);
    }
}
