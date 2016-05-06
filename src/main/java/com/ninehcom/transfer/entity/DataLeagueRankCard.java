package com.ninehcom.transfer.entity;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;

import java.util.Date;
/**
    名称:DataLeagueRankCard实体类
    描述:联赛红黄牌榜
 * @author shenjizhe
 * @version 1.0.0

### 联赛红黄牌榜 ###
<A NAME="DataLeagueRankCard">DataLeagueRankCard</A>

名称|类型|描述
-|-|-
id                  |Long      |
league_id           |Long      |联赛ID
club_id             |Long      |俱乐部ID
club_history_id     |Long      |俱乐部历史ID
red_cards           |Integer   |红牌数
yellow_cards        |Integer   |黄牌数
double_y_cards      |Integer   |双黄牌数
ranking             |Integer   |名次，默认为0
year                |Integer   |开始年份
end_year            |Integer   |结束年份
created_at          |Date      |
updated_at          |Date      |
 */
@Entity
public class DataLeagueRankCard implements Serializable{

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

    private Integer redCards;
    public  Integer getRedCards() {
        return redCards;
    }
    public void setRedCards(Integer redCards) {
        this.redCards = redCards;
    }

    private Integer yellowCards;
    public  Integer getYellowCards() {
        return yellowCards;
    }
    public void setYellowCards(Integer yellowCards) {
        this.yellowCards = yellowCards;
    }

    private Integer doubleYCards;
    public  Integer getDoubleYCards() {
        return doubleYCards;
    }
    public void setDoubleYCards(Integer doubleYCards) {
        this.doubleYCards = doubleYCards;
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
