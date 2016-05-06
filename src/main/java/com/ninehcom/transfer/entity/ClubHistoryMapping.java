package com.ninehcom.transfer.entity;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;

/**
    名称:ClubHistoryMapping实体类
    描述:俱乐部历史ID映射表
 * @author shenjizhe
 * @version 1.0.0

### 俱乐部历史ID映射表 ###
<A NAME="ClubHistoryMapping">ClubHistoryMapping</A>

名称|类型|描述
-|-|-
team_history_id     |Integer   |俱乐部历史ID
club_history_id     |Long      |中超俱乐部历史ID
 */
@Entity
public class ClubHistoryMapping implements Serializable{

    @Id
    private Integer teamHistoryId;
    public  Integer getTeamHistoryId() {
        return teamHistoryId;
    }
    public void setTeamHistoryId(Integer teamHistoryId) {
        this.teamHistoryId = teamHistoryId;
    }

    private Long clubHistoryId;
    public  Long getClubHistoryId() {
        return clubHistoryId;
    }
    public void setClubHistoryId(Long clubHistoryId) {
        this.clubHistoryId = clubHistoryId;
    }

}
