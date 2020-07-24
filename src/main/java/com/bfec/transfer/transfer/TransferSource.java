package com.bfec.transfer.transfer;

import com.bfec.common.enums.OperationType;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TransferSource {
    String tableName;
    String idColumn;
    OperationType ops;
    String opsColumn;
}
