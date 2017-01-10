/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ninehcom.transfer.transfer;

import com.ninehcom.common.util.Result;
import com.ninehcom.transfer.entity.Coach;
import com.ninehcom.transfer.entity.CoachMapping;
import com.ninehcom.transfer.entity.DataCoach;
import com.ninehcom.transfer.interfaces.IMapper;
import com.ninehcom.transfer.interfaces.ITransfer;
import com.ninehcom.transfer.mapper.CoachMapper;
import com.ninehcom.transfer.mapper.CoachMappingMapper;
import com.ninehcom.transfer.mapper.DataCoachMapper;
import com.ninehcom.transfer.mapper.ErrlogMapper;
import com.ninehcom.transfer.mapper.TranslogMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Shenjizhe
 */
@Service
public class CoachTransfer extends TransferBase<Coach, DataCoach> implements ITransfer {

    @Autowired
    ErrlogMapper errlogMapper;

    @Override
    public ErrlogMapper getErrlogMapper() {
        return errlogMapper;
    }
    @Autowired
    CoachMapper coachMapper;
    @Autowired
    DataCoachMapper dataCoachMapper;
    @Autowired
    CoachMappingMapper coachMappingMapper;
    @Autowired
    TranslogMapper translogMapper;

    @Override
    public DataCoach CreateDestination(Coach source, int id) {
        DataCoach coach = new DataCoach();
        coach.setId((long) id);
        coach.setName(source.getName());
        coach.setBirth(source.getBirthday());
        coach.setCountry(source.getNationality());
        coach.setNativePlace(source.getBirthplace());
        coach.setCreatedAt(source.getCreateTime());
        coach.setUpdatedAt(source.getUpdateTime());
        return coach;
    }

    @Override
    public void AddSameDataMapping(Coach obj1, DataCoach obj2) {
        CoachMapping mapping = new CoachMapping(obj1.getId(), obj2.getId());
        coachMappingMapper.insertCoachMapping(mapping);
    }

    @Override
    public void AddDiffDataMapping(Coach obj1, DataCoach obj2) {
        dataCoachMapper.insertDataCoach(obj2);
        CoachMapping mapping = new CoachMapping(obj1.getId(), obj2.getId());
        coachMappingMapper.insertCoachMapping(mapping);
    }

    @Override
    public int getDestinationMaxId() {
        return dataCoachMapper.getMax();
    }

    @Override
    public TranslogMapper getTranslogger() {
        return translogMapper;
    }

    @Override
    public IMapper getReseter() {
        return null;
    }

    @Override
    public Result trans() {
        List<Coach> coachList = coachMapper.selectAllCoach();
        List<DataCoach> dataCoachList = dataCoachMapper.selectAllDataCoach();
        return trans(Coach.class, DataCoach.class, coachList, dataCoachList, "coach", "data_coach", "getName", "getName");
    }

    @Override
    public String getT1Key(Coach obj1) {
        return obj1.getId().toString();
    }

    @Override
    public String getT2Key(DataCoach obj2) {
        return obj2.getId().toString();
    }

}
