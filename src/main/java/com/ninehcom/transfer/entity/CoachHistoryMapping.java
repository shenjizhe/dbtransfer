package com.ninehcom.transfer.entity;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;

/**
    名称:CoachHistoryMapping实体类
    描述:教练历史映射
 * @author shenjizhe
 * @version 1.0.0

### 教练历史映射 ###
<A NAME="CoachHistoryMapping">CoachHistoryMapping</A>

名称|类型|描述
-|-|-
coach_history_id    |Integer   |教练历史ID
coach_re_club_id    |Long      |
 */
@Entity
public class CoachHistoryMapping implements Serializable{

    public CoachHistoryMapping() {
    }

    public CoachHistoryMapping(Integer coachHistoryId, Long coachReClubId) {
        this.coachHistoryId = coachHistoryId;
        this.coachReClubId = coachReClubId;
    }

    
    @Id
    private Integer coachHistoryId;
    public  Integer getCoachHistoryId() {
        return coachHistoryId;
    }
    public void setCoachHistoryId(Integer coachHistoryId) {
        this.coachHistoryId = coachHistoryId;
    }

    private Long coachReClubId;
    public  Long getCoachReClubId() {
        return coachReClubId;
    }
    public void setCoachReClubId(Long coachReClubId) {
        this.coachReClubId = coachReClubId;
    }

}
