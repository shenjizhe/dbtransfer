package com.ninehcom.transfer.entity;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;

/**
    名称:DataPlayerIdMapped实体类
    描述:比赛球员Id  与 amisco 数据中的比赛球员id 对应表
 * @author shenjizhe
 * @version 1.0.0

### 比赛球员Id  与 amisco 数据中的比赛球员id 对应表 ###
<A NAME="DataPlayerIdMapped">DataPlayerIdMapped</A>

名称|类型|描述
-|-|-
id                  |Long      |
player_id           |Long      |
amisco_player_id    |Long      |
club_id             |Long      |俱乐部Id
year                |String    |
 */
@Entity
public class DataPlayerIdMapped implements Serializable{

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

    private Long amiscoPlayerId;
    public  Long getAmiscoPlayerId() {
        return amiscoPlayerId;
    }
    public void setAmiscoPlayerId(Long amiscoPlayerId) {
        this.amiscoPlayerId = amiscoPlayerId;
    }

    private Long clubId;
    public  Long getClubId() {
        return clubId;
    }
    public void setClubId(Long clubId) {
        this.clubId = clubId;
    }

    private String year;
    public  String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }

}
