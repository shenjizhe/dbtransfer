package com.bfec.transfer.transfer;

import com.bfec.common.enums.OperationType;

import java.util.List;

public class TransferItem {
    public TransferItem(List<TransferSource> sources, List<TransferDestination> desctinations) {
        this.sources = sources;
        this.desctinations = desctinations;
    }

    List<TransferSource> sources;
    List<TransferDestination> desctinations;
    OperationType type;

    public OperationType getType() {
        return type;
    }

    public void setType(OperationType type) {
        this.type = type;
    }

    public List<TransferSource> getSources() {
        return sources;
    }

    public void setSources(List<TransferSource> sources) {
        this.sources = sources;
    }

    public List<TransferDestination> getDesctinations() {
        return desctinations;
    }

    public void setDesctinations(List<TransferDestination> desctinations) {
        this.desctinations = desctinations;
    }
}
