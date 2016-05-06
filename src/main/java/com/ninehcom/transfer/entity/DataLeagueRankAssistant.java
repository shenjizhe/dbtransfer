package com.ninehcom.transfer.entity;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;

import java.util.Date;
/**
    名称:DataLeagueRankAssistant实体类
    描述:联赛助攻榜
 * @author shenjizhe
 * @version 1.0.0

### 联赛助攻榜 ###
<A NAME="DataLeagueRankAssistant">DataLeagueRankAssistant</A>

名称|类型|描述
-|-|-
id                  |Long      |
league_id           |Long      |联赛ID
player_id           |Long      |球员ID
club_id             |Long      |所属俱乐部ID
club_history_id     |Long      |俱乐部历史ID
assistants          |Integer   |助攻数
home_assistants     |Integer   |主场助攻数
guest_assistants    |Integer   |客场助攻数
pre_ranking         |Integer   |上轮排名
ranking             |Integer   |排名
year                |Integer   |联赛年份 (支持不带-的当年和带-的跨年两种格式 注:这里考虑到url的/冲突,避免用/做分隔符)
end_year            |Integer   |结束年份
created_at          |Date      |
updated_at          |Date      |名次，默认为0
 */
@Entity
public class DataLeagueRankAssistant implements Serializable{

    @Id
    private Long id;
    public  Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    private Long leagueId;
    public  Long getLeagueId() {
        return leagueId;
    }
    public void setLeagueId(Long leagueId) {
        this.leagueId = leagueId;
    }

    private Long playerId;
    public  Long getPlayerId() {
        return playerId;
    }
    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    private Long clubId;
    public  Long getClubId() {
        return clubId;
    }
    public void setClubId(Long clubId) {
        this.clubId = clubId;
    }

    private Long clubHistoryId;
    public  Long getClubHistoryId() {
        return clubHistoryId;
    }
    public void setClubHistoryId(Long clubHistoryId) {
        this.clubHistoryId = clubHistoryId;
    }

    private Integer assistants;
    public  Integer getAssistants() {
        return assistants;
    }
    public void setAssistants(Integer assistants) {
        this.assistants = assistants;
    }

    private Integer homeAssistants;
    public  Integer getHomeAssistants() {
        return homeAssistants;
    }
    public void setHomeAssistants(Integer homeAssistants) {
        this.homeAssistants = homeAssistants;
    }

    private Integer guestAssistants;
    public  Integer getGuestAssistants() {
        return guestAssistants;
    }
    public void setGuestAssistants(Integer guestAssistants) {
        this.guestAssistants = guestAssistants;
    }

    private Integer preRanking;
    public  Integer getPreRanking() {
        return preRanking;
    }
    public void setPreRanking(Integer preRanking) {
        this.preRanking = preRanking;
    }

    private Integer ranking;
    public  Integer getRanking() {
        return ranking;
    }
    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }

    private Integer year;
    public  Integer getYear() {
        return year;
    }
    public void setYear(Integer year) {
        this.year = year;
    }

    private Integer endYear;
    public  Integer getEndYear() {
        return endYear;
    }
    public void setEndYear(Integer endYear) {
        this.endYear = endYear;
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
