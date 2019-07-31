package com.zza.mutiThread;

import java.util.concurrent.ConcurrentHashMap;

public class No4 {
    private int count = 10;

    public synchronized void m1(){
        count--;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"count = " + count);
    }
    public synchronized void m2(){
        count++;
        System.out.println(Thread.currentThread().getName()+"count = " + count);
    }

    public static void main(String[] args) {
        No4 n1=new No4();
        No4 n2=new No4();

        new Thread(() -> {
            n1.m1();
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            n2.m1();

        }).start();
        new Thread(() -> {
            n2.m1();
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            n1.m1();

        }).start();
    }
}
