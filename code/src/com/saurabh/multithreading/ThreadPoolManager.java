package com.saurabh.multithreading;

/**
 * Created by Saurabh on 22-04-2016.
 */
public class ThreadPoolManager {

    MyQueue<Runnable> myQueue=new MyQueue<>();
    final int THREAD_Pool_CAPACITY;

    public ThreadPoolManager(int THREAD_Pool_CAPACITY) {
        this.THREAD_Pool_CAPACITY = THREAD_Pool_CAPACITY;

        initializePool();
    }

    private void initializePool() {

        for (int i = 0; i < THREAD_Pool_CAPACITY; i++) {
            new Thread(new Worker(myQueue, "Thread-" + i)).start();
        }
    }

     public void submitTask(Runnable r){

        myQueue.enQueue(r);
    }



}
