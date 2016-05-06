package com.ninehcom.transfer.entity;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;

/**
    名称:EventType实体类
    描述:事件类型
 * @author shenjizhe
 * @version 1.0.0

### 事件类型 ###
<A NAME="EventType">EventType</A>

名称|类型|描述
-|-|-
id                  |Integer   |逻辑主键
name                |String    |赛事事件名称
icon                |String    |图标
 */
@Entity
public class EventType implements Serializable{

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

    private String icon;
    public  String getIcon() {
        return icon;
    }
    public void setIcon(String icon) {
        this.icon = icon;
    }

}
