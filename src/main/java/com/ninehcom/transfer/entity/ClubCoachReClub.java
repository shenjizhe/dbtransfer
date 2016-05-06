package com.ninehcom.transfer.entity;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;

/**
    名称:ClubCoachReClub实体类
    描述:俱乐部教练信息
 * @author shenjizhe
 * @version 1.0.0

### 俱乐部教练信息 ###
<A NAME="ClubCoachReClub">ClubCoachReClub</A>

名称|类型|描述
-|-|-
id                  |Long      |教练关系ID
cir_avatar          |String    |半身像圆角图
info_avatar         |String    |带文字描述的头像
full_avatar         |String    |全身像
 */
@Entity
public class ClubCoachReClub implements Serializable{

    @Id
    private Long id;
    public  Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
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

}
