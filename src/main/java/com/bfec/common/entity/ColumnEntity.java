/*
 * To change this license header; choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bfec.common.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Shenjizhe
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ColumnEntity {

    private String TABLE_SCHEMA;
    private String TABLE_NAME;
    private String COLUMN_NAME;
    private String IS_NULLABLE;
    private String DATA_TYPE;
    private String CHARACTER_MAXIMUM_LENGTH;
    private String COLUMN_TYPE;
    private String COLUMN_COMMENT;
}
