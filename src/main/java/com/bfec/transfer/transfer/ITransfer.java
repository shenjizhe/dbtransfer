package com.bfec.transfer.transfer;

import java.util.Map;

public interface ITransfer {
    void transfer(TransferItem item);
    boolean check(TransferItem item);
    Map getSourceMap(TransferSource source);
    Map getDestMap(TransferDestination destination);
}
