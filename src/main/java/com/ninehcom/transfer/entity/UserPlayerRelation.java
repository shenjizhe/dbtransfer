package com.ninehcom.transfer.entity;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;

import java.util.Date;
/**
    名称:UserPlayerRelation实体类
    描述:用户球员关系
 * @author shenjizhe
 * @version 1.0.0

### 用户球员关系 ###
<A NAME="UserPlayerRelation">UserPlayerRelation</A>

名称|类型|描述
-|-|-
UserId              |String    |用户ID
PlayID              |Integer   |球员ID
Type                |Integer   |关系类型（1.关注）
Time                |Date      |关系建立时间
 */
@Entity
public class UserPlayerRelation implements Serializable{

    @Id
    private String userId;
    public  String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    private Integer playID;
    public  Integer getPlayID() {
        return playID;
    }
    public void setPlayID(Integer playID) {
        this.playID = playID;
    }

    private Integer type;
    public  Integer getType() {
        return type;
    }
    public void setType(Integer type) {
        this.type = type;
    }

    private Date time;
    public  Date getTime() {
        return time;
    }
    public void setTime(Date time) {
        this.time = time;
    }

}
