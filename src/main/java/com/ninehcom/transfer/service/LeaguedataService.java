package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.Leaguedata;
import com.ninehcom.transfer.mapper.LeaguedataMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Leaguedata的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class LeaguedataService {

    @Autowired
    private  LeaguedataMapper  leaguedataMapper;
    public Result selectAllLeaguedata() {
        List<Leaguedata> list = leaguedataMapper.selectAllLeaguedata();
        return Result.Success((ArrayList)list);
    }
    public Result selectLeaguedataById(int Id) {
        Leaguedata leaguedata = leaguedataMapper.selectLeaguedataById(Id);
        return Result.Success(leaguedata);
    }
}
