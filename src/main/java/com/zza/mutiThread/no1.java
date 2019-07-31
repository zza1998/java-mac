package com.zza.mutiThread;

public class no1 {
    private int count= 10;
    private final Object o=new Object();

    public void m(){
        // 互斥锁
        synchronized (o){
            count--;
            System.out.println(Thread.currentThread().getName()+"count = "+count);
        }

    }

    public static void main(String[] args) {
        no1 n=new no1();
        for(int i =0;i<30;i++){
            new Thread(n::m,"Thread"+i).start();
        }
    }
}
