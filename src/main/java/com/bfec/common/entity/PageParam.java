/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bfec.common.entity;

import java.io.Serializable;

/**
 * 分页查询对象
 *
 * @author shenjizhe
 */
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

    public PageParam() {
        size = DEFAULT_SIZE;
        index = DEFAULT_INDEX;
        canPage = DEFAULT_CAN_PAGE;
    }

    /**
     * @return the size
     */
    public int getSize() {
        if (size < MIN_SIZE) {
            return MIN_SIZE;
        }
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @return the index
     */
    public int getIndex() {
        if (index < MIN_INDEX) {
            return MIN_INDEX;
        }
        return index;
    }

    /**
     * @param index the index to set
     */
    public void setIndex(int index) {
        this.index = index;
    }

    /**
     * @return the current
     */
    public int getCurrent() {
        current = index * size;
        return current;
    }

    /**
     * @param current the current to set
     */
    public void setCurrent(int current) {
        current = index * size;
        this.current = current;
    }

    /**
     * @return the canPage
     */
    public boolean isCanPage() {
        return canPage;
    }

    /**
     * @param canPage the canPage to set
     */
    public void setCanPage(boolean canPage) {
        this.canPage = canPage;
    }
}
