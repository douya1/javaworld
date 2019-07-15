package com.lihztest.middle.collection;

import com.lihztest.oot.Hero;

import javax.sound.midi.SoundbankResource;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

import static java.lang.System.currentTimeMillis;

public class HashMapTest {

    public static void main(String[] args) {

        //reverseMap();

        //fun1();
        linkedSetTest();
    }

    static void linkedSetTest(){

        LinkedHashSet<Character> ls = new LinkedHashSet<Character>();

        String str = String.valueOf(Math.PI);
        System.out.println(str);
        char [] cs = str.toCharArray();
        for(char c:cs){
            if(c>='0' && c<='9')
                ls.add(c);
        }
        System.out.println(ls);
    }

    static void reverseMap(){
        HashMap<String,String> map = new HashMap<>();
        HashMap<String,String> remap = new HashMap<>();
        map.put("a","1");
        map.put("b","2");
        map.put("c","3");
        System.out.println(map);

        Set<String> keySet = map.keySet();

        for(String s :keySet){
            remap.put(map.get(s),s);
        }
        System.out.println(remap);

    }
    static void fun1(){
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
