package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.MatchMapping;
import com.ninehcom.transfer.mapper.MatchMappingMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * MatchMapping的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class MatchMappingService {

    @Autowired
    private  MatchMappingMapper  matchMappingMapper;
    public Result selectAllMatchMapping() {
        List<MatchMapping> list = matchMappingMapper.selectAllMatchMapping();
        return Result.Success((ArrayList)list);
    }
    public Result selectMatchMappingById(int Id) {
        MatchMapping matchMapping = matchMappingMapper.selectMatchMappingById(Id);
        return Result.Success(matchMapping);
    }
    public Result insertMatchMapping(MatchMapping matchMapping) {
        int count = matchMappingMapper.insertMatchMapping(matchMapping);
        return Result.Success(count);
    }
    public Result updateMatchMapping(MatchMapping matchMapping) {
        int count = matchMappingMapper.updateMatchMapping(matchMapping);
        return Result.Success(count);
    }
    public Result deleteMatchMappingById(int Id) {
        int count = matchMappingMapper.deleteMatchMappingById(Id);
        return Result.Success(count);
    }
}
