package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.Leaguecalendar;
import com.ninehcom.transfer.mapper.LeaguecalendarMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Leaguecalendar的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class LeaguecalendarService {

    @Autowired
    private  LeaguecalendarMapper  leaguecalendarMapper;
    public Result selectAllLeaguecalendar() {
        List<Leaguecalendar> list = leaguecalendarMapper.selectAllLeaguecalendar();
        return Result.Success((ArrayList)list);
    }
    public Result selectLeaguecalendarById(int Id) {
        Leaguecalendar leaguecalendar = leaguecalendarMapper.selectLeaguecalendarById(Id);
        return Result.Success(leaguecalendar);
    }
}
