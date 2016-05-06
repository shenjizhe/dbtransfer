package com.ninehcom.transfer.entity;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;

/**
    名称:JudgeType实体类
    描述:裁判类型
 * @author shenjizhe
 * @version 1.0.0

### 裁判类型 ###
<A NAME="JudgeType">JudgeType</A>

名称|类型|描述
-|-|-
id                  |Integer   |唯一主键
name                |String    |裁判类型名称
 */
@Entity
public class JudgeType implements Serializable{

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
