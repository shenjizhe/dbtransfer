package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.Team;
import com.ninehcom.transfer.mapper.TeamMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Team的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class TeamService {

    @Autowired
    private  TeamMapper  teamMapper;
    public Result selectAllTeam() {
        List<Team> list = teamMapper.selectAllTeam();
        return Result.Success((ArrayList)list);
    }
    public Result selectTeamById(int Id) {
        Team team = teamMapper.selectTeamById(Id);
        return Result.Success(team);
    }
}
