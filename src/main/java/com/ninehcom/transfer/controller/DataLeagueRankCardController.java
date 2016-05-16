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
import com.ninehcom.transfer.entity.DataLeagueRankCard;
import com.ninehcom.transfer.service.DataLeagueRankCardService;
import com.ninehcom.common.util.Result;
//import com.ninehcom.transfer.jpa.repository.DataLeagueRankCardRepository;

/**
 * 联赛红黄牌榜的控制器
 * @author shenjizhe
 * @version 1.0.0
 */
@Api(basePath = "/transfer", value = "联赛红黄牌榜", description = "联赛红黄牌榜", produces = "application/json")
@RestController
@RequestMapping(value = "/transfer")
public class DataLeagueRankCardController {

    @Autowired
    DataLeagueRankCardService dataLeagueRankCardService;
    @ApiOperation(value = "获取所有联赛红黄牌榜", notes = "获取所有联赛红黄牌榜", position = 1)
    @RequestMapping(value = "/data-league-rank-card", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAllDataLeagueRankCard() {
        return dataLeagueRankCardService.selectAllDataLeagueRankCard();
    }
    @ApiOperation(value = "获取联赛红黄牌榜", notes = "获取联赛红黄牌榜", position = 2)
    @RequestMapping(value = "/data-league-rank-card/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result selectDataLeagueRankCardById(
        @ApiParam(value = "联赛红黄牌榜唯一标识")
        @PathVariable("id") int id) {
        return dataLeagueRankCardService.selectDataLeagueRankCardById(id);
    }
    @ApiOperation(value = "添加联赛红黄牌榜", notes = "添加联赛红黄牌榜", position = 3)
    @RequestMapping(value = "/data-league-rank-card", method = RequestMethod.POST)
    @ResponseBody
    public Result insertDataLeagueRankCard(
        @ApiParam(value = "联赛红黄牌榜")
        @RequestBody DataLeagueRankCard dataLeagueRankCard) {
        return dataLeagueRankCardService.insertDataLeagueRankCard(dataLeagueRankCard);
    }
    @ApiOperation(value = "修改联赛红黄牌榜", notes = "修改联赛红黄牌榜", position = 4)
    @RequestMapping(value = "/data-league-rank-card", method = RequestMethod.PUT)
    @ResponseBody
    public Result updateDataLeagueRankCard(
        @ApiParam(value = "联赛红黄牌榜")
        @RequestBody DataLeagueRankCard dataLeagueRankCard) {
        return dataLeagueRankCardService.updateDataLeagueRankCard(dataLeagueRankCard);
    }
    @ApiOperation(value = "删除联赛红黄牌榜", notes = "删除联赛红黄牌榜", position = 5)
    @RequestMapping(value = "/data-league-rank-card/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteDataLeagueRankCardById(
        @ApiParam(value = "联赛红黄牌榜唯一标识")
        @PathVariable("id") int id) {
        return dataLeagueRankCardService.deleteDataLeagueRankCardById(id);
    }
}
