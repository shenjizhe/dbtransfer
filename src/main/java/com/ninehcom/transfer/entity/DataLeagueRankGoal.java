package com.ninehcom.transfer.entity;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;

import java.util.Date;
/**
    名称:DataLeagueRankGoal实体类
    描述:联赛射手榜
 * @author shenjizhe
 * @version 1.0.0

### 联赛射手榜 ###
<A NAME="DataLeagueRankGoal">DataLeagueRankGoal</A>

名称|类型|描述
-|-|-
id                  |Long      |唯一标识
league_id           |Long      |联赛ID
club_id             |Long      |所属俱乐部ID
club_history_id     |Long      |俱乐部历史ID
player_id           |Long      |球员ID
goals               |Integer   |进球数
pre_ranking         |Integer   |上一轮排名
ranking             |Integer   |名次，默认为0
year                |Integer   |开始年份
end_year            |Integer   |结束年份
created_at          |Date      |
updated_at          |Date      |
 */
@Entity
public class DataLeagueRankGoal implements Serializable{

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

    private Long playerId;
    public  Long getPlayerId() {
        return playerId;
    }
    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    private Integer goals;
    public  Integer getGoals() {
        return goals;
    }
    public void setGoals(Integer goals) {
        this.goals = goals;
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
