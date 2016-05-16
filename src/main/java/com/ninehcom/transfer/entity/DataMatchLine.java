package com.ninehcom.transfer.entity;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;
import java.util.Date;

/**
 * 名称:DataMatchLine实体类 描述:比赛阵容
 *
 * @author shenjizhe
 * @version 1.0.0
 *
 * ### 比赛阵容 ###
 * <A NAME="DataMatchLine">DataMatchLine</A>
 *
名称|类型|描述 -|-|- id |Long |比赛阵容唯一主键 match_id |Long |赛事ID FK -> data_match.id
 * home_club_id |Long |主队ID FK -> data_club.id guest_club_id |Long |客队ID FK ->
 * data_club.id line_url |String |比赛球队阵容图URL home_line_url |String |主队阵容图(半场)
 * guest_line_url |String |客队阵容图(半场) home_line |String |主队阵型 guest_line |String
 * | 客队阵型 year |Integer |比赛年份 created_at |Timestamp | updated_at |Timestamp |
 */
@Entity
public class DataMatchLine implements Serializable {

    @Id
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private Long matchId;

    public Long getMatchId() {
        return matchId;
    }

    public void setMatchId(Long matchId) {
        this.matchId = matchId;
    }

    private Long homeClubId;

    public Long getHomeClubId() {
        return homeClubId;
    }

    public void setHomeClubId(Long homeClubId) {
        this.homeClubId = homeClubId;
    }

    private Long guestClubId;

    public Long getGuestClubId() {
        return guestClubId;
    }

    public void setGuestClubId(Long guestClubId) {
        this.guestClubId = guestClubId;
    }

    private String lineUrl;

    public String getLineUrl() {
        return lineUrl;
    }

    public void setLineUrl(String lineUrl) {
        this.lineUrl = lineUrl;
    }

    private String homeLineUrl;

    public String getHomeLineUrl() {
        return homeLineUrl;
    }

    public void setHomeLineUrl(String homeLineUrl) {
        this.homeLineUrl = homeLineUrl;
    }

    private String guestLineUrl;

    public String getGuestLineUrl() {
        return guestLineUrl;
    }

    public void setGuestLineUrl(String guestLineUrl) {
        this.guestLineUrl = guestLineUrl;
    }

    private String homeLine;

    public String getHomeLine() {
        return homeLine;
    }

    public void setHomeLine(String homeLine) {
        this.homeLine = homeLine;
    }

    private String guestLine;

    public String getGuestLine() {
        return guestLine;
    }

    public void setGuestLine(String guestLine) {
        this.guestLine = guestLine;
    }

    private Integer year;

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    private Date createdAt;

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    private Date updatedAt;

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

}
