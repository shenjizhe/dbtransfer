package com.ninehcom.transfer.entity;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;

import java.util.Date;
/**
    名称:DataLeagueUpdown实体类
    描述:
 * @author shenjizhe
 * @version 1.0.0

###  ###
<A NAME="DataLeagueUpdown">DataLeagueUpdown</A>

名称|类型|描述
-|-|-
id                  |Long      |
league_id           |Long      |联赛ID
club_id             |Long      |俱乐部ID
updown_type         |String    |升降级类型(1:升级 2:降级)
year                |String    |联赛年份 (支持不带-的当年和带-的跨年两种格式 注:这里考虑到url的/冲突,避免用/做分隔符)
created_at          |Date      |
updated_at          |Date      |
 */
@Entity
public class DataLeagueUpdown implements Serializable{

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

    private String updownType;
    public  String getUpdownType() {
        return updownType;
    }
    public void setUpdownType(String updownType) {
        this.updownType = updownType;
    }

    private String year;
    public  String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
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
