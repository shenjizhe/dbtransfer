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
import com.ninehcom.transfer.entity.StateType;
import com.ninehcom.transfer.service.StateTypeService;
import com.ninehcom.common.util.Result;
//import com.ninehcom.transfer.jpa.repository.StateTypeRepository;

/**
 * 赛事状态的控制器
 * @author shenjizhe
 * @version 1.0.0
 */
@Api(basePath = "/transfer", value = "赛事状态", description = "赛事状态", produces = "application/json")
@RestController
@RequestMapping(value = "/transfer")
public class StateTypeController {

    @Autowired
    StateTypeService stateTypeService;
    @ApiOperation(value = "获取所有赛事状态", notes = "获取所有赛事状态", position = 1)
    @RequestMapping(value = "/state-type", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAllStateType() {
        return stateTypeService.selectAllStateType();
    }
    @ApiOperation(value = "获取赛事状态", notes = "获取赛事状态", position = 2)
    @RequestMapping(value = "/state-type/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result selectStateTypeById(
        @ApiParam(value = "赛事状态唯一标识")
        @PathVariable("id") int id) {
        return stateTypeService.selectStateTypeById(id);
    }
    @ApiOperation(value = "添加赛事状态", notes = "添加赛事状态", position = 3)
    @RequestMapping(value = "/state-type", method = RequestMethod.POST)
    @ResponseBody
    public Result insertStateType(
        @ApiParam(value = "赛事状态")
        @RequestBody StateType stateType) {
        return stateTypeService.insertStateType(stateType);
    }
    @ApiOperation(value = "修改赛事状态", notes = "修改赛事状态", position = 4)
    @RequestMapping(value = "/state-type", method = RequestMethod.PUT)
    @ResponseBody
    public Result updateStateType(
        @ApiParam(value = "赛事状态")
        @RequestBody StateType stateType) {
        return stateTypeService.updateStateType(stateType);
    }
    @ApiOperation(value = "删除赛事状态", notes = "删除赛事状态", position = 5)
    @RequestMapping(value = "/state-type/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteStateTypeById(
        @ApiParam(value = "赛事状态唯一标识")
        @PathVariable("id") int id) {
        return stateTypeService.deleteStateTypeById(id);
    }
}
