package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.DataLeagueRankCard;
import com.ninehcom.transfer.mapper.DataLeagueRankCardMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * DataLeagueRankCard的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class DataLeagueRankCardService {

    @Autowired
    private  DataLeagueRankCardMapper  dataLeagueRankCardMapper;
    public Result selectAllDataLeagueRankCard() {
        List<DataLeagueRankCard> list = dataLeagueRankCardMapper.selectAllDataLeagueRankCard();
        return Result.Success((ArrayList)list);
    }
    public Result selectDataLeagueRankCardById(int Id) {
        DataLeagueRankCard dataLeagueRankCard = dataLeagueRankCardMapper.selectDataLeagueRankCardById(Id);
        return Result.Success(dataLeagueRankCard);
    }
    public Result insertDataLeagueRankCard(DataLeagueRankCard dataLeagueRankCard) {
        int count = dataLeagueRankCardMapper.insertDataLeagueRankCard(dataLeagueRankCard);
        return Result.Success(count);
    }
    public Result updateDataLeagueRankCard(DataLeagueRankCard dataLeagueRankCard) {
        int count = dataLeagueRankCardMapper.updateDataLeagueRankCard(dataLeagueRankCard);
        return Result.Success(count);
    }
    public Result deleteDataLeagueRankCardById(int Id) {
        int count = dataLeagueRankCardMapper.deleteDataLeagueRankCardById(Id);
        return Result.Success(count);
    }
}
