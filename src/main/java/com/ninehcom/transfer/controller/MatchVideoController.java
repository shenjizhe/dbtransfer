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
import com.ninehcom.transfer.entity.MatchVideo;
import com.ninehcom.transfer.service.MatchVideoService;
import com.ninehcom.common.util.Result;
//import com.ninehcom.transfer.jpa.repository.MatchVideoRepository;

/**
 * 赛事视频的控制器
 * @author shenjizhe
 * @version 1.0.0
 */
@Api(basePath = "/transfer", value = "赛事视频", description = "赛事视频", produces = "application/json")
@RestController
@RequestMapping(value = "/transfer")
public class MatchVideoController {

    @Autowired
    MatchVideoService matchVideoService;
    @ApiOperation(value = "获取所有赛事视频", notes = "获取所有赛事视频", position = 1)
    @RequestMapping(value = "/match-video", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAllMatchVideo() {
        return matchVideoService.selectAllMatchVideo();
    }
    @ApiOperation(value = "获取赛事视频", notes = "获取赛事视频", position = 2)
    @RequestMapping(value = "/match-video/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result selectMatchVideoById(
        @ApiParam(value = "赛事视频唯一标识")
        @PathVariable("id") int id) {
        return matchVideoService.selectMatchVideoById(id);
    }
    @ApiOperation(value = "添加赛事视频", notes = "添加赛事视频", position = 3)
    @RequestMapping(value = "/match-video", method = RequestMethod.POST)
    @ResponseBody
    public Result insertMatchVideo(
        @ApiParam(value = "赛事视频")
        @RequestBody MatchVideo matchVideo) {
        return matchVideoService.insertMatchVideo(matchVideo);
    }
    @ApiOperation(value = "修改赛事视频", notes = "修改赛事视频", position = 4)
    @RequestMapping(value = "/match-video", method = RequestMethod.PUT)
    @ResponseBody
    public Result updateMatchVideo(
        @ApiParam(value = "赛事视频")
        @RequestBody MatchVideo matchVideo) {
        return matchVideoService.updateMatchVideo(matchVideo);
    }
    @ApiOperation(value = "删除赛事视频", notes = "删除赛事视频", position = 5)
    @RequestMapping(value = "/match-video/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteMatchVideoById(
        @ApiParam(value = "赛事视频唯一标识")
        @PathVariable("id") int id) {
        return matchVideoService.deleteMatchVideoById(id);
    }
}
