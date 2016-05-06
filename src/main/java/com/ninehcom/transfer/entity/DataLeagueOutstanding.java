package com.ninehcom.transfer.entity;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;

import java.util.Date;
/**
    名称:DataLeagueOutstanding实体类
    描述:历史数据-中超历年最佳
 * @author shenjizhe
 * @version 1.0.0

### 历史数据-中超历年最佳 ###
<A NAME="DataLeagueOutstanding">DataLeagueOutstanding</A>

名称|类型|描述
-|-|-
id                  |Long      |
content_url         |String    |// H5页面URL (包含以下信息的页面)
league_id           |Long      |联赛id
player_id           |Long      |最佳球员  FK -> data_league_player.id
judge_id            |Long      |最佳裁判  FK -> data_league_judge.id 
fish_id             |Long      |最佳新人  FK -> data_league_player.id
coach_id            |Long      |最佳教练 (FK -> data_league_coach.id)
lineUp              |String    |最佳阵容(一张阵容图的URL)
league_name         |String    |联赛名称
player_name         |String    |最佳球员姓名
judge_name          |String    |裁判姓名
judge_region        |String    |裁判地区(直辖市/省级的粒度)
judge_birth         |Date      |裁判出生年月
fish_name           |String    |新人姓名
coach_name          |String    |教练姓名
year                |String    |
player_re_club_name |String    |最佳球员所属俱乐部名称
player_re_club_logo |String    |最佳球员所属俱乐部logo
player_number       |Integer   |最佳球员号码
fish_re_club_name   |String    |新人所属俱乐部名称
fish_re_club_logo   |String    |新人所属俱乐部logo
fish_number         |Integer   |新人球员号码
coach_re_club_name  |String    |教练所属俱乐部名称
coach_re_club_logo  |String    |教练所属俱乐部logo
created_at          |Date      |
updated_at          |Date      |
 */
@Entity
public class DataLeagueOutstanding implements Serializable{

    @Id
    private Long id;
    public  Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    private String contentUrl;
    public  String getContentUrl() {
        return contentUrl;
    }
    public void setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
    }

    private Long leagueId;
    public  Long getLeagueId() {
        return leagueId;
    }
    public void setLeagueId(Long leagueId) {
        this.leagueId = leagueId;
    }

    private Long playerId;
    public  Long getPlayerId() {
        return playerId;
    }
    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    private Long judgeId;
    public  Long getJudgeId() {
        return judgeId;
    }
    public void setJudgeId(Long judgeId) {
        this.judgeId = judgeId;
    }

    private Long fishId;
    public  Long getFishId() {
        return fishId;
    }
    public void setFishId(Long fishId) {
        this.fishId = fishId;
    }

    private Long coachId;
    public  Long getCoachId() {
        return coachId;
    }
    public void setCoachId(Long coachId) {
        this.coachId = coachId;
    }

    private String lineUp;
    public  String getLineUp() {
        return lineUp;
    }
    public void setLineUp(String lineUp) {
        this.lineUp = lineUp;
    }

    private String leagueName;
    public  String getLeagueName() {
        return leagueName;
    }
    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    private String playerName;
    public  String getPlayerName() {
        return playerName;
    }
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    private String judgeName;
    public  String getJudgeName() {
        return judgeName;
    }
    public void setJudgeName(String judgeName) {
        this.judgeName = judgeName;
    }

    private String judgeRegion;
    public  String getJudgeRegion() {
        return judgeRegion;
    }
    public void setJudgeRegion(String judgeRegion) {
        this.judgeRegion = judgeRegion;
    }

    private Date judgeBirth;
    public  Date getJudgeBirth() {
        return judgeBirth;
    }
    public void setJudgeBirth(Date judgeBirth) {
        this.judgeBirth = judgeBirth;
    }

    private String fishName;
    public  String getFishName() {
        return fishName;
    }
    public void setFishName(String fishName) {
        this.fishName = fishName;
    }

    private String coachName;
    public  String getCoachName() {
        return coachName;
    }
    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }

    private String year;
    public  String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }

    private String playerReClubName;
    public  String getPlayerReClubName() {
        return playerReClubName;
    }
    public void setPlayerReClubName(String playerReClubName) {
        this.playerReClubName = playerReClubName;
    }

    private String playerReClubLogo;
    public  String getPlayerReClubLogo() {
        return playerReClubLogo;
    }
    public void setPlayerReClubLogo(String playerReClubLogo) {
        this.playerReClubLogo = playerReClubLogo;
    }

    private Integer playerNumber;
    public  Integer getPlayerNumber() {
        return playerNumber;
    }
    public void setPlayerNumber(Integer playerNumber) {
        this.playerNumber = playerNumber;
    }

    private String fishReClubName;
    public  String getFishReClubName() {
        return fishReClubName;
    }
    public void setFishReClubName(String fishReClubName) {
        this.fishReClubName = fishReClubName;
    }

    private String fishReClubLogo;
    public  String getFishReClubLogo() {
        return fishReClubLogo;
    }
    public void setFishReClubLogo(String fishReClubLogo) {
        this.fishReClubLogo = fishReClubLogo;
    }

    private Integer fishNumber;
    public  Integer getFishNumber() {
        return fishNumber;
    }
    public void setFishNumber(Integer fishNumber) {
        this.fishNumber = fishNumber;
    }

    private String coachReClubName;
    public  String getCoachReClubName() {
        return coachReClubName;
    }
    public void setCoachReClubName(String coachReClubName) {
        this.coachReClubName = coachReClubName;
    }

    private String coachReClubLogo;
    public  String getCoachReClubLogo() {
        return coachReClubLogo;
    }
    public void setCoachReClubLogo(String coachReClubLogo) {
        this.coachReClubLogo = coachReClubLogo;
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
