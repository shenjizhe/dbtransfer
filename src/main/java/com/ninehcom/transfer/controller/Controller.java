/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ninehcom.transfer.controller;

import com.ninehcom.common.util.Result;
import com.ninehcom.transfer.transfer.AssistRankTransfer;
import com.ninehcom.transfer.transfer.ClubHistoryTransfer;
import com.ninehcom.transfer.transfer.ClubTransfer;
import com.ninehcom.transfer.transfer.CoachHistoryTransfer;
import com.ninehcom.transfer.transfer.CoachResumeTransfer;
import com.ninehcom.transfer.transfer.CoachTransfer;
import com.ninehcom.transfer.transfer.LeagueMatchTransfer;
import com.ninehcom.transfer.transfer.LineupTransfer;
import com.ninehcom.transfer.transfer.MatchDataTransfer;
import com.ninehcom.transfer.transfer.MatchEventTransfer;
import com.ninehcom.transfer.transfer.PlayerHistoryTransfer;
import com.ninehcom.transfer.transfer.PlayerTransfer;
import com.ninehcom.transfer.transfer.ShooterRankTransfer;
import com.ninehcom.transfer.transfer.UserPlayerReleationTransfer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Shenjizhe
 */
@RestController
@RequestMapping(value = "/1.trans-all-data")
public class Controller {

    @Autowired
    ClubTransfer clubTransfer;
    @Autowired
    ClubHistoryTransfer clubHistoryTransfer;
    @Autowired
    PlayerTransfer playerTransfer;
    @Autowired
    PlayerHistoryTransfer playerHistoryTransfer;
    @Autowired
    CoachTransfer coachTransfer;
    @Autowired
    CoachHistoryTransfer coachHistoryTransfer;
    @Autowired
    CoachResumeTransfer coachResumeTransfer;
    @Autowired
    LeagueMatchTransfer leagueMatchTransfer;
    @Autowired
    MatchEventTransfer matchEventTransfer;
    @Autowired
    ShooterRankTransfer shooterRankTransfer;
    @Autowired
    AssistRankTransfer assistRankTransfer;
    @Autowired
    LineupTransfer lineupTransfer;
    @Autowired
    MatchDataTransfer matchDataTransfer;
    @Autowired
    UserPlayerReleationTransfer userPlayerReleationTransfer;

    @RequestMapping(value = "/01.trans-team", method = RequestMethod.GET)
    @ResponseBody
    public Result transTeam() {
        return clubTransfer.trans();
    }

    @RequestMapping(value = "/02.trans-team-history", method = RequestMethod.GET)
    @ResponseBody
    public Result transTeamHistory() {
        return clubHistoryTransfer.trans();
    }

    @RequestMapping(value = "/03.trans-player", method = RequestMethod.GET)
    @ResponseBody
    public Result transPlayer() {
        //因为球员重名现象严重，无法映射两个系统的球员数据，因此留下1863个数据的中超数据，补录俱乐部相关球员信息（422总-244重复=178个球员数据）
        //return Result.Fail(ErrorCode.Fail);
        return playerTransfer.trans();
    }

    @RequestMapping(value = "/04.trans-player-history", method = RequestMethod.GET)
    @ResponseBody
    public Result transPlayerHistory() {
        return playerHistoryTransfer.trans();
    }

    @RequestMapping(value = "/05.trans-coach", method = RequestMethod.GET)
    @ResponseBody
    public Result transCoach() {
        return coachTransfer.trans();
    }

    @RequestMapping(value = "/06.trans-coach-history", method = RequestMethod.GET)
    @ResponseBody
    public Result transCoachHistory() {
        return coachHistoryTransfer.trans();
    }

    @RequestMapping(value = "/07.trans-coach-resume", method = RequestMethod.GET)
    @ResponseBody
    public Result transCoachResume() {
        return coachResumeTransfer.trans();
    }

    @RequestMapping(value = "/08.trans-match", method = RequestMethod.GET)
    @ResponseBody
    public Result transMatch() {
        return leagueMatchTransfer.trans();
    }

    @RequestMapping(value = "/09.trans-match-event", method = RequestMethod.GET)
    @ResponseBody
    public Result transMatchEvent() {
        return matchEventTransfer.trans();
    }

    @RequestMapping(value = "/10.trans-match-rank-goal", method = RequestMethod.GET)
    @ResponseBody
    public Result transRankGoal() {
        return shooterRankTransfer.trans();
    }

    @RequestMapping(value = "/11.trans-match-rank-assist", method = RequestMethod.GET)
    @ResponseBody
    public Result transRankAssist() {
        return assistRankTransfer.trans();
    }

    @RequestMapping(value = "/12.trans-match-data", method = RequestMethod.GET)
    @ResponseBody
    public Result transMatchData() {
        return matchDataTransfer.trans();
    }

    @RequestMapping(value = "/13.trans-match-line", method = RequestMethod.GET)
    @ResponseBody
    public Result transLineup() {
        return lineupTransfer.trans();
    }

    @RequestMapping(value = "/14.trans-user-player", method = RequestMethod.GET)
    @ResponseBody
    public Result userPlayerReleasion() {
        return userPlayerReleationTransfer.trans();
    }
}
