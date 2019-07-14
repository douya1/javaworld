package com.lihztest.middle.collection;

import com.lihztest.oot.Hero;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

    public static void main(String[] args) {

        //fun();
        fun2();
    }

    static void fun(){
        LinkedList<Hero> list = new LinkedList<>();
        for(int i=0; i<5; i++)
            list.add(new Hero("hero" +i));
        System.out.println(list);
        //add to the last
        list.offer(new Hero("Hero offer"));
        System.out.println(list);
        //remove the first element
        list.poll();
        System.out.println(list);
        //view the first element
        System.out.println(list.peek());

    }

    //realize Stack
    static  void fun2(){

        MyStack stack = new MyStack();
        for(int i=0 ;i<5; i++){
            stack.push(new Hero("hero " +i));
        }
        System.out.println(stack);
        stack.pull();
        System.out.println(stack);

    }
}
