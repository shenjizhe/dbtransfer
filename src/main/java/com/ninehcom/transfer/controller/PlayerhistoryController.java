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
import com.ninehcom.transfer.entity.Playerhistory;
import com.ninehcom.transfer.service.PlayerhistoryService;
import com.ninehcom.common.util.Result;
//import com.ninehcom.transfer.jpa.repository.PlayerhistoryRepository;

/**
 * 球员历史的控制器
 * @author shenjizhe
 * @version 1.0.0
 */
@Api(basePath = "/transfer", value = "球员历史", description = "球员历史", produces = "application/json")
@RestController
@RequestMapping(value = "/transfer")
public class PlayerhistoryController {

    @Autowired
    PlayerhistoryService playerhistoryService;
    @ApiOperation(value = "获取所有球员历史", notes = "获取所有球员历史", position = 1)
    @RequestMapping(value = "/playerhistory", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAllPlayerhistory() {
        return playerhistoryService.selectAllPlayerhistory();
    }
    @ApiOperation(value = "获取球员历史", notes = "获取球员历史", position = 2)
    @RequestMapping(value = "/playerhistory/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result selectPlayerhistoryById(
        @ApiParam(value = "球员历史唯一标识")
        @PathVariable("id") int id) {
        return playerhistoryService.selectPlayerhistoryById(id);
    }
}
