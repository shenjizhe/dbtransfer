package com.ninehcom.transfer.entity;

import com.ninehcom.transfer.interfaces.IReset;
import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;

import java.util.Date;
/**
    名称:CoachHistoryData实体类
    描述:VIEW
 * @author shenjizhe
 * @version 1.0.0

### VIEW ###
<A NAME="CoachHistoryData">CoachHistoryData</A>

名称|类型|描述
-|-|-
Id                  |Integer   |逻辑主键
TeamId              |Integer   |
TeamHistoryId       |Integer   |
TeamLogo            |String    |
TeamName            |String    |
CoachId             |Integer   |
HalfLogo            |String    |
InfoLogo            |String    |mini半身像
Logo                |String    |
CoachName           |String    |
EnglishName         |String    |英文名
Age                 |Integer   |年龄
CoachTypeId         |Integer   |
CoachTypeName       |String    |
Years               |Integer   |
CreateTime          |Date      |
UpdateTime          |Date      |
 */
@Entity
public class CoachHistoryData implements Serializable,IReset{

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

    private Integer teamHistoryId;
    public  Integer getTeamHistoryId() {
        return teamHistoryId;
    }
    public void setTeamHistoryId(Integer teamHistoryId) {
        this.teamHistoryId = teamHistoryId;
    }

    private String teamLogo;
    public  String getTeamLogo() {
        return teamLogo;
    }
    public void setTeamLogo(String teamLogo) {
        this.teamLogo = teamLogo;
    }

    private String teamName;
    public  String getTeamName() {
        return teamName;
    }
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    private Integer coachId;
    public  Integer getCoachId() {
        return coachId;
    }
    public void setCoachId(Integer coachId) {
        this.coachId = coachId;
    }

    private String halfLogo;
    public  String getHalfLogo() {
        return halfLogo;
    }
    public void setHalfLogo(String halfLogo) {
        this.halfLogo = halfLogo;
    }

    private String infoLogo;
    public  String getInfoLogo() {
        return infoLogo;
    }
    public void setInfoLogo(String infoLogo) {
        this.infoLogo = infoLogo;
    }

    private String logo;
    public  String getLogo() {
        return logo;
    }
    public void setLogo(String logo) {
        this.logo = logo;
    }

    private String coachName;
    public  String getCoachName() {
        return coachName;
    }
    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }

    private String englishName;
    public  String getEnglishName() {
        return englishName;
    }
    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    private Integer age;
    public  Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }

    private Integer coachTypeId;
    public  Integer getCoachTypeId() {
        return coachTypeId;
    }
    public void setCoachTypeId(Integer coachTypeId) {
        this.coachTypeId = coachTypeId;
    }

    private String coachTypeName;
    public  String getCoachTypeName() {
        return coachTypeName;
    }
    public void setCoachTypeName(String coachTypeName) {
        this.coachTypeName = coachTypeName;
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
        return coachId;
    }

    @Override
    public void set(Integer v) {
        coachId = v;
    }

}
