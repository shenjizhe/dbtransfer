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
import com.ninehcom.transfer.entity.DataMatchLine;
import com.ninehcom.transfer.service.DataMatchLineService;
import com.ninehcom.common.util.Result;
//import com.ninehcom.transfer.jpa.repository.DataMatchLineRepository;

/**
 * 比赛阵容的控制器
 * @author shenjizhe
 * @version 1.0.0
 */
@Api(basePath = "/transfer", value = "比赛阵容", description = "比赛阵容", produces = "application/json")
@RestController
@RequestMapping(value = "/transfer")
public class DataMatchLineController {

    @Autowired
    DataMatchLineService dataMatchLineService;
    @ApiOperation(value = "获取所有比赛阵容", notes = "获取所有比赛阵容", position = 1)
    @RequestMapping(value = "/data-match-line", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAllDataMatchLine() {
        return dataMatchLineService.selectAllDataMatchLine();
    }
    @ApiOperation(value = "获取比赛阵容", notes = "获取比赛阵容", position = 2)
    @RequestMapping(value = "/data-match-line/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result selectDataMatchLineById(
        @ApiParam(value = "比赛阵容唯一标识")
        @PathVariable("id") int id) {
        return dataMatchLineService.selectDataMatchLineById(id);
    }
    @ApiOperation(value = "添加比赛阵容", notes = "添加比赛阵容", position = 3)
    @RequestMapping(value = "/data-match-line", method = RequestMethod.POST)
    @ResponseBody
    public Result insertDataMatchLine(
        @ApiParam(value = "比赛阵容")
        @RequestBody DataMatchLine dataMatchLine) {
        return dataMatchLineService.insertDataMatchLine(dataMatchLine);
    }
    @ApiOperation(value = "修改比赛阵容", notes = "修改比赛阵容", position = 4)
    @RequestMapping(value = "/data-match-line", method = RequestMethod.PUT)
    @ResponseBody
    public Result updateDataMatchLine(
        @ApiParam(value = "比赛阵容")
        @RequestBody DataMatchLine dataMatchLine) {
        return dataMatchLineService.updateDataMatchLine(dataMatchLine);
    }
    @ApiOperation(value = "删除比赛阵容", notes = "删除比赛阵容", position = 5)
    @RequestMapping(value = "/data-match-line/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteDataMatchLineById(
        @ApiParam(value = "比赛阵容唯一标识")
        @PathVariable("id") int id) {
        return dataMatchLineService.deleteDataMatchLineById(id);
    }
}
