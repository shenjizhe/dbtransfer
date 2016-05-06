package com.ninehcom.transfer.entity;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;

import java.util.Date;
/**
    名称:DataLeagueRankClubGuest实体类
    描述:联赛客场积分榜
 * @author shenjizhe
 * @version 1.0.0

### 联赛客场积分榜 ###
<A NAME="DataLeagueRankClubGuest">DataLeagueRankClubGuest</A>

名称|类型|描述
-|-|-
id                  |Long      |
league_id           |Long      |联赛ID
league_sub_id       |Long      |联赛子ID
club_id             |Long      |俱乐部ID
club_history_id     |Long      |俱乐部历史ID
round               |String    |场次
wins                |Integer   |胜场
ties                |Integer   |平场
loses               |Integer   |负场
goals               |Integer   |进球
goals_a             |Integer   |失球
goals_d             |Integer   |净胜球
points              |Integer   |积分
year                |Integer   |联赛年份 
end_year            |Integer   |联赛结束年份 
display_order       |Integer   |用于积分榜的手动排序，数值越大越靠前。默认为1
ranking_status      |Integer   |ranking_status 排名状态(1:下降,2:保持,3:上升;默认为:2)
pre_ranking         |Integer   |上一轮排序
ranking             |Integer   |名次，默认为0
created_at          |Date      |
updated_at          |Date      |
 */
@Entity
public class DataLeagueRankClubGuest implements Serializable{

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

    private Long leagueSubId;
    public  Long getLeagueSubId() {
        return leagueSubId;
    }
    public void setLeagueSubId(Long leagueSubId) {
        this.leagueSubId = leagueSubId;
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

    private String round;
    public  String getRound() {
        return round;
    }
    public void setRound(String round) {
        this.round = round;
    }

    private Integer wins;
    public  Integer getWins() {
        return wins;
    }
    public void setWins(Integer wins) {
        this.wins = wins;
    }

    private Integer ties;
    public  Integer getTies() {
        return ties;
    }
    public void setTies(Integer ties) {
        this.ties = ties;
    }

    private Integer loses;
    public  Integer getLoses() {
        return loses;
    }
    public void setLoses(Integer loses) {
        this.loses = loses;
    }

    private Integer goals;
    public  Integer getGoals() {
        return goals;
    }
    public void setGoals(Integer goals) {
        this.goals = goals;
    }

    private Integer goalsA;
    public  Integer getGoalsA() {
        return goalsA;
    }
    public void setGoalsA(Integer goalsA) {
        this.goalsA = goalsA;
    }

    private Integer goalsD;
    public  Integer getGoalsD() {
        return goalsD;
    }
    public void setGoalsD(Integer goalsD) {
        this.goalsD = goalsD;
    }

    private Integer points;
    public  Integer getPoints() {
        return points;
    }
    public void setPoints(Integer points) {
        this.points = points;
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

    private Integer displayOrder;
    public  Integer getDisplayOrder() {
        return displayOrder;
    }
    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    private Integer rankingStatus;
    public  Integer getRankingStatus() {
        return rankingStatus;
    }
    public void setRankingStatus(Integer rankingStatus) {
        this.rankingStatus = rankingStatus;
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
