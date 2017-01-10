/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ninehcom.transfer.transfer;

import com.ninehcom.common.util.Result;
import com.ninehcom.transfer.entity.ClubMapping;
import com.ninehcom.transfer.entity.DataMatchEvent;
import com.ninehcom.transfer.entity.Leagueevent;
import com.ninehcom.transfer.interfaces.IMapper;
import com.ninehcom.transfer.interfaces.ITransfer;
import com.ninehcom.transfer.mapper.ClubMappingMapper;
import com.ninehcom.transfer.mapper.DataMatchEventMapper;
import com.ninehcom.transfer.mapper.ErrlogMapper;
import com.ninehcom.transfer.mapper.LeagueeventMapper;
import com.ninehcom.transfer.mapper.MatchMappingMapper;
import com.ninehcom.transfer.mapper.TranslogMapper;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Shenjizhe
 */
@Service
public class MatchEventTransfer extends TransferBase<Leagueevent, DataMatchEvent> implements ITransfer {

    final int[] LEAGUE_EVENT_TYPE_IDS = new int[]{0, 5, 9, 10, 11, 13, 12, 2, 3, 7, 4, 8, 6};
    final String[] LEAGUE_EVENT_TYPE_NAMES = new String[]{"开始", "换人", "进球+助攻", "进球（入球）", "进球（点球）", "点球未进", "进球（乌龙）", "助攻", "红牌", "双黄牌", "黄牌", "伤", "结束"};
@Autowired
    ErrlogMapper errlogMapper;

    @Override
    public ErrlogMapper getErrlogMapper() {
        return errlogMapper;
    }
    @Autowired
    LeagueeventMapper leagueeventMapper;
    @Autowired
    DataMatchEventMapper dataMatchEventMapper;
    @Autowired
    MatchMappingMapper matchMappingMapper;
    @Autowired
    ClubMappingMapper clubMappingMapper;
    @Autowired
    TranslogMapper translogMapper;

    private void changeEventType(Leagueevent source, DataMatchEvent destination) {
        int clubEventTypeIndex = source.getLeagueEventTypeId() - 1;

        destination.setEventType(LEAGUE_EVENT_TYPE_IDS[clubEventTypeIndex]);
        destination.setEventData(LEAGUE_EVENT_TYPE_NAMES[clubEventTypeIndex]);
    }

    @Override
    public DataMatchEvent CreateDestination(Leagueevent source, int id) {
        DataMatchEvent event = new DataMatchEvent();
        event.setId((long) id);

        long clubId = clubMap.get(source.getTeamId()).getClubId();
        event.setClubId(clubId);
        event.setClubType(source.getLeagueTeamTypeId());
        event.setEventPoint(source.getLeagueEventTime());
        event.setMatchId(source.getLeagueCalendarId().longValue());
        event.setPlayerName(source.getPlayerName());
        event.setPlayerSecondaryName(source.getPlayerName2());
        changeEventType(source, event);
        event.setCreatedAt(source.getCreateTime());
        event.setUpdatedAt(source.getUpdateTime());
        return event;
    }

    @Override
    public void AddSameDataMapping(Leagueevent obj1, DataMatchEvent obj2) {

    }

    @Override
    public void AddDiffDataMapping(Leagueevent obj1, DataMatchEvent obj2) {
        dataMatchEventMapper.insertDataMatchEvent(obj2);
    }

    @Override
    public int getDestinationMaxId() {
        return dataMatchEventMapper.getMax();
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

        List<Leagueevent> clubEventList = leagueeventMapper.selectFilterLeagueevent();
        List<DataMatchEvent> dataEventList = dataMatchEventMapper.selectAllDataMatchEvent();

        return trans(Leagueevent.class, DataMatchEvent.class, clubEventList, dataEventList, "leagueevent", "data_match_event", null, null);
    }

}
