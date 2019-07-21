package com.lihztest.middle.Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class TestLambda {

    public static void main(String[] args) {
//        Supplier<List> s = new Supplier<List>(){
//
//            @Override
//            public List get() {
//                return new ArrayList();
//            }
//        };
//
//        List list1 = getList(s);
        List list2 = getList(()->new ArrayList());
        List list3 = getList(ArrayList::new);
    }

    public static List getList(Supplier<List> s){
        return s.get();
    }
}
