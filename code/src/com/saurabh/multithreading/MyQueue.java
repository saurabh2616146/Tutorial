package com.saurabh.multithreading;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Saurabh on 21-04-2016.
 */
public class MyQueue<E> implements IQueue<E> {

    private  Queue<E> queue=new LinkedList<E>();

    @Override
    public synchronized void enQueue(E e) {
        queue.add(e);
        notifyAll();
    }

    @Override
    public synchronized E deQueue() {
        E e;
        while(queue.isEmpty()){
            try {
                wait();
            } catch (InterruptedException in) {
                in.printStackTrace();
            }
        }
        e=queue.remove();
        return e;
    }
}
