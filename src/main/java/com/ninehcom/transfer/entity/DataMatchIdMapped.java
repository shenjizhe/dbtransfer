package com.ninehcom.transfer.entity;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;

/**
    名称:DataMatchIdMapped实体类
    描述:比赛Id  与 amisco 数据中的比赛id 对应表
 * @author shenjizhe
 * @version 1.0.0

### 比赛Id  与 amisco 数据中的比赛id 对应表 ###
<A NAME="DataMatchIdMapped">DataMatchIdMapped</A>

名称|类型|描述
-|-|-
id                  |Long      |
match_id            |Long      |比赛Id
amisco_match_id     |Long      |amisco 数据中的比赛id
year                |String    |
 */
@Entity
public class DataMatchIdMapped implements Serializable{

    @Id
    private Long id;
    public  Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    private Long matchId;
    public  Long getMatchId() {
        return matchId;
    }
    public void setMatchId(Long matchId) {
        this.matchId = matchId;
    }

    private Long amiscoMatchId;
    public  Long getAmiscoMatchId() {
        return amiscoMatchId;
    }
    public void setAmiscoMatchId(Long amiscoMatchId) {
        this.amiscoMatchId = amiscoMatchId;
    }

    private String year;
    public  String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }

}
