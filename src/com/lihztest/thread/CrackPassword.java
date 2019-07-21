package com.lihztest.thread;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class CrackPassword {

    private static Queue<String> strs = new ArrayDeque<>();

    public static void main(String[] args) {

        Qlju q = new Qlju();
        q.run();
        System.out.println(strs);

        Thread r = new Thread(){
            @Override
            public void run() {
                if(strs.poll()==null)
                {
                    try {
                        sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

    }

    static class Qlju implements Runnable{
        @Override
        public void run() {
            char [] temps= new char[3];
            int len=0;//len
            char [] cs = new char[100];
            for(char c='0';c<='9';c++){
                cs[len++] = c;
            }
//            for(char c='A';c<='Z';c++){
//                cs[len++] = c;
//            }
//            for(char c='a';c<='z';c++){
//                cs[len++] = c;
//            }

            for(int i=0;i<len;i++)
                for(int j=0;j<len;j++)
                    for(int k=0;k<len;k++)
                    {
                        temps[0]=cs[i];
                        temps[1]=cs[j];
                        temps[2]=cs[k];
                        strs.add(String.valueOf(temps));
                    }

        }

    }

}
