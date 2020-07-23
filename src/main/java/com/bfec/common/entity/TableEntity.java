/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bfec.common.entity;

/**
 *
 * @author Administrator
 */
public class TableEntity {

    private String TABLE_NAME;
    private String TABLE_SCHEMA;
    private String TABLE_TYPE;
    private String AUTO_INCREMENT;
    private String TABLE_COMMENT;

    public TableEntity() {
    }

    public TableEntity(String TABLE_NAME, String TABLE_SCHEMA, String TABLE_TYPE, String AUTO_INCREMENT, String TABLE_COMMENT) {
        this.TABLE_NAME = TABLE_NAME;
        this.TABLE_SCHEMA = TABLE_SCHEMA;
        this.TABLE_TYPE = TABLE_TYPE;
        this.AUTO_INCREMENT = AUTO_INCREMENT;
        this.TABLE_COMMENT = TABLE_COMMENT;
    }

    /**
     * @return the TABLE_NAME
     */
    public String getTABLE_NAME() {
        return TABLE_NAME;
    }

    /**
     * @param TABLE_NAME the TABLE_NAME to set
     */
    public void setTABLE_NAME(String TABLE_NAME) {
        this.TABLE_NAME = TABLE_NAME;
    }

    /**
     * @return the TABLE_SCHEMA
     */
    public String getTABLE_SCHEMA() {
        return TABLE_SCHEMA;
    }

    /**
     * @param TABLE_SCHEMA the TABLE_SCHEMA to set
     */
    public void setTABLE_SCHEMA(String TABLE_SCHEMA) {
        this.TABLE_SCHEMA = TABLE_SCHEMA;
    }

    /**
     * @return the TABLE_TYPE
     */
    public String getTABLE_TYPE() {
        return TABLE_TYPE;
    }

    /**
     * @param TABLE_TYPE the TABLE_TYPE to set
     */
    public void setTABLE_TYPE(String TABLE_TYPE) {
        this.TABLE_TYPE = TABLE_TYPE;
    }

    /**
     * @return the AUTO_INCREMENT
     */
    public String getAUTO_INCREMENT() {
        return AUTO_INCREMENT;
    }

    /**
     * @param AUTO_INCREMENT the AUTO_INCREMENT to set
     */
    public void setAUTO_INCREMENT(String AUTO_INCREMENT) {
        this.AUTO_INCREMENT = AUTO_INCREMENT;
    }

    /**
     * @return the TABLE_COMMENT
     */
    public String getTABLE_COMMENT() {
        return TABLE_COMMENT;
    }

    /**
     * @param TABLE_COMMENT the TABLE_COMMENT to set
     */
    public void setTABLE_COMMENT(String TABLE_COMMENT) {
        this.TABLE_COMMENT = TABLE_COMMENT;
    }

}
