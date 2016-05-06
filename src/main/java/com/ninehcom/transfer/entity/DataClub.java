package com.ninehcom.transfer.entity;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;

import java.util.Date;
/**
    名称:DataClub实体类
    描述:俱乐部
 * @author shenjizhe
 * @version 1.0.0

### 俱乐部 ###
<A NAME="DataClub">DataClub</A>

名称|类型|描述
-|-|-
id                  |Long      |唯一主键
bg_image            |String    |俱乐部背景图
bg_player_image     |String    |球员背景图
data_color          |String    |俱乐部数据的颜色(主题色)
name                |String    |中文名称,常用,比如:广州恒大
intro_url           |String    |俱乐部介绍资料(一个网页URL)
founded_at          |Date      |创立时间
created_at          |Date      |创建时间
updated_at          |Date      |更新时间
 */
@Entity
public class DataClub implements Serializable{

    @Id
    private Long id;
    public  Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    private String bgImage;
    public  String getBgImage() {
        return bgImage;
    }
    public void setBgImage(String bgImage) {
        this.bgImage = bgImage;
    }

    private String bgPlayerImage;
    public  String getBgPlayerImage() {
        return bgPlayerImage;
    }
    public void setBgPlayerImage(String bgPlayerImage) {
        this.bgPlayerImage = bgPlayerImage;
    }

    private String dataColor;
    public  String getDataColor() {
        return dataColor;
    }
    public void setDataColor(String dataColor) {
        this.dataColor = dataColor;
    }

    private String name;
    public  String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    private String introUrl;
    public  String getIntroUrl() {
        return introUrl;
    }
    public void setIntroUrl(String introUrl) {
        this.introUrl = introUrl;
    }

    private Date foundedAt;
    public  Date getFoundedAt() {
        return foundedAt;
    }
    public void setFoundedAt(Date foundedAt) {
        this.foundedAt = foundedAt;
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
