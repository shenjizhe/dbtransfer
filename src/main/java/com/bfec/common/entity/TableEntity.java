/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bfec.common.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Shenjizhe
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TableEntity {

    private String TABLE_NAME;
    private String TABLE_SCHEMA;
    private String TABLE_TYPE;
    private String AUTO_INCREMENT;
    private String TABLE_COMMENT;
}
