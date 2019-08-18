package com.zza.beanTest;

public class Son extends Father{
    public Son() {
        System.out.println("子类构造方法");
    }
    static {
        System.out.println("子类静态块");
    }

    @Override
    public void method() {
        System.out.println("子类方法");
    }
}
