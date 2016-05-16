package com.ninehcom.transfer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import com.ninehcom.transfer.service.CoachresumeService;
import com.ninehcom.common.util.Result;
//import com.ninehcom.transfer.jpa.repository.CoachresumeRepository;

/**
 * 教练履历的控制器
 * @author shenjizhe
 * @version 1.0.0
 */
@Api(basePath = "/transfer", value = "教练履历", description = "教练履历", produces = "application/json")
@RestController
@RequestMapping(value = "/transfer")
public class CoachresumeController {

    @Autowired
    CoachresumeService coachresumeService;
    @ApiOperation(value = "获取所有教练履历", notes = "获取所有教练履历", position = 1)
    @RequestMapping(value = "/coachresume", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAllCoachresume() {
        return coachresumeService.selectAllCoachresume();
    }
    @ApiOperation(value = "获取教练履历", notes = "获取教练履历", position = 2)
    @RequestMapping(value = "/coachresume/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result selectCoachresumeById(
        @ApiParam(value = "教练履历唯一标识")
        @PathVariable("id") int id) {
        return coachresumeService.selectCoachresumeById(id);
    }
}
