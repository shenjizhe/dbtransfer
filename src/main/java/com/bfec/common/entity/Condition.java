/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bfec.common.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 *
 * @author Shenjizhe
 */
@Getter
@Setter
public class Condition implements Serializable{
    private String name;
    private String type;
    private String value;
}
