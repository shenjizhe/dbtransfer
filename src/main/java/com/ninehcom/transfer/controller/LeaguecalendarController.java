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
import com.ninehcom.transfer.entity.Leaguecalendar;
import com.ninehcom.transfer.service.LeaguecalendarService;
import com.ninehcom.common.util.Result;
//import com.ninehcom.transfer.jpa.repository.LeaguecalendarRepository;

/**
 * 赛事的控制器
 * @author shenjizhe
 * @version 1.0.0
 */
@Api(basePath = "/transfer", value = "赛事", description = "赛事", produces = "application/json")
@RestController
@RequestMapping(value = "/transfer")
public class LeaguecalendarController {

    @Autowired
    LeaguecalendarService leaguecalendarService;
    @ApiOperation(value = "获取所有赛事", notes = "获取所有赛事", position = 1)
    @RequestMapping(value = "/leaguecalendar", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAllLeaguecalendar() {
        return leaguecalendarService.selectAllLeaguecalendar();
    }
    @ApiOperation(value = "获取赛事", notes = "获取赛事", position = 2)
    @RequestMapping(value = "/leaguecalendar/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result selectLeaguecalendarById(
        @ApiParam(value = "赛事唯一标识")
        @PathVariable("id") int id) {
        return leaguecalendarService.selectLeaguecalendarById(id);
    }
}
