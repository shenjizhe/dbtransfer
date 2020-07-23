package com.bfec.transfer.transfer;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransferDestination {
    String tableName;
    String idColumn;
    String updateColumn;
}
