package com.lihztest.middle.collection;

public class Entry {

    private String key;
    private Object obj;
    public  Entry(String str, Object o){
        key = str;
        obj = o;
    }

    public String getKey() {
        return key;
    }

    public Object getObj() {
        return obj;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "key='" + key + '\'' +
                ", obj=" + obj +
                '}';
    }
}
