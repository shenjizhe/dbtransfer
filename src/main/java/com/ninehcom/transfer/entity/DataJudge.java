package com.ninehcom.transfer.entity;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;

import java.util.Date;
/**
    名称:DataJudge实体类
    描述:联赛裁判
 * @author shenjizhe
 * @version 1.0.0

### 联赛裁判 ###
<A NAME="DataJudge">DataJudge</A>

名称|类型|描述
-|-|-
id                  |Long      |
name                |String    |裁判姓名
name_initials       |String    |姓名首字母缩写(用于可能需要的姓名自然排序)
nationality         |String    |国籍
native_place        |String    |籍贯（出生地）
region              |String    |地区(直辖市/省级的粒度)(暂时不删除，但是建议用行政区划)
region_code         |Integer   |行政区划6位编码(备用）
birth               |Date      |生日(用于自动计算年龄)
level               |Integer   |级别(1:国家级 2:国际级)
created_at          |Date      |
updated_at          |Date      |
 */
@Entity
public class DataJudge implements Serializable{

    @Id
    private Long id;
    public  Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    private String name;
    public  String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    private String nameInitials;
    public  String getNameInitials() {
        return nameInitials;
    }
    public void setNameInitials(String nameInitials) {
        this.nameInitials = nameInitials;
    }

    private String nationality;
    public  String getNationality() {
        return nationality;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    private String nativePlace;
    public  String getNativePlace() {
        return nativePlace;
    }
    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    private String region;
    public  String getRegion() {
        return region;
    }
    public void setRegion(String region) {
        this.region = region;
    }

    private Integer regionCode;
    public  Integer getRegionCode() {
        return regionCode;
    }
    public void setRegionCode(Integer regionCode) {
        this.regionCode = regionCode;
    }

    private Date birth;
    public  Date getBirth() {
        return birth;
    }
    public void setBirth(Date birth) {
        this.birth = birth;
    }

    private Integer level;
    public  Integer getLevel() {
        return level;
    }
    public void setLevel(Integer level) {
        this.level = level;
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
