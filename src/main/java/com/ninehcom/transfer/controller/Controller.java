/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ninehcom.transfer.controller;

import com.ninehcom.common.util.Result;
import com.ninehcom.transfer.transfer.ClubHistoryTransfer;
import com.ninehcom.transfer.transfer.ClubTransfer;
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
}
