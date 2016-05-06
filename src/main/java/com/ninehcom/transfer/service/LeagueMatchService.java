package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.LeagueMatch;
import com.ninehcom.transfer.mapper.LeagueMatchMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * LeagueMatch的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class LeagueMatchService {

    @Autowired
    private  LeagueMatchMapper  leagueMatchMapper;
    public Result selectAllLeagueMatch() {
        List<LeagueMatch> list = leagueMatchMapper.selectAllLeagueMatch();
        return Result.Success((ArrayList)list);
    }
    public Result selectLeagueMatchById(int Id) {
        LeagueMatch leagueMatch = leagueMatchMapper.selectLeagueMatchById(Id);
        return Result.Success(leagueMatch);
    }
    public Result insertLeagueMatch(LeagueMatch leagueMatch) {
        int count = leagueMatchMapper.insertLeagueMatch(leagueMatch);
        return Result.Success(count);
    }
    public Result updateLeagueMatch(LeagueMatch leagueMatch) {
        int count = leagueMatchMapper.updateLeagueMatch(leagueMatch);
        return Result.Success(count);
    }
    public Result deleteLeagueMatchById(int Id) {
        int count = leagueMatchMapper.deleteLeagueMatchById(Id);
        return Result.Success(count);
    }
}
