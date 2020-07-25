package com.bfec.transfer.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;
import com.bfec.transfer.service.CommonService;
import com.bfec.common.util.Result;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Playerhistory 的控制器，用于显示同时查询2个数据库的结果 * @author shenjizhe
 *
 * @version 1.0.0
 */
@RestController
@Api(value = "/common", description = "通用控制器", produces = "application/json")
@RequestMapping(value = "/common")
public class CommonController {

    @Autowired
    CommonService commonService;

    @ApiOperation(value = "获得资源列表", notes = "获得系统内注册的资源列表")
    @RequestMapping(value = "/{datasource}/{resource}", method = RequestMethod.GET)
    @ResponseBody
    public Result selectAll(
            @ApiParam(required = true, defaultValue = "", name = "datasource", value = "数据源名称")
            @PathVariable("datasource") String datasource,
            @ApiParam(required = true, defaultValue = "", name = "resource", value = "资源名称")
            @PathVariable("resource") String resource,
            @ApiParam(required = false, defaultValue = "false", name = "page_can", value = "是否可以分页，true/false")
            @RequestParam(value = "page_can", required = false, defaultValue = "false") boolean canpage,
            @ApiParam(required = false, name = "page_index", value = "索引从1开始，代表第一页,只有page_can设置为true才生效")
            @RequestParam(value = "page_index", required = false, defaultValue = "1") int index,
            @ApiParam(required = false, name = "page_size", value = "默认页大小为20，只有page_can设置为true才生效")
            @RequestParam(value = "page_size", required = false, defaultValue = "20") int size,
            @ApiParam(required = false, name = "condition", value = "默认为无条件,条件格式:（id=1 or name='123'）")
            @RequestParam(value = "condition", required = false, defaultValue = "") String condition,
            @ApiParam(required = false, name = "fields", value = "默认返回所有列,删选格式:\nid\nname")
            @RequestParam(value = "fields", required = false, defaultValue = "") List<String> fields,
            @ApiParam(required = false, name = "orderby", value = "默认为不排序‘-’代表逆序排序,'+'或者''代表正序排序,排序格式:\n-name\nbirthday")
            @RequestParam(value = "orderby", required = false, defaultValue = "") List<String> orderby
    ) throws SQLException {
//        Result result = sqlUtil.checkTable(datasource, resource);
//        if (!result.isSuccess()) {
//            return result;
//        }
//        result = sqlUtil.checkColumns(datasource, resource, fields);
//        if (!result.isSuccess()) {
//            return result;
//        }
//        result = sqlUtil.checkColumns(datasource, resource, orderby);
//        if (!result.isSuccess()) {
//            return result;
//        }
//        result = sqlUtil.checkWhere(datasource, resource, condition);
//        if (!result.isSuccess()) {
//            return result;
//        }

        Map request = new HashMap();
        request.put("table", resource);
        // pagable
        request.put("page_can", canpage);
        request.put("offset", (index - 1) * size);
        request.put("size", size);

        // order
        boolean order_can = orderby.size() > 0;
        request.put("order_can", order_can);
        if (order_can) {
            String orderbyText = "";
            for (int i = 0; i < orderby.size(); i++) {
                String text = orderby.get(i);
                if (text.startsWith("-")) {
                    orderbyText += text.substring(1);
                    orderbyText += " desc";
                } else if (text.startsWith("+")) {
                    orderbyText += text.substring(1);
                } else {
                    orderbyText += text;
                }

                if (i + 1 < orderby.size()) {
                    orderbyText += ",";
                }
            }
            request.put("order_text", orderbyText);
        }
        // fields
        boolean field_can = fields.size() > 0;
        if (field_can) {
            String fieldText = "";
            for (int i = 0; i < fields.size(); i++) {

                fieldText += fields.get(i);
                if (i + 1 < fields.size()) {
                    fieldText += ",";
                }
            }
            request.put("field_text", fieldText);
        } else {
            request.put("field_text", "*");
        }

        // conditions
        request.put("where_text", condition);
        request.put("db",datasource);

        return commonService.select(request);
    }

    @ApiOperation(value = "添加新的资源", notes = "添加新的资源")
    @RequestMapping(value = "/{datasource}/{resource}", method = RequestMethod.POST)
    @ResponseBody
    public Result add(
            @ApiParam(required = true, defaultValue = "", name = "datasource", value = "数据源名称")
            @PathVariable("datasource") String datasource,
            @ApiParam(required = true, defaultValue = "", name = "resource", value = "资源名称")
            @PathVariable("resource") String resource,
            @ApiParam(required = false, defaultValue = "", name = "request", value = "资源对象")
            @RequestBody Map request) throws SQLException {
//        Result result = sqlUtil.checkTable(datasource, resource);
//        if (!result.isSuccess()) {
//            return result;
//        }
//
//        result = sqlUtil.checkColumns(datasource, resource, request.keySet());
//        if (!result.isSuccess()) {
//            return result;
//        }
        return commonService.add(datasource, resource, request);
    }

    @ApiOperation(value = "修改资源", notes = "修改资源")
    @RequestMapping(value = "/{datasource}/{resource}", method = RequestMethod.PATCH)
    @ResponseBody
    public Result change(
            @ApiParam(required = true, defaultValue = "", name = "datasource", value = "数据源名称")
            @PathVariable("datasource") String datasource,
            @ApiParam(required = true, defaultValue = "", name = "resource", value = "资源名称")
            @PathVariable("resource") String resource,
            @ApiParam(required = false, name = "condition", value = "默认为无条件,条件格式:（id=1 or name='123'）")
            @RequestParam(value = "condition", required = false, defaultValue = "") String condition,
            @ApiParam(required = false, defaultValue = "", name = "request", value = "资源对象")
            @RequestBody Map request) throws SQLException {
//        Result result = sqlUtil.checkTable(datasource, resource);
//        if (!result.isSuccess()) {
//            return result;
//        }
//
//        result = sqlUtil.checkColumns(datasource, resource, request.keySet());
//        if (!result.isSuccess()) {
//            return result;
//        }
//        result = sqlUtil.checkWhere(datasource, resource, condition);
//        if (!result.isSuccess()) {
//            return result;
//        }
        return commonService.change(datasource, resource, request, condition);
    }

    @ApiOperation(value = "删除资源", notes = "删除资源")
    @RequestMapping(value = "{datasource}/{resource}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result delete(
            @ApiParam(required = true, defaultValue = "", name = "datasource", value = "数据源名称")
            @PathVariable("datasource") String datasource,
            @ApiParam(required = true, defaultValue = "", name = "resource", value = "资源名称")
            @PathVariable("resource") String resource,
            @ApiParam(required = false, name = "condition", value = "默认为无条件,条件格式:（id=1 or name='123'）")
            @RequestParam(value = "condition", required = false, defaultValue = "") String condition) throws SQLException {
//        Result result = sqlUtil.checkTable(datasource, resource);
//        if (!result.isSuccess()) {
//            return result;
//        }
//        result = sqlUtil.checkWhere(datasource, resource, condition);
//        if (!result.isSuccess()) {
//            return result;
//        }
        return commonService.delete(datasource, resource, condition);
    }
}
