package com.bfec.transfer.service;

import com.bfec.common.util.Result;
import com.bfec.transfer.transfer.TransferEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class TransferService {
    @Autowired
    TransferEngine engine;

    public Result trans() throws IOException {
        // 1. load transfer config
        engine.transferAll();
        return Result.Success();
    }
}
