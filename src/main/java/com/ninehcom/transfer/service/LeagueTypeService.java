package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.LeagueType;
import com.ninehcom.transfer.mapper.LeagueTypeMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * LeagueType的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class LeagueTypeService {

    @Autowired
    private  LeagueTypeMapper  leagueTypeMapper;
    public Result selectAllLeagueType() {
        List<LeagueType> list = leagueTypeMapper.selectAllLeagueType();
        return Result.Success((ArrayList)list);
    }
    public Result selectLeagueTypeById(int Id) {
        LeagueType leagueType = leagueTypeMapper.selectLeagueTypeById(Id);
        return Result.Success(leagueType);
    }
    public Result insertLeagueType(LeagueType leagueType) {
        int count = leagueTypeMapper.insertLeagueType(leagueType);
        return Result.Success(count);
    }
    public Result updateLeagueType(LeagueType leagueType) {
        int count = leagueTypeMapper.updateLeagueType(leagueType);
        return Result.Success(count);
    }
    public Result deleteLeagueTypeById(int Id) {
        int count = leagueTypeMapper.deleteLeagueTypeById(Id);
        return Result.Success(count);
    }
}
