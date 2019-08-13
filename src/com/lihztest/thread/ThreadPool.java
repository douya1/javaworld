package com.lihztest.thread;

import java.util.ArrayList;
import java.util.LinkedList;

public class ThreadPool {

    int threadPollSize;

    //container
    LinkedList<Runnable> tasks = new LinkedList<>();

    //试图消费的线程
    public ThreadPool(){
        threadPollSize = 10;
        synchronized(tasks){
            for(int i=0; i<threadPollSize; i++){
                new TaskConsumeThread("task:"+i).start();
            }

        }
    }

    public  void add(Runnable task){
        synchronized(tasks){
            tasks.add(task);
            tasks.notifyAll();
        }
    }
    class TaskConsumeThread extends Thread{
        public TaskConsumeThread(String name ){
            super(name);

        }

        Runnable task;

        @Override
        public void run() {
            System.out.println("start :" + this.getName());
            while(true){
                synchronized(tasks){
                    while (tasks.size() == 0){
                        try {
                            tasks.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }
                    task = tasks.removeLast();
                    tasks.notifyAll();
                }
                System.out.println(this.getName() + "task has been excuting.");
                task.run();
            }

        }
    }
}
