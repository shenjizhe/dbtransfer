/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ninehcom.transfer.interfaces;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Administrator
 */
public interface IMapper {
    void reset(List list);
    Map<Integer,Long> getMap();
}