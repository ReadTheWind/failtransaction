package com.transaction.failtransaction.proxy;

/**
 * 约会代理对象
 */
public class DateProxy implements IDateService,IEatService{

    //包含真实对象
    Girl girl;

    BeautifulGirl beautifulGirl;

    public DateProxy(Girl girl){
        this.girl=girl;
    }

    public DateProxy(BeautifulGirl beautifulGirl){
        this.beautifulGirl=beautifulGirl;
    }

    @Override
    public void haveADate(String msg) {
        //增强
        System.out.println("月老帮你找到对象了！");
        girl.haveADate(msg);
        System.out.println("月老求反馈");
    }



    //静态代理实现多代理，违反开闭原则，耦合度高
    @Override
    public void eat(String msg) {
        //增强
        System.out.println("月老帮你找到对象了！");
        beautifulGirl.eat(msg);
        System.out.println("月老求反馈");
    }
}
