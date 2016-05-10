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
import com.ninehcom.transfer.entity.CoachHistoryData;
import com.ninehcom.transfer.service.CoachHistoryDataService;
import com.ninehcom.common.util.Result;
//import com.ninehcom.transfer.jpa.repository.CoachHistoryDataRepository;

/**
 * VIEW的控制器
 * @author shenjizhe
 * @version 1.0.0
 */
@Api(basePath = "/transfer", value = "VIEW", description = "VIEW", produces = "application/json")
@RestController
@RequestMapping(value = "/transfer")
public class CoachHistoryDataController {

    @Autowired
    CoachHistoryDataService coachHistoryDataService;
    @ApiOperation(value = "获取所有VIEW", notes = "获取所有VIEW", position = 1)
    @RequestMapping(value = "/coach-history-data", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAllCoachHistoryData() {
        return coachHistoryDataService.selectAllCoachHistoryData();
    }
    @ApiOperation(value = "获取VIEW", notes = "获取VIEW", position = 2)
    @RequestMapping(value = "/coach-history-data/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result selectCoachHistoryDataById(
        @ApiParam(value = "VIEW唯一标识")
        @PathVariable("id") int id) {
        return coachHistoryDataService.selectCoachHistoryDataById(id);
    }
}
