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
import com.ninehcom.transfer.entity.CoachHistoryMapping;
import com.ninehcom.transfer.service.CoachHistoryMappingService;
import com.ninehcom.common.util.Result;
//import com.ninehcom.transfer.jpa.repository.CoachHistoryMappingRepository;

/**
 * 教练历史映射的控制器
 * @author shenjizhe
 * @version 1.0.0
 */
@Api(basePath = "/transfer", value = "教练历史映射", description = "教练历史映射", produces = "application/json")
@RestController
@RequestMapping(value = "/transfer")
public class CoachHistoryMappingController {

    @Autowired
    CoachHistoryMappingService coachHistoryMappingService;
    @ApiOperation(value = "获取所有教练历史映射", notes = "获取所有教练历史映射", position = 1)
    @RequestMapping(value = "/coach-history-mapping", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAllCoachHistoryMapping() {
        return coachHistoryMappingService.selectAllCoachHistoryMapping();
    }
    @ApiOperation(value = "获取教练历史映射", notes = "获取教练历史映射", position = 2)
    @RequestMapping(value = "/coach-history-mapping/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result selectCoachHistoryMappingById(
        @ApiParam(value = "教练历史映射唯一标识")
        @PathVariable("id") int id) {
        return coachHistoryMappingService.selectCoachHistoryMappingById(id);
    }
    @ApiOperation(value = "添加教练历史映射", notes = "添加教练历史映射", position = 3)
    @RequestMapping(value = "/coach-history-mapping", method = RequestMethod.POST)
    @ResponseBody
    public Result insertCoachHistoryMapping(
        @ApiParam(value = "教练历史映射")
        @RequestBody CoachHistoryMapping coachHistoryMapping) {
        return coachHistoryMappingService.insertCoachHistoryMapping(coachHistoryMapping);
    }
    @ApiOperation(value = "修改教练历史映射", notes = "修改教练历史映射", position = 4)
    @RequestMapping(value = "/coach-history-mapping", method = RequestMethod.PUT)
    @ResponseBody
    public Result updateCoachHistoryMapping(
        @ApiParam(value = "教练历史映射")
        @RequestBody CoachHistoryMapping coachHistoryMapping) {
        return coachHistoryMappingService.updateCoachHistoryMapping(coachHistoryMapping);
    }
    @ApiOperation(value = "删除教练历史映射", notes = "删除教练历史映射", position = 5)
    @RequestMapping(value = "/coach-history-mapping/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteCoachHistoryMappingById(
        @ApiParam(value = "教练历史映射唯一标识")
        @PathVariable("id") int id) {
        return coachHistoryMappingService.deleteCoachHistoryMappingById(id);
    }
}
