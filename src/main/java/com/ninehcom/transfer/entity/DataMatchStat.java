package com.ninehcom.transfer.entity;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;

import java.sql.Timestamp;;

/**
    名称:DataMatchStat实体类
    描述:比赛统计注：数据保存格式: 主场球队/客场球队 如 2/3
 * @author shenjizhe
 * @version 1.0.0

### 比赛统计注：数据保存格式: 主场球队/客场球队 如 2/3 ###
<A NAME="DataMatchStat">DataMatchStat</A>

名称|类型|描述
-|-|-
id                  |Long      |
match_id            |Long      |赛事ID
club_id             |Long      |球队ID FK -> data_club.id
club_type           |String    |球队类型(1:主队,2:客队)
to_shoot            |String    |射门次数
in_target           |String    |射正球门
miss_goals          |String    |射门偏出
hit_woodwork        |String    |击中门框
spot_kick           |String    |点球次数
pass_times          |String    |传球次数
through_pass        |String    |直塞球
offside             |String    |越位
steal               |String    |抢断
free_kick           |String    |任意球
corner              |String    |角球
out_of_bounds       |String    |界外球
pass_compl          |String    |传球成功率
pass_middle         |String    |传中成功率
steal_rate          |String    |抢断成功率
possession          |String    |控球率
fouls               |String    |犯规
red_cards           |String    |红牌
yellow_cards        |String    |黄牌
injury              |String    |受伤
year                |String    |年份
created_at          |Timestamp |
updated_at          |Timestamp |
pauses              |String    |停顿次数
real_match_at       |String    |净比赛时间
running_dis         |String    |跑动距离
double_y_cards      |String    |双黄牌数
 */
@Entity
public class DataMatchStat implements Serializable{

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

    private Long clubId;
    public  Long getClubId() {
        return clubId;
    }
    public void setClubId(Long clubId) {
        this.clubId = clubId;
    }

    private String clubType;
    public  String getClubType() {
        return clubType;
    }
    public void setClubType(String clubType) {
        this.clubType = clubType;
    }

    private String toShoot;
    public  String getToShoot() {
        return toShoot;
    }
    public void setToShoot(String toShoot) {
        this.toShoot = toShoot;
    }

    private String inTarget;
    public  String getInTarget() {
        return inTarget;
    }
    public void setInTarget(String inTarget) {
        this.inTarget = inTarget;
    }

    private String missGoals;
    public  String getMissGoals() {
        return missGoals;
    }
    public void setMissGoals(String missGoals) {
        this.missGoals = missGoals;
    }

    private String hitWoodwork;
    public  String getHitWoodwork() {
        return hitWoodwork;
    }
    public void setHitWoodwork(String hitWoodwork) {
        this.hitWoodwork = hitWoodwork;
    }

    private String spotKick;
    public  String getSpotKick() {
        return spotKick;
    }
    public void setSpotKick(String spotKick) {
        this.spotKick = spotKick;
    }

    private String passTimes;
    public  String getPassTimes() {
        return passTimes;
    }
    public void setPassTimes(String passTimes) {
        this.passTimes = passTimes;
    }

    private String throughPass;
    public  String getThroughPass() {
        return throughPass;
    }
    public void setThroughPass(String throughPass) {
        this.throughPass = throughPass;
    }

    private String offside;
    public  String getOffside() {
        return offside;
    }
    public void setOffside(String offside) {
        this.offside = offside;
    }

    private String steal;
    public  String getSteal() {
        return steal;
    }
    public void setSteal(String steal) {
        this.steal = steal;
    }

    private String freeKick;
    public  String getFreeKick() {
        return freeKick;
    }
    public void setFreeKick(String freeKick) {
        this.freeKick = freeKick;
    }

    private String corner;
    public  String getCorner() {
        return corner;
    }
    public void setCorner(String corner) {
        this.corner = corner;
    }

    private String outOfBounds;
    public  String getOutOfBounds() {
        return outOfBounds;
    }
    public void setOutOfBounds(String outOfBounds) {
        this.outOfBounds = outOfBounds;
    }

    private String passCompl;
    public  String getPassCompl() {
        return passCompl;
    }
    public void setPassCompl(String passCompl) {
        this.passCompl = passCompl;
    }

    private String passMiddle;
    public  String getPassMiddle() {
        return passMiddle;
    }
    public void setPassMiddle(String passMiddle) {
        this.passMiddle = passMiddle;
    }

    private String stealRate;
    public  String getStealRate() {
        return stealRate;
    }
    public void setStealRate(String stealRate) {
        this.stealRate = stealRate;
    }

    private String possession;
    public  String getPossession() {
        return possession;
    }
    public void setPossession(String possession) {
        this.possession = possession;
    }

    private String fouls;
    public  String getFouls() {
        return fouls;
    }
    public void setFouls(String fouls) {
        this.fouls = fouls;
    }

    private String redCards;
    public  String getRedCards() {
        return redCards;
    }
    public void setRedCards(String redCards) {
        this.redCards = redCards;
    }

    private String yellowCards;
    public  String getYellowCards() {
        return yellowCards;
    }
    public void setYellowCards(String yellowCards) {
        this.yellowCards = yellowCards;
    }

    private String injury;
    public  String getInjury() {
        return injury;
    }
    public void setInjury(String injury) {
        this.injury = injury;
    }

    private String year;
    public  String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }

    private Timestamp createdAt;
    public  Timestamp getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    private Timestamp updatedAt;
    public  Timestamp getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    private String pauses;
    public  String getPauses() {
        return pauses;
    }
    public void setPauses(String pauses) {
        this.pauses = pauses;
    }

    private String realMatchAt;
    public  String getRealMatchAt() {
        return realMatchAt;
    }
    public void setRealMatchAt(String realMatchAt) {
        this.realMatchAt = realMatchAt;
    }

    private String runningDis;
    public  String getRunningDis() {
        return runningDis;
    }
    public void setRunningDis(String runningDis) {
        this.runningDis = runningDis;
    }

    private String doubleYCards;
    public  String getDoubleYCards() {
        return doubleYCards;
    }
    public void setDoubleYCards(String doubleYCards) {
        this.doubleYCards = doubleYCards;
    }

}
