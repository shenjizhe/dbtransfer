package com.bfec.transfer.transfer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bfec.common.enums.OperationType;
import org.apache.tomcat.jni.File;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransferFactory {
    public List<TransferItem> load(String json) {
        // TODO: use json to load transfer items

        List<TransferItem> transferItems = JSON.parseArray(json, TransferItem.class);
        return transferItems;
    }

    public ITransfer getTransfer(OperationType type) {
        switch (type) {
            case Sum:
            case Count:
                return new AggregationTransfer();
            default:
                return null;
        }
    }

    public void transfer(TransferItem item) {
        ITransfer transfer = getTransfer(item.getType());
        transfer.transfer(item);
    }
}
