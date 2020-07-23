package com.bfec.transfer.transfer;

import com.bfec.common.enums.OperationType;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TransferItem {
    public TransferItem(List<TransferSource> sources, List<TransferDestination> desctinations) {
        this.sources = sources;
        this.desctinations = desctinations;
    }

    List<TransferSource> sources;
    List<TransferDestination> desctinations;
    OperationType type;

}
