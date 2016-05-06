package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.DataPlayerReClub;
import com.ninehcom.transfer.mapper.DataPlayerReClubMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * DataPlayerReClub的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class DataPlayerReClubService {

    @Autowired
    private  DataPlayerReClubMapper  dataPlayerReClubMapper;
    public Result selectAllDataPlayerReClub() {
        List<DataPlayerReClub> list = dataPlayerReClubMapper.selectAllDataPlayerReClub();
        return Result.Success((ArrayList)list);
    }
    public Result selectDataPlayerReClubById(int Id) {
        DataPlayerReClub dataPlayerReClub = dataPlayerReClubMapper.selectDataPlayerReClubById(Id);
        return Result.Success(dataPlayerReClub);
    }
    public Result insertDataPlayerReClub(DataPlayerReClub dataPlayerReClub) {
        int count = dataPlayerReClubMapper.insertDataPlayerReClub(dataPlayerReClub);
        return Result.Success(count);
    }
    public Result updateDataPlayerReClub(DataPlayerReClub dataPlayerReClub) {
        int count = dataPlayerReClubMapper.updateDataPlayerReClub(dataPlayerReClub);
        return Result.Success(count);
    }
    public Result deleteDataPlayerReClubById(int Id) {
        int count = dataPlayerReClubMapper.deleteDataPlayerReClubById(Id);
        return Result.Success(count);
    }
}
