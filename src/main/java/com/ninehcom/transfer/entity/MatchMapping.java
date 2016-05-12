package com.ninehcom.transfer.entity;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;

/**
    名称:MatchMapping实体类
    描述:球赛映射
 * @author shenjizhe
 * @version 1.0.0

### 球赛映射 ###
<A NAME="MatchMapping">MatchMapping</A>

名称|类型|描述
-|-|-
club_match_id       |Integer   |俱乐部球赛ID
data_match_id       |Long      |中超球赛ID
 */
@Entity
public class MatchMapping implements Serializable{

    public MatchMapping() {
    }

    public MatchMapping(Integer clubMatchId, Long dataMatchId) {
        this.clubMatchId = clubMatchId;
        this.dataMatchId = dataMatchId;
    }

    
    @Id
    private Integer clubMatchId;
    public  Integer getClubMatchId() {
        return clubMatchId;
    }
    public void setClubMatchId(Integer clubMatchId) {
        this.clubMatchId = clubMatchId;
    }

    private Long dataMatchId;
    public  Long getDataMatchId() {
        return dataMatchId;
    }
    public void setDataMatchId(Long dataMatchId) {
        this.dataMatchId = dataMatchId;
    }

}
