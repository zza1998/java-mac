package com.zza.mutiThread;

public class No3 {
    public synchronized void m1(){
        System.out.println(Thread.currentThread().getName()+"thread start ----");
        try {
            Thread.sleep(10000L);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"thread end -----");
    }

    public void m2(){
        try {
            Thread.sleep(5000L);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"m2");
    }

    public static void main(String[] args) {
        No3 n=new No3();

        new Thread(n::m1,"t1").start();
        new Thread(n::m2,"t2").start();
    }
}
