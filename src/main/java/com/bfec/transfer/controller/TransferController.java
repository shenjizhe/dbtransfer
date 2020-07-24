package com.bfec.transfer.controller;

import com.bfec.common.util.Result;
import com.bfec.transfer.service.TransferService;
import com.bfec.transfer.transfer.TransferFactory;
import com.bfec.transfer.transfer.TransferItem;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@RestController
@Api(value = "/trans", description = "转换控制器", produces = "application/json")
@RequestMapping(value = "/trans")
public class TransferController {

    @Autowired
    TransferService service;

    @ApiOperation(value = "执行转换", notes = "执行数据库转换任务")
    @RequestMapping(value = "/excute", method = RequestMethod.POST)
    @ResponseBody
    public Result trans(
    ) throws SQLException, IOException {
        return service.trans();
    }
}
