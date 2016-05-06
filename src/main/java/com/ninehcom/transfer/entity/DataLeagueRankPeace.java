package com.ninehcom.transfer.entity;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;

import java.util.Date;
/**
    名称:DataLeagueRankPeace实体类
    描述:
 * @author shenjizhe
 * @version 1.0.0

###  ###
<A NAME="DataLeagueRankPeace">DataLeagueRankPeace</A>

名称|类型|描述
-|-|-
id                  |Long      |
league_id           |Long      |联赛ID
club_id             |Long      |俱乐部ID
club_history_id     |Long      |俱乐部历史ID
points              |Integer   |积分
dock_of_cards       |Integer   |红黄牌扣分
dock_of_fouls       |Integer   |纪律处罚扣分
dock_of_sum         |Integer   |扣分合计
red_cards           |Integer   |红牌数
year                |Integer   |联赛年份
end_year            |Integer   |结束年份
fouls               |Integer   |停赛次数
yellow_cards        |Integer   |黄牌数
created_at          |Date      |
updated_at          |Date      |
 */
@Entity
public class DataLeagueRankPeace implements Serializable{

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

    private Integer points;
    public  Integer getPoints() {
        return points;
    }
    public void setPoints(Integer points) {
        this.points = points;
    }

    private Integer dockOfCards;
    public  Integer getDockOfCards() {
        return dockOfCards;
    }
    public void setDockOfCards(Integer dockOfCards) {
        this.dockOfCards = dockOfCards;
    }

    private Integer dockOfFouls;
    public  Integer getDockOfFouls() {
        return dockOfFouls;
    }
    public void setDockOfFouls(Integer dockOfFouls) {
        this.dockOfFouls = dockOfFouls;
    }

    private Integer dockOfSum;
    public  Integer getDockOfSum() {
        return dockOfSum;
    }
    public void setDockOfSum(Integer dockOfSum) {
        this.dockOfSum = dockOfSum;
    }

    private Integer redCards;
    public  Integer getRedCards() {
        return redCards;
    }
    public void setRedCards(Integer redCards) {
        this.redCards = redCards;
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

    private Integer fouls;
    public  Integer getFouls() {
        return fouls;
    }
    public void setFouls(Integer fouls) {
        this.fouls = fouls;
    }

    private Integer yellowCards;
    public  Integer getYellowCards() {
        return yellowCards;
    }
    public void setYellowCards(Integer yellowCards) {
        this.yellowCards = yellowCards;
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
