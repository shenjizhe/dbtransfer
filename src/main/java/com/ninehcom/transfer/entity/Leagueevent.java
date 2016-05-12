package com.ninehcom.transfer.entity;

import com.ninehcom.transfer.interfaces.IReset;
import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;

import java.util.Date;
/**
    名称:Leagueevent实体类
    描述:赛事事件
 * @author shenjizhe
 * @version 1.0.0

### 赛事事件 ###
<A NAME="Leagueevent">Leagueevent</A>

名称|类型|描述
-|-|-
Id                  |Integer   |逻辑主键
LeagueCalendarId    |Integer   |赛事ID
LeagueTeamTypeId    |Integer   |赛事球队类型（主客）
TeamId              |Integer   |球队ID
LeagueEventTypeId   |Integer   |时间类型ID
LeagueEventTypeName |String    |事件类型名称
LeagueEventTime     |Integer   |事件发生时间（分钟）
PlayerName          |String    |球员1姓名
PlayerName2         |String    |球员2姓名
Years               |Integer   |年份
CreateTime          |Date      |
UpdateTime          |Date      |
Sort                |Integer   |赛事事件排序字段（非必填字段，只有事件相同的情况下才以本字段排序，1.事件时间2.顺序3.事件ID）
 */
@Entity
public class Leagueevent implements Serializable,IReset{

    @Id
    private Integer id;
    public  Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    private Integer leagueCalendarId;
    public  Integer getLeagueCalendarId() {
        return leagueCalendarId;
    }
    public void setLeagueCalendarId(Integer leagueCalendarId) {
        this.leagueCalendarId = leagueCalendarId;
    }

    private Integer leagueTeamTypeId;
    public  Integer getLeagueTeamTypeId() {
        return leagueTeamTypeId;
    }
    public void setLeagueTeamTypeId(Integer leagueTeamTypeId) {
        this.leagueTeamTypeId = leagueTeamTypeId;
    }

    private Integer teamId;
    public  Integer getTeamId() {
        return teamId;
    }
    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    private Integer leagueEventTypeId;
    public  Integer getLeagueEventTypeId() {
        return leagueEventTypeId;
    }
    public void setLeagueEventTypeId(Integer leagueEventTypeId) {
        this.leagueEventTypeId = leagueEventTypeId;
    }

    private String leagueEventTypeName;
    public  String getLeagueEventTypeName() {
        return leagueEventTypeName;
    }
    public void setLeagueEventTypeName(String leagueEventTypeName) {
        this.leagueEventTypeName = leagueEventTypeName;
    }

    private Integer leagueEventTime;
    public  Integer getLeagueEventTime() {
        return leagueEventTime;
    }
    public void setLeagueEventTime(Integer leagueEventTime) {
        this.leagueEventTime = leagueEventTime;
    }

    private String playerName;
    public  String getPlayerName() {
        return playerName;
    }
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    private String playerName2;
    public  String getPlayerName2() {
        return playerName2;
    }
    public void setPlayerName2(String playerName2) {
        this.playerName2 = playerName2;
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

    private Integer sort;
    public  Integer getSort() {
        return sort;
    }
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    public Integer get() {
        return leagueCalendarId;
    }

    @Override
    public void set(Integer v) {
        leagueCalendarId = v;
    }
}
