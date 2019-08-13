package com.lihztest.thread;

public class TestThread {
    public static void main(String[] args) {
        ThreadPool pool = new ThreadPool();

        for(int i=0;i<5;i++){
            Runnable r = new Runnable() {
                @Override
                public void run() {
                    System.out.println("eng+0300303");
                }
            };
            pool.add(r);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
