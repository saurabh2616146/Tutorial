package com.saurabh.multithreading;

/**
 * Created by Saurabh on 21-04-2016.
 */
public interface IQueue <E> {

     void enQueue(E e);
        E deQueue();
}
