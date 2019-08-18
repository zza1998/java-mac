package com.zza.beanTest;

public class Father {
    public Father() {
        System.out.println("父类构造方法");
    }
    static {
        System.out.println("父类静态块");
    }
    public void method(){
        System.  out.println("父类方法");

    }
    public static final int i = 0;
}
