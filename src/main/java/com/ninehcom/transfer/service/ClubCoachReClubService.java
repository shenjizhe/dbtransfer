package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.ClubCoachReClub;
import com.ninehcom.transfer.mapper.ClubCoachReClubMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClubCoachReClub的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class ClubCoachReClubService {

    @Autowired
    private  ClubCoachReClubMapper  clubCoachReClubMapper;
    public Result selectAllClubCoachReClub() {
        List<ClubCoachReClub> list = clubCoachReClubMapper.selectAllClubCoachReClub();
        return Result.Success((ArrayList)list);
    }
    public Result selectClubCoachReClubById(int Id) {
        ClubCoachReClub clubCoachReClub = clubCoachReClubMapper.selectClubCoachReClubById(Id);
        return Result.Success(clubCoachReClub);
    }
    public Result insertClubCoachReClub(ClubCoachReClub clubCoachReClub) {
        int count = clubCoachReClubMapper.insertClubCoachReClub(clubCoachReClub);
        return Result.Success(count);
    }
    public Result updateClubCoachReClub(ClubCoachReClub clubCoachReClub) {
        int count = clubCoachReClubMapper.updateClubCoachReClub(clubCoachReClub);
        return Result.Success(count);
    }
    public Result deleteClubCoachReClubById(int Id) {
        int count = clubCoachReClubMapper.deleteClubCoachReClubById(Id);
        return Result.Success(count);
    }
}
