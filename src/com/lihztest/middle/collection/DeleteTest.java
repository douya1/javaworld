package com.lihztest.middle.collection;

import com.lihztest.oot.Hero;

import java.util.ArrayList;
import java.util.List;

public class DeleteTest {

    public static void main(String[] args) {

        List<Hero> list = new ArrayList<>();

        for(int i=0;i<100; i++){
            list.add(new Hero("Sper Hero "+ i));
        }
        System.out.println(list);
        //creat a new list for delele
        List<Hero> deleleList = new ArrayList<>();
        for(int i=0; i<100; i++){
            if(i % 8 == 0)
                deleleList.add(list.get(i));
        }

        //list.removeAll(deleleList);
        for(Hero h1 : deleleList)
            list.remove(h1);
        System.out.println(list);
    }
}
