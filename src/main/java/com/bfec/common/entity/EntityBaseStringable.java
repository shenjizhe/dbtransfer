package com.bfec.common.entity;

import com.alibaba.fastjson.JSON;

/**
 * @author Shenjizhe
 */
public abstract class EntityBaseStringable {

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
