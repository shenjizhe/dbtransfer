package com.ninehcom.transfer.entity;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;

/**
    名称:PlayerMapping实体类
    描述:球员映射
 * @author shenjizhe
 * @version 1.0.0

### 球员映射 ###
<A NAME="PlayerMapping">PlayerMapping</A>

名称|类型|描述
-|-|-
club_player_id      |Integer   |俱乐部球员ID
data_player_id      |Long      |中超用户ID
 */
@Entity
public class PlayerMapping implements Serializable{

    public PlayerMapping() {
    }

    public PlayerMapping(Integer clubPlayerId, Long dataPlayerId) {
        this.clubPlayerId = clubPlayerId;
        this.dataPlayerId = dataPlayerId;
    }

    
    @Id
    private Integer clubPlayerId;
    public  Integer getClubPlayerId() {
        return clubPlayerId;
    }
    public void setClubPlayerId(Integer clubPlayerId) {
        this.clubPlayerId = clubPlayerId;
    }

    private Long dataPlayerId;
    public  Long getDataPlayerId() {
        return dataPlayerId;
    }
    public void setDataPlayerId(Long dataPlayerId) {
        this.dataPlayerId = dataPlayerId;
    }

}
