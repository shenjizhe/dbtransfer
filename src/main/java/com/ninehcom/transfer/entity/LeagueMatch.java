package com.ninehcom.transfer.entity;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;

import java.util.Date;
/**
    名称:LeagueMatch实体类
    描述:VIEW
 * @author shenjizhe
 * @version 1.0.0

### VIEW ###
<A NAME="LeagueMatch">LeagueMatch</A>

名称|类型|描述
-|-|-
id                  |Long      |唯一主键
kick_at             |Date      |比赛时间(年月日时分)
home_score          |Integer   |主队比分(未开赛则为0)
guest_score         |Integer   |客队比分(未开赛则为0)
home_club_id        |Long      |主队ID   FK -> data_club.id
guest_club_id       |Long      |客队ID   FK -> data_club.id
round               |Integer   |比赛轮次 (用于记录联赛的情况)
round_name          |String    |轮次名称
knockout            |String    |比赛分组(用于记录杯赛的情况,分 pre[预选],a-z[小组]
weekday             |String    |比赛星期(一~日)
stadium             |String    |比赛球馆
league_id           |Long      |所属联赛  FK-> data_league.id
league_sub_id       |Long      |联赛子类型
audiences           |Integer   |观众人数(用于计算上座率)
relative_tag        |String    |(是否需要)相关关联标签(如转播计划,精彩视频等),参见新闻的关联标签设计
year                |String    |联赛年份 (支持不带-的当年和带-的跨年两种格式 注:这里考虑到url的/冲突,避免用/做分隔符)
video_url           |String    |精彩视频转播URL
match_status        |Integer   |比赛是否结束 1:表示结束，2：表示进行中，3：表示未开始，4:比赛延期 默认皆为 3
type_name           |String    |联赛中文简称(中超，亚冠，预备队...),常用,比如:中超联赛
type_full_name      |String    |联赛的全文名称,作为某些情况下的备份,比如:中国足球超级联赛
type_english_name   |String    |英文简称,常用,比如:CSL
type_english_full_name|String    |英文全称,备份,比如:Chinese Super League
type_region_name    |String    |举办地区 (中国,亚洲...)
type                |String    |联赛范围 1:国家级,2:洲级,3:世界级
sub_type_name       |String    |联赛中文简称(中超，亚冠，预备队...),常用,比如:中超联赛
sub_type_full_name  |String    |联赛的全文名称,作为某些情况下的备份,比如:中国足球超级联赛
sub_type_english_name|String    |英文简称,常用,比如:CSL
sub_type_english_full_name|String    |英文全称,备份,比如:Chinese Super League
sub_type_region     |String    |举办地区 (中国,亚洲...)
sub_type            |String    |联赛范围 1:国家级,2:洲级,3:世界级
home_club_name      |String    |队名
home_club_logo      |String    |图片
home_club_english_name|String    |英文名
home_club_full_name |String    |中文全名
home_club_english_full_name|String    |英文全名
home_club_color     |String    |俱乐部主体颜色
guest_club_name     |String    |队名
guest_club_logo     |String    |图片
guest_club_english_name|String    |英文名
guest_club_full_name|String    |中文全名
guest_club_english_full_name|String    |英文全名
guest_club_color    |String    |俱乐部主体颜色
 */
@Entity
public class LeagueMatch implements Serializable{

    @Id
    private Long id;
    public  Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    private Date kickAt;
    public  Date getKickAt() {
        return kickAt;
    }
    public void setKickAt(Date kickAt) {
        this.kickAt = kickAt;
    }

    private Integer homeScore;
    public  Integer getHomeScore() {
        return homeScore;
    }
    public void setHomeScore(Integer homeScore) {
        this.homeScore = homeScore;
    }

    private Integer guestScore;
    public  Integer getGuestScore() {
        return guestScore;
    }
    public void setGuestScore(Integer guestScore) {
        this.guestScore = guestScore;
    }

    private Long homeClubId;
    public  Long getHomeClubId() {
        return homeClubId;
    }
    public void setHomeClubId(Long homeClubId) {
        this.homeClubId = homeClubId;
    }

    private Long guestClubId;
    public  Long getGuestClubId() {
        return guestClubId;
    }
    public void setGuestClubId(Long guestClubId) {
        this.guestClubId = guestClubId;
    }

    private Integer round;
    public  Integer getRound() {
        return round;
    }
    public void setRound(Integer round) {
        this.round = round;
    }

    private String roundName;
    public  String getRoundName() {
        return roundName;
    }
    public void setRoundName(String roundName) {
        this.roundName = roundName;
    }

    private String knockout;
    public  String getKnockout() {
        return knockout;
    }
    public void setKnockout(String knockout) {
        this.knockout = knockout;
    }

