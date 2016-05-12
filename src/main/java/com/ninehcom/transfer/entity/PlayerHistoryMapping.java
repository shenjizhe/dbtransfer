package com.ninehcom.transfer.entity;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;

/**
    名称:PlayerHistoryMapping实体类
    描述:球员历史映射
 * @author shenjizhe
 * @version 1.0.0

### 球员历史映射 ###
<A NAME="PlayerHistoryMapping">PlayerHistoryMapping</A>

名称|类型|描述
-|-|-
player_history_id   |Integer   |球员历史ID
player_re_club_id   |Long      |球员俱乐部关系ID
 */
@Entity
public class PlayerHistoryMapping implements Serializable{

    @Id
    private Integer playerHistoryId;

    public PlayerHistoryMapping() {
    }

    public PlayerHistoryMapping(Integer playerHistoryId, Long playerReClubId) {
        this.playerHistoryId = playerHistoryId;
        this.playerReClubId = playerReClubId;
    }

    public  Integer getPlayerHistoryId() {
        return playerHistoryId;
    }
    public void setPlayerHistoryId(Integer playerHistoryId) {
        this.playerHistoryId = playerHistoryId;
    }

    private Long playerReClubId;
    public  Long getPlayerReClubId() {
        return playerReClubId;
    }
    public void setPlayerReClubId(Long playerReClubId) {
        this.playerReClubId = playerReClubId;
    }

}
