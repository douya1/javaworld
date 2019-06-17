package com.lihztest.middle;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest {
    public static void main(String[] args) {

        int i = 0;
        try {
            i = test2();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println(i);
    }
    static int test1(){
        File file= new File("D://1.txt");

        try {
            new FileInputStream(file);
            System.out.println("1");
            return 1;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("2");
            return 2;
        }finally {
            System.out.println("3");
            return 3;
        }
    }

    static int test2() throws Throwable {
        File file = new File("D://1.txt");

        new FileInputStream(file);
        System.out.println("1");
        return 1;
    }

}
