package com.transaction.failtransaction.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class YueLaoFactory implements InvocationHandler{

    /**
     *  被代理对象
     */
    private  Object obj;


    /**
     * 通过proxy获取动态代理的对象
     * @return
     */
    public Object geyProxyInstance(Object o){
        this.obj=o;
        Object o1=Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),this);
        return o1;
    }

    /***
     * 通过动态代理增强
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object  object=method.invoke(obj,args);
        after();
        return object;
    }

    private void before() {//方法执行前
        System.out.println("方法执行前,月老工厂为您服务!");
    }
    private void after() {//方法执行后
        System.out.println("方法执行后，月老为您服务完毕");
    }
}
