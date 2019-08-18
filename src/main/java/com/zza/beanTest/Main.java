package com.zza.beanTest;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicIntegerArray;

public class Main {
    public static void main(String[] args) {
        Father s = new Son();
        s.method();
        AtomicIntegerArray integerArray = new AtomicIntegerArray(100000);
        for (int i = 0;i<1000;i++){
            Integer h = i;
        }
        System.gc();
        canCall aa = new canCall();
        FutureTask<Integer> fu = new FutureTask<>(aa);
        new Thread(fu).start();
        try {
            Integer sum = fu.get();
            System.out.println(sum);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

   static class canCall implements Callable<Integer>{

        @Override
        public Integer call() throws Exception {
            System.out.println("this ");
            return 0;
        }
    }
}
