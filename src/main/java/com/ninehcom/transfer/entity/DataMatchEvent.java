package com.ninehcom.transfer.entity;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;

import java.sql.Timestamp;;

/**
    名称:DataMatchEvent实体类
    描述:赛事事件
 * @author shenjizhe
 * @version 1.0.0

### 赛事事件 ###
<A NAME="DataMatchEvent">DataMatchEvent</A>

名称|类型|描述
-|-|-
id                  |Long      |
match_id            |Long      |赛事ID
club_type           |Integer   |产生此事件的球队(1:主场球队,2:客场球队)
club_id             |Long      |球队ID FK -> data_club.id
event_type          |Integer   | 事件类型(0:比赛开始,1:进球,2:助攻,3:红牌,4:黄牌,5:换人,6:比赛结束)
event_data          |String    |赛事事件文本
event_point         |Integer   |事件发生时间点(如: 比赛中的第 45min )
event_at            |Timestamp |事件发生时间
player_id           |Long      |球员ID
player_secondary_id |Long      |次要球员ID
player_name         |String    |球员名称
player_secondary_name|String    |次要球员名称
created_at          |Timestamp |数据记录创建时间
updated_at          |Timestamp |数据记录更新时间
 */
@Entity
public class DataMatchEvent implements Serializable{

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

    private Integer clubType;
    public  Integer getClubType() {
        return clubType;
    }
    public void setClubType(Integer clubType) {
        this.clubType = clubType;
    }

    private Long clubId;
    public  Long getClubId() {
        return clubId;
    }
    public void setClubId(Long clubId) {
        this.clubId = clubId;
    }

    private Integer eventType;
    public  Integer getEventType() {
        return eventType;
    }
    public void setEventType(Integer eventType) {
        this.eventType = eventType;
    }

    private String eventData;
    public  String getEventData() {
        return eventData;
    }
    public void setEventData(String eventData) {
        this.eventData = eventData;
    }

    private Integer eventPoint;
    public  Integer getEventPoint() {
        return eventPoint;
    }
    public void setEventPoint(Integer eventPoint) {
        this.eventPoint = eventPoint;
    }

    private Timestamp eventAt;
    public  Timestamp getEventAt() {
        return eventAt;
    }
    public void setEventAt(Timestamp eventAt) {
        this.eventAt = eventAt;
    }

    private Long playerId;
    public  Long getPlayerId() {
        return playerId;
    }
    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    private Long playerSecondaryId;
    public  Long getPlayerSecondaryId() {
        return playerSecondaryId;
    }
    public void setPlayerSecondaryId(Long playerSecondaryId) {
        this.playerSecondaryId = playerSecondaryId;
    }

    private String playerName;
    public  String getPlayerName() {
        return playerName;
    }
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    private String playerSecondaryName;
    public  String getPlayerSecondaryName() {
        return playerSecondaryName;
    }
    public void setPlayerSecondaryName(String playerSecondaryName) {
        this.playerSecondaryName = playerSecondaryName;
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
