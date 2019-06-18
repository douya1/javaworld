package com.lihztest.middle.file;

import java.io.File;
import java.util.Date;

public class FileProperty {

    public static void main(String[] args) {

        File file = new File("D:/1.txt");

        System.out.println("current file is :" + file);

        System.out.println("file is extends? " + file.exists());

        System.out.println("file is a Directory" + file.isDirectory());

        System.out.println("file is a File ?" + file.isFile());

        System.out.println("file`s length is:" + file.length());

        //The time of the file last be modified
        //When the file was last modified

        long time = file.lastModified();
        Date d =  new Date(time);
        System.out.println("When the file was last modified" + d);

        file.setLastModified(0);

        //file rename
        File file2 = new File("d:/2.txt");
        file.renameTo(file2);
        System.out.println("Have already renamed 1.txt to 2.txt");
    }
}
