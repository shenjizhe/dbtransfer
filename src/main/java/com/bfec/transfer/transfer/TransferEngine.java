package com.bfec.transfer.transfer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Path;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

@Service
public class TransferEngine {
    @Autowired
    private TransferFactory factory;

    public void transferAll() {
        File path = new File("config/");
        List<File> files = Arrays.asList(path.listFiles());
        files.forEach(file -> {
            try {
                transfer(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    public void transfer(File file) throws IOException {
        List<TransferItem> items = factory.load(file);
        items.forEach(item -> {
            try {
                factory.transfer(item);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        });
    }
}
