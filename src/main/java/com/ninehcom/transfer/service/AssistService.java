package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.Assist;
import com.ninehcom.transfer.mapper.AssistMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Assist的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class AssistService {

    @Autowired
    private  AssistMapper  assistMapper;
    public Result selectAllAssist() {
        List<Assist> list = assistMapper.selectAllAssist();
        return Result.Success((ArrayList)list);
    }
    public Result selectAssistById(int Id) {
        Assist assist = assistMapper.selectAssistById(Id);
        return Result.Success(assist);
    }
}
