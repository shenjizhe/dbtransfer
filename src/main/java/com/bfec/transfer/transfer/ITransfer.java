package com.bfec.transfer.transfer;

public interface ITransfer {
    void transfer(TransferItem item);
    boolean check(TransferItem item);
}
