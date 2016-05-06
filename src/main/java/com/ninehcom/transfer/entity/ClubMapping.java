package com.ninehcom.transfer.entity;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;

/**
    名称:ClubMapping实体类
    描述:俱乐部项目和中超项目的俱乐部映射关系
 * @author shenjizhe
 * @version 1.0.0

### 俱乐部项目和中超项目的俱乐部映射关系 ###
<A NAME="ClubMapping">ClubMapping</A>

名称|类型|描述
-|-|-
team_id             |Integer   |国安俱乐部ID
club_id             |Long      |中超俱乐部ID
 */
@Entity
public class ClubMapping implements Serializable{

    public ClubMapping() {
    }

    public ClubMapping(Integer teamId, Long clubId) {
        this.teamId = teamId;
        this.clubId = clubId;
    }

    
    @Id
    private Integer teamId;
    public  Integer getTeamId() {
        return teamId;
    }
    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    private Long clubId;
    public  Long getClubId() {
        return clubId;
    }
    public void setClubId(Long clubId) {
        this.clubId = clubId;
    }

}
