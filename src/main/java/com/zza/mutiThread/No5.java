package com.zza.mutiThread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

public class No5 {
    AtomicInteger count=new AtomicInteger(0);
    void m(){
        for (int i=0;i<10000;i++){
            if (count.get()<1000){
                count.getAndIncrement();
            }

        }
    }

    public static void main(String[] args) {

        No5 n=new No5();
        List<Thread> threads =new ArrayList<>();

        for (int i=0;i<10;i++){
            threads.add(new Thread(n::m,"t"+i));
        }

        threads.forEach(Thread::start);
        threads.forEach((o)->{
            try {
                o.join();

            }catch (InterruptedException e){
                e.printStackTrace();
            }
        });

        System.out.println(n.count);
    }
}
