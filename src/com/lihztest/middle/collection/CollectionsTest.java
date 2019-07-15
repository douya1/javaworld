package com.lihztest.middle.collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsTest {
    public static void main(String[] args) {

//        reverse();
        shuffle();
    }

    static void shuffle(){

        ArrayList<Integer> list = getList();
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
    }

    static void reverse(){

        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<10; i++){

            list.add(Integer.valueOf((int)(Math.random()*10)));
        }
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);
    }

    static ArrayList<Integer> getList(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<10; i++){

            list.add(Integer.valueOf(i));
        }
        return list;
    }
}
