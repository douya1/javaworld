package com.lihztest.middle.collection;

import java.util.Arrays;

public class HashCodeTest {
    public static void main(String[] args) {

        for(int i=0; i<= 100;i++){
            String str = HashSetTest.getRandomString((int)(Math.random()*8+2));
            System.out.printf("%s hashCode is[%d]\n", str, getHashCode(str));
        }
    }
    public static int getHashCode(String str){

        int hashcode = 0;
        if(null == str || 0==str.length())
            return hashcode;
        char [] cs = str.toCharArray();
        for(char c:cs){
            hashcode += c;
        }
        hashcode *=23;
        return hashcode%2000;
    }
}
