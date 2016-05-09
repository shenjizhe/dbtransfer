package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.Coachresume;
import com.ninehcom.transfer.mapper.CoachresumeMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Coachresume的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class CoachresumeService {

    @Autowired
    private  CoachresumeMapper  coachresumeMapper;
    public Result selectAllCoachresume() {
        List<Coachresume> list = coachresumeMapper.selectAllCoachresume();
        return Result.Success((ArrayList)list);
    }
    public Result selectCoachresumeById(int Id) {
        Coachresume coachresume = coachresumeMapper.selectCoachresumeById(Id);
        return Result.Success(coachresume);
    }
}
