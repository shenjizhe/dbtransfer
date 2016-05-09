package com.ninehcom.transfer.entity;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;

import java.util.Date;
/**
    名称:Playerhistory实体类
    描述:球员历史
 * @author shenjizhe
 * @version 1.0.0

### 球员历史 ###
<A NAME="Playerhistory">Playerhistory</A>

名称|类型|描述
-|-|-
Id                  |Integer   |球员历史ID
TeamId              |Integer   |队伍ID
TeamHistoryId       |Integer   |队伍历史ID
TeamLogo            |String    |球队logo
TeamName            |String    |球队名称
PlayerId            |Integer   |球员标识
HalfLogo            |String    |球员半身像
Logo                |String    |头像
InfoLogo            |String    |mini半身像
Name                |String    |姓名
EnglishName         |String    |英文名
Age                 |Integer   |年龄
Height              |Integer   |身高
Weight              |Integer   |体重
JerseyNum           |Integer   |球衣号码
PositionId          |Integer   |位置ID
PositionName        |String    |位置名称
EnterTimes          |Integer   |出场次数
EnterTime           |Integer   |出场时间
ShootTimes          |Integer   |射门次数
AssistTimes         |Integer   |助攻次数
YellowTimes         |Integer   |黄牌次数
RedTimes            |Integer   |红牌次数
Years               |Integer   |年份
CreateTime          |Date      |创建时间
UpdateTime          |Date      |更新时间
 */
@Entity
public class Playerhistory implements Serializable{

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

    private Integer playerId;
    public  Integer getPlayerId() {
        return playerId;
    }
    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    private String halfLogo;
    public  String getHalfLogo() {
        return halfLogo;
    }
    public void setHalfLogo(String halfLogo) {
        this.halfLogo = halfLogo;
    }

    private String logo;
    public  String getLogo() {
        return logo;
    }
    public void setLogo(String logo) {
        this.logo = logo;
    }

    private String infoLogo;
    public  String getInfoLogo() {
        return infoLogo;
    }
    public void setInfoLogo(String infoLogo) {
        this.infoLogo = infoLogo;
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

    private Integer age;
    public  Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }

    private Integer height;
    public  Integer getHeight() {
        return height;
    }
    public void setHeight(Integer height) {
        this.height = height;
    }

    private Integer weight;
    public  Integer getWeight() {
        return weight;
    }
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    private Integer jerseyNum;
    public  Integer getJerseyNum() {
        return jerseyNum;
    }
    public void setJerseyNum(Integer jerseyNum) {
        this.jerseyNum = jerseyNum;
    }

    private Integer positionId;
    public  Integer getPositionId() {
        return positionId;
    }
    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    private String positionName;
    public  String getPositionName() {
        return positionName;
    }
    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    private Integer enterTimes;
    public  Integer getEnterTimes() {
        return enterTimes;
    }
    public void setEnterTimes(Integer enterTimes) {
        this.enterTimes = enterTimes;
    }

    private Integer enterTime;
    public  Integer getEnterTime() {
        return enterTime;
    }
    public void setEnterTime(Integer enterTime) {
        this.enterTime = enterTime;
    }

    private Integer shootTimes;
    public  Integer getShootTimes() {
        return shootTimes;
    }
    public void setShootTimes(Integer shootTimes) {
        this.shootTimes = shootTimes;
    }

    private Integer assistTimes;
    public  Integer getAssistTimes() {
        return assistTimes;
    }
    public void setAssistTimes(Integer assistTimes) {
        this.assistTimes = assistTimes;
    }

    private Integer yellowTimes;
    public  Integer getYellowTimes() {
        return yellowTimes;
    }
    public void setYellowTimes(Integer yellowTimes) {
        this.yellowTimes = yellowTimes;
    }

    private Integer redTimes;
    public  Integer getRedTimes() {
        return redTimes;
    }
    public void setRedTimes(Integer redTimes) {
        this.redTimes = redTimes;
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

}
