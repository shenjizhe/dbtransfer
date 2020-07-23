/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bfec.common.entity;

import org.json.JSONObject;

/**
 *
 * @author Administrator
 */
public abstract class EntityBaseStringable {

    @Override
    public String toString() {
        return new JSONObject(this).toString();
    }
}
