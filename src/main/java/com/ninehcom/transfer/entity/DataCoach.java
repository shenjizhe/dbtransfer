package com.ninehcom.transfer.entity;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;

import java.util.Date;
/**
    名称:DataCoach实体类
    描述:教练
 * @author shenjizhe
 * @version 1.0.0

### 教练 ###
<A NAME="DataCoach">DataCoach</A>

名称|类型|描述
-|-|-
id                  |Long      |唯一主键
name                |String    |中文姓名
english_name        |String    |英文姓名
country             |String    |国籍
native_place        |String    |籍贯（出生地）
birth               |Date      |出生年月日
created_at          |Date      |
updated_at          |Date      |
 */
@Entity
public class DataCoach implements Serializable{

    @Id
    private Long id;
    public  Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    private String name;
    public  String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    private String englishName;
    public  String getEnglishName() {
        return englishName;
    }
    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    private String country;
    public  String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    private String nativePlace;
    public  String getNativePlace() {
        return nativePlace;
    }
    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    private Date birth;
    public  Date getBirth() {
        return birth;
    }
    public void setBirth(Date birth) {
        this.birth = birth;
    }

    private Date createdAt;
    public  Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    private Date updatedAt;
    public  Date getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

}
