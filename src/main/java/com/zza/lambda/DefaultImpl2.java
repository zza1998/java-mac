package com.zza.lambda;

public class DefaultImpl2 implements Default {
    @Override
    public void takeIt() {
        System.out.println(super.getClass());
    }
}
