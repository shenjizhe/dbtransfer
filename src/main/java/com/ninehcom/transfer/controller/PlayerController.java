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
import com.ninehcom.transfer.entity.Player;
import com.ninehcom.transfer.service.PlayerService;
import com.ninehcom.common.util.Result;
//import com.ninehcom.transfer.jpa.repository.PlayerRepository;

/**
 * 球员的控制器
 * @author shenjizhe
 * @version 1.0.0
 */
@Api(basePath = "/transfer", value = "球员", description = "球员", produces = "application/json")
@RestController
@RequestMapping(value = "/transfer")
public class PlayerController {

    @Autowired
    PlayerService playerService;
    @ApiOperation(value = "获取所有球员", notes = "获取所有球员", position = 1)
    @RequestMapping(value = "/player", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAllPlayer() {
        return playerService.selectAllPlayer();
    }
    @ApiOperation(value = "获取球员", notes = "获取球员", position = 2)
    @RequestMapping(value = "/player/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result selectPlayerById(
        @ApiParam(value = "球员唯一标识")
        @PathVariable("id") int id) {
        return playerService.selectPlayerById(id);
    }
}
