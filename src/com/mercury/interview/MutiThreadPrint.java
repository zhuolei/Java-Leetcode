package com.mercury.interview;

public class MutiThreadPrint {
    private int count = 10;
    class Print implements Runnable {
        private Object lock;
        @Override
        public void run() {
            synchronized(lock) {
                while(count <= 10) {
                    System.out.println(count);
                    count++;
                    try{
                        lock.notify();
                        while (count < 10) {
                            lock.wait();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
