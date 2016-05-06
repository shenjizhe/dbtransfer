package com.ninehcom.transfer.entity;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;

/**
    名称:StateType实体类
    描述:赛事状态
 * @author shenjizhe
 * @version 1.0.0

### 赛事状态 ###
<A NAME="StateType">StateType</A>

名称|类型|描述
-|-|-
id                  |Integer   |逻辑主键
name                |String    |
 */
@Entity
public class StateType implements Serializable{

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
