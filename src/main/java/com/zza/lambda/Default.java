package com.zza.lambda;

public interface Default {
    /**
     * java1.8 新特性Default 方法，用在接口上继承的类默认实现
     */
    default void takeIt(){
        System.out.println("I AM DEFAULT METHOD");
    }
}
