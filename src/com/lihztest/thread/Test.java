package com.lihztest.thread;

public class Test
{
    public  void main(String[] args) {

        System.out.println("11111");

        Thread t1 = new Thread(){
            @Override
            public void run() {
                int second = 0;
                while(true){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("after 10s");
                }
            }
        };
        t1.setDaemon(true);
        t1.start();
    }
}
