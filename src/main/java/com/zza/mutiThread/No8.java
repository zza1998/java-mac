package com.zza.mutiThread;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

public class No8 {
    public static void main(String[] args) {
        No8 thing = new No8();
        new Thread(()->{
            while (true){
            if(thing.num % 2 == 0){
                System.out.println("single" + thing.num);
                thing.num++;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
             }}
        }).start();
        new Thread(()->{
            while (true){
            if (thing.num % 2 == 1) {
                System.out.println("double" + thing.num);
            }
            thing.num++;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

     int num = 0;

    public void single() {
        if (num % 2 == 0)

        num++;
    }

    public void doubles() {
        if (num % 2 == 1) {
            System.out.println("double" + num);
        }
        num++;
    }
}
