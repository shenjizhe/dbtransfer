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
import com.ninehcom.transfer.entity.Leagueevent;
import com.ninehcom.transfer.service.LeagueeventService;
import com.ninehcom.common.util.Result;
//import com.ninehcom.transfer.jpa.repository.LeagueeventRepository;

/**
 * 赛事事件的控制器
 * @author shenjizhe
 * @version 1.0.0
 */
@Api(basePath = "/transfer", value = "赛事事件", description = "赛事事件", produces = "application/json")
@RestController
@RequestMapping(value = "/transfer")
public class LeagueeventController {

    @Autowired
    LeagueeventService leagueeventService;
    @ApiOperation(value = "获取所有赛事事件", notes = "获取所有赛事事件", position = 1)
    @RequestMapping(value = "/leagueevent", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAllLeagueevent() {
        return leagueeventService.selectAllLeagueevent();
    }
    @ApiOperation(value = "获取赛事事件", notes = "获取赛事事件", position = 2)
    @RequestMapping(value = "/leagueevent/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result selectLeagueeventById(
        @ApiParam(value = "赛事事件唯一标识")
        @PathVariable("id") int id) {
        return leagueeventService.selectLeagueeventById(id);
    }
}
