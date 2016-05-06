package com.ninehcom.transfer.entity;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;

import java.util.Date;
/**
    名称:ClubHistory实体类
    描述:俱乐部历史
 * @author shenjizhe
 * @version 1.0.0

### 俱乐部历史 ###
<A NAME="ClubHistory">ClubHistory</A>

名称|类型|描述
-|-|-
id                  |Long      |唯一主键
club_id             |Long      |俱乐部ID   FK-> data_club.id
year                |String    |联赛年份 (支持不带-的当年和带-的跨年两种格式 注:这里考虑到url的/冲突,避免用/做分隔符)
logo                |String    |图片
name                |String    |队名
en_name             |String    |英文名
full_name           |String    |中文全名
en_full_name        |String    |英文全名
created_at          |Date      |创建时间
updated_at          |Date      |最后修改时间
court               |String    |主场场地
color               |String    |俱乐部主体颜色
 */
@Entity
public class ClubHistory implements Serializable{

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

    private String year;
    public  String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }

    private String logo;
    public  String getLogo() {
        return logo;
    }
    public void setLogo(String logo) {
        this.logo = logo;
    }

    private String name;
    public  String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    private String enName;
    public  String getEnName() {
        return enName;
    }
    public void setEnName(String enName) {
        this.enName = enName;
    }

    private String fullName;
    public  String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    private String enFullName;
    public  String getEnFullName() {
        return enFullName;
    }
    public void setEnFullName(String enFullName) {
        this.enFullName = enFullName;
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

    private String court;
    public  String getCourt() {
        return court;
    }
    public void setCourt(String court) {
        this.court = court;
    }

    private String color;
    public  String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

}
