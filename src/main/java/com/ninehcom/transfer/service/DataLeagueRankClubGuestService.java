package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.DataLeagueRankClubGuest;
import com.ninehcom.transfer.mapper.DataLeagueRankClubGuestMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * DataLeagueRankClubGuest的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class DataLeagueRankClubGuestService {

    @Autowired
    private  DataLeagueRankClubGuestMapper  dataLeagueRankClubGuestMapper;
    public Result selectAllDataLeagueRankClubGuest() {
        List<DataLeagueRankClubGuest> list = dataLeagueRankClubGuestMapper.selectAllDataLeagueRankClubGuest();
        return Result.Success((ArrayList)list);
    }
    public Result selectDataLeagueRankClubGuestById(int Id) {
        DataLeagueRankClubGuest dataLeagueRankClubGuest = dataLeagueRankClubGuestMapper.selectDataLeagueRankClubGuestById(Id);
        return Result.Success(dataLeagueRankClubGuest);
    }
    public Result insertDataLeagueRankClubGuest(DataLeagueRankClubGuest dataLeagueRankClubGuest) {
        int count = dataLeagueRankClubGuestMapper.insertDataLeagueRankClubGuest(dataLeagueRankClubGuest);
        return Result.Success(count);
    }
    public Result updateDataLeagueRankClubGuest(DataLeagueRankClubGuest dataLeagueRankClubGuest) {
        int count = dataLeagueRankClubGuestMapper.updateDataLeagueRankClubGuest(dataLeagueRankClubGuest);
        return Result.Success(count);
    }
    public Result deleteDataLeagueRankClubGuestById(int Id) {
        int count = dataLeagueRankClubGuestMapper.deleteDataLeagueRankClubGuestById(Id);
        return Result.Success(count);
    }
}
