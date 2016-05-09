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
import com.ninehcom.transfer.entity.Coach;
import com.ninehcom.transfer.service.CoachService;
import com.ninehcom.common.util.Result;
//import com.ninehcom.transfer.jpa.repository.CoachRepository;

/**
 * 教练的控制器
 * @author shenjizhe
 * @version 1.0.0
 */
@Api(basePath = "/transfer", value = "教练", description = "教练", produces = "application/json")
@RestController
@RequestMapping(value = "/transfer")
public class CoachController {

    @Autowired
    CoachService coachService;
    @ApiOperation(value = "获取所有教练", notes = "获取所有教练", position = 1)
    @RequestMapping(value = "/coach", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAllCoach() {
        return coachService.selectAllCoach();
    }
    @ApiOperation(value = "获取教练", notes = "获取教练", position = 2)
    @RequestMapping(value = "/coach/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result selectCoachById(
        @ApiParam(value = "教练唯一标识")
        @PathVariable("id") int id) {
        return coachService.selectCoachById(id);
    }
}
