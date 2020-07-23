package com.bfec.transfer.transfer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bfec.common.enums.OperationType;
import org.apache.tomcat.jni.File;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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

    public void writeDataToFile(String jsonStr) throws IOException {
        //文件目录
        Path rootLocation = Paths.get("folder");
        if(Files.notExists(rootLocation)){
            Files.createDirectories(rootLocation);
        }
        Path path = rootLocation.resolve("tran.conf");
        byte[] strToBytes = jsonStr.getBytes();
        Files.write(path, strToBytes);
    }

    public void save(List<TransferItem> list) throws IOException {
        String s = JSON.toJSONString(list);
        writeDataToFile(s);
    }

    public List<TransferItem> load(){
        return null;
    }
}
