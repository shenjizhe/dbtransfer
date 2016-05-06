package com.ninehcom.transfer.entity;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;

import java.util.Date;
/**
    名称:DataPlayerReClub实体类
    描述:球员历史
 * @author shenjizhe
 * @version 1.0.0

### 球员历史 ###
<A NAME="DataPlayerReClub">DataPlayerReClub</A>

名称|类型|描述
-|-|-
id                  |Long      |唯一主键
club_id             |Long      |俱乐部ID FK->data_club.id
club_history_id     |Long      |俱乐部历史ID(新增)
player_id           |Long      |球员ID FK->data_player.id
league_type         |Integer   |1:踢正赛(比如中超)，2:踢正赛,非正赛(比如中超预备队) 3:踢非正赛
player_number       |Integer   |球衣号码
player_number_icon  |String    |球衣号码图片URL
position            |String    |队内位置，文字描述(门将/后卫/中场/前锋)
position_number     |Integer   |（中超要修改）位置权重，排序用,数字大在前面 1:门将 2:后卫 3 中场  4:前锋;默认为0
avatar              |String    | 球员头像URL(半身像方框)
weight              |Integer   |球员体重(如: 65 kg)
height              |Integer   |球员身高(如: 185 cm)
year                |Integer   |开始年份(改为了int)
end_year            |Integer   |结束年份(新增)
is_last_served      |Boolean   |是否是最后效力的俱乐部(用于查询俱乐部当前所有球员的列表 ,"0"表示否,"1"表示是)
onfield             |Integer   |球员在本赛季代表俱乐部的出场次数
onfield_last        |Integer   |球员在本赛季代表俱乐部的出场时间
goals               |Integer   |本赛季的进球数(默认为0)
shoot_times         |Integer   |射门次数
assist_times        |Integer   |助攻次数
yellow_times        |Integer   |黄牌次数
red_times           |Integer   |红牌次数
serial_number       |String    |参赛编号
created_at          |Date      |
updated_at          |Date      |
 */
@Entity
public class DataPlayerReClub implements Serializable{

    @Id
    private Long id;
    public  Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
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

    private Integer leagueType;
    public  Integer getLeagueType() {
        return leagueType;
    }
    public void setLeagueType(Integer leagueType) {
        this.leagueType = leagueType;
    }

    private Integer playerNumber;
    public  Integer getPlayerNumber() {
        return playerNumber;
    }
    public void setPlayerNumber(Integer playerNumber) {
        this.playerNumber = playerNumber;
    }

    private String playerNumberIcon;
    public  String getPlayerNumberIcon() {
        return playerNumberIcon;
    }
    public void setPlayerNumberIcon(String playerNumberIcon) {
        this.playerNumberIcon = playerNumberIcon;
    }

    private String position;
    public  String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    private Integer positionNumber;
    public  Integer getPositionNumber() {
        return positionNumber;
    }
    public void setPositionNumber(Integer positionNumber) {
        this.positionNumber = positionNumber;
    }

    private String avatar;
    public  String getAvatar() {
        return avatar;
    }
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    private Integer weight;
    public  Integer getWeight() {
        return weight;
    }
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    private Integer height;
    public  Integer getHeight() {
        return height;
    }
    public void setHeight(Integer height) {
        this.height = height;
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

    private Boolean isLastServed;
    public  Boolean getIsLastServed() {
        return isLastServed;
    }
    public void setIsLastServed(Boolean isLastServed) {
        this.isLastServed = isLastServed;
    }

    private Integer onfield;
    public  Integer getOnfield() {
        return onfield;
    }
    public void setOnfield(Integer onfield) {
        this.onfield = onfield;
    }

    private Integer onfieldLast;
    public  Integer getOnfieldLast() {
        return onfieldLast;
    }
    public void setOnfieldLast(Integer onfieldLast) {
        this.onfieldLast = onfieldLast;
    }

    private Integer goals;
    public  Integer getGoals() {
        return goals;
    }
    public void setGoals(Integer goals) {
        this.goals = goals;
    }

    private Integer shootTimes;
    public  Integer getShootTimes() {
        return shootTimes;
    }
    public void setShootTimes(Integer shootTimes) {
        this.shootTimes = shootTimes;
    }

    private Integer assistTimes;
    public  Integer getAssistTimes() {
        return assistTimes;
    }
    public void setAssistTimes(Integer assistTimes) {
        this.assistTimes = assistTimes;
    }

    private Integer yellowTimes;
    public  Integer getYellowTimes() {
        return yellowTimes;
    }
    public void setYellowTimes(Integer yellowTimes) {
        this.yellowTimes = yellowTimes;
    }

    private Integer redTimes;
    public  Integer getRedTimes() {
        return redTimes;
    }
    public void setRedTimes(Integer redTimes) {
        this.redTimes = redTimes;
    }

    private String serialNumber;
    public  String getSerialNumber() {
        return serialNumber;
    }
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
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
