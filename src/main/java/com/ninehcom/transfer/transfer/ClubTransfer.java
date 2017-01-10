/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ninehcom.transfer.transfer;

import com.ninehcom.common.util.Result;
import com.ninehcom.transfer.entity.ClubMapping;
import com.ninehcom.transfer.entity.DataClub;
import com.ninehcom.transfer.entity.Team;
import com.ninehcom.transfer.interfaces.IMapper;
import com.ninehcom.transfer.interfaces.ITransfer;
import com.ninehcom.transfer.mapper.ClubMappingMapper;
import com.ninehcom.transfer.mapper.DataClubMapper;
import com.ninehcom.transfer.mapper.ErrlogMapper;
import com.ninehcom.transfer.mapper.TeamMapper;
import com.ninehcom.transfer.mapper.TranslogMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Shenjizhe
 */
@Service
public class ClubTransfer extends TransferBase<Team, DataClub> implements ITransfer {

    @Autowired
    private TeamMapper teamMapper;
    @Autowired
    private DataClubMapper dataClubMapper;
    @Autowired
    private ClubMappingMapper clubMappingMapper;
    @Autowired
    TranslogMapper translogMapper;

    @Override
    public DataClub CreateDestination(Team source, int id) {
        DataClub club = new DataClub();
        club.setId((long) id);
        club.setCreatedAt(source.getCreateTime());
        club.setUpdatedAt(source.getUpdateTime());
        club.setName(source.getName());
        return club;
    }

    @Override
    public void AddSameDataMapping(Team obj1, DataClub obj2) {
        ClubMapping mapping = new ClubMapping(obj1.getId(), obj2.getId());
        clubMappingMapper.insertClubMapping(mapping);
    }

    @Override
    public void AddDiffDataMapping(Team obj1, DataClub obj2) {
        dataClubMapper.insertDataClub(obj2);
        ClubMapping mapping = new ClubMapping(obj1.getId(), obj2.getId());
        clubMappingMapper.insertClubMapping(mapping);
    }

    @Override
    public Result trans() {
        List<Team> teamList = teamMapper.selectAllTeam();
        List<DataClub> clubList = dataClubMapper.selectAllDataClub();
        return trans(Team.class, DataClub.class, teamList, clubList, "team", "data_club", "getName", "getName");
    }

    @Override
    public int getDestinationMaxId() {
        return dataClubMapper.getMax();
    }

    @Override
    public TranslogMapper getTranslogger() {
        return translogMapper;
    }

    @Override
    public IMapper getReseter() {
        return null;
    }
    @Autowired
    ErrlogMapper errlogMapper;

    @Override
    public ErrlogMapper getErrlogMapper() {
        return errlogMapper;
    }

    @Override
    public String getT1Key(Team obj1) {
        return obj1.getId().toString();
    }

    @Override
    public String getT2Key(DataClub obj2) {
        return obj2.getId().toString();
    }
}
