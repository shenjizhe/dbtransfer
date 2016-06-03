package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.UserPlayerRelation;
import com.ninehcom.transfer.mapper.UserPlayerRelationMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * UserPlayerRelation的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class UserPlayerRelationService {

    @Autowired
    private  UserPlayerRelationMapper  userPlayerRelationMapper;
    public Result selectAllUserPlayerRelation() {
        List<UserPlayerRelation> list = userPlayerRelationMapper.selectAllUserPlayerRelation();
        return Result.Success((ArrayList)list);
    }
    public Result updateUserPlayerRelation(UserPlayerRelation userPlayerRelation) {
        int count = userPlayerRelationMapper.updateUserPlayerRelation(userPlayerRelation);
        return Result.Success(count);
    }
}
