package com.ninehcom.transfer.entity;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;

import java.util.Date;
/**
    名称:Leaguecalendar实体类
    描述:赛事
 * @author shenjizhe
 * @version 1.0.0

### 赛事 ###
<A NAME="Leaguecalendar">Leaguecalendar</A>

名称|类型|描述
-|-|-
Id                  |Integer   |逻辑主键
LeagueTypeId        |Integer   |leaguecalendartype表 Id
LeagueTypeName      |String    |
LeagueTypeId2       |Integer   |
LeagueTypeName2     |String    |
RoundsId            |Integer   |轮次
RoundsName          |String    |
HomeTeamId          |Integer   |前端用主队Id
HomeTeamHistoryId   |Integer   |
HomeTeamLogo        |String    |
HomeTeamName        |String    |
GuestTeamId         |Integer   |前端用客队Id
GuestTeamHistoryId  |Integer   |
GuestTeamLogo       |String    |
GuestTeamName       |String    |
LeagueTime          |Date      |
LeagueCourt         |String    |比赛场地
MasterScore         |Integer   |
GuestScore          |Integer   |
LeagueStateId       |Integer   |
LeagueStateName     |String    |
LineupLogo          |String    |首发阵容图
ExistLineup         |Boolean   |是否存在阵容数据
ExistLeagueData     |Boolean   |是否存在赛事数据
ExistLeagueEvent    |Boolean   |是否存在赛事事件
ExistLeagueVideo    |Boolean   |是否存在赛事视频
Years               |Integer   |
CreateTime          |Date      |
UpdateTime          |Date      |
 */
@Entity
public class Leaguecalendar implements Serializable{

    @Id
    private Integer id;
    public  Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    private Integer leagueTypeId;
    public  Integer getLeagueTypeId() {
        return leagueTypeId;
    }
    public void setLeagueTypeId(Integer leagueTypeId) {
        this.leagueTypeId = leagueTypeId;
    }

    private String leagueTypeName;
    public  String getLeagueTypeName() {
        return leagueTypeName;
    }
    public void setLeagueTypeName(String leagueTypeName) {
        this.leagueTypeName = leagueTypeName;
    }

    private Integer leagueTypeId2;
    public  Integer getLeagueTypeId2() {
        return leagueTypeId2;
    }
    public void setLeagueTypeId2(Integer leagueTypeId2) {
        this.leagueTypeId2 = leagueTypeId2;
    }

    private String leagueTypeName2;
    public  String getLeagueTypeName2() {
        return leagueTypeName2;
    }
    public void setLeagueTypeName2(String leagueTypeName2) {
        this.leagueTypeName2 = leagueTypeName2;
    }

    private Integer roundsId;
    public  Integer getRoundsId() {
        return roundsId;
    }
    public void setRoundsId(Integer roundsId) {
        this.roundsId = roundsId;
    }

    private String roundsName;
    public  String getRoundsName() {
        return roundsName;
    }
    public void setRoundsName(String roundsName) {
        this.roundsName = roundsName;
    }

    private Integer homeTeamId;
    public  Integer getHomeTeamId() {
        return homeTeamId;
    }
    public void setHomeTeamId(Integer homeTeamId) {
        this.homeTeamId = homeTeamId;
    }

    private Integer homeTeamHistoryId;
    public  Integer getHomeTeamHistoryId() {
        return homeTeamHistoryId;
    }
    public void setHomeTeamHistoryId(Integer homeTeamHistoryId) {
        this.homeTeamHistoryId = homeTeamHistoryId;
    }

    private String homeTeamLogo;
    public  String getHomeTeamLogo() {
        return homeTeamLogo;
    }
    public void setHomeTeamLogo(String homeTeamLogo) {
        this.homeTeamLogo = homeTeamLogo;
    }

    private String homeTeamName;
    public  String getHomeTeamName() {
        return homeTeamName;
    }
    public void setHomeTeamName(String homeTeamName) {
        this.homeTeamName = homeTeamName;
    }

    private Integer guestTeamId;
    public  Integer getGuestTeamId() {
        return guestTeamId;
    }
    public void setGuestTeamId(Integer guestTeamId) {
        this.guestTeamId = guestTeamId;
    }

    private Integer guestTeamHistoryId;
    public  Integer getGuestTeamHistoryId() {
        return guestTeamHistoryId;
    }
    public void setGuestTeamHistoryId(Integer guestTeamHistoryId) {
        this.guestTeamHistoryId = guestTeamHistoryId;
    }

    private String guestTeamLogo;
    public  String getGuestTeamLogo() {
        return guestTeamLogo;
    }
    public void setGuestTeamLogo(String guestTeamLogo) {
        this.guestTeamLogo = guestTeamLogo;
    }

    private String guestTeamName;
    public  String getGuestTeamName() {
        return guestTeamName;
    }
    public void setGuestTeamName(String guestTeamName) {
        this.guestTeamName = guestTeamName;
    }

    private Date leagueTime;
    public  Date getLeagueTime() {
        return leagueTime;
    }
    public void setLeagueTime(Date leagueTime) {
        this.leagueTime = leagueTime;
    }

    private String leagueCourt;
    public  String getLeagueCourt() {
        return leagueCourt;
    }
    public void setLeagueCourt(String leagueCourt) {
        this.leagueCourt = leagueCourt;
    }

    private Integer masterScore;
    public  Integer getMasterScore() {
        return masterScore;
    }
    public void setMasterScore(Integer masterScore) {
        this.masterScore = masterScore;
    }

    private Integer guestScore;
    public  Integer getGuestScore() {
        return guestScore;
    }
    public void setGuestScore(Integer guestScore) {
        this.guestScore = guestScore;
    }

    private Integer leagueStateId;
    public  Integer getLeagueStateId() {
        return leagueStateId;
    }
    public void setLeagueStateId(Integer leagueStateId) {
        this.leagueStateId = leagueStateId;
    }

    private String leagueStateName;
    public  String getLeagueStateName() {
        return leagueStateName;
    }
    public void setLeagueStateName(String leagueStateName) {
        this.leagueStateName = leagueStateName;
    }

    private String lineupLogo;
    public  String getLineupLogo() {
        return lineupLogo;
    }
    public void setLineupLogo(String lineupLogo) {
        this.lineupLogo = lineupLogo;
    }

    private Boolean existLineup;
    public  Boolean getExistLineup() {
        return existLineup;
    }
    public void setExistLineup(Boolean existLineup) {
        this.existLineup = existLineup;
    }

    private Boolean existLeagueData;
    public  Boolean getExistLeagueData() {
        return existLeagueData;
    }
    public void setExistLeagueData(Boolean existLeagueData) {
        this.existLeagueData = existLeagueData;
    }

    private Boolean existLeagueEvent;
    public  Boolean getExistLeagueEvent() {
        return existLeagueEvent;
    }
    public void setExistLeagueEvent(Boolean existLeagueEvent) {
        this.existLeagueEvent = existLeagueEvent;
    }

    private Boolean existLeagueVideo;
    public  Boolean getExistLeagueVideo() {
        return existLeagueVideo;
    }
    public void setExistLeagueVideo(Boolean existLeagueVideo) {
        this.existLeagueVideo = existLeagueVideo;
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
