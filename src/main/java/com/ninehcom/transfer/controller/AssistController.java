package com.ninehcom.transfer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import com.ninehcom.transfer.service.AssistService;
import com.ninehcom.common.util.Result;
//import com.ninehcom.transfer.jpa.repository.AssistRepository;

/**
 * 助攻的控制器
 * @author shenjizhe
 * @version 1.0.0
 */
@Api(basePath = "/transfer", value = "助攻", description = "助攻", produces = "application/json")
@RestController
@RequestMapping(value = "/transfer")
public class AssistController {

    @Autowired
    AssistService assistService;
    @ApiOperation(value = "获取所有助攻", notes = "获取所有助攻", position = 1)
    @RequestMapping(value = "/assist", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAllAssist() {
        return assistService.selectAllAssist();
    }
    @ApiOperation(value = "获取助攻", notes = "获取助攻", position = 2)
    @RequestMapping(value = "/assist/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAssistById(
        @ApiParam(value = "助攻唯一标识")
        @PathVariable("id") int id) {
        return assistService.selectAssistById(id);
    }
}
