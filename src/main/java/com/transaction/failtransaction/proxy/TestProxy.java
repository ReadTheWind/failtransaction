package com.transaction.failtransaction.proxy;

public class TestProxy {

    /**
     * 测试静态代理
     * @param args
     */
    public static void main(String args[]){
        //我觉得这个妹子不错，我想约她
        Girl girl=new Girl();
        //我就去找月老约她
        DateProxy dateProxy=new DateProxy(girl);
        //月老帮我和她去约会
        dateProxy.haveADate("约会？我把你当兄弟，你竟然想泡我！");

        System.out.println("************************");
        //静态代理实现多代理，违反开闭原则，耦合度高
        //约漂亮妹子吃饭
        BeautifulGirl beautifulGirl=new BeautifulGirl();
        DateProxy dateProxy2=new DateProxy(beautifulGirl);
        dateProxy2.eat("烛光晚餐");
    }
}
