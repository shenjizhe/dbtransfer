package com.ninehcom.transfer.entity;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;

import java.util.Date;
/**
    名称:DataJudgeReMatch实体类
    描述:
 * @author shenjizhe
 * @version 1.0.0

###  ###
<A NAME="DataJudgeReMatch">DataJudgeReMatch</A>

名称|类型|描述
-|-|-
id                  |Long      |唯一主键
judge_id            |Long      |裁判ID
match_id            |Long      |比赛ID
judge_type_id       |Integer   |裁判类型
avatar              |String    |裁判头像URL(方框半身像)
cir_avatar          |String    |半身像圆角图
info_avatar         |String    |带文字描述的头像
full_avatar         |String    |全身像
created_at          |Date      |
updated_at          |Date      |
 */
@Entity
public class DataJudgeReMatch implements Serializable{

    @Id
    private Long id;
    public  Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    private Long judgeId;
    public  Long getJudgeId() {
        return judgeId;
    }
    public void setJudgeId(Long judgeId) {
        this.judgeId = judgeId;
    }

    private Long matchId;
    public  Long getMatchId() {
        return matchId;
    }
    public void setMatchId(Long matchId) {
        this.matchId = matchId;
    }

    private Integer judgeTypeId;
    public  Integer getJudgeTypeId() {
        return judgeTypeId;
    }
    public void setJudgeTypeId(Integer judgeTypeId) {
        this.judgeTypeId = judgeTypeId;
    }

    private String avatar;
    public  String getAvatar() {
        return avatar;
    }
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    private String cirAvatar;
    public  String getCirAvatar() {
        return cirAvatar;
    }
    public void setCirAvatar(String cirAvatar) {
        this.cirAvatar = cirAvatar;
    }

    private String infoAvatar;
    public  String getInfoAvatar() {
        return infoAvatar;
    }
    public void setInfoAvatar(String infoAvatar) {
        this.infoAvatar = infoAvatar;
    }

    private String fullAvatar;
    public  String getFullAvatar() {
        return fullAvatar;
    }
    public void setFullAvatar(String fullAvatar) {
        this.fullAvatar = fullAvatar;
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
