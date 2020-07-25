package com.bfec.transfer.transfer;

import com.bfec.transfer.service.CommonService;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AggregationTransfer implements ITransfer {

    private SqlSession session;
    private CommonService service;

    @Override
    public void serService(CommonService service) {
        this.service = service;
    }

    @Override
    public void switchDataSource(SqlSession session) {
        this.session = session;
    }

    @Override
    public void transfer(TransferItem item) {
        TransferDestination destination = item.destinations.get(0);

        item.sources.forEach(source -> {
            List<HashMap> list = null;
            switch (source.ops) {
                case Sum:
                    list = service.sum(getSourceMap(source));
                    break;
                case Count:
                    list = service.count(getSourceMap(source));
                    break;
                default:
                    break;
            }

            list.forEach(kv -> {
                Integer k = (Integer) kv.get("k");
                Double v = (Double) kv.get("v");

                String condition = destination.idColumn + "=" + k;
                service.change(destination.tableName, getDestMap(destination, v), condition);
            });

        });
    }

    @Override
    public boolean check(TransferItem item) {
        return false;
    }

    @Override
    public boolean checkParam(TransferItem item) {
        return false;
    }

    Map getSourceMap(TransferSource source) {
        Map<String, String> map = new HashMap<>();
        map.put("table", source.tableName);
        map.put("group_text", source.idColumn);
        map.put("field_text", source.opsColumn);
        return map;
    }

    Map getDestMap(TransferDestination destination, Double v) {
        Map map = new HashMap<>();
        map.put(destination.updateColumn, v);
        return map;
    }
}
