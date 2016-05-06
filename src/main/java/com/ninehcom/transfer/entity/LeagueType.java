package com.ninehcom.transfer.entity;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;

import java.util.Date;
/**
    名称:LeagueType实体类
    描述:联赛类型
 * @author shenjizhe
 * @version 1.0.0

### 联赛类型 ###
<A NAME="LeagueType">LeagueType</A>

名称|类型|描述
-|-|-
id                  |Long      |唯一标识
pid                 |Long      |父联赛ID
name                |String    |联赛中文简称(中超，亚冠，预备队...),常用,比如:中超联赛
full_name           |String    |联赛的全文名称,作为某些情况下的备份,比如:中国足球超级联赛
en_name             |String    |英文简称,常用,比如:CSL
en_full_name        |String    |英文全称,备份,比如:Chinese Super League
type                |String    |联赛类型 1:联赛(积分制) 2:杯赛(淘汰制)
region              |String    |举办地区 (中国,亚洲...)
region_type         |String    |联赛范围 1:国家级,2:洲级,3:世界级
start_at            |Date      |开始举办年份
created_at          |Date      |
updated_at          |Date      |
 */
@Entity
public class LeagueType implements Serializable{

    @Id
    private Long id;
    public  Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    private Long pid;
    public  Long getPid() {
        return pid;
    }
    public void setPid(Long pid) {
        this.pid = pid;
    }

    private String name;
    public  String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    private String fullName;
    public  String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    private String enName;
    public  String getEnName() {
        return enName;
    }
    public void setEnName(String enName) {
        this.enName = enName;
    }

    private String enFullName;
    public  String getEnFullName() {
        return enFullName;
    }
    public void setEnFullName(String enFullName) {
        this.enFullName = enFullName;
    }

    private String type;
    public  String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    private String region;
    public  String getRegion() {
        return region;
    }
    public void setRegion(String region) {
        this.region = region;
    }

    private String regionType;
    public  String getRegionType() {
        return regionType;
    }
    public void setRegionType(String regionType) {
        this.regionType = regionType;
    }

    private Date startAt;
    public  Date getStartAt() {
        return startAt;
    }
    public void setStartAt(Date startAt) {
        this.startAt = startAt;
    }

    private Date createdAt;
    public  Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    private Date updatedAt;
    public  Date getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

}
