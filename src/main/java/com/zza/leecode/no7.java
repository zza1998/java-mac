package com.zza.leecode;

import java.util.concurrent.Semaphore;

public class no7 {


    private Semaphore h=new Semaphore(2);
    private Semaphore o=new Semaphore(1);
    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {

        h.acquire(1);
        // releaseHydrogen.run() outputs "H". Do not change or remove this line.
        releaseHydrogen.run();
        o.release(1);
    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {
        h.acquire(2);
        // releaseOxygen.run() outputs "H". Do not change or remove this line.
        releaseOxygen.run();
        o.release(2);
    }


}
