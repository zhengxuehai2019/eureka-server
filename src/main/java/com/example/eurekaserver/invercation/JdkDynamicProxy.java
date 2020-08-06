package com.example.eurekaserver.invercation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkDynamicProxy implements InvocationHandler {
    private Object object;

    public JdkDynamicProxy(Object object) {
        this.object = object;
    }

    public <T> T getProxy(){
        return (T) Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理类的前置操作：。。。");
        Object result = method.invoke(object,args);
        System.out.println("代理类的后置操作：。。。");
        return result;
    }
}
