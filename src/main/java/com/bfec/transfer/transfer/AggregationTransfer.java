package com.bfec.transfer.transfer;

import com.bfec.transfer.mapper.CommonMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

public class AggregationTransfer implements ITransfer {

    @Autowired
    CommonMapper mapper;

    @Autowired
    TransferFactory factory;

    @Override
    public void transfer(TransferItem item) {
        Map map = getMap(item);
        //TODO: 连接池还没写
        item.sources.forEach(source -> {
            switch (source.ops) {
                case Sum:
                    mapper.sum(null, map);
                    break;
                case Count:
                    mapper.count(null, map);
                    break;
                default:
                    break;
            }
        });
    }

    @Override
    public boolean check(TransferItem item) {
        // TODO: 检查结果是否正确转换
        return false;
    }

    @Override
    public Map getMap(TransferItem item) {
        //TODO：
        return null;
    }
}
