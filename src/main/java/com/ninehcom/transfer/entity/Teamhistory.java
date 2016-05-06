package com.ninehcom.transfer.entity;

import com.ninehcom.transfer.interfaces.IReset;
import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;

import java.util.Date;
/**
    名称:Teamhistory实体类
    描述:球队历史
 * @author shenjizhe
 * @version 1.0.0

### 球队历史 ###
<A NAME="Teamhistory">Teamhistory</A>

名称|类型|描述
-|-|-
Id                  |Integer   |逻辑主键
TeamId              |Integer   |team表 Id
Logo                |String    |
Name                |String    |
EnglishName         |String    |俱乐部英文名称
HomeCourt           |String    |主场
ColorValue          |String    |色值
Years               |Integer   |
CreateTime          |Date      |
UpdateTime          |Date      |
 */
@Entity
public class Teamhistory implements Serializable,IReset{

    @Id
    private Integer id;
    public  Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    private Integer teamId;
    public  Integer getTeamId() {
        return teamId;
    }
    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    private String logo;
    public  String getLogo() {
        return logo;
    }
    public void setLogo(String logo) {
        this.logo = logo;
    }

    private String name;
    public  String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    private String englishName;
    public  String getEnglishName() {
        return englishName;
    }
    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    private String homeCourt;
    public  String getHomeCourt() {
        return homeCourt;
    }
    public void setHomeCourt(String homeCourt) {
        this.homeCourt = homeCourt;
    }

    private String colorValue;
    public  String getColorValue() {
        return colorValue;
    }
    public void setColorValue(String colorValue) {
        this.colorValue = colorValue;
    }

    private Integer years;
    public  Integer getYears() {
        return years;
    }
    public void setYears(Integer years) {
        this.years = years;
    }

    private Date createTime;
    public  Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    private Date updateTime;
    public  Date getUpdateTime() {
        return updateTime;
    }
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public Integer get() {
        return teamId;
    }

    @Override
    public void set(Integer v) {
        teamId = v;
    }

}
