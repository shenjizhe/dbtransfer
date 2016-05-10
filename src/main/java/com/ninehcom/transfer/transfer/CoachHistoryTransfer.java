/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ninehcom.transfer.transfer;

import com.ninehcom.common.util.Result;
import com.ninehcom.transfer.entity.ClubHistoryMapping;
import com.ninehcom.transfer.entity.ClubMapping;
import com.ninehcom.transfer.entity.CoachHistoryData;
import com.ninehcom.transfer.entity.CoachHistoryMapping;
import com.ninehcom.transfer.entity.DataCoachReClub;
import com.ninehcom.transfer.interfaces.IMapper;
import com.ninehcom.transfer.interfaces.ITransfer;
import com.ninehcom.transfer.mapper.ClubHistoryMappingMapper;
import com.ninehcom.transfer.mapper.ClubMappingMapper;
import com.ninehcom.transfer.mapper.CoachHistoryDataMapper;
import com.ninehcom.transfer.mapper.CoachHistoryMappingMapper;
import com.ninehcom.transfer.mapper.CoachMappingMapper;
import com.ninehcom.transfer.mapper.DataCoachReClubMapper;
import com.ninehcom.transfer.mapper.TranslogMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Shenjizhe
 */
@Service
public class CoachHistoryTransfer extends TransferBase<CoachHistoryData, DataCoachReClub> implements ITransfer {

    @Autowired
    CoachHistoryDataMapper coachHistoryDataMapper;
    @Autowired
    DataCoachReClubMapper dataCoachReClubMapper;
    @Autowired
    ClubMappingMapper clubMappingMapper;
    @Autowired
    ClubHistoryMappingMapper clubHistoryMappingMapper;
    @Autowired
    CoachHistoryMappingMapper coachHistoryMappingMapper;
    @Autowired
    CoachMappingMapper coachMappingMapper;
    @Autowired
    private TranslogMapper translogMapper;

    @Override
    public DataCoachReClub CreateDestination(CoachHistoryData source, int id) {
        DataCoachReClub coach = new DataCoachReClub();
        coach.setId((long) id);
        ClubMapping clubMapping = clubMappingMapper.selectClubMappingById(source.getTeamId().intValue());
        long clubId = clubMapping.getClubId();
        coach.setClubId(clubId);
        ClubHistoryMapping clubHistoryMapping = clubHistoryMappingMapper.selectClubHistoryMappingById(source.getTeamHistoryId().intValue());
        long clubHistoryId = clubHistoryMapping.getClubHistoryId();
        coach.setClubHistoryId(clubHistoryId);
        coach.setYear(source.getYears());
        coach.setAvatar(source.getLogo());
        coach.setType(source.getCoachTypeId());
        coach.setTypeName(source.getCoachTypeName());
        coach.setCreatedAt(source.getCreateTime());
        coach.setUpdatedAt(source.getUpdateTime());
        coach.setCoachId(source.getCoachId().longValue());
        coach.setIsLastServed("1");
        return coach;
    }

    @Override
    public void AddSameDataMapping(CoachHistoryData obj1, DataCoachReClub obj2) {
        CoachHistoryMapping mapping = new CoachHistoryMapping(obj1.getId(), obj2.getId());
        coachHistoryMappingMapper.insertCoachHistoryMapping(mapping);
    }

    @Override
    public void AddDiffDataMapping(CoachHistoryData obj1, DataCoachReClub obj2) {
        dataCoachReClubMapper.insertDataCoachReClub(obj2);
        CoachHistoryMapping mapping = new CoachHistoryMapping(obj1.getId(), obj2.getId());
        coachHistoryMappingMapper.insertCoachHistoryMapping(mapping);
    }

    @Override
    public int getDestinationMaxId() {
        return dataCoachReClubMapper.getMax();
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
        List<CoachHistoryData> coachList = coachHistoryDataMapper.selectAllCoachHistoryData();
        List<DataCoachReClub> dataCoachList = dataCoachReClubMapper.selectAllDataCoachReClub();

        return trans(CoachHistoryData.class, DataCoachReClub.class, coachList, dataCoachList, "coachHistory", "data_coach_re_club", "getCoachId,getYears", "getCoachId,getYear");
    }

}
