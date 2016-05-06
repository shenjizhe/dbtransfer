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
import com.ninehcom.transfer.entity.CoachHistory;
import com.ninehcom.transfer.service.CoachHistoryService;
import com.ninehcom.common.util.Result;
//import com.ninehcom.transfer.jpa.repository.CoachHistoryRepository;

/**
 * 教练履历的控制器
 * @author shenjizhe
 * @version 1.0.0
 */
@Api(basePath = "/transfer", value = "教练履历", description = "教练履历", produces = "application/json")
@RestController
@RequestMapping(value = "/transfer")
public class CoachHistoryController {

    @Autowired
    CoachHistoryService coachHistoryService;
    @ApiOperation(value = "获取所有教练履历", notes = "获取所有教练履历", position = 1)
    @RequestMapping(value = "/coach-history", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAllCoachHistory() {
        return coachHistoryService.selectAllCoachHistory();
    }
    @ApiOperation(value = "获取教练履历", notes = "获取教练履历", position = 2)
    @RequestMapping(value = "/coach-history/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result selectCoachHistoryById(
        @ApiParam(value = "教练履历唯一标识")
        @PathVariable("id") int id) {
        return coachHistoryService.selectCoachHistoryById(id);
    }
    @ApiOperation(value = "添加教练履历", notes = "添加教练履历", position = 3)
    @RequestMapping(value = "/coach-history", method = RequestMethod.POST)
    @ResponseBody
    public Result insertCoachHistory(
        @ApiParam(value = "教练履历")
        @RequestBody CoachHistory coachHistory) {
        return coachHistoryService.insertCoachHistory(coachHistory);
    }
    @ApiOperation(value = "修改教练履历", notes = "修改教练履历", position = 4)
    @RequestMapping(value = "/coach-history", method = RequestMethod.PUT)
    @ResponseBody
    public Result updateCoachHistory(
        @ApiParam(value = "教练履历")
        @RequestBody CoachHistory coachHistory) {
        return coachHistoryService.updateCoachHistory(coachHistory);
    }
    @ApiOperation(value = "删除教练履历", notes = "删除教练履历", position = 5)
    @RequestMapping(value = "/coach-history/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteCoachHistoryById(
        @ApiParam(value = "教练履历唯一标识")
        @PathVariable("id") int id) {
        return coachHistoryService.deleteCoachHistoryById(id);
    }
}
