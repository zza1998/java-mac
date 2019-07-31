package com.zza.mutiThread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

public class ReentrantLock {
    Lock lock = new java.util.concurrent.locks.ReentrantLock();
    void m1(){
        try {
            lock.lock();
            for (int i = 0;i<10;i++){
                Thread.sleep(2000);

                System.out.println(i);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    void m2(){
        boolean islock = false;
        try {
            islock = lock.tryLock(5, TimeUnit.SECONDS);
            System.out.println("m2 ----------" + islock);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        if (islock)lock.unlock();
    }
    public static void main(String[] args) {
        No7 n = new No7();
        new Thread(n::m1).start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(n::m2).start();
    }
}
