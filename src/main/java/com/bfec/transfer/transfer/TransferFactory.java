package com.bfec.transfer.transfer;

import com.bfec.common.enums.OperationType;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransferFactory {
    public List<TransferItem> load(String fileName){
        // TODO: use json to load transfer items
        return null;
    }

    public ITransfer getTransfer(OperationType type)  {
        switch (type) {
            case Sum:
            case Count:
                return new AggregationTransfer();
            default:
                return null;
        }
    }

    public void transfer(TransferItem item){
        ITransfer transfer =getTransfer(item.getType());
        transfer.transfer(item);
    }
}