package com.lihztest.middle;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest {
    public static void main(String[] args) {

        File file= new File("D://1.txt");

        try {
            new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
