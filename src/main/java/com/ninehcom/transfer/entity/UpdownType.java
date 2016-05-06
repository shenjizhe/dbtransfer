package com.ninehcom.transfer.entity;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;

/**
    名称:UpdownType实体类
    描述:球队升降级
 * @author shenjizhe
 * @version 1.0.0

### 球队升降级 ###
<A NAME="UpdownType">UpdownType</A>

名称|类型|描述
-|-|-
id                  |Integer   |唯一主键
name                |String    |升降级
 */
@Entity
public class UpdownType implements Serializable{

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
