package com.zza.ccc;

import java.util.*;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.function.IntBinaryOperator;

public class fff {
    public static void main(String[] args) {
        doSomething();
    }

    private static void doSomething() {
        AtomicIntegerArray array = new AtomicIntegerArray(10);
        array.set(0,10);
        array.set(1,20);
        array.set(5,33);
        IntBinaryOperator i = (left, right) -> left+2*right;
        array.accumulateAndGet(0,27, i);
        System.out.println(array.getAndIncrement(5));
        System.out.println(array);
        List<Integer> list = new LinkedList<>();
        Collection s= Collections.synchronizedCollection(new ArrayList<>());

    }
}
