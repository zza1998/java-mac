package com.zza.mutiThread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class No7 {
    Lock lock = new ReentrantLock();
    void m1(){
        try {
            lock.lock();
            for (int i = 0;i<10;i++){
                Thread.sleep(1000);
                System.out.println(i);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    void m2(){
        lock.lock();
        System.out.println("m2 ----------");
        lock.unlock();
    }

    public static void main(String[] args) {
        No7 n = new No7();
        new Thread(n::m1).start();
        new Thread(n::m2).start();
    }
}
