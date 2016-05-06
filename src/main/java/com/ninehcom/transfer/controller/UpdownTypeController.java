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
import com.ninehcom.transfer.entity.UpdownType;
import com.ninehcom.transfer.service.UpdownTypeService;
import com.ninehcom.common.util.Result;
//import com.ninehcom.transfer.jpa.repository.UpdownTypeRepository;

/**
 * 球队升降级的控制器
 * @author shenjizhe
 * @version 1.0.0
 */
@Api(basePath = "/transfer", value = "球队升降级", description = "球队升降级", produces = "application/json")
@RestController
@RequestMapping(value = "/transfer")
public class UpdownTypeController {

    @Autowired
    UpdownTypeService updownTypeService;
    @ApiOperation(value = "获取所有球队升降级", notes = "获取所有球队升降级", position = 1)
    @RequestMapping(value = "/updown-type", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAllUpdownType() {
        return updownTypeService.selectAllUpdownType();
    }
    @ApiOperation(value = "获取球队升降级", notes = "获取球队升降级", position = 2)
    @RequestMapping(value = "/updown-type/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result selectUpdownTypeById(
        @ApiParam(value = "球队升降级唯一标识")
        @PathVariable("id") int id) {
        return updownTypeService.selectUpdownTypeById(id);
    }
    @ApiOperation(value = "添加球队升降级", notes = "添加球队升降级", position = 3)
    @RequestMapping(value = "/updown-type", method = RequestMethod.POST)
    @ResponseBody
    public Result insertUpdownType(
        @ApiParam(value = "球队升降级")
        @RequestBody UpdownType updownType) {
        return updownTypeService.insertUpdownType(updownType);
    }
    @ApiOperation(value = "修改球队升降级", notes = "修改球队升降级", position = 4)
    @RequestMapping(value = "/updown-type", method = RequestMethod.PUT)
    @ResponseBody
    public Result updateUpdownType(
        @ApiParam(value = "球队升降级")
        @RequestBody UpdownType updownType) {
        return updownTypeService.updateUpdownType(updownType);
    }
    @ApiOperation(value = "删除球队升降级", notes = "删除球队升降级", position = 5)
    @RequestMapping(value = "/updown-type/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteUpdownTypeById(
        @ApiParam(value = "球队升降级唯一标识")
        @PathVariable("id") int id) {
        return updownTypeService.deleteUpdownTypeById(id);
    }
}
