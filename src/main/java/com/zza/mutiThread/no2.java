package com.zza.mutiThread;

public class no2 implements Runnable{

    private int count = 10;

    @Override
    public  void run() {
        count--;
        System.out.println(Thread.currentThread().getName()+"count = "+ count);
    }

    public static void main(String[] args) {
        no2 n2=new no2();
        for (int i =0;i<5;i++){
            new Thread(n2,"Thread"+i).start();
        }
    }
}
