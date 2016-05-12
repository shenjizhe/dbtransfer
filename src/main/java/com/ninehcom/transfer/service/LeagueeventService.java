package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.Leagueevent;
import com.ninehcom.transfer.mapper.LeagueeventMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Leagueevent的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class LeagueeventService {

    @Autowired
    private  LeagueeventMapper  leagueeventMapper;
    public Result selectAllLeagueevent() {
        List<Leagueevent> list = leagueeventMapper.selectAllLeagueevent();
        return Result.Success((ArrayList)list);
    }
    public Result selectLeagueeventById(int Id) {
        Leagueevent leagueevent = leagueeventMapper.selectLeagueeventById(Id);
        return Result.Success(leagueevent);
    }
}
