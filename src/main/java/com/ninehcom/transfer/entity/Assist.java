package com.ninehcom.transfer.entity;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;

import java.util.Date;
/**
    名称:Assist实体类
    描述:助攻
 * @author shenjizhe
 * @version 1.0.0

### 助攻 ###
<A NAME="Assist">Assist</A>

名称|类型|描述
-|-|-
Id                  |Integer   |逻辑主键
LeagueTypeId        |Integer   |
LeagueTypeName      |String    |
TeamId              |Integer   |
TeamHistoryId       |Integer   |
TeamLogo            |String    |
TeamName            |String    |
PlayerId            |Integer   |
PlayerHistoryId     |Integer   |
PlayerHalfLogo      |String    |
PlayerLogo          |String    |
PlayerInfoLogo      |String    |
PlayerName          |String    |
JerseyNum           |Integer   |
Times               |Integer   |
PreRank             |Integer   |
Rank                |Integer   |
Years               |Integer   |
CreateTime          |Date      |
UpdateTime          |Date      |
 */
@Entity
public class Assist implements Serializable{

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

    private Integer playerHistoryId;
    public  Integer getPlayerHistoryId() {
        return playerHistoryId;
    }
    public void setPlayerHistoryId(Integer playerHistoryId) {
        this.playerHistoryId = playerHistoryId;
    }

    private String playerHalfLogo;
    public  String getPlayerHalfLogo() {
        return playerHalfLogo;
    }
    public void setPlayerHalfLogo(String playerHalfLogo) {
        this.playerHalfLogo = playerHalfLogo;
    }

    private String playerLogo;
    public  String getPlayerLogo() {
        return playerLogo;
    }
    public void setPlayerLogo(String playerLogo) {
        this.playerLogo = playerLogo;
    }

    private String playerInfoLogo;
    public  String getPlayerInfoLogo() {
        return playerInfoLogo;
    }
    public void setPlayerInfoLogo(String playerInfoLogo) {
        this.playerInfoLogo = playerInfoLogo;
    }

    private String playerName;
    public  String getPlayerName() {
        return playerName;
    }
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    private Integer jerseyNum;
    public  Integer getJerseyNum() {
        return jerseyNum;
    }
    public void setJerseyNum(Integer jerseyNum) {
        this.jerseyNum = jerseyNum;
    }

    private Integer times;
    public  Integer getTimes() {
        return times;
    }
    public void setTimes(Integer times) {
        this.times = times;
    }

    private Integer preRank;
    public  Integer getPreRank() {
        return preRank;
    }
    public void setPreRank(Integer preRank) {
        this.preRank = preRank;
    }

    private Integer rank;
    public  Integer getRank() {
        return rank;
    }
    public void setRank(Integer rank) {
        this.rank = rank;
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
