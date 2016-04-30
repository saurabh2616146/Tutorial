package com.saurabh.multithreading;

/**
 * Created by Saurabh on 22-04-2016.
 */
public class Worker implements Runnable {

    private MyQueue<Runnable> myQueue;
    private String threadName;

    public Worker(MyQueue<Runnable> myQueue, String threadName) {
        this.myQueue = myQueue;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        while(true){
            Runnable r=myQueue.deQueue();
            System.out.println("Task Taken by thread : "+this.threadName);
            r.run();
            System.out.println("Task completed by thread : "+this.threadName);
        }
    }
}
