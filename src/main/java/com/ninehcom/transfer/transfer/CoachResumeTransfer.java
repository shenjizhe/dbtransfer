/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ninehcom.transfer.transfer;

import com.ninehcom.common.util.Result;
import com.ninehcom.transfer.entity.CoachHistory;
import com.ninehcom.transfer.entity.Coachresume;
import com.ninehcom.transfer.interfaces.IMapper;
import com.ninehcom.transfer.interfaces.ITransfer;
import com.ninehcom.transfer.mapper.CoachHistoryMapper;
import com.ninehcom.transfer.mapper.CoachMappingMapper;
import com.ninehcom.transfer.mapper.CoachresumeMapper;
import com.ninehcom.transfer.mapper.TranslogMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Shenjizhe
 */
@Service
public class CoachResumeTransfer extends TransferBase<Coachresume, CoachHistory> implements ITransfer {

    @Autowired
    CoachresumeMapper coachresumeMapper;
    @Autowired
    CoachHistoryMapper coachHistoryMapper;
    @Autowired
    CoachMappingMapper coachMappingMapper;
    @Autowired
    TranslogMapper translogMapper;

    @Override
    public CoachHistory CreateDestination(Coachresume source, int id) {
        CoachHistory history = new CoachHistory();
        history.setId((long) id);
        history.setCoachId(source.getCoachId().longValue());
        history.setCoachName(source.getCoachName());
        history.setLeagueName(source.getLeagueName());
        history.setClubName(source.getTeamName());
        history.setYear(source.getStartYear());
        history.setEndYear(source.getEndYear());
        history.setHonors(source.getHonors());
        history.setCreateAt(source.getCreateTime());
        history.setUpdateAt(source.getUpdateTime());
        return history;
    }

    @Override
    public void AddSameDataMapping(Coachresume obj1, CoachHistory obj2) {

    }

    @Override
    public void AddDiffDataMapping(Coachresume obj1, CoachHistory obj2) {
        coachHistoryMapper.insertCoachHistory(obj2);
    }

    @Override
    public int getDestinationMaxId() {
        return coachHistoryMapper.getMax();
    }

    @Override
    public TranslogMapper getTranslogger() {
        return translogMapper;
    }

    @Override
    public IMapper getReseter() {
        return coachMappingMapper;
    }

    @Override
    public Result trans() {
        List<Coachresume> coachResumeList = coachresumeMapper.selectAllCoachresume();
        List<CoachHistory> coachHistoryList = coachHistoryMapper.selectAllCoachHistory();

        return trans(Coachresume.class, CoachHistory.class, coachResumeList, coachHistoryList, "coachresume", "coach_history", "getCoachId,getStartYear", "getCoachId,getYear");
    }

}
