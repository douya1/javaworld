package com.lihztest.middle.collection;

import com.lihztest.oot.Col;
import com.lihztest.oot.Hero;
import com.lihztest.oot.Item;

import java.util.ArrayList;

public class Test2 {

    public static void main(String[] args) {
        ArrayList<Col> cols =  new ArrayList<>();

        Hero h1 = new Hero("hero1");
        cols.add(h1);
        Item i1 =  new Item("Item1");
        cols.add(i1);
    }



}
