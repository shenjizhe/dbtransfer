package com.ninehcom.transfer.entity;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;

import java.util.Date;
/**
    名称:CoachHistory实体类
    描述:教练履历
 * @author shenjizhe
 * @version 1.0.0

### 教练履历 ###
<A NAME="CoachHistory">CoachHistory</A>

名称|类型|描述
-|-|-
id                  |Long      |履历主键
year                |Integer   |联赛开始年份
end_year            |Integer   |结束年份
coach_id            |Long      |教练主键
coach_name          |String    |教练姓名
league_name         |String    |联赛名称
club_name           |String    |俱乐部名称
honors              |String    |荣誉
create_at           |Date      |
update_at           |Date      |
 */
@Entity
public class CoachHistory implements Serializable{

    @Id
    private Long id;
    public  Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
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

    private Long coachId;
    public  Long getCoachId() {
        return coachId;
    }
    public void setCoachId(Long coachId) {
        this.coachId = coachId;
    }

    private String coachName;
    public  String getCoachName() {
        return coachName;
    }
    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }

    private String leagueName;
    public  String getLeagueName() {
        return leagueName;
    }
    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    private String clubName;
    public  String getClubName() {
        return clubName;
    }
    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    private String honors;
    public  String getHonors() {
        return honors;
    }
    public void setHonors(String honors) {
        this.honors = honors;
    }

    private Date createdAt;
    public  Date getCreatedAt() {
        return createdAt;
    }
    public void setCreateAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    private Date updatedAt;
    public  Date getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdateAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

}