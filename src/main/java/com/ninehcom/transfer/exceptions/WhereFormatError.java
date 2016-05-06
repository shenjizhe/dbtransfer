/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ninehcom.transfer.exceptions;

/**
 *
 * @author Administrator
 */
public class WhereFormatError extends Exception{
    private String sql;

    public WhereFormatError(String sql) {
        super(); 
        this.sql = sql;
    }

    /**
     * @return the sql
     */
    public String getSql() {
        return sql;
    }

    /**
     * @param sql the sql to set
     */
    public void setSql(String sql) {
        this.sql = sql;
    }
}
