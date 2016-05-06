package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.ClubType;
import com.ninehcom.transfer.mapper.ClubTypeMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClubType的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class ClubTypeService {

    @Autowired
    private  ClubTypeMapper  clubTypeMapper;
    public Result selectAllClubType() {
        List<ClubType> list = clubTypeMapper.selectAllClubType();
        return Result.Success((ArrayList)list);
    }
    public Result selectClubTypeById(int Id) {
        ClubType clubType = clubTypeMapper.selectClubTypeById(Id);
        return Result.Success(clubType);
    }
    public Result insertClubType(ClubType clubType) {
        int count = clubTypeMapper.insertClubType(clubType);
        return Result.Success(count);
    }
    public Result updateClubType(ClubType clubType) {
        int count = clubTypeMapper.updateClubType(clubType);
        return Result.Success(count);
    }
    public Result deleteClubTypeById(int Id) {
        int count = clubTypeMapper.deleteClubTypeById(Id);
        return Result.Success(count);
    }
}
