package com.ninehcom.transfer.entity;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;

/**
    名称:MatchPosition实体类
    描述:
 * @author shenjizhe
 * @version 1.0.0

###  ###
<A NAME="MatchPosition">MatchPosition</A>

名称|类型|描述
-|-|-
name                |String    |位置名称
x                   |Integer   |x坐标
y                   |Integer   |y坐标
club_type_id        |Integer   |主客关系ID
 */
@Entity
public class MatchPosition implements Serializable{

    @Id
    private String name;
    public  String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    private Integer x;
    public  Integer getX() {
        return x;
    }
    public void setX(Integer x) {
        this.x = x;
    }

    private Integer y;
    public  Integer getY() {
        return y;
    }
    public void setY(Integer y) {
        this.y = y;
    }

    private Integer clubTypeId;
    public  Integer getClubTypeId() {
        return clubTypeId;
    }
    public void setClubTypeId(Integer clubTypeId) {
        this.clubTypeId = clubTypeId;
    }

}
