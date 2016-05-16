/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.Errlog;
import com.ninehcom.transfer.interfaces.IMapper;
import com.ninehcom.transfer.interfaces.IReset;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Shenjizhe
 */
@Component
public abstract class MapperBase implements IMapper {

    @Autowired
    ErrlogMapper errlogMapper;

    @Override
    public void reset(String table, List list) {
        Map<Integer, Long> map = getMap();
        List errList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            IReset item = (IReset) list.get(i);
            try {
                item.set(map.get(item.get()).intValue());
            } catch (Exception ex) {
                errList.add(item);
                Errlog log = new Errlog();
                log.setKey(item.get().toString());
                log.setTable(table);
                log.setTime(new Date());
                log.setTitle("导入错误，映射不存在");
                JSONObject obj = new JSONObject(item);
                log.setData(obj.toString());
                errlogMapper.insertErrlog(log);
            }
        }
        
        for (int i = 0; i < errList.size(); i++) {
            list.remove(errList.get(i));
        }
    }
}
