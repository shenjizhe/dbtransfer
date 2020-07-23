package com.bfec.transfer.transfer;

import com.bfec.common.enums.OperationType;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TransferItem {
    public TransferItem(List<TransferSource> sources, List<TransferDestination> destinations) {
        this.sources = sources;
        this.destinations = destinations;
    }

    List<TransferSource> sources;
    List<TransferDestination> destinations;
    OperationType type;

}
