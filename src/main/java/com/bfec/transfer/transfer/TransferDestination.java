package com.bfec.transfer.transfer;

public class TransferDestination {
    String tableName;
    String idColumn;
    String updateColumn;

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

    public String getUpdateColumn() {
        return updateColumn;
    }

    public void setUpdateColumn(String updateColumn) {
        this.updateColumn = updateColumn;
    }
}
