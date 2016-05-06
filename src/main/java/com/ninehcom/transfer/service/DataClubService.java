package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.DataClub;
import com.ninehcom.transfer.mapper.DataClubMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * DataClub的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class DataClubService {

    @Autowired
    private  DataClubMapper  dataClubMapper;
    public Result selectAllDataClub() {
        List<DataClub> list = dataClubMapper.selectAllDataClub();
        return Result.Success((ArrayList)list);
    }
    public Result selectDataClubById(int Id) {
        DataClub dataClub = dataClubMapper.selectDataClubById(Id);
        return Result.Success(dataClub);
    }
    public Result insertDataClub(DataClub dataClub) {
        int count = dataClubMapper.insertDataClub(dataClub);
        return Result.Success(count);
    }
    public Result updateDataClub(DataClub dataClub) {
        int count = dataClubMapper.updateDataClub(dataClub);
        return Result.Success(count);
    }
    public Result deleteDataClubById(int Id) {
        int count = dataClubMapper.deleteDataClubById(Id);
        return Result.Success(count);
    }
}
