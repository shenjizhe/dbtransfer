package com.ninehcom.transfer.entity;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;

import java.util.Date;
/**
    名称:AssistRank实体类
    描述:VIEW
 * @author shenjizhe
 * @version 1.0.0

### VIEW ###
<A NAME="AssistRank">AssistRank</A>

名称|类型|描述
-|-|-
id                  |Long      |
assistants          |Integer   |助攻数
player_id           |Long      |球员ID
pre_ranking         |Integer   |上轮排名
ranking             |Integer   |排名
year                |Integer   |联赛年份 (支持不带-的当年和带-的跨年两种格式 注:这里考虑到url的/冲突,避免用/做分隔符)
end_year            |Integer   |结束年份
club_id             |Long      |所属俱乐部ID
club_logo           |String    |图片
club_name           |String    |队名
club_english_name   |String    |英文名
club_full_name      |String    |中文全名
club_english_full_name|String    |英文全名
player_name         |String    |中文姓名
player_english_name |String    |英文姓名
country             |String    |国籍
native_place        |String    |籍贯
birth               |Date      |出生年月
 */
@Entity
public class AssistRank implements Serializable{

    @Id
    private Long id;
    public  Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    private Integer assistants;
    public  Integer getAssistants() {
        return assistants;
    }
    public void setAssistants(Integer assistants) {
        this.assistants = assistants;
    }

    private Long playerId;
    public  Long getPlayerId() {
        return playerId;
    }
    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
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

    private String clubLogo;
    public  String getClubLogo() {
        return clubLogo;
    }
    public void setClubLogo(String clubLogo) {
        this.clubLogo = clubLogo;
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

}
