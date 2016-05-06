/*
 * To change this license header; choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ninehcom.common.entity;

/**
 *
 * @author Administrator
 */
public class ColumnEntity {

    private String TABLE_SCHEMA;
    private String TABLE_NAME;
    private String COLUMN_NAME;
    private String IS_NULLABLE;
    private String DATA_TYPE;
    private String CHARACTER_MAXIMUM_LENGTH;
    private String COLUMN_TYPE;
    private String COLUMN_COMMENT;

    public ColumnEntity() {
    }

    public ColumnEntity(String TABLE_SCHEMA, String TABLE_NAME, String COLUMN_NAME, String IS_NULLABLE, String DATA_TYPE, String CHARACTER_MAXIMUM_LENGTH, String COLUMN_TYPE, String COLUMN_COMMENT) {
        this.TABLE_SCHEMA = TABLE_SCHEMA;
        this.TABLE_NAME = TABLE_NAME;
        this.COLUMN_NAME = COLUMN_NAME;
        this.IS_NULLABLE = IS_NULLABLE;
        this.DATA_TYPE = DATA_TYPE;
        this.CHARACTER_MAXIMUM_LENGTH = CHARACTER_MAXIMUM_LENGTH;
        this.COLUMN_TYPE = COLUMN_TYPE;
        this.COLUMN_COMMENT = COLUMN_COMMENT;
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
     * @return the COLUMN_NAME
     */
    public String getCOLUMN_NAME() {
        return COLUMN_NAME;
    }

    /**
     * @param COLUMN_NAME the COLUMN_NAME to set
     */
    public void setCOLUMN_NAME(String COLUMN_NAME) {
        this.COLUMN_NAME = COLUMN_NAME;
    }

    /**
     * @return the IS_NULLABLE
     */
    public String getIS_NULLABLE() {
        return IS_NULLABLE;
    }

    /**
     * @param IS_NULLABLE the IS_NULLABLE to set
     */
    public void setIS_NULLABLE(String IS_NULLABLE) {
        this.IS_NULLABLE = IS_NULLABLE;
    }

    /**
     * @return the DATA_TYPE
     */
    public String getDATA_TYPE() {
        return DATA_TYPE;
    }

    /**
     * @param DATA_TYPE the DATA_TYPE to set
     */
    public void setDATA_TYPE(String DATA_TYPE) {
        this.DATA_TYPE = DATA_TYPE;
    }

    /**
     * @return the CHARACTER_MAXIMUM_LENGTH
     */
    public String getCHARACTER_MAXIMUM_LENGTH() {
        return CHARACTER_MAXIMUM_LENGTH;
    }

    /**
     * @param CHARACTER_MAXIMUM_LENGTH the CHARACTER_MAXIMUM_LENGTH to set
     */
    public void setCHARACTER_MAXIMUM_LENGTH(String CHARACTER_MAXIMUM_LENGTH) {
        this.CHARACTER_MAXIMUM_LENGTH = CHARACTER_MAXIMUM_LENGTH;
    }

    /**
     * @return the COLUMN_TYPE
     */
    public String getCOLUMN_TYPE() {
        return COLUMN_TYPE;
    }

    /**
     * @param COLUMN_TYPE the COLUMN_TYPE to set
     */
    public void setCOLUMN_TYPE(String COLUMN_TYPE) {
        this.COLUMN_TYPE = COLUMN_TYPE;
    }

    /**
     * @return the COLUMN_COMMENT
     */
    public String getCOLUMN_COMMENT() {
        return COLUMN_COMMENT;
    }

    /**
     * @param COLUMN_COMMENT the COLUMN_COMMENT to set
     */
    public void setCOLUMN_COMMENT(String COLUMN_COMMENT) {
        this.COLUMN_COMMENT = COLUMN_COMMENT;
    }
}
