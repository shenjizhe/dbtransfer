package com.bfec.transfer.transfer;

import com.bfec.transfer.service.CommonService;
import org.apache.ibatis.session.SqlSession;

public interface ITransfer {
    void serService(CommonService service);

    void switchDataSource(SqlSession session);

    void transfer(TransferItem item);

    boolean check(TransferItem item);

    boolean checkParam(TransferItem item);
}
