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
import com.ninehcom.transfer.entity.Errlog;
import com.ninehcom.transfer.service.ErrlogService;
import com.ninehcom.common.util.Result;
//import com.ninehcom.transfer.jpa.repository.ErrlogRepository;

/**
 * 错误日志的控制器
 * @author shenjizhe
 * @version 1.0.0
 */
@Api(basePath = "/transfer", value = "错误日志", description = "错误日志", produces = "application/json")
@RestController
@RequestMapping(value = "/transfer")
public class ErrlogController {

    @Autowired
    ErrlogService errlogService;
    @ApiOperation(value = "获取所有错误日志", notes = "获取所有错误日志", position = 1)
    @RequestMapping(value = "/errlog", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAllErrlog() {
        return errlogService.selectAllErrlog();
    }
    @ApiOperation(value = "获取错误日志", notes = "获取错误日志", position = 2)
    @RequestMapping(value = "/errlog/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result selectErrlogById(
        @ApiParam(value = "错误日志唯一标识")
        @PathVariable("id") int id) {
        return errlogService.selectErrlogById(id);
    }
    @ApiOperation(value = "添加错误日志", notes = "添加错误日志", position = 3)
    @RequestMapping(value = "/errlog", method = RequestMethod.POST)
    @ResponseBody
    public Result insertErrlog(
        @ApiParam(value = "错误日志")
        @RequestBody Errlog errlog) {
        return errlogService.insertErrlog(errlog);
    }
    @ApiOperation(value = "修改错误日志", notes = "修改错误日志", position = 4)
    @RequestMapping(value = "/errlog", method = RequestMethod.PUT)
    @ResponseBody
    public Result updateErrlog(
        @ApiParam(value = "错误日志")
        @RequestBody Errlog errlog) {
        return errlogService.updateErrlog(errlog);
    }
    @ApiOperation(value = "删除错误日志", notes = "删除错误日志", position = 5)
    @RequestMapping(value = "/errlog/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteErrlogById(
        @ApiParam(value = "错误日志唯一标识")
        @PathVariable("id") int id) {
        return errlogService.deleteErrlogById(id);
    }
}
