package com.lihztest.middle.file;

import java.io.*;

/**
 * split 100kb each file if the file larger than 100kb.
 */
public class StreamTest2 {

    public static void main(String[] args) {

        //splitFile();
        assemblyFile();

    }

    public static void assemblyFile(){

        File f = new File("D:/testFile/2.pdf");
        byte [] data = new byte[1024*1024];
        try(FileOutputStream fos =  new FileOutputStream(f)) {

            int i=0;
            File f1 = new File("D:/testFile/1.pdf" + "-"+ i++);
            while(f1.exists()){

                try(FileInputStream fis = new FileInputStream(f1);) {

                    int len ;
                    while( (len = fis.read(data))  != -1){
                        fos.write(data, 0, len);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                f1 = new File("D:/testFile/1.pdf" + "-"+ i++);
            }
            System.out.println("Have assembly D:/testFile/2.pdf by " +i + "files.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static  void splitFile(){
        File f = new File("D:/testFile/1.pdf");
        byte [] data = new byte[1024*1024];
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(f);
            int i = 0;
            int len;
            while ((len =fis.read(data)) != -1){
                File f2 = new File("D:/testFile/1.pdf" + "-"+ i++);
                fos = new FileOutputStream(f2);
                fos.write(data,0,len);
                fos.close();
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
                try {
                    if(fis != null)
                        fis.close();
                    if(fos != null)
                        fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

        }
    }
}
