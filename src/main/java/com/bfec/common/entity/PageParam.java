/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bfec.common.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * 分页查询对象
 *
 * @author shenjizhe
 */
@Getter
@Setter
@NoArgsConstructor
public class PageParam implements Serializable{

    public final int MIN_SIZE = 1;
    public final int MIN_INDEX = 0;
    public final int DEFAULT_SIZE = 10;
    public final int DEFAULT_INDEX = 0;
    public final boolean DEFAULT_CAN_PAGE = true;

    private int size;
    private int index;
    private int current;
    private boolean canPage;
}
