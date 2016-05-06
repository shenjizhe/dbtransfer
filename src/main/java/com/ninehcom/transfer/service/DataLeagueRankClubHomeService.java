package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.DataLeagueRankClubHome;
import com.ninehcom.transfer.mapper.DataLeagueRankClubHomeMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * DataLeagueRankClubHome的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class DataLeagueRankClubHomeService {

    @Autowired
    private  DataLeagueRankClubHomeMapper  dataLeagueRankClubHomeMapper;
    public Result selectAllDataLeagueRankClubHome() {
        List<DataLeagueRankClubHome> list = dataLeagueRankClubHomeMapper.selectAllDataLeagueRankClubHome();
        return Result.Success((ArrayList)list);
    }
    public Result selectDataLeagueRankClubHomeById(int Id) {
        DataLeagueRankClubHome dataLeagueRankClubHome = dataLeagueRankClubHomeMapper.selectDataLeagueRankClubHomeById(Id);
        return Result.Success(dataLeagueRankClubHome);
    }
    public Result insertDataLeagueRankClubHome(DataLeagueRankClubHome dataLeagueRankClubHome) {
        int count = dataLeagueRankClubHomeMapper.insertDataLeagueRankClubHome(dataLeagueRankClubHome);
        return Result.Success(count);
    }
    public Result updateDataLeagueRankClubHome(DataLeagueRankClubHome dataLeagueRankClubHome) {
        int count = dataLeagueRankClubHomeMapper.updateDataLeagueRankClubHome(dataLeagueRankClubHome);
        return Result.Success(count);
    }
    public Result deleteDataLeagueRankClubHomeById(int Id) {
        int count = dataLeagueRankClubHomeMapper.deleteDataLeagueRankClubHomeById(Id);
        return Result.Success(count);
    }
}
