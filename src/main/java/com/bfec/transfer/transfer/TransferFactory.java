package com.bfec.transfer.transfer;

import com.alibaba.fastjson.JSON;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.bfec.common.enums.OperationType;
import com.bfec.transfer.service.CommonService;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Service
public class TransferFactory {

    @Autowired
    SqlSession session;

    @Autowired
    CommonService service;

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

    public void transfer(TransferItem item) throws SQLException {
        ITransfer transfer = getTransfer(item.getType());
        transfer.serService(service);
        transfer.switchDataSource(session);
        transfer.transfer(item);
    }


    private static String jsonRead(File file) {
        Scanner scanner = null;
        StringBuilder buffer = new StringBuilder();
        try {
            scanner = new Scanner(file, "utf-8");
            while (scanner.hasNextLine()) {
                buffer.append(scanner.nextLine());
            }
        } catch (Exception e) {

        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
        return buffer.toString();
    }

    public static void writeDataToFile(String jsonStr) throws IOException {
        //文件目录
        Path rootLocation = Paths.get("config");
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

    public static List<TransferItem> load(File file) throws IOException {
        String s = jsonRead(file);
        List<TransferItem> items = JSON.parseArray(s, TransferItem.class);
        return items;
    }
}
