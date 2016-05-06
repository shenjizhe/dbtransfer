package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.ClubMapping;
import com.ninehcom.transfer.mapper.ClubMappingMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClubMapping的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class ClubMappingService {

    @Autowired
    private  ClubMappingMapper  clubMappingMapper;
    public Result selectAllClubMapping() {
        List<ClubMapping> list = clubMappingMapper.selectAllClubMapping();
        return Result.Success((ArrayList)list);
    }
    public Result selectClubMappingById(int Id) {
        ClubMapping clubMapping = clubMappingMapper.selectClubMappingById(Id);
        return Result.Success(clubMapping);
    }
    public Result insertClubMapping(ClubMapping clubMapping) {
        int count = clubMappingMapper.insertClubMapping(clubMapping);
        return Result.Success(count);
    }
    public Result updateClubMapping(ClubMapping clubMapping) {
        int count = clubMappingMapper.updateClubMapping(clubMapping);
        return Result.Success(count);
    }
    public Result deleteClubMappingById(int Id) {
        int count = clubMappingMapper.deleteClubMappingById(Id);
        return Result.Success(count);
    }
}
