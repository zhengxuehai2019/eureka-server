package com.example.eurekaserver.invercation;

public class ImplSubject implements Subject {
    @Override
    public void doSome() {
        System.out.println("做了一些事情~~~first");
    }
}
