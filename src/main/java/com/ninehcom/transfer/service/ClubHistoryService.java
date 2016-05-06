package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.ClubHistory;
import com.ninehcom.transfer.mapper.ClubHistoryMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClubHistory的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class ClubHistoryService {

    @Autowired
    private  ClubHistoryMapper  clubHistoryMapper;
    public Result selectAllClubHistory() {
        List<ClubHistory> list = clubHistoryMapper.selectAllClubHistory();
        return Result.Success((ArrayList)list);
    }
    public Result selectClubHistoryById(int Id) {
        ClubHistory clubHistory = clubHistoryMapper.selectClubHistoryById(Id);
        return Result.Success(clubHistory);
    }
    public Result insertClubHistory(ClubHistory clubHistory) {
        int count = clubHistoryMapper.insertClubHistory(clubHistory);
        return Result.Success(count);
    }
    public Result updateClubHistory(ClubHistory clubHistory) {
        int count = clubHistoryMapper.updateClubHistory(clubHistory);
        return Result.Success(count);
    }
    public Result deleteClubHistoryById(int Id) {
        int count = clubHistoryMapper.deleteClubHistoryById(Id);
        return Result.Success(count);
    }
}
