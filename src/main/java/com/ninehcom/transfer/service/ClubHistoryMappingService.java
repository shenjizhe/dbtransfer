package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.ClubHistoryMapping;
import com.ninehcom.transfer.mapper.ClubHistoryMappingMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClubHistoryMapping的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class ClubHistoryMappingService {

    @Autowired
    private  ClubHistoryMappingMapper  clubHistoryMappingMapper;
    public Result selectAllClubHistoryMapping() {
        List<ClubHistoryMapping> list = clubHistoryMappingMapper.selectAllClubHistoryMapping();
        return Result.Success((ArrayList)list);
    }
    public Result selectClubHistoryMappingById(int Id) {
        ClubHistoryMapping clubHistoryMapping = clubHistoryMappingMapper.selectClubHistoryMappingById(Id);
        return Result.Success(clubHistoryMapping);
    }
    public Result insertClubHistoryMapping(ClubHistoryMapping clubHistoryMapping) {
        int count = clubHistoryMappingMapper.insertClubHistoryMapping(clubHistoryMapping);
        return Result.Success(count);
    }
    public Result updateClubHistoryMapping(ClubHistoryMapping clubHistoryMapping) {
        int count = clubHistoryMappingMapper.updateClubHistoryMapping(clubHistoryMapping);
        return Result.Success(count);
    }
    public Result deleteClubHistoryMappingById(int Id) {
        int count = clubHistoryMappingMapper.deleteClubHistoryMappingById(Id);
        return Result.Success(count);
    }
}
