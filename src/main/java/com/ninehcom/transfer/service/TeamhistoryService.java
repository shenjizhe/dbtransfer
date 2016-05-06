package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.Teamhistory;
import com.ninehcom.transfer.mapper.TeamhistoryMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Teamhistory的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class TeamhistoryService {

    @Autowired
    private  TeamhistoryMapper  teamhistoryMapper;
    public Result selectAllTeamhistory() {
        List<Teamhistory> list = teamhistoryMapper.selectAllTeamhistory();
        return Result.Success((ArrayList)list);
    }
    public Result selectTeamhistoryById(int Id) {
        Teamhistory teamhistory = teamhistoryMapper.selectTeamhistoryById(Id);
        return Result.Success(teamhistory);
    }
}
