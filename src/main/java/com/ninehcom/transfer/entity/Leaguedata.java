package com.ninehcom.transfer.entity;

import com.ninehcom.transfer.interfaces.IReset;
import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;

import java.util.Date;
/**
    名称:Leaguedata实体类
    描述:赛事数据
 * @author shenjizhe
 * @version 1.0.0

### 赛事数据 ###
<A NAME="Leaguedata">Leaguedata</A>

名称|类型|描述
-|-|-
Id                  |Integer   |逻辑主键
LeagueCalendarId    |Integer   |leaguecalendar表 Id （赛事Id）
LeagueTeamTypeId    |Integer   |leagueteamtype表 Id （主客）
TeamId              |Integer   |team表 Id
ColorValue          |String    |色值
ShootTimes          |Integer   |射门次数
ShootInTimes        |Integer   |射正次数
ShootOutTimes       |Integer   |射偏次数
HitTimes            |Integer   |击中门框次数
PenaltyTimes        |Integer   |点球次数
PassTimes           |Integer   |传球次数
StraightTimes       |Integer   |直塞球次数
OffsideTimes        |Integer   |越位次数
StealTimes          |Integer   |抢断次数
FreeKickTimes       |Integer   |任意球次数
CornerTimes         |Integer   |角球次数
ThrowInTimes        |Integer   |界外球次数
PassRate            |Float     |传球成功率
PassCenterRate      |Float     |传中成功率
StealRate           |Float     |抢断成功率
ControllRate        |Float     |控球率
FoulTimes           |Integer   |犯规次数
YellowTimes         |Integer   |黄牌次数
RedTimes            |Integer   |红牌次数
HurtTimes           |Integer   |受伤次数
Years               |Integer   |年份
CreateTime          |Date      |
UpdateTime          |Date      |
 */
@Entity
public class Leaguedata implements Serializable,IReset{

    @Id
    private Integer id;
    public  Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    private Integer leagueCalendarId;
    public  Integer getLeagueCalendarId() {
        return leagueCalendarId;
    }
    public void setLeagueCalendarId(Integer leagueCalendarId) {
        this.leagueCalendarId = leagueCalendarId;
    }

    private Integer leagueTeamTypeId;
    public  Integer getLeagueTeamTypeId() {
        return leagueTeamTypeId;
    }
    public void setLeagueTeamTypeId(Integer leagueTeamTypeId) {
        this.leagueTeamTypeId = leagueTeamTypeId;
    }

    private Integer teamId;
    public  Integer getTeamId() {
        return teamId;
    }
    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    private String colorValue;
    public  String getColorValue() {
        return colorValue;
    }
    public void setColorValue(String colorValue) {
        this.colorValue = colorValue;
    }

    private Integer shootTimes;
    public  Integer getShootTimes() {
        return shootTimes;
    }
    public void setShootTimes(Integer shootTimes) {
        this.shootTimes = shootTimes;
    }

    private Integer shootInTimes;
    public  Integer getShootInTimes() {
        return shootInTimes;
    }
    public void setShootInTimes(Integer shootInTimes) {
        this.shootInTimes = shootInTimes;
    }

    private Integer shootOutTimes;
    public  Integer getShootOutTimes() {
        return shootOutTimes;
    }
    public void setShootOutTimes(Integer shootOutTimes) {
        this.shootOutTimes = shootOutTimes;
    }

    private Integer hitTimes;
    public  Integer getHitTimes() {
        return hitTimes;
    }
    public void setHitTimes(Integer hitTimes) {
        this.hitTimes = hitTimes;
    }

    private Integer penaltyTimes;
    public  Integer getPenaltyTimes() {
        return penaltyTimes;
    }
    public void setPenaltyTimes(Integer penaltyTimes) {
        this.penaltyTimes = penaltyTimes;
    }

    private Integer passTimes;
    public  Integer getPassTimes() {
        return passTimes;
    }
    public void setPassTimes(Integer passTimes) {
        this.passTimes = passTimes;
    }

    private Integer straightTimes;
    public  Integer getStraightTimes() {
        return straightTimes;
    }
    public void setStraightTimes(Integer straightTimes) {
        this.straightTimes = straightTimes;
    }

    private Integer offsideTimes;
    public  Integer getOffsideTimes() {
        return offsideTimes;
    }
    public void setOffsideTimes(Integer offsideTimes) {
        this.offsideTimes = offsideTimes;
    }

    private Integer stealTimes;
    public  Integer getStealTimes() {
        return stealTimes;
    }
    public void setStealTimes(Integer stealTimes) {
        this.stealTimes = stealTimes;
    }

    private Integer freeKickTimes;
    public  Integer getFreeKickTimes() {
        return freeKickTimes;
    }
    public void setFreeKickTimes(Integer freeKickTimes) {
        this.freeKickTimes = freeKickTimes;
    }

    private Integer cornerTimes;
    public  Integer getCornerTimes() {
        return cornerTimes;
    }
    public void setCornerTimes(Integer cornerTimes) {
        this.cornerTimes = cornerTimes;
    }

    private Integer throwInTimes;
    public  Integer getThrowInTimes() {
        return throwInTimes;
    }
    public void setThrowInTimes(Integer throwInTimes) {
        this.throwInTimes = throwInTimes;
    }

    private Float passRate;
    public  Float getPassRate() {
        return passRate;
    }
    public void setPassRate(Float passRate) {
        this.passRate = passRate;
    }

    private Float passCenterRate;
    public  Float getPassCenterRate() {
        return passCenterRate;
    }
    public void setPassCenterRate(Float passCenterRate) {
        this.passCenterRate = passCenterRate;
    }

    private Float stealRate;
    public  Float getStealRate() {
        return stealRate;
    }
    public void setStealRate(Float stealRate) {
        this.stealRate = stealRate;
    }

    private Float controllRate;
    public  Float getControllRate() {
        return controllRate;
    }
    public void setControllRate(Float controllRate) {
        this.controllRate = controllRate;
    }

    private Integer foulTimes;
    public  Integer getFoulTimes() {
        return foulTimes;
    }
    public void setFoulTimes(Integer foulTimes) {
        this.foulTimes = foulTimes;
    }

    private Integer yellowTimes;
    public  Integer getYellowTimes() {
        return yellowTimes;
    }
    public void setYellowTimes(Integer yellowTimes) {
        this.yellowTimes = yellowTimes;
    }

    private Integer redTimes;
    public  Integer getRedTimes() {
        return redTimes;
    }
    public void setRedTimes(Integer redTimes) {
        this.redTimes = redTimes;
    }

    private Integer hurtTimes;
    public  Integer getHurtTimes() {
        return hurtTimes;
    }
    public void setHurtTimes(Integer hurtTimes) {
        this.hurtTimes = hurtTimes;
    }

    private Integer years;
    public  Integer getYears() {
        return years;
    }
    public void setYears(Integer years) {
        this.years = years;
    }

    private Date createTime;
    public  Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    private Date updateTime;
    public  Date getUpdateTime() {
        return updateTime;
    }
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public Integer get() {
        return leagueCalendarId;
    }

    @Override
    public void set(Integer v) {
        leagueCalendarId = v;
    }

}
