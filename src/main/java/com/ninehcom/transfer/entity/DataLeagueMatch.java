package com.ninehcom.transfer.entity;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;

import java.util.Date;
/**
    名称:DataLeagueMatch实体类
    描述:赛程
 * @author shenjizhe
 * @version 1.0.0

### 赛程 ###
<A NAME="DataLeagueMatch">DataLeagueMatch</A>

名称|类型|描述
-|-|-
id                  |Long      |唯一主键
kick_at             |Date      |比赛时间(年月日时分)
home_score          |Integer   |主队比分(未开赛则为0)
guest_score         |Integer   |客队比分(未开赛则为0)
home_club_id        |Long      |主队ID   FK -> data_club.id
home_club_history_id|Long      |主队历史ID
guest_club_id       |Long      |客队ID   FK -> data_club.id
guest_club_history_id|Long      |客队历史ID
round               |Integer   |比赛轮次 (用于记录联赛的情况)
knockout            |String    |比赛分组(用于记录杯赛的情况,分 pre[预选],a-z[小组]
weekday             |String    |比赛星期(一~日)
stadium             |String    |比赛球馆
league_id           |Long      |所属联赛  FK-> data_league.id
league_sub_id       |Long      |联赛子类型
audiences           |Integer   |观众人数(用于计算上座率)
relative_tag        |String    |(是否需要)相关关联标签(如转播计划,精彩视频等),参见新闻的关联标签设计
video_url           |String    |精彩视频转播URL
year                |String    |联赛年份 (支持不带-的当年和带-的跨年两种格式 注:这里考虑到url的/冲突,避免用/做分隔符)
match_status        |Integer   |比赛是否结束 1:表示结束，2：表示进行中，3：表示未开始，4:比赛延期 默认皆为 3
created_at          |Date      |
updated_at          |Date      |
 */
@Entity
public class DataLeagueMatch implements Serializable{

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

    private Long homeClubHistoryId;
    public  Long getHomeClubHistoryId() {
        return homeClubHistoryId;
    }
    public void setHomeClubHistoryId(Long homeClubHistoryId) {
        this.homeClubHistoryId = homeClubHistoryId;
    }

    private Long guestClubId;
    public  Long getGuestClubId() {
        return guestClubId;
    }
    public void setGuestClubId(Long guestClubId) {
        this.guestClubId = guestClubId;
    }

    private Long guestClubHistoryId;
    public  Long getGuestClubHistoryId() {
        return guestClubHistoryId;
    }
    public void setGuestClubHistoryId(Long guestClubHistoryId) {
        this.guestClubHistoryId = guestClubHistoryId;
    }

    private Integer round;
    public  Integer getRound() {
        return round;
    }
    public void setRound(Integer round) {
        this.round = round;
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

    private String videoUrl;
    public  String getVideoUrl() {
        return videoUrl;
    }
    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    private Integer year;
    public  Integer getYear() {
        return year;
    }
    public void setYear(Integer year) {
        this.year = year;
    }

    private Integer matchStatus;
    public  Integer getMatchStatus() {
        return matchStatus;
    }
    public void setMatchStatus(Integer matchStatus) {
        this.matchStatus = matchStatus;
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

}
