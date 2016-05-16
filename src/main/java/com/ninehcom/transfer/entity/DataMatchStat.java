package com.ninehcom.transfer.entity;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;

import java.util.Date;
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
club_type           |Integer   |球队类型(1:主队,2:客队)
to_shoot            |Integer   |射门次数
in_target           |Integer   |射正球门
miss_goals          |Integer   |射门偏出
hit_woodwork        |Integer   |击中门框
spot_kick           |Integer   |点球次数
pass_times          |Integer   |传球次数
through_pass        |Integer   |直塞球
offside             |Integer   |越位
steal               |Integer   |抢断
free_kick           |Integer   |任意球
corner              |Integer   |角球
out_of_bounds       |Integer   |界外球
pass_compl          |Float     |传球成功率
pass_middle         |Float     |传中成功率
steal_rate          |Float     |抢断成功率
possession          |Float     |控球率
fouls               |Integer   |犯规
red_cards           |Integer   |红牌
yellow_cards        |Integer   |黄牌
injury              |Integer   |受伤
year                |Integer   |年份
created_at          |Date      |
updated_at          |Date      |
pauses              |Integer   |停顿次数
real_match_at       |String    |净比赛时间
running_dis         |Integer   |跑动距离
double_y_cards      |Integer   |双黄牌数
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

    private Integer clubType;
    public  Integer getClubType() {
        return clubType;
    }
    public void setClubType(Integer clubType) {
        this.clubType = clubType;
    }

    private Integer toShoot;
    public  Integer getToShoot() {
        return toShoot;
    }
    public void setToShoot(Integer toShoot) {
        this.toShoot = toShoot;
    }

    private Integer inTarget;
    public  Integer getInTarget() {
        return inTarget;
    }
    public void setInTarget(Integer inTarget) {
        this.inTarget = inTarget;
    }

    private Integer missGoals;
    public  Integer getMissGoals() {
        return missGoals;
    }
    public void setMissGoals(Integer missGoals) {
        this.missGoals = missGoals;
    }

    private Integer hitWoodwork;
    public  Integer getHitWoodwork() {
        return hitWoodwork;
    }
    public void setHitWoodwork(Integer hitWoodwork) {
        this.hitWoodwork = hitWoodwork;
    }

    private Integer spotKick;
    public  Integer getSpotKick() {
        return spotKick;
    }
    public void setSpotKick(Integer spotKick) {
        this.spotKick = spotKick;
    }

    private Integer passTimes;
    public  Integer getPassTimes() {
        return passTimes;
    }
    public void setPassTimes(Integer passTimes) {
        this.passTimes = passTimes;
    }

    private Integer throughPass;
    public  Integer getThroughPass() {
        return throughPass;
    }
    public void setThroughPass(Integer throughPass) {
        this.throughPass = throughPass;
    }

    private Integer offside;
    public  Integer getOffside() {
        return offside;
    }
    public void setOffside(Integer offside) {
        this.offside = offside;
    }

    private Integer steal;
    public  Integer getSteal() {
        return steal;
    }
    public void setSteal(Integer steal) {
        this.steal = steal;
    }

    private Integer freeKick;
    public  Integer getFreeKick() {
        return freeKick;
    }
    public void setFreeKick(Integer freeKick) {
        this.freeKick = freeKick;
    }

    private Integer corner;
    public  Integer getCorner() {
        return corner;
    }
    public void setCorner(Integer corner) {
        this.corner = corner;
    }

    private Integer outOfBounds;
    public  Integer getOutOfBounds() {
        return outOfBounds;
    }
    public void setOutOfBounds(Integer outOfBounds) {
        this.outOfBounds = outOfBounds;
    }

    private Float passCompl;
    public  Float getPassCompl() {
        return passCompl;
    }
    public void setPassCompl(Float passCompl) {
        this.passCompl = passCompl;
    }

    private Float passMiddle;
    public  Float getPassMiddle() {
        return passMiddle;
    }
    public void setPassMiddle(Float passMiddle) {
        this.passMiddle = passMiddle;
    }

    private Float stealRate;
    public  Float getStealRate() {
        return stealRate;
    }
    public void setStealRate(Float stealRate) {
        this.stealRate = stealRate;
    }

    private Float possession;
    public  Float getPossession() {
        return possession;
    }
    public void setPossession(Float possession) {
        this.possession = possession;
    }

    private Integer fouls;
    public  Integer getFouls() {
        return fouls;
    }
    public void setFouls(Integer fouls) {
        this.fouls = fouls;
    }

    private Integer redCards;
    public  Integer getRedCards() {
        return redCards;
    }
    public void setRedCards(Integer redCards) {
        this.redCards = redCards;
    }

    private Integer yellowCards;
    public  Integer getYellowCards() {
        return yellowCards;
    }
    public void setYellowCards(Integer yellowCards) {
        this.yellowCards = yellowCards;
    }

    private Integer injury;
    public  Integer getInjury() {
        return injury;
    }
    public void setInjury(Integer injury) {
        this.injury = injury;
    }

    private Integer year;
    public  Integer getYear() {
        return year;
    }
    public void setYear(Integer year) {
        this.year = year;
    }

    private Date createdAt;
    public  Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    private Date updatedAt;
    public  Date getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    private Integer pauses;
    public  Integer getPauses() {
        return pauses;
    }
    public void setPauses(Integer pauses) {
        this.pauses = pauses;
    }

    private String realMatchAt;
    public  String getRealMatchAt() {
        return realMatchAt;
    }
    public void setRealMatchAt(String realMatchAt) {
        this.realMatchAt = realMatchAt;
    }

    private Integer runningDis;
    public  Integer getRunningDis() {
        return runningDis;
    }
    public void setRunningDis(Integer runningDis) {
        this.runningDis = runningDis;
    }

    private Integer doubleYCards;
    public  Integer getDoubleYCards() {
        return doubleYCards;
    }
    public void setDoubleYCards(Integer doubleYCards) {
        this.doubleYCards = doubleYCards;
    }

}