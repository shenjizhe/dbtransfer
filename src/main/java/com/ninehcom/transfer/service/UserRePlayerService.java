package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.UserRePlayer;
import com.ninehcom.transfer.mapper.UserRePlayerMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * UserRePlayer的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class UserRePlayerService {

    @Autowired
    private  UserRePlayerMapper  userRePlayerMapper;
    public Result selectAllUserRePlayer() {
        List<UserRePlayer> list = userRePlayerMapper.selectAllUserRePlayer();
        return Result.Success((ArrayList)list);
    }
    public Result selectUserRePlayerById(int Id) {
        UserRePlayer userRePlayer = userRePlayerMapper.selectUserRePlayerById(Id);
        return Result.Success(userRePlayer);
    }
    public Result insertUserRePlayer(UserRePlayer userRePlayer) {
        int count = userRePlayerMapper.insertUserRePlayer(userRePlayer);
        return Result.Success(count);
    }
    public Result updateUserRePlayer(UserRePlayer userRePlayer) {
        int count = userRePlayerMapper.updateUserRePlayer(userRePlayer);
        return Result.Success(count);
    }
    public Result deleteUserRePlayerById(int Id) {
        int count = userRePlayerMapper.deleteUserRePlayerById(Id);
        return Result.Success(count);
    }
}
