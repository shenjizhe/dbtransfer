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
import com.ninehcom.transfer.entity.AssistRank;
import com.ninehcom.transfer.service.AssistRankService;
import com.ninehcom.common.util.Result;
//import com.ninehcom.transfer.jpa.repository.AssistRankRepository;

/**
 * VIEW的控制器
 * @author shenjizhe
 * @version 1.0.0
 */
@Api(basePath = "/transfer", value = "VIEW", description = "VIEW", produces = "application/json")
@RestController
@RequestMapping(value = "/transfer")
public class AssistRankController {

    @Autowired
    AssistRankService assistRankService;
    @ApiOperation(value = "获取所有VIEW", notes = "获取所有VIEW", position = 1)
    @RequestMapping(value = "/assist-rank", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAllAssistRank() {
        return assistRankService.selectAllAssistRank();
    }
    @ApiOperation(value = "获取VIEW", notes = "获取VIEW", position = 2)
    @RequestMapping(value = "/assist-rank/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAssistRankById(
        @ApiParam(value = "VIEW唯一标识")
        @PathVariable("id") int id) {
        return assistRankService.selectAssistRankById(id);
    }
    @ApiOperation(value = "添加VIEW", notes = "添加VIEW", position = 3)
    @RequestMapping(value = "/assist-rank", method = RequestMethod.POST)
    @ResponseBody
    public Result insertAssistRank(
        @ApiParam(value = "VIEW")
        @RequestBody AssistRank assistRank) {
        return assistRankService.insertAssistRank(assistRank);
    }
    @ApiOperation(value = "修改VIEW", notes = "修改VIEW", position = 4)
    @RequestMapping(value = "/assist-rank", method = RequestMethod.PUT)
    @ResponseBody
    public Result updateAssistRank(
        @ApiParam(value = "VIEW")
        @RequestBody AssistRank assistRank) {
        return assistRankService.updateAssistRank(assistRank);
    }
    @ApiOperation(value = "删除VIEW", notes = "删除VIEW", position = 5)
    @RequestMapping(value = "/assist-rank/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteAssistRankById(
        @ApiParam(value = "VIEW唯一标识")
        @PathVariable("id") int id) {
        return assistRankService.deleteAssistRankById(id);
    }
}
