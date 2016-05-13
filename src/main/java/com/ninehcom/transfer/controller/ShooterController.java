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
import com.ninehcom.transfer.entity.Shooter;
import com.ninehcom.transfer.service.ShooterService;
import com.ninehcom.common.util.Result;
//import com.ninehcom.transfer.jpa.repository.ShooterRepository;

/**
 * 射手的控制器
 * @author shenjizhe
 * @version 1.0.0
 */
@Api(basePath = "/transfer", value = "射手", description = "射手", produces = "application/json")
@RestController
@RequestMapping(value = "/transfer")
public class ShooterController {

    @Autowired
    ShooterService shooterService;
    @ApiOperation(value = "获取所有射手", notes = "获取所有射手", position = 1)
    @RequestMapping(value = "/shooter", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAllShooter() {
        return shooterService.selectAllShooter();
    }
    @ApiOperation(value = "获取射手", notes = "获取射手", position = 2)
    @RequestMapping(value = "/shooter/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result selectShooterById(
        @ApiParam(value = "射手唯一标识")
        @PathVariable("id") int id) {
        return shooterService.selectShooterById(id);
    }
}
