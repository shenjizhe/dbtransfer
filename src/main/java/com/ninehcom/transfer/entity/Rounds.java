package com.ninehcom.transfer.entity;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;

/**
    名称:Rounds实体类
    描述:轮次
 * @author shenjizhe
 * @version 1.0.0

### 轮次 ###
<A NAME="Rounds">Rounds</A>

名称|类型|描述
-|-|-
Id                  |Integer   |轮次ID
RoundsId            |Integer   |轮次号
Name                |String    |轮次名称
LeagueTypeId        |Integer   |联赛子类型
 */
@Entity
public class Rounds implements Serializable{

    @Id
    private Integer id;
    public  Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    private Integer roundsId;
    public  Integer getRoundsId() {
        return roundsId;
    }
    public void setRoundsId(Integer roundsId) {
        this.roundsId = roundsId;
    }

    private String name;
    public  String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    private Integer leagueTypeId;
    public  Integer getLeagueTypeId() {
        return leagueTypeId;
    }
    public void setLeagueTypeId(Integer leagueTypeId) {
        this.leagueTypeId = leagueTypeId;
    }

}
