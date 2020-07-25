package com.bfec.transfer.transfer;

import com.bfec.transfer.mapper.CommonMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

public class AggregationTransfer implements ITransfer {

    @Autowired
    CommonMapper mapper;

    @Autowired
    TransferFactory factory;

    @Override
    public void transfer(TransferItem item) {
        //TODO: 连接池还没写
        item.sources.forEach(source -> {
            switch (source.ops) {
                case Sum:
                    mapper.sum(null, getSourceMap(source));
                    break;
                case Count:
                    mapper.count(null, getSourceMap(source));
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
    public Map getSourceMap(TransferSource source) {
        Map<String, String> map = new HashMap<>();
        map.put("table", source.tableName);
        map.put("group_text", source.idColumn);
        map.put("field_text", source.opsColumn);
        return map;
    }

    @Override
    public Map getDestMap(TransferDestination destination) {
//            <update id="update" parameterType="Map">
//                update
//        ${table}
//        set
//                <foreach collection="map" item="value" index="key"
//        open=" " separator="," close=" ">
//                ${key}=#{value}
//        </foreach>
//                where
//        ${condition}
//    </update>
        return null;
    }
}
