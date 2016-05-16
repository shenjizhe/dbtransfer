package com.ninehcom.transfer.entity;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;

import java.util.Date;
/**
    名称:Errlog实体类
    描述:错误日志
 * @author shenjizhe
 * @version 1.0.0

### 错误日志 ###
<A NAME="Errlog">Errlog</A>

名称|类型|描述
-|-|-
title               |String    |错误标题
key                 |String    |字典主键
table               |String    |出错表格
time                |Date      |出错时间
data                |String    |出错记录
 */
@Entity
public class Errlog implements Serializable{

    @Id
    private String title;
    public  String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    private String key;
    public  String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }

    private String table;
    public  String getTable() {
        return table;
    }
    public void setTable(String table) {
        this.table = table;
    }

    private Date time;
    public  Date getTime() {
        return time;
    }
    public void setTime(Date time) {
        this.time = time;
    }

    private String data;
    public  String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

}