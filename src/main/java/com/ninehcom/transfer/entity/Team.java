package com.ninehcom.transfer.entity;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;

import java.util.Date;
/**
    名称:Team实体类
    描述:球队
 * @author shenjizhe
 * @version 1.0.0

### 球队 ###
<A NAME="Team">Team</A>

名称|类型|描述
-|-|-
Id                  |Integer   |逻辑主键
Name                |String    |球队现在名称/最后存在名称
CreateTime          |Date      |
UpdateTime          |Date      |
 */
@Entity
public class Team implements Serializable{

    @Id
    private Integer id;
    public  Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    private String name;
    public  String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    private Date createTime;
    public  Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    private Date updateTime;
    public  Date getUpdateTime() {
        return updateTime;
    }
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

}
