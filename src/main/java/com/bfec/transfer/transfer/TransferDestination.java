package com.bfec.transfer.transfer;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TransferDestination {
    String tableName;
    String idColumn;
    String updateColumn;
}
