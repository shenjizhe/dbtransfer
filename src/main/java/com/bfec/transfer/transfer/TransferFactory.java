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
import java.util.ArrayList;
import java.util.List;

@Service
public class TransferFactory {
    public static void saveFile() throws IOException {
        List<TransferItem> list = new ArrayList<>();
        list.add(createItem("groupbatch_account", "batch_id", OperationType.Sum, "balance", "groupbatch_copy", "id", "totalBalance"));
        save(list);
    }

    private static TransferItem createItem(String sourceTable, String sourceID, OperationType ops, String opsColumn,
                                    String desctTable, String desID, String updateColumn) {
        List<TransferSource> sources = new ArrayList<>();
        List<TransferDestination> desctinations = new ArrayList<>();
        sources.add(new TransferSource(sourceTable, sourceID, ops, opsColumn));
        desctinations.add(new TransferDestination(desctTable, desID, updateColumn));
        TransferItem item = new TransferItem(sources, desctinations, OperationType.Sum);
        return item;
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

    public static String loadFromFile() throws IOException {
        Path rootLocation = Paths.get("folder");
        Path path = rootLocation.resolve("tran.conf");

        byte[] bytes = Files.readAllBytes(path);

        String s = String.valueOf(bytes);
        return s;
    }

    public static void writeDataToFile(String jsonStr) throws IOException {
        //文件目录
        Path rootLocation = Paths.get("folder");
        if (Files.notExists(rootLocation)) {
            Files.createDirectories(rootLocation);
        }
        Path path = rootLocation.resolve("tran.conf");
        byte[] strToBytes = jsonStr.getBytes();
        Files.write(path, strToBytes);
    }

    public static void save(List<TransferItem> list) throws IOException {
        String s = JSON.toJSONString(list);
        writeDataToFile(s);
    }

    public static List<TransferItem> load() throws IOException {
        String s = loadFromFile();
        List<TransferItem> items = JSON.parseArray(s, TransferItem.class);
        return items;
    }
}
