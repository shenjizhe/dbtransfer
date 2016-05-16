package com.ninehcom.transfer.controller;

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
import com.ninehcom.transfer.entity.ClubMapping;
import com.ninehcom.transfer.service.ClubMappingService;
import com.ninehcom.common.util.Result;
//import com.ninehcom.transfer.jpa.repository.ClubMappingRepository;

/**
 * 俱乐部项目和中超项目的俱乐部映射关系的控制器
 * @author shenjizhe
 * @version 1.0.0
 */
@Api(basePath = "/transfer", value = "俱乐部项目和中超项目的俱乐部映射关系", description = "俱乐部项目和中超项目的俱乐部映射关系", produces = "application/json")
@RestController
@RequestMapping(value = "/transfer")
public class ClubMappingController {

    @Autowired
    ClubMappingService clubMappingService;
    @ApiOperation(value = "获取所有俱乐部项目和中超项目的俱乐部映射关系", notes = "获取所有俱乐部项目和中超项目的俱乐部映射关系", position = 1)
    @RequestMapping(value = "/club-mapping", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAllClubMapping() {
        return clubMappingService.selectAllClubMapping();
    }
    @ApiOperation(value = "获取俱乐部项目和中超项目的俱乐部映射关系", notes = "获取俱乐部项目和中超项目的俱乐部映射关系", position = 2)
    @RequestMapping(value = "/club-mapping/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result selectClubMappingById(
        @ApiParam(value = "俱乐部项目和中超项目的俱乐部映射关系唯一标识")
        @PathVariable("id") int id) {
        return clubMappingService.selectClubMappingById(id);
    }
    @ApiOperation(value = "添加俱乐部项目和中超项目的俱乐部映射关系", notes = "添加俱乐部项目和中超项目的俱乐部映射关系", position = 3)
    @RequestMapping(value = "/club-mapping", method = RequestMethod.POST)
    @ResponseBody
    public Result insertClubMapping(
        @ApiParam(value = "俱乐部项目和中超项目的俱乐部映射关系")
        @RequestBody ClubMapping clubMapping) {
        return clubMappingService.insertClubMapping(clubMapping);
    }
    @ApiOperation(value = "修改俱乐部项目和中超项目的俱乐部映射关系", notes = "修改俱乐部项目和中超项目的俱乐部映射关系", position = 4)
    @RequestMapping(value = "/club-mapping", method = RequestMethod.PUT)
    @ResponseBody
    public Result updateClubMapping(
        @ApiParam(value = "俱乐部项目和中超项目的俱乐部映射关系")
        @RequestBody ClubMapping clubMapping) {
        return clubMappingService.updateClubMapping(clubMapping);
    }
    @ApiOperation(value = "删除俱乐部项目和中超项目的俱乐部映射关系", notes = "删除俱乐部项目和中超项目的俱乐部映射关系", position = 5)
    @RequestMapping(value = "/club-mapping/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteClubMappingById(
        @ApiParam(value = "俱乐部项目和中超项目的俱乐部映射关系唯一标识")
        @PathVariable("id") int id) {
        return clubMappingService.deleteClubMappingById(id);
    }
}
