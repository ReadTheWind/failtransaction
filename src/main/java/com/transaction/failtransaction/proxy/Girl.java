package com.transaction.failtransaction.proxy;

/**
 * 真实对象
 */
public class Girl implements IDateService{


    @Override
    public void haveADate(String msg) {
//        System.out.println("约会？我把你当兄弟，你竟然想泡我！");
        System.out.println(msg);
    }
}
