package com.lihztest.middle.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * split 100kb each file if the file larger than 100kb.
 */
public class StreamTest2 {

    public static void main(String[] args) {

        //splitFile();

    }

    public static void assemblyFile(){

    }

    public static  void splitFile(){
        File f = new File("D:/testFile/1.pdf");
        byte [] data = new byte[1024*1024];
        try {
            FileInputStream fis = new FileInputStream(f);
            int i = 0;
            int len;
            while ((len =fis.read(data)) != -1){
                File f2 = new File("D:/testFile/1.pdf" + "-"+ i++);
                FileOutputStream fos = new FileOutputStream(f2);
                fos.write(data,0,len);
                fos.close();
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
