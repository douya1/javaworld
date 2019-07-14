package com.lihztest.middle.collection;

import java.util.LinkedList;

public class MyStack implements Stack {

    public MyStack(){

        list = new LinkedList();
    }

    LinkedList<Object>  list;


    @Override
    public void push(Object a) {
        list.addLast(a);
    }

    @Override
    public Object pull() {
        return list.removeLast();
    }

    @Override
    public Object peek() {
        return list.getLast();
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "list=" + list +
                '}';
    }
}
