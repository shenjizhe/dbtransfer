package com.ninehcom.transfer.entity;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;

import java.util.Date;
/**
    名称:DataLeagueReClub实体类
    描述:俱乐部联赛关系
 * @author shenjizhe
 * @version 1.0.0

### 俱乐部联赛关系 ###
<A NAME="DataLeagueReClub">DataLeagueReClub</A>

名称|类型|描述
-|-|-
id                  |Long      |唯一主键
club_id             |Long      |俱乐部ID   FK-> data_club.id
league_id           |Long      |联赛ID     FK-> data_league.id
league_name         |String    |联赛名称（冗余）
year                |String    |联赛年份 (支持不带-的当年和带-的跨年两种格式 注:这里考虑到url的/冲突,避免用/做分隔符)
honors              |String    |荣誉(球队第几名)
display_order       |Integer   |球队排序
created_at          |Date      |创建时间
updated_at          |Date      |最后修改时间
 */
@Entity
public class DataLeagueReClub implements Serializable{

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

    private Long leagueId;
    public  Long getLeagueId() {
        return leagueId;
    }
    public void setLeagueId(Long leagueId) {
        this.leagueId = leagueId;
    }

    private String leagueName;
    public  String getLeagueName() {
        return leagueName;
    }
    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    private String year;
    public  String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }

    private String honors;
    public  String getHonors() {
        return honors;
    }
    public void setHonors(String honors) {
        this.honors = honors;
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
