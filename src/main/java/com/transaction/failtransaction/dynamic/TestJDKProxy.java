package com.transaction.failtransaction.dynamic;

import com.transaction.failtransaction.proxy.BeautifulGirl;
import com.transaction.failtransaction.proxy.Girl;
import com.transaction.failtransaction.proxy.IDateService;
import com.transaction.failtransaction.proxy.IEatService;

public class TestJDKProxy {


    /**
     * 测试jdk动态代理
     * @param args
     */
    public static void main(String[] args){

        YueLaoFactory yueLaoFactory =new YueLaoFactory();
        IDateService iDateService=new Girl();
        IDateService iDate= (IDateService) yueLaoFactory.geyProxyInstance(iDateService);
       iDate.haveADate("约会？我把你当兄弟，你竟然想泡我！");

//        iDateService.haveADate("888");

//        System.out.println("*****************");
//        IEatService eatService=new BeautifulGirl();
//        IEatService ieat= (IEatService) yueLaoFactory.geyProxyInstance(eatService);
//        ieat.eat("烛光晚餐");


    }
}
