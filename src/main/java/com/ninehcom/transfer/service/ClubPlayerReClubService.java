package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.ClubPlayerReClub;
import com.ninehcom.transfer.mapper.ClubPlayerReClubMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClubPlayerReClub的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class ClubPlayerReClubService {

    @Autowired
    private  ClubPlayerReClubMapper  clubPlayerReClubMapper;
    public Result selectAllClubPlayerReClub() {
        List<ClubPlayerReClub> list = clubPlayerReClubMapper.selectAllClubPlayerReClub();
        return Result.Success((ArrayList)list);
    }
    public Result selectClubPlayerReClubById(int Id) {
        ClubPlayerReClub clubPlayerReClub = clubPlayerReClubMapper.selectClubPlayerReClubById(Id);
        return Result.Success(clubPlayerReClub);
    }
    public Result insertClubPlayerReClub(ClubPlayerReClub clubPlayerReClub) {
        int count = clubPlayerReClubMapper.insertClubPlayerReClub(clubPlayerReClub);
        return Result.Success(count);
    }
    public Result updateClubPlayerReClub(ClubPlayerReClub clubPlayerReClub) {
        int count = clubPlayerReClubMapper.updateClubPlayerReClub(clubPlayerReClub);
        return Result.Success(count);
    }
    public Result deleteClubPlayerReClubById(int Id) {
        int count = clubPlayerReClubMapper.deleteClubPlayerReClubById(Id);
        return Result.Success(count);
    }
}
