package com.ninehcom.transfer.service;

import com.ninehcom.transfer.entity.MatchVideo;
import com.ninehcom.transfer.mapper.MatchVideoMapper;
import com.ninehcom.common.entity.PageParam;
import com.ninehcom.common.util.Result;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * MatchVideo的Service
 * @author shenjizhe
 * @version 1.0.0
 */
@Service
public class MatchVideoService {

    @Autowired
    private  MatchVideoMapper  matchVideoMapper;
    public Result selectAllMatchVideo() {
        List<MatchVideo> list = matchVideoMapper.selectAllMatchVideo();
        return Result.Success((ArrayList)list);
    }
    public Result selectMatchVideoById(int Id) {
        MatchVideo matchVideo = matchVideoMapper.selectMatchVideoById(Id);
        return Result.Success(matchVideo);
    }
    public Result insertMatchVideo(MatchVideo matchVideo) {
        int count = matchVideoMapper.insertMatchVideo(matchVideo);
        return Result.Success(count);
    }
    public Result updateMatchVideo(MatchVideo matchVideo) {
        int count = matchVideoMapper.updateMatchVideo(matchVideo);
        return Result.Success(count);
    }
    public Result deleteMatchVideoById(int Id) {
        int count = matchVideoMapper.deleteMatchVideoById(Id);
        return Result.Success(count);
    }
}
