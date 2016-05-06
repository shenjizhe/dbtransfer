package com.ninehcom.transfer.entity;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;

import java.util.Date;
/**
    名称:DataLeagueMatchBroadcast实体类
    描述:联赛转播
 * @author shenjizhe
 * @version 1.0.0

### 联赛转播 ###
<A NAME="DataLeagueMatchBroadcast">DataLeagueMatchBroadcast</A>

名称|类型|描述
-|-|-
id                  |Long      |唯一主键
match_id            |Long      |该转播计划关联的比赛ID FK-> data_league_match.id
cast_name           |String    |转播方
cast_url            |String    |转播链接
cast_logo           |String    |视频标识
play_times          |Integer   |播放次数
display_order       |Integer   |排序权重，默认为1，高的在前
created_at          |Date      |
updated_at          |Date      |
 */
@Entity
public class DataLeagueMatchBroadcast implements Serializable{

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

    private String castName;
    public  String getCastName() {
        return castName;
    }
    public void setCastName(String castName) {
        this.castName = castName;
    }

    private String castUrl;
    public  String getCastUrl() {
        return castUrl;
    }
    public void setCastUrl(String castUrl) {
        this.castUrl = castUrl;
    }

    private String castLogo;
    public  String getCastLogo() {
        return castLogo;
    }
    public void setCastLogo(String castLogo) {
        this.castLogo = castLogo;
    }

    private Integer playTimes;
    public  Integer getPlayTimes() {
        return playTimes;
    }
    public void setPlayTimes(Integer playTimes) {
        this.playTimes = playTimes;
    }

    private Integer displayOrder;
    public  Integer getDisplayOrder() {
        return displayOrder;
    }
    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
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
