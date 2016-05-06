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
import com.ninehcom.transfer.entity.ClubType;
import com.ninehcom.transfer.service.ClubTypeService;
import com.ninehcom.common.util.Result;
//import com.ninehcom.transfer.jpa.repository.ClubTypeRepository;

/**
 * 球队主客关系的控制器
 * @author shenjizhe
 * @version 1.0.0
 */
@Api(basePath = "/transfer", value = "球队主客关系", description = "球队主客关系", produces = "application/json")
@RestController
@RequestMapping(value = "/transfer")
public class ClubTypeController {

    @Autowired
    ClubTypeService clubTypeService;
    @ApiOperation(value = "获取所有球队主客关系", notes = "获取所有球队主客关系", position = 1)
    @RequestMapping(value = "/club-type", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAllClubType() {
        return clubTypeService.selectAllClubType();
    }
    @ApiOperation(value = "获取球队主客关系", notes = "获取球队主客关系", position = 2)
    @RequestMapping(value = "/club-type/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result selectClubTypeById(
        @ApiParam(value = "球队主客关系唯一标识")
        @PathVariable("id") int id) {
        return clubTypeService.selectClubTypeById(id);
    }
    @ApiOperation(value = "添加球队主客关系", notes = "添加球队主客关系", position = 3)
    @RequestMapping(value = "/club-type", method = RequestMethod.POST)
    @ResponseBody
    public Result insertClubType(
        @ApiParam(value = "球队主客关系")
        @RequestBody ClubType clubType) {
        return clubTypeService.insertClubType(clubType);
    }
    @ApiOperation(value = "修改球队主客关系", notes = "修改球队主客关系", position = 4)
    @RequestMapping(value = "/club-type", method = RequestMethod.PUT)
    @ResponseBody
    public Result updateClubType(
        @ApiParam(value = "球队主客关系")
        @RequestBody ClubType clubType) {
        return clubTypeService.updateClubType(clubType);
    }
    @ApiOperation(value = "删除球队主客关系", notes = "删除球队主客关系", position = 5)
    @RequestMapping(value = "/club-type/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteClubTypeById(
        @ApiParam(value = "球队主客关系唯一标识")
        @PathVariable("id") int id) {
        return clubTypeService.deleteClubTypeById(id);
    }
}
