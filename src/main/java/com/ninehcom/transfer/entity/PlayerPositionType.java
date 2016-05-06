package com.ninehcom.transfer.entity;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;

/**
    名称:PlayerPositionType实体类
    描述:球员类型
 * @author shenjizhe
 * @version 1.0.0

### 球员类型 ###
<A NAME="PlayerPositionType">PlayerPositionType</A>

名称|类型|描述
-|-|-
id                  |Integer   |逻辑主键
name                |String    |
 */
@Entity
public class PlayerPositionType implements Serializable{

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
