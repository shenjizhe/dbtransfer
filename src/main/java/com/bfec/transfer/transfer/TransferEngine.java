package com.bfec.transfer.transfer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransferEngine {

    @Autowired
    private TransferFactory factory;

    private List<TransferItem> list;

    public  void  load(String name){

    }

    public  void  transferAll(){
        list.forEach(item->{

        });
    }

    public void  transfer(String name){

    }
}
