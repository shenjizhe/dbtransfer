/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ninehcom.transfer.transfer;

import com.ninehcom.common.enums.ErrorCode;
import com.ninehcom.common.util.ListComparator;
import com.ninehcom.common.util.Result;
import com.ninehcom.transfer.entity.Translog;
import com.ninehcom.transfer.interfaces.IMapper;
import com.ninehcom.transfer.mapper.TranslogMapper;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public abstract class TransferBase<T1, T2> {

    public abstract T2 CreateDestination(T1 source, int id);
//ClubHistoryMapping mapping = new ClubHistoryMapping(team.getId(), club.getId());
//clubHistoryMappingMapper.insertClubHistoryMapping(mapping);

    public abstract void AddSameDataMapping(T1 obj1, T2 obj2);

//clubHistoryMapper.insertClubHistory(club);
//ClubHistoryMapping mapping = new ClubHistoryMapping(team.getId(), club.getId());
//clubHistoryMappingMapper.insertClubHistoryMapping(mapping);
    public abstract void AddDiffDataMapping(T1 obj1, T2 obj2);

    public abstract int getDestinationMaxId();

    public abstract TranslogMapper getTranslogger();

    public abstract IMapper getReseter();

    public Result trans(Class<T1> cls1, Class<T2> cls2, List<T1> list1, List<T2> list2, String tabl1, String table2, String key1, String key2) {

        TranslogMapper logger = getTranslogger();
        IMapper reseter = getReseter();
        if (reseter != null) {
            try {
                reseter.reset(tabl1, list1);
            } catch (Exception ex) {
                return Result.Fail(ErrorCode.Fail);
            }
        }

        Translog log = new Translog();
        int mappingCount = 0;
        ListComparator.Result result;
        try {
            ListComparator<T1, T2> comparator = new ListComparator(cls1, cls2, key1, key2);
            result = comparator.compare(list1, list2);

            log = result.getLog(list1, list2, tabl1, table2);
            Map<T1, T2> same = result.getSame();

            for (T1 obj1 : same.keySet()) {
                T2 obj2 = same.get(obj1);
                AddSameDataMapping(obj1, obj2);
                mappingCount++;
            }
        } catch (Exception ex) {
            log.setErr(ex.getMessage() + "\t" + ex.getStackTrace());
            Logger.getLogger(ClubHistoryTransfer.class.getName()).log(Level.SEVERE, null, ex);
            logger.insertTranslog(log);
            return Result.Fail(ErrorCode.Fail, ex);
        }

        int id = 0;
        try {
            id = getDestinationMaxId();
        } catch (Exception ex) {

        }

        log.setOldMaxId((long) id);
        try {
            List<T1> diff1 = result.getDiff1();
            for (T1 obj1 : diff1) {
                id++;
                T2 obj2 = null;
                try {
                    obj2 = CreateDestination(obj1, id);
                    AddDiffDataMapping(obj1, obj2);
                } catch (Exception ex) {
                    throw ex;
                }
                mappingCount++;
            }
            log.setMappingCount(mappingCount);
        } catch (Exception ex) {
            log.setErr(ex.getMessage() + "\t" + ex.getStackTrace());
            Logger.getLogger(ClubHistoryTransfer.class.getName()).log(Level.SEVERE, null, ex);
            logger.insertTranslog(log);
            return Result.Fail(ErrorCode.Fail, ex);
        }

        logger.insertTranslog(log);

        return Result.Success();
    }
}
