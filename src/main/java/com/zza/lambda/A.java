package com.zza.lambda;

import lombok.Data;

@Data
public class A {
    private Integer a;
    private Integer b;

    public A(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }
}
