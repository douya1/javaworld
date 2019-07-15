package com.lihztest.middle.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsTest {
    public static void main(String[] args) {

//        reverse();
//        shuffle();
      //  sort();
//        swap();
//        rotate();
        test();;
    }

    static void test(){
        ArrayList<Integer> list = getList();

        System.out.println(list);
        int number = 0;
        for(int i=0;i<1000000;i++){
            Collections.shuffle(list);

            if(list.get(0).equals(Integer.valueOf("3"))
                && list.get(1).equals(Integer.valueOf("1"))
                && list.get(2).equals(Integer.valueOf("2")))
                number++;
        }
        System.out.println("3-1-2 has been appear for "+ number +"number of times");
    }

    static void rotate(){
        ArrayList<Integer> list = getList();
        System.out.println(list);
        Collections.rotate(list,1);
        System.out.println(list);
        Collections.synchronizedList(list);
    }

    static  void swap(){
        ArrayList<Integer> list = getList();
        System.out.println(list);
        Collections.swap(list,0,8);
        System.out.println(list);
    }

    static void sort(){
        ArrayList<Integer> list ;
        list = shuffle();

        Collections.sort(list);
        System.out.println(list);

    }

    static ArrayList<Integer> shuffle(){

        ArrayList<Integer> list = getList();
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        return list;
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
