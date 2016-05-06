package com.ninehcom.transfer.entity;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;

/**
    名称:ClubType实体类
    描述:球队主客关系
 * @author shenjizhe
 * @version 1.0.0

### 球队主客关系 ###
<A NAME="ClubType">ClubType</A>

名称|类型|描述
-|-|-
id                  |Integer   |逻辑主键
name                |String    |名称
 */
@Entity
public class ClubType implements Serializable{

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

}
