package com.ninehcom.transfer.entity;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;

import java.util.Date;
/**
    名称:Coach实体类
    描述:教练
 * @author shenjizhe
 * @version 1.0.0

### 教练 ###
<A NAME="Coach">Coach</A>

名称|类型|描述
-|-|-
Id                  |Integer   |逻辑主键
Name                |String    |姓名
Birthday            |Date      |生日
Nationality         |String    |国籍
Birthplace          |String    |出生地
CreateTime          |Date      |创建时间
UpdateTime          |Date      |更新时间
 */
@Entity
public class Coach implements Serializable{

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

    private Date birthday;
    public  Date getBirthday() {
        return birthday;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    private String nationality;
    public  String getNationality() {
        return nationality;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    private String birthplace;
    public  String getBirthplace() {
        return birthplace;
    }
    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
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
