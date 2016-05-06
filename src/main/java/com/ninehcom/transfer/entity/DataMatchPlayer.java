package com.ninehcom.transfer.entity;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;

import java.sql.Timestamp;;

/**
    名称:DataMatchPlayer实体类
    描述:比赛球员
 * @author shenjizhe
 * @version 1.0.0

### 比赛球员 ###
<A NAME="DataMatchPlayer">DataMatchPlayer</A>

名称|类型|描述
-|-|-
id                  |Long      |
match_id            |Long      |赛事阵容  FK -> data_match.id
club_id             |Long      |俱乐部ID  FK -> data_club.id
player_id           |Long      |球员ID  FK -> data_player.id
club_type           |Integer   |球队类型(1:主队,2:客队)
player_name         |String    |球员姓名
player_number       |Integer   |球衣号码
position            |String    |队内位置，文字描述(门将/后卫/中场/前锋)
position_number     |Integer   |位置权重，1:门将 2:后卫 3:中场 4:前锋;默认为0
player_type         |Integer   |球员类型(1:首发球员,2:替补球员;3伤停默认为1)
year                |Integer   |比赛开始年份
coordinates         |String    |用于确定球员在阵容图的位置
created_at          |Timestamp |
updated_at          |Timestamp |
 */
@Entity
public class DataMatchPlayer implements Serializable{

    @Id
    private Long id;
    public  Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    private Long matchId;
    public  Long getMatchId() {
        return matchId;
    }
    public void setMatchId(Long matchId) {
        this.matchId = matchId;
    }

    private Long clubId;
    public  Long getClubId() {
        return clubId;
    }
    public void setClubId(Long clubId) {
        this.clubId = clubId;
    }

    private Long playerId;
    public  Long getPlayerId() {
        return playerId;
    }
    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    private Integer clubType;
    public  Integer getClubType() {
        return clubType;
    }
    public void setClubType(Integer clubType) {
        this.clubType = clubType;
    }

    private String playerName;
    public  String getPlayerName() {
        return playerName;
    }
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    private Integer playerNumber;
    public  Integer getPlayerNumber() {
        return playerNumber;
    }
    public void setPlayerNumber(Integer playerNumber) {
        this.playerNumber = playerNumber;
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

    private Integer playerType;
    public  Integer getPlayerType() {
        return playerType;
    }
    public void setPlayerType(Integer playerType) {
        this.playerType = playerType;
    }

    private Integer year;
    public  Integer getYear() {
        return year;
    }
    public void setYear(Integer year) {
        this.year = year;
    }

    private String coordinates;
    public  String getCoordinates() {
        return coordinates;
    }
    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    private Timestamp createdAt;
    public  Timestamp getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    private Timestamp updatedAt;
    public  Timestamp getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

}
