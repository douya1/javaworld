package com.lihztest.thread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class Test
{
    public static void main(String[] args) {

        for(int i=0 ;i<20;i ++){

            char c = (char) (Math.random()*('Z'+1-'A')+ 'A');
            System.out.println(c);
        }
    }
}
