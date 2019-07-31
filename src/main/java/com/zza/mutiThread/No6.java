package com.zza.mutiThread;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class No6 {

    List<Object> list = new LinkedList<>();
    public int size =list.size();

    public void add(){
        list.add(new Object());
    }
    public static void main(String[] args) {
        No6 n = new No6();
        CountDownLatch latch = new CountDownLatch(1);

        new Thread(()->{
            System.out.println("启动t2线程");
            if (n.list.size()!=5){
                try{
                    latch.await();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            System.out.println("线程t2结束");
        },"t2").start();

        try {
            TimeUnit.MILLISECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(()->{
            System.out.println("线程t1启动");
            for (int i = 0;i<10;i++){
                n.add();
                System.out.println(n.list.size());
                if (n.list.size() == 5){
                    latch.countDown();

                }
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


        },"t1").start();
    }

}
