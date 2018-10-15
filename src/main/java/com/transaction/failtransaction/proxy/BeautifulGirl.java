package com.transaction.failtransaction.proxy;

public class BeautifulGirl implements IEatService {


    @Override
    public void eat(String msg) {
        System.out.println(msg);
    }
}
