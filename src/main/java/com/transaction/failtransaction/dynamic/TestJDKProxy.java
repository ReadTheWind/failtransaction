package com.transaction.failtransaction.dynamic;

import com.transaction.failtransaction.proxy.BeautifulGirl;
import com.transaction.failtransaction.proxy.Girl;
import com.transaction.failtransaction.proxy.IDateService;
import com.transaction.failtransaction.proxy.IEatService;

public class TestJDKProxy {

    interface Subject{
        void sayHi();
        void sayHello();
    }

    static class SubjectImpl implements Subject{

        @Override
        public void sayHi() {
            System.out.println("hi");
        }

        @Override
        public void sayHello() {
            System.out.println("hello");
        }
    }

    /**
     * 测试jdk动态代理
     * @param args
     */
    public static void main(String[] args){

        YueLaoFactory yueLaoFactory =new YueLaoFactory();
        IDateService iDateService=new Girl();
//        IDateService iDate= (IDateService) yueLaoFactory.geyProxyInstance(iDateService);
//       iDate.haveADate("约会？我把你当兄弟，你竟然想泡我！");
//       System.out.println("*****************");
        iDateService.haveADate("888");
        System.out.println("*****************");
        IEatService eatService=new BeautifulGirl();
        IEatService ieat= (IEatService) yueLaoFactory.geyProxyInstance(eatService);
        ieat.eat("烛光晚餐");

//        Subject subject=new SubjectImpl();
//        JDKProxy  jdkProxy=new JDKProxy();
//        Subject s= (Subject) jdkProxy.newProxy(subject);
//        s.sayHi();
//        s.sayHello();

    }
}
