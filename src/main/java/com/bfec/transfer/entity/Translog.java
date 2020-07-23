package com.bfec.transfer.entity;

import java.io.Serializable;

import java.util.Date;
/**
    名称:Translog实体类
    描述:转换日志
 * @author shenjizhe
 * @version 1.0.0

### 转换日志 ###
<A NAME="Translog">Translog</A>

名称|类型|描述
-|-|-
id                  |Integer   |唯一主键
time                |Date      |操作时间
operator            |String    |操作
source              |String    |源表
destination         |String    |目标表
source_count        |Integer   |源表数量
destination_count   |Integer   |目标数量
same_count          |Integer   |相同数量
mapping_count       |Integer   |映射数量
source_diff         |Integer   |源表不同数量
destination_diff    |Integer   |目的表不同数量
check               |Boolean   |数量检查
Err                 |String    |错误
 */
public class Translog implements Serializable{

    private Integer id;
    public  Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    private Date time;
    public  Date getTime() {
        return time;
    }
    public void setTime(Date time) {
        this.time = time;
    }

    private String operator;
    public  String getOperator() {
        return operator;
    }
    public void setOperator(String operator) {
        this.operator = operator;
    }

    private String source;
    public  String getSource() {
        return source;
    }
    public void setSource(String source) {
        this.source = source;
    }

    private String destination;
    public  String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }

    private Integer sourceCount;
    public  Integer getSourceCount() {
        return sourceCount;
    }
    public void setSourceCount(Integer sourceCount) {
        this.sourceCount = sourceCount;
    }

    private Integer destinationCount;
    public  Integer getDestinationCount() {
        return destinationCount;
    }
    public void setDestinationCount(Integer destinationCount) {
        this.destinationCount = destinationCount;
    }

    private Integer sameCount;
    public  Integer getSameCount() {
        return sameCount;
    }
    public void setSameCount(Integer sameCount) {
        this.sameCount = sameCount;
    }

    private Integer mappingCount;
    public  Integer getMappingCount() {
        return mappingCount;
    }
    public void setMappingCount(Integer mappingCount) {
        this.mappingCount = mappingCount;
    }

    private Integer sourceDiff;
    public  Integer getSourceDiff() {
        return sourceDiff;
    }
    public void setSourceDiff(Integer sourceDiff) {
        this.sourceDiff = sourceDiff;
    }

    private Integer destinationDiff;
    public  Integer getDestinationDiff() {
        return destinationDiff;
    }
    public void setDestinationDiff(Integer destinationDiff) {
        this.destinationDiff = destinationDiff;
    }

    public  Boolean getCheck() {
        int count = this.getDestinationCount() + this.getSourceCount()-this.getSameCount();
        int diffCount = this.getSourceDiff()+this.getDestinationDiff()+this.getSameCount();
        return count==diffCount;
    }

    private String err;
    public  String getErr() {
        return err;
    }
    public void setErr(String err) {
        this.err = err;
    }

    public void setLog(Translog log){
        
    }
    
    private Long oldMaxId;
    public  Long getOldMaxId() {
        return oldMaxId;
    }
    public void setOldMaxId(Long oldMaxId) {
        this.oldMaxId = oldMaxId;
    }
}