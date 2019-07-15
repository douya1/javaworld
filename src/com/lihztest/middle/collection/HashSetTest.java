package com.lihztest.middle.collection;

import com.lihztest.oot.Hero;

import javax.sound.midi.SoundbankResource;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        ArrayList<String> list = new ArrayList<>();

        for(int i=0; i<300; i++){
            String str = getRandomString(2);
            if(set.contains(str)){
                list.add(str);
            }else
            {
                set.add(str);
            }
        }
        for(String s : set){
            System.out.printf("[%s],", s);
        }
        System.out.println();
        System.out.println("the repeat elements have "+ list.size());
        System.out.println("they are : " + list.toString() );

    }

    /**
     * get random string from 0-9,a-z,A-Z
     * @param len random String`s len
     * @return
     */
    public static String getRandomString(int len){

        String pool ="";
        for(int i='0';i<='9';i++)
            pool+=(char)i;
        for(int i='A'; i<= 'Z'; i++){
            pool+=(char)i;
        }
        for(int i='a'; i<='z'; i++){
            pool+=(char)i;
        }
        char[] cs = new char[len];
        for(int i=0;i<len;i++){
            cs[i] = pool.charAt( (int)(Math.random()*(pool.length())));
        }
        return new String(cs);

    }

    static void fun1(){
        HashSet<Hero> set = new HashSet<>();
        set.add(new Hero("Hero1"));
        set.add(new Hero("Hero2"));
        set.add(new Hero("Hero3"));

        for(Hero h1: set)
            System.out.println(h1);

        for(Iterator<Hero> iterator = set.iterator();iterator.hasNext();){
            Hero h1 = iterator.next();
            System.out.println(h1);
        }
    }

}
