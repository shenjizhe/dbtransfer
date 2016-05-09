/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ninehcom.transfer.controller;

import com.ninehcom.common.enums.ErrorCode;
import com.ninehcom.common.util.Result;
import com.ninehcom.transfer.transfer.ClubHistoryTransfer;
import com.ninehcom.transfer.transfer.ClubTransfer;
import com.ninehcom.transfer.transfer.CoachTransfer;
import com.ninehcom.transfer.transfer.PlayerTransfer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Administrator
 */
@RestController
@RequestMapping(value = "/transfer")
public class Controller {
    @Autowired
    ClubTransfer clubTransfer;
    
    @Autowired
    ClubHistoryTransfer clubHistoryTransfer;
    
    @Autowired
    PlayerTransfer playerTransfer;
    
    @Autowired
    CoachTransfer coachTransfer;
    
    @RequestMapping(value = "/1.trans-team", method = RequestMethod.GET)
    @ResponseBody
    public Result transTeam() {
        return clubTransfer.trans();
    }
    
    @RequestMapping(value = "/2.trans-team-history", method = RequestMethod.GET)
    @ResponseBody
    public Result transTeamHistory() {
        return clubHistoryTransfer.trans();
    }
    
    @RequestMapping(value = "/3.trans-player", method = RequestMethod.GET)
    @ResponseBody
    public Result transPlayer() {
        //因为球员重名现象严重，无法映射两个系统的球员数据，因此留下1863个数据的中超数据，补录俱乐部相关球员信息（422总-244重复=178个球员数据）
        //return Result.Fail(ErrorCode.Fail);
        return playerTransfer.trans();
    }
    
    @RequestMapping(value = "/5.trans-coach", method = RequestMethod.GET)
    @ResponseBody
    public Result coachPlayer() {
        return coachTransfer.trans();
    }
}
