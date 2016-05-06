package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.DataLeagueRankClub;
import com.ninehcom.transfer.mapper.DataLeagueRankClubMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * DataLeagueRankClub的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class DataLeagueRankClubService {

    @Autowired
    private  DataLeagueRankClubMapper  dataLeagueRankClubMapper;
    public Result selectAllDataLeagueRankClub() {
        List<DataLeagueRankClub> list = dataLeagueRankClubMapper.selectAllDataLeagueRankClub();
        return Result.Success((ArrayList)list);
    }
    public Result selectDataLeagueRankClubById(int Id) {
        DataLeagueRankClub dataLeagueRankClub = dataLeagueRankClubMapper.selectDataLeagueRankClubById(Id);
        return Result.Success(dataLeagueRankClub);
    }
    public Result insertDataLeagueRankClub(DataLeagueRankClub dataLeagueRankClub) {
        int count = dataLeagueRankClubMapper.insertDataLeagueRankClub(dataLeagueRankClub);
        return Result.Success(count);
    }
    public Result updateDataLeagueRankClub(DataLeagueRankClub dataLeagueRankClub) {
        int count = dataLeagueRankClubMapper.updateDataLeagueRankClub(dataLeagueRankClub);
        return Result.Success(count);
    }
    public Result deleteDataLeagueRankClubById(int Id) {
        int count = dataLeagueRankClubMapper.deleteDataLeagueRankClubById(Id);
        return Result.Success(count);
    }
}
