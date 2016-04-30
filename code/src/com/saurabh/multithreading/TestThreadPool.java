package com.saurabh.multithreading;

/**
 * Created by Saurabh on 23-04-2016.
 */
public class TestThreadPool {
    public static void main(String[] args) {
        ThreadPoolManager threadPoolManager=new ThreadPoolManager(10);

        for(int i=0;i<23;i++) {
            threadPoolManager.submitTask(new MyRunnable("task"+i)
            );
        }
//        threadPoolManager.submitTask(new Runnable() {
//                                         @Override
//                                         public void run() {
//                                             System.out.println("submitting task B");
//                                             try {
//                                                 Thread.sleep(100);
//                                             } catch (InterruptedException e) {
//                                                 e.printStackTrace();
//                                             }
//                                             System.out.println(" task B completed");
//                                         }
//                                     }
//        );
    }

    private static class MyRunnable implements Runnable {

        String name;

        public MyRunnable(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            System.out.println("submitting: "+this.name);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.name+"completed");
        }
    }
}
