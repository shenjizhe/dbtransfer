/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ninehcom.transfer.transfer;

import com.ninehcom.common.util.Result;
import com.ninehcom.transfer.entity.ClubMapping;
import com.ninehcom.transfer.entity.DataMatchLine;
import com.ninehcom.transfer.entity.Leaguecalendar;
import com.ninehcom.transfer.interfaces.IMapper;
import com.ninehcom.transfer.interfaces.ITransfer;
import com.ninehcom.transfer.mapper.ClubMappingMapper;
import com.ninehcom.transfer.mapper.DataMatchLineMapper;
import com.ninehcom.transfer.mapper.ErrlogMapper;
import com.ninehcom.transfer.mapper.LeaguecalendarMapper;
import com.ninehcom.transfer.mapper.MatchMappingMapper;
import com.ninehcom.transfer.mapper.TranslogMapper;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Shenjizhe
 */
@Service
public class LineupTransfer extends TransferBase<Leaguecalendar, DataMatchLine> implements ITransfer {
    @Autowired
    ErrlogMapper errlogMapper;

    @Override
    public ErrlogMapper getErrlogMapper() {
        return errlogMapper;
    }
    @Autowired
    LeaguecalendarMapper leaguecalendarMapper;
    @Autowired
    DataMatchLineMapper dataMatchLineMapper;
    @Autowired
    MatchMappingMapper matchMappingMapper;
    @Autowired
    ClubMappingMapper clubMappingMapper;
    @Autowired
    TranslogMapper translogMapper;
    
    @Override
    public DataMatchLine CreateDestination(Leaguecalendar source, int id) {
        DataMatchLine line = new DataMatchLine();
        try {
            line.setId((long) id);
            line.setMatchId(source.getId().longValue());
            long homeClubId = clubMap.get(source.getHomeTeamId()).getClubId();
            line.setHomeClubId(homeClubId);
            long guestClubId = clubMap.get(source.getGuestTeamId()).getClubId();
            line.setGuestClubId(guestClubId);
            
//            int clubTeamType = source.getClubTeamType();
//            if (clubTeamType == 1) {
//                line.setHomeLineUrl(source.getLineupLogo());
//            } else if (clubTeamType == 2) {
//                line.setGuestLineUrl(source.getLineupLogo());
//            } else {
//                
//            }
            
            line.setYear(source.getYears());
            line.setCreatedAt(source.getCreateTime());
            line.setUpdatedAt(source.getUpdateTime());
        } catch (Exception ex) {
            LOG.info(ex.getMessage());
        }
        
        return line;
    }
    private static final Logger LOG = Logger.getLogger(LineupTransfer.class.getName());
    
    @Override
    public void AddSameDataMapping(Leaguecalendar obj1, DataMatchLine obj2) {
        DataMatchLine temp = new DataMatchLine();
        temp.setMatchId(obj2.getMatchId());
//        temp.setHomeLineUrl(obj2.getHomeLineUrl());
//        temp.setGuestLineUrl(obj2.getGuestLineUrl());
        temp.setUpdatedAt(new Date());
        dataMatchLineMapper.updateDataMatchLine(temp);
    }
    
    @Override
    public void AddDiffDataMapping(Leaguecalendar obj1, DataMatchLine obj2) {
        DataMatchLine line = dataMatchLineMapper.selectDataMatchLineById(obj2.getMatchId().intValue());
        if (line != null) {
            AddSameDataMapping(obj1, obj2);
        } else {
            dataMatchLineMapper.insertDataMatchLine(obj2);
        }
    }
    
    @Override
    public int getDestinationMaxId() {
        return dataMatchLineMapper.getMax();
    }
    
    @Override
    public TranslogMapper getTranslogger() {
        return translogMapper;
    }
    
    @Override
    public IMapper getReseter() {
        return matchMappingMapper;
    }
    
    Map<Integer, ClubMapping> clubMap = null;
    
    @Override
    public Result trans() {
        clubMap = clubMappingMapper.selectMapClubMapping();
        List<Leaguecalendar> club_line = leaguecalendarMapper.selectLineLeaguecalendar();
        List<DataMatchLine> data_line = dataMatchLineMapper.selectAllDataMatchLine();
        
        return trans(Leaguecalendar.class, DataMatchLine.class, club_line, data_line, "leaguecalendar", "data_match_line", "getId", "getMatchId");
    }

    @Override
    public String getT1Key(Leaguecalendar obj1) {
        return obj1.getId().toString();
    }

    @Override
    public String getT2Key(DataMatchLine obj2) {
        return obj2.getId().toString();
    }
    
}
