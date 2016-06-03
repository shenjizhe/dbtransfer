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
import com.ninehcom.transfer.entity.UserPlayerRelation;
import com.ninehcom.transfer.service.UserPlayerRelationService;
import com.ninehcom.common.util.Result;
//import com.ninehcom.transfer.jpa.repository.UserPlayerRelationRepository;

/**
 * 用户球员关系的控制器
 * @author shenjizhe
 * @version 1.0.0
 */
@Api(basePath = "/transfer", value = "用户球员关系", description = "用户球员关系", produces = "application/json")
@RestController
@RequestMapping(value = "/transfer")
public class UserPlayerRelationController {

    @Autowired
    UserPlayerRelationService userPlayerRelationService;
    @ApiOperation(value = "获取所有用户球员关系", notes = "获取所有用户球员关系", position = 1)
    @RequestMapping(value = "/user-player-relation", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAllUserPlayerRelation() {
        return userPlayerRelationService.selectAllUserPlayerRelation();
    }
    @ApiOperation(value = "修改用户球员关系", notes = "修改用户球员关系", position = 4)
    @RequestMapping(value = "/user-player-relation", method = RequestMethod.PUT)
    @ResponseBody
    public Result updateUserPlayerRelation(
        @ApiParam(value = "用户球员关系")
        @RequestBody UserPlayerRelation userPlayerRelation) {
        return userPlayerRelationService.updateUserPlayerRelation(userPlayerRelation);
    }
}
