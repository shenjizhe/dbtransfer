package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.DataLeagueReClub;
import com.ninehcom.transfer.mapper.DataLeagueReClubMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * DataLeagueReClub的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class DataLeagueReClubService {

    @Autowired
    private  DataLeagueReClubMapper  dataLeagueReClubMapper;
    public Result selectAllDataLeagueReClub() {
        List<DataLeagueReClub> list = dataLeagueReClubMapper.selectAllDataLeagueReClub();
        return Result.Success((ArrayList)list);
    }
    public Result selectDataLeagueReClubById(int Id) {
        DataLeagueReClub dataLeagueReClub = dataLeagueReClubMapper.selectDataLeagueReClubById(Id);
        return Result.Success(dataLeagueReClub);
    }
    public Result insertDataLeagueReClub(DataLeagueReClub dataLeagueReClub) {
        int count = dataLeagueReClubMapper.insertDataLeagueReClub(dataLeagueReClub);
        return Result.Success(count);
    }
    public Result updateDataLeagueReClub(DataLeagueReClub dataLeagueReClub) {
        int count = dataLeagueReClubMapper.updateDataLeagueReClub(dataLeagueReClub);
        return Result.Success(count);
    }
    public Result deleteDataLeagueReClubById(int Id) {
        int count = dataLeagueReClubMapper.deleteDataLeagueReClubById(Id);
        return Result.Success(count);
    }
}
