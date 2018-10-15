package com.transaction.failtransaction.proxy;

/**
 * 约会代理对象-月老
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
        before();
        girl.haveADate(msg);
        after();
    }



    //静态代理实现多代理，违反开闭原则，耦合度高
    @Override
    public void eat(String msg) {
        //增强
        before();
        beautifulGirl.eat(msg);
        after();
    }

    private void before() {//方法执行前
        System.out.println("方法执行前 ，月老帮你找到对象了!");
    }
    private void after() {//方法执行后
        System.out.println("方法执行后，月老求反馈");
    }
}
