/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bfec.transfer.interfaces;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Shenjizhe
 */
public interface IMapper {
    void reset(String table,List list);
    Map<Integer,Long> getMap();
}
