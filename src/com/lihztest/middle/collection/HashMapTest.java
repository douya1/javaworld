package com.lihztest.middle.collection;

import com.lihztest.oot.Hero;

import java.util.HashMap;
import java.util.LinkedList;

import static java.lang.System.currentTimeMillis;

public class HashMapTest {

    public static void main(String[] args) {

        LinkedList<Hero> list = new LinkedList<Hero>();
        HashMap<String, Hero> map = new HashMap();

        for(int i=0;i<10000000;i++)
        {
            String hName= "hero-" + (int)(1000+Math.random()*9999);
            Hero h= new Hero(hName);
            list.add(h);
            map.put("hero"+i, h);
        }

        long l1= System.currentTimeMillis();
        int i=0;
        for(Hero h2: list){
            if(h2.getName().equals("hero-5555"))
                i++;
        }
        long l2= System.currentTimeMillis();
        System.out.printf("hero-5555 hava %d, and take %d ms",i, l2-l1);


    }
}
