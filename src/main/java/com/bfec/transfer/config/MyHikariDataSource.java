package com.bfec.transfer.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.jdbc.datasource.AbstractDataSource;
import java.io.Closeable;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author szs
 * @date 2019/3/14 14:30
 */
public class MyHikariDataSource extends AbstractDataSource {

    private static Map<String, HikariDataSource> dataSourceMap = new HashMap<>(1);

    @Override
    public Connection getConnection() throws SQLException {
        return dataSourceMap.get("1").getConnection();
    }

    @Override
    public Connection getConnection(String username, String password) throws SQLException {
        return dataSourceMap.get("1").getConnection(username, password);
    }

    private void destroy() {
        dataSourceMap.forEach((key, source) -> {
            Closeable closeable = (Closeable) source;
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void updateDataSourceMap(String key, HikariDataSource value) {
        dataSourceMap.put(key, value);
    }

    public HikariDataSource switchSource(String key) {
        return dataSourceMap.get(key);
    }
}