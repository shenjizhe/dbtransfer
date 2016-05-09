package com.ninehcom.transfer.entity;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;

/**
    名称:CoachMapping实体类
    描述:教练映射
 * @author shenjizhe
 * @version 1.0.0

### 教练映射 ###
<A NAME="CoachMapping">CoachMapping</A>

名称|类型|描述
-|-|-
club_coach_id       |Integer   |教练ID
data_coach_id       |Long      |
 */
@Entity
public class CoachMapping implements Serializable{

    @Id
    private Integer clubCoachId;

    public CoachMapping(Integer id, Long id0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public  Integer getClubCoachId() {
        return clubCoachId;
    }
    public void setClubCoachId(Integer clubCoachId) {
        this.clubCoachId = clubCoachId;
    }

    private Long dataCoachId;
    public  Long getDataCoachId() {
        return dataCoachId;
    }
    public void setDataCoachId(Long dataCoachId) {
        this.dataCoachId = dataCoachId;
    }

}
