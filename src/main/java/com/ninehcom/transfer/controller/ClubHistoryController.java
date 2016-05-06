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
import com.ninehcom.transfer.entity.ClubHistory;
import com.ninehcom.transfer.service.ClubHistoryService;
import com.ninehcom.common.util.Result;
//import com.ninehcom.transfer.jpa.repository.ClubHistoryRepository;

/**
 * 俱乐部历史的控制器
 * @author shenjizhe
 * @version 1.0.0
 */
@Api(basePath = "/transfer", value = "俱乐部历史", description = "俱乐部历史", produces = "application/json")
@RestController
@RequestMapping(value = "/transfer")
public class ClubHistoryController {

    @Autowired
    ClubHistoryService clubHistoryService;
    @ApiOperation(value = "获取所有俱乐部历史", notes = "获取所有俱乐部历史", position = 1)
    @RequestMapping(value = "/club-history", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAllClubHistory() {
        return clubHistoryService.selectAllClubHistory();
    }
    @ApiOperation(value = "获取俱乐部历史", notes = "获取俱乐部历史", position = 2)
    @RequestMapping(value = "/club-history/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result selectClubHistoryById(
        @ApiParam(value = "俱乐部历史唯一标识")
        @PathVariable("id") int id) {
        return clubHistoryService.selectClubHistoryById(id);
    }
    @ApiOperation(value = "添加俱乐部历史", notes = "添加俱乐部历史", position = 3)
    @RequestMapping(value = "/club-history", method = RequestMethod.POST)
    @ResponseBody
    public Result insertClubHistory(
        @ApiParam(value = "俱乐部历史")
        @RequestBody ClubHistory clubHistory) {
        return clubHistoryService.insertClubHistory(clubHistory);
    }
    @ApiOperation(value = "修改俱乐部历史", notes = "修改俱乐部历史", position = 4)
    @RequestMapping(value = "/club-history", method = RequestMethod.PUT)
    @ResponseBody
    public Result updateClubHistory(
        @ApiParam(value = "俱乐部历史")
        @RequestBody ClubHistory clubHistory) {
        return clubHistoryService.updateClubHistory(clubHistory);
    }
    @ApiOperation(value = "删除俱乐部历史", notes = "删除俱乐部历史", position = 5)
    @RequestMapping(value = "/club-history/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteClubHistoryById(
        @ApiParam(value = "俱乐部历史唯一标识")
        @PathVariable("id") int id) {
        return clubHistoryService.deleteClubHistoryById(id);
    }
}
