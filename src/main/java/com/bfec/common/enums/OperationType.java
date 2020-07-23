package com.bfec.common.enums;

/*
operation for db transfer
 */
public enum OperationType {
    Sum(0x0001,"sum"),
    Count(0x0002,"count"),
    ;
    int type;
    String name;

    OperationType(int type, String name) {
        this.type = type;
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
