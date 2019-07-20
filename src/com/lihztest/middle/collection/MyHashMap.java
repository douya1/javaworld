package com.lihztest.middle.collection;

import java.util.ArrayList;

public class MyHashMap {

    private ArrayList<Entry> [] arrayLists = new ArrayList[2000];

    public boolean put(String key, Object value){

        if(key==null || key.length() == 0)
            return false;

        int keyHashCode = HashCodeTest.getHashCode(key);

        ArrayList<Entry> a1 = arrayLists[keyHashCode];
        if(a1==null) {
            a1 = new ArrayList();
            arrayLists[keyHashCode] = a1;
            a1.add(new Entry(key, value));
        }
        else
            a1.add(new Entry(key, value));
        return true;
    }

    public Object get(String key){

        if(key==null || key.length() == 0)
            return null;

        int keyHashCode = HashCodeTest.getHashCode(key);
        ArrayList<Entry> a1 = arrayLists[keyHashCode];
        if(a1==null)
            return null;
        for(Entry e:a1){
            if(key.equals(e.getKey()))
                return e.getObj();
        }
        return null;
    }

    public static void main(String[] args) {
        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put("1","a");
        System.out.println(myHashMap.get("1"));
    }

}
