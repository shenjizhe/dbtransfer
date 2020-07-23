package com.bfec.transfer.transfer;

import com.bfec.common.enums.OperationType;

public class TransferSource {
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getIdColumn() {
        return idColumn;
    }

    public void setIdColumn(String idColumn) {
        this.idColumn = idColumn;
    }

    public OperationType getOps() {
        return ops;
    }

    public void setOps(OperationType ops) {
        this.ops = ops;
    }

    public String getOpsColumn() {
        return opsColumn;
    }

    public void setOpsColumn(String opsColumn) {
        this.opsColumn = opsColumn;
    }

    String tableName;
    String idColumn;
    OperationType ops;
    String opsColumn;
}
