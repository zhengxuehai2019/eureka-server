package com.example.eurekaserver.invercation;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
//        Map a = new HashMap();
//        a.put(null,null);
//        a.put(1,null);
//        for (Object o : a.keySet()) {
//            System.out.println(a.get(o));
//        }
//
//        // 保存生成的代理类的字节码文件
//        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
//        // JDK动态代理测试
//        Subject subject = new JdkDynamicProxy(new ImplSubject()).getProxy();
//        subject.doSome();
        Executors.newFixedThreadPool(5);

    }
}
