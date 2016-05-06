package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.DataCoachReClub;
import com.ninehcom.transfer.mapper.DataCoachReClubMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * DataCoachReClub的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class DataCoachReClubService {

    @Autowired
    private  DataCoachReClubMapper  dataCoachReClubMapper;
    public Result selectAllDataCoachReClub() {
        List<DataCoachReClub> list = dataCoachReClubMapper.selectAllDataCoachReClub();
        return Result.Success((ArrayList)list);
    }
    public Result selectDataCoachReClubById(int Id) {
        DataCoachReClub dataCoachReClub = dataCoachReClubMapper.selectDataCoachReClubById(Id);
        return Result.Success(dataCoachReClub);
    }
    public Result insertDataCoachReClub(DataCoachReClub dataCoachReClub) {
        int count = dataCoachReClubMapper.insertDataCoachReClub(dataCoachReClub);
        return Result.Success(count);
    }
    public Result updateDataCoachReClub(DataCoachReClub dataCoachReClub) {
        int count = dataCoachReClubMapper.updateDataCoachReClub(dataCoachReClub);
        return Result.Success(count);
    }
    public Result deleteDataCoachReClubById(int Id) {
        int count = dataCoachReClubMapper.deleteDataCoachReClubById(Id);
        return Result.Success(count);
    }
}
