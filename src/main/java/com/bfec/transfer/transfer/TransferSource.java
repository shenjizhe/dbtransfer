package com.bfec.transfer.transfer;

import com.bfec.common.enums.OperationType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransferSource {
    String tableName;
    String idColumn;
    OperationType ops;
    String opsColumn;
}
