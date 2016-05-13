/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ninehcom.transfer.transfer;

import com.ninehcom.common.util.Result;
import com.ninehcom.transfer.entity.DataLeagueMatch;
import com.ninehcom.transfer.entity.Leaguecalendar;
import com.ninehcom.transfer.entity.MatchMapping;
import com.ninehcom.transfer.interfaces.IMapper;
import com.ninehcom.transfer.interfaces.ITransfer;
import com.ninehcom.transfer.mapper.ClubHistoryMappingMapper;
import com.ninehcom.transfer.mapper.ClubMappingMapper;
import com.ninehcom.transfer.mapper.DataLeagueMatchMapper;
import com.ninehcom.transfer.mapper.LeaguecalendarMapper;
import com.ninehcom.transfer.mapper.MatchMappingMapper;
import com.ninehcom.transfer.mapper.TranslogMapper;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Shenjizhe
 */
@Service
public class LeagueMatchTransfer extends TransferBase<Leaguecalendar, DataLeagueMatch> implements ITransfer {

    public final static long[] LEAGUE_TYPE_IDS = new long[]{1, 4, 5, 2, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    public final static int[] LEAGUE_STATUS_IDS = new int[]{3, 2, 1, 4};
    public final static String[] DAY_OF_WEEK_NAMES = new String[]{"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};

    @Autowired
    LeaguecalendarMapper leaguecalendarMapper;
    @Autowired
    DataLeagueMatchMapper dataLeagueMatchMapper;
    @Autowired
    ClubMappingMapper clubMappingMapper;
    @Autowired
    ClubHistoryMappingMapper clubHistoryMappingMapper;
    @Autowired
    MatchMappingMapper matchMappingMapper;
    @Autowired
    private TranslogMapper translogMapper;

    private void changeLeagueTypeId(Leaguecalendar source, DataLeagueMatch desctination) {
        int index = source.getLeagueTypeId() - 1;
        int subIndex = source.getLeagueTypeId2() - 1;

        desctination.setLeagueId(LEAGUE_TYPE_IDS[index]);
        desctination.setLeagueSubId(LEAGUE_TYPE_IDS[subIndex]);

        int statusIndex = source.getLeagueStateId() - 1;
        desctination.setMatchStatus(LEAGUE_STATUS_IDS[statusIndex]);
    }

    @Override
    public DataLeagueMatch CreateDestination(Leaguecalendar source, int id) {
        DataLeagueMatch match = new DataLeagueMatch();
        match.setId((long) id);
        changeLeagueTypeId(source, match);
        match.setRound(source.getRoundsId());
        match.setHomeScore(source.getMasterScore());
        match.setGuestScore(source.getGuestScore());

        long homeClubId = clubMappingMapper.selectClubMappingById(source.getHomeTeamId()).getClubId();
        match.setHomeClubId(homeClubId);
        long guestClubId = clubMappingMapper.selectClubMappingById(source.getGuestTeamId()).getClubId();
        match.setGuestClubId(guestClubId);

        long homeHistoryClubId = clubHistoryMappingMapper.selectClubHistoryMappingById(source.getHomeTeamHistoryId()).getClubHistoryId();
        match.setHomeClubHistoryId(homeHistoryClubId);
        long guestHistoryClubId = clubHistoryMappingMapper.selectClubHistoryMappingById(source.getGuestTeamHistoryId()).getClubHistoryId();
        match.setGuestClubHistoryId(guestHistoryClubId);

        Date time = source.getLeagueTime();
        match.setKickAt(time);
        match.setWeekday(DAY_OF_WEEK_NAMES[time.getDay()]);

        match.setYear(source.getYears());
        match.setStadium(source.getLeagueCourt());
        match.setCreatedAt(source.getCreateTime());
        match.setUpdatedAt(source.getUpdateTime());

        return match;
    }

    @Override
    public void AddSameDataMapping(Leaguecalendar obj1, DataLeagueMatch obj2) {
        MatchMapping mapping = new MatchMapping(obj1.getId(), obj2.getId());
        matchMappingMapper.insertMatchMapping(mapping);
    }

    @Override
    public void AddDiffDataMapping(Leaguecalendar obj1, DataLeagueMatch obj2) {
        dataLeagueMatchMapper.insertDataLeagueMatch(obj2);
        MatchMapping mapping = new MatchMapping(obj1.getId(), obj2.getId());
        matchMappingMapper.insertMatchMapping(mapping);
    }

    @Override
    public int getDestinationMaxId() {
        return dataLeagueMatchMapper.getMax();
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
        List<Leaguecalendar> clubMatchList = leaguecalendarMapper.selectFilterLeaguecalendar();
        List<DataLeagueMatch> dataMatchList = dataLeagueMatchMapper.selectAllDataLeagueMatch();

        return trans(Leaguecalendar.class, DataLeagueMatch.class, clubMatchList, dataMatchList, "leaguecalendar", "data_league_match", null, null);
    }

}
