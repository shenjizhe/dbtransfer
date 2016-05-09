package com.ninehcom.transfer.entity;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;

import java.util.Date;
/**
    名称:Coachresume实体类
    描述:教练履历
 * @author shenjizhe
 * @version 1.0.0

### 教练履历 ###
<A NAME="Coachresume">Coachresume</A>

名称|类型|描述
-|-|-
Id                  |Integer   |逻辑主键
SeasonType          |Integer   |跨年/不跨年
StartYear           |Integer   |开始年度
EndYear             |Integer   |结束年度
CoachId             |Integer   |教练ID
CoachName           |String    |教练姓名
LeagueName          |String    |联赛名称
TeamName            |String    |球队名称
Honors              |String    |荣誉
CreateTime          |Date      |
UpdateTime          |Date      |
 */
@Entity
public class Coachresume implements Serializable{

    @Id
    private Integer id;
    public  Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    private Integer seasonType;
    public  Integer getSeasonType() {
        return seasonType;
    }
    public void setSeasonType(Integer seasonType) {
        this.seasonType = seasonType;
    }

    private Integer startYear;
    public  Integer getStartYear() {
        return startYear;
    }
    public void setStartYear(Integer startYear) {
        this.startYear = startYear;
    }

    private Integer endYear;
    public  Integer getEndYear() {
        return endYear;
    }
    public void setEndYear(Integer endYear) {
        this.endYear = endYear;
    }

    private Integer coachId;
    public  Integer getCoachId() {
        return coachId;
    }
    public void setCoachId(Integer coachId) {
        this.coachId = coachId;
    }

    private String coachName;
    public  String getCoachName() {
        return coachName;
    }
    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }

    private String leagueName;
    public  String getLeagueName() {
        return leagueName;
    }
    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    private String teamName;
    public  String getTeamName() {
        return teamName;
    }
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    private String honors;
    public  String getHonors() {
        return honors;
    }
    public void setHonors(String honors) {
        this.honors = honors;
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

}