    private String weekday;
    public  String getWeekday() {
        return weekday;
    }
    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }

    private String stadium;
    public  String getStadium() {
        return stadium;
    }
    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

    private Long leagueId;
    public  Long getLeagueId() {
        return leagueId;
    }
    public void setLeagueId(Long leagueId) {
        this.leagueId = leagueId;
    }

    private Long leagueSubId;
    public  Long getLeagueSubId() {
        return leagueSubId;
    }
    public void setLeagueSubId(Long leagueSubId) {
        this.leagueSubId = leagueSubId;
    }

    private Integer audiences;
    public  Integer getAudiences() {
        return audiences;
    }
    public void setAudiences(Integer audiences) {
        this.audiences = audiences;
    }

    private String relativeTag;
    public  String getRelativeTag() {
        return relativeTag;
    }
    public void setRelativeTag(String relativeTag) {
        this.relativeTag = relativeTag;
    }

    private String year;
    public  String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }

    private String videoUrl;
    public  String getVideoUrl() {
        return videoUrl;
    }
    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    private Integer matchStatus;
    public  Integer getMatchStatus() {
        return matchStatus;
    }
    public void setMatchStatus(Integer matchStatus) {
        this.matchStatus = matchStatus;
    }

    private String typeName;
    public  String getTypeName() {
        return typeName;
    }
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    private String typeFullName;
    public  String getTypeFullName() {
        return typeFullName;
    }
    public void setTypeFullName(String typeFullName) {
        this.typeFullName = typeFullName;
    }

    private String typeEnglishName;
    public  String getTypeEnglishName() {
        return typeEnglishName;
    }
    public void setTypeEnglishName(String typeEnglishName) {
        this.typeEnglishName = typeEnglishName;
    }

    private String typeEnglishFullName;
    public  String getTypeEnglishFullName() {
        return typeEnglishFullName;
    }
    public void setTypeEnglishFullName(String typeEnglishFullName) {
        this.typeEnglishFullName = typeEnglishFullName;
    }

    private String typeRegionName;
    public  String getTypeRegionName() {
        return typeRegionName;
    }
    public void setTypeRegionName(String typeRegionName) {
        this.typeRegionName = typeRegionName;
    }

    private String type;
    public  String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    private String subTypeName;
    public  String getSubTypeName() {
        return subTypeName;
    }
    public void setSubTypeName(String subTypeName) {
        this.subTypeName = subTypeName;
    }

    private String subTypeFullName;
    public  String getSubTypeFullName() {
        return subTypeFullName;
    }
    public void setSubTypeFullName(String subTypeFullName) {
        this.subTypeFullName = subTypeFullName;
    }

    private String subTypeEnglishName;
    public  String getSubTypeEnglishName() {
        return subTypeEnglishName;
    }
    public void setSubTypeEnglishName(String subTypeEnglishName) {
        this.subTypeEnglishName = subTypeEnglishName;
    }

    private String subTypeEnglishFullName;
    public  String getSubTypeEnglishFullName() {
        return subTypeEnglishFullName;
    }
    public void setSubTypeEnglishFullName(String subTypeEnglishFullName) {
        this.subTypeEnglishFullName = subTypeEnglishFullName;
    }

    private String subTypeRegion;
    public  String getSubTypeRegion() {
        return subTypeRegion;
    }
    public void setSubTypeRegion(String subTypeRegion) {
        this.subTypeRegion = subTypeRegion;
    }

    private String subType;
    public  String getSubType() {
        return subType;
    }
    public void setSubType(String subType) {
        this.subType = subType;
    }

    private String homeClubName;
    public  String getHomeClubName() {
        return homeClubName;
    }
    public void setHomeClubName(String homeClubName) {
        this.homeClubName = homeClubName;
    }

    private String homeClubLogo;
    public  String getHomeClubLogo() {
        return homeClubLogo;
    }
    public void setHomeClubLogo(String homeClubLogo) {
        this.homeClubLogo = homeClubLogo;
    }

    private String homeClubEnglishName;
    public  String getHomeClubEnglishName() {
        return homeClubEnglishName;
    }
    public void setHomeClubEnglishName(String homeClubEnglishName) {
        this.homeClubEnglishName = homeClubEnglishName;
    }

    private String homeClubFullName;
    public  String getHomeClubFullName() {
        return homeClubFullName;
    }
    public void setHomeClubFullName(String homeClubFullName) {
        this.homeClubFullName = homeClubFullName;
    }

    private String homeClubEnglishFullName;
    public  String getHomeClubEnglishFullName() {
        return homeClubEnglishFullName;
    }
    public void setHomeClubEnglishFullName(String homeClubEnglishFullName) {
        this.homeClubEnglishFullName = homeClubEnglishFullName;
    }

    private String homeClubColor;
    public  String getHomeClubColor() {
        return homeClubColor;
    }
    public void setHomeClubColor(String homeClubColor) {
        this.homeClubColor = homeClubColor;
    }

    private String guestClubName;
    public  String getGuestClubName() {
        return guestClubName;
    }
    public void setGuestClubName(String guestClubName) {
        this.guestClubName = guestClubName;
    }

    private String guestClubLogo;
    public  String getGuestClubLogo() {
        return guestClubLogo;
    }
    public void setGuestClubLogo(String guestClubLogo) {
        this.guestClubLogo = guestClubLogo;
    }

    private String guestClubEnglishName;
    public  String getGuestClubEnglishName() {
        return guestClubEnglishName;
    }
    public void setGuestClubEnglishName(String guestClubEnglishName) {
        this.guestClubEnglishName = guestClubEnglishName;
    }

    private String guestClubFullName;
    public  String getGuestClubFullName() {
        return guestClubFullName;
    }
    public void setGuestClubFullName(String guestClubFullName) {
        this.guestClubFullName = guestClubFullName;
    }

    private String guestClubEnglishFullName;
    public  String getGuestClubEnglishFullName() {
        return guestClubEnglishFullName;
    }
    public void setGuestClubEnglishFullName(String guestClubEnglishFullName) {
        this.guestClubEnglishFullName = guestClubEnglishFullName;
    }

    private String guestClubColor;
    public  String getGuestClubColor() {
        return guestClubColor;
    }
    public void setGuestClubColor(String guestClubColor) {
        this.guestClubColor = guestClubColor;
    }

}
