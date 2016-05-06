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
import com.ninehcom.transfer.entity.DataCoach;
import com.ninehcom.transfer.service.DataCoachService;
import com.ninehcom.common.util.Result;
//import com.ninehcom.transfer.jpa.repository.DataCoachRepository;

/**
 * 教练的控制器
 * @author shenjizhe
 * @version 1.0.0
 */
@Api(basePath = "/transfer", value = "教练", description = "教练", produces = "application/json")
@RestController
@RequestMapping(value = "/transfer")
public class DataCoachController {

    @Autowired
    DataCoachService dataCoachService;
    @ApiOperation(value = "获取所有教练", notes = "获取所有教练", position = 1)
    @RequestMapping(value = "/data-coach", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAllDataCoach() {
        return dataCoachService.selectAllDataCoach();
    }
    @ApiOperation(value = "获取教练", notes = "获取教练", position = 2)
    @RequestMapping(value = "/data-coach/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result selectDataCoachById(
        @ApiParam(value = "教练唯一标识")
        @PathVariable("id") int id) {
        return dataCoachService.selectDataCoachById(id);
    }
    @ApiOperation(value = "添加教练", notes = "添加教练", position = 3)
    @RequestMapping(value = "/data-coach", method = RequestMethod.POST)
    @ResponseBody
    public Result insertDataCoach(
        @ApiParam(value = "教练")
        @RequestBody DataCoach dataCoach) {
        return dataCoachService.insertDataCoach(dataCoach);
    }
    @ApiOperation(value = "修改教练", notes = "修改教练", position = 4)
    @RequestMapping(value = "/data-coach", method = RequestMethod.PUT)
    @ResponseBody
    public Result updateDataCoach(
        @ApiParam(value = "教练")
        @RequestBody DataCoach dataCoach) {
        return dataCoachService.updateDataCoach(dataCoach);
    }
    @ApiOperation(value = "删除教练", notes = "删除教练", position = 5)
    @RequestMapping(value = "/data-coach/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteDataCoachById(
        @ApiParam(value = "教练唯一标识")
        @PathVariable("id") int id) {
        return dataCoachService.deleteDataCoachById(id);
    }
}
