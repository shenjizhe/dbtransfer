package com.ninehcom.transfer.entity;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;

/**
    名称:PlayerLineType实体类
    描述:球员阵容类型
 * @author shenjizhe
 * @version 1.0.0

### 球员阵容类型 ###
<A NAME="PlayerLineType">PlayerLineType</A>

名称|类型|描述
-|-|-
id                  |Integer   |唯一主键
name                |String    |队员阵容类型
 */
@Entity
public class PlayerLineType implements Serializable{

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
