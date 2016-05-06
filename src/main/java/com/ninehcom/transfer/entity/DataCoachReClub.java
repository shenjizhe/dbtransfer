package com.ninehcom.transfer.entity;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;

import java.util.Date;
/**
    名称:DataCoachReClub实体类
    描述:教练与俱乐部关联关系
 * @author shenjizhe
 * @version 1.0.0

### 教练与俱乐部关联关系 ###
<A NAME="DataCoachReClub">DataCoachReClub</A>

名称|类型|描述
-|-|-
id                  |Long      |唯一主键
coach_id            |Long      |教练ID FK -> data_coach.id
club_id             |Long      |俱乐部ID FK-> data_club.id
type                |Integer   |教练类型（参考coachtype表）
type_name           |String    |教练类型名称
club_history_id     |Long      |球队历史ID
avatar              |String    |教练头像URL(方框半身像)
is_last_served      |String    |是否是最后效力的俱乐部("0"表示否,"1"表示是)
year                |Integer   |教练效力俱乐部的开始年份(数据类型为int)
end_year            |Integer   |结束年份(新增)
created_at          |Date      |
updated_at          |Date      |
 */
@Entity
public class DataCoachReClub implements Serializable{

    @Id
    private Long id;
    public  Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    private Long coachId;
    public  Long getCoachId() {
        return coachId;
    }
    public void setCoachId(Long coachId) {
        this.coachId = coachId;
    }

    private Long clubId;
    public  Long getClubId() {
        return clubId;
    }
    public void setClubId(Long clubId) {
        this.clubId = clubId;
    }

    private Integer type;
    public  Integer getType() {
        return type;
    }
    public void setType(Integer type) {
        this.type = type;
    }

    private String typeName;
    public  String getTypeName() {
        return typeName;
    }
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    private Long clubHistoryId;
    public  Long getClubHistoryId() {
        return clubHistoryId;
    }
    public void setClubHistoryId(Long clubHistoryId) {
        this.clubHistoryId = clubHistoryId;
    }

    private String avatar;
    public  String getAvatar() {
        return avatar;
    }
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    private String isLastServed;
    public  String getIsLastServed() {
        return isLastServed;
    }
    public void setIsLastServed(String isLastServed) {
        this.isLastServed = isLastServed;
    }

    private Integer year;
    public  Integer getYear() {
        return year;
    }
    public void setYear(Integer year) {
        this.year = year;
    }

    private Integer endYear;
    public  Integer getEndYear() {
        return endYear;
    }
    public void setEndYear(Integer endYear) {
        this.endYear = endYear;
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
