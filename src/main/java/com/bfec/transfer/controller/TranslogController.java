package com.bfec.transfer.controller;

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
import com.bfec.transfer.entity.Translog;
import com.bfec.transfer.service.TranslogService;
import com.bfec.common.util.Result;
//import com.bfec.transfer.jpa.repository.TranslogRepository;

/**
 * 转换日志的控制器
 * @author shenjizhe
 * @version 1.0.0
 */
@Api(basePath = "/transfer", value = "转换日志", description = "转换日志", produces = "application/json")
@RestController
@RequestMapping(value = "/transfer")
public class TranslogController {

    @Autowired
    TranslogService translogService;
    @ApiOperation(value = "获取所有转换日志", notes = "获取所有转换日志", position = 1)
    @RequestMapping(value = "/translog", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAllTranslog() {
        return translogService.selectAllTranslog();
    }
    @ApiOperation(value = "获取转换日志", notes = "获取转换日志", position = 2)
    @RequestMapping(value = "/translog/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result selectTranslogById(
        @ApiParam(value = "转换日志唯一标识")
        @PathVariable("id") int id) {
        return translogService.selectTranslogById(id);
    }
    @ApiOperation(value = "添加转换日志", notes = "添加转换日志", position = 3)
    @RequestMapping(value = "/translog", method = RequestMethod.POST)
    @ResponseBody
    public Result insertTranslog(
        @ApiParam(value = "转换日志")
        @RequestBody Translog translog) {
        return translogService.insertTranslog(translog);
    }
    @ApiOperation(value = "修改转换日志", notes = "修改转换日志", position = 4)
    @RequestMapping(value = "/translog", method = RequestMethod.PUT)
    @ResponseBody
    public Result updateTranslog(
        @ApiParam(value = "转换日志")
        @RequestBody Translog translog) {
        return translogService.updateTranslog(translog);
    }
    @ApiOperation(value = "删除转换日志", notes = "删除转换日志", position = 5)
    @RequestMapping(value = "/translog/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteTranslogById(
        @ApiParam(value = "转换日志唯一标识")
        @PathVariable("id") int id) {
        return translogService.deleteTranslogById(id);
    }
}
