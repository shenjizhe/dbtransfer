package com.ninehcom.transfer.entity;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;

import java.util.Date;
/**
    名称:MatchVideo实体类
    描述:赛事视频
 * @author shenjizhe
 * @version 1.0.0

### 赛事视频 ###
<A NAME="MatchVideo">MatchVideo</A>

名称|类型|描述
-|-|-
id                  |Long      |视频ID
club_id             |Long      |俱乐部ID
match_id            |Long      |比赛ID
logo                |String    |视频主图
title               |String    |视频标题
url                 |String    |视频链接
public_time         |Date      |发布时间
play_times          |Integer   |播放次数
create_at           |Date      |
update_at           |Date      |
 */
@Entity
public class MatchVideo implements Serializable{

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

    private Long matchId;
    public  Long getMatchId() {
        return matchId;
    }
    public void setMatchId(Long matchId) {
        this.matchId = matchId;
    }

    private String logo;
    public  String getLogo() {
        return logo;
    }
    public void setLogo(String logo) {
        this.logo = logo;
    }

    private String title;
    public  String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    private String url;
    public  String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    private Date publicTime;
    public  Date getPublicTime() {
        return publicTime;
    }
    public void setPublicTime(Date publicTime) {
        this.publicTime = publicTime;
    }

    private Integer playTimes;
    public  Integer getPlayTimes() {
        return playTimes;
    }
    public void setPlayTimes(Integer playTimes) {
        this.playTimes = playTimes;
    }

    private Date createAt;
    public  Date getCreateAt() {
        return createAt;
    }
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    private Date updateAt;
    public  Date getUpdateAt() {
        return updateAt;
    }
    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

}
