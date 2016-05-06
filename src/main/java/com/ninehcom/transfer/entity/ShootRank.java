package com.ninehcom.transfer.entity;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;

import java.util.Date;
/**
    名称:ShootRank实体类
    描述:VIEW
 * @author shenjizhe
 * @version 1.0.0

### VIEW ###
<A NAME="ShootRank">ShootRank</A>

名称|类型|描述
-|-|-
id                  |Long      |唯一标识
player_id           |Long      |球员ID
player_name         |String    |中文姓名
player_english_name |String    |英文姓名
country             |String    |国籍
native_place        |String    |籍贯
birth               |Date      |出生年月
goals               |Integer   |进球数
pre_ranking         |Integer   |上一轮排名
ranking             |Integer   |名次，默认为0
year                |Integer   |开始年份
end_year            |Integer   |结束年份
club_id             |Long      |俱乐部ID   FK-> data_club.id
club_name           |String    |队名
club_english_name   |String    |英文名
club_full_name      |String    |中文全名
club_english_full_name|String    |英文全名
club_logo           |String    |图片
 */
@Entity
public class ShootRank implements Serializable{

    @Id
    private Long id;
    public  Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    private Long playerId;
    public  Long getPlayerId() {
        return playerId;
    }
    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    private String playerName;
    public  String getPlayerName() {
        return playerName;
    }
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    private String playerEnglishName;
    public  String getPlayerEnglishName() {
        return playerEnglishName;
    }
    public void setPlayerEnglishName(String playerEnglishName) {
        this.playerEnglishName = playerEnglishName;
    }

    private String country;
    public  String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    private String nativePlace;
    public  String getNativePlace() {
        return nativePlace;
    }
    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    private Date birth;
    public  Date getBirth() {
        return birth;
    }
    public void setBirth(Date birth) {
        this.birth = birth;
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

    private Long clubId;
    public  Long getClubId() {
        return clubId;
    }
    public void setClubId(Long clubId) {
        this.clubId = clubId;
    }

    private String clubName;
    public  String getClubName() {
        return clubName;
    }
    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    private String clubEnglishName;
    public  String getClubEnglishName() {
        return clubEnglishName;
    }
    public void setClubEnglishName(String clubEnglishName) {
        this.clubEnglishName = clubEnglishName;
    }

    private String clubFullName;
    public  String getClubFullName() {
        return clubFullName;
    }
    public void setClubFullName(String clubFullName) {
        this.clubFullName = clubFullName;
    }

    private String clubEnglishFullName;
    public  String getClubEnglishFullName() {
        return clubEnglishFullName;
    }
    public void setClubEnglishFullName(String clubEnglishFullName) {
        this.clubEnglishFullName = clubEnglishFullName;
    }

    private String clubLogo;
    public  String getClubLogo() {
        return clubLogo;
    }
    public void setClubLogo(String clubLogo) {
        this.clubLogo = clubLogo;
    }

}
