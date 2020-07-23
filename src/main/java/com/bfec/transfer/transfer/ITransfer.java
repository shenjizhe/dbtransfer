package com.bfec.transfer.transfer;

import java.util.Map;

public interface ITransfer {
    void transfer(TransferItem item);
    boolean check(TransferItem item);
    Map getMap(TransferItem item);
}
