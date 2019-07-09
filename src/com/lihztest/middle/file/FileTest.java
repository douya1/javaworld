package com.lihztest.middle.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class FileTest {

    public static void main(String[] args) {

        //copyFile("D:/testFile/1.txt", "D:/testFile/5.txt");
        copyFolder("D:/testFile/1", "D:/testFile/2");
    }

    public static void copyFolder(String srcFolder, String descFolder){

        File f2 = new File(descFolder);

        if(!f2.exists()){
            f2.mkdirs();
        }
        File f1 = new File(srcFolder);
        File[] l1=f1.listFiles();
        for(File tmpFile:l1){
            File newDestFile = new File(descFolder,tmpFile.getName());
            System.out.println(newDestFile.getAbsolutePath());
            if(tmpFile.isDirectory()){
                copyFolder(tmpFile.getAbsolutePath(), newDestFile.getAbsolutePath());
            }else
            {
                copyFile(tmpFile.getAbsolutePath(), newDestFile.getAbsolutePath() );
            }
        }
    }

    public static void copyFile(String srcFile, String descFile){

        File f1 = new File(srcFile);
        File f2 = new File(descFile);

        byte []buf = new byte[1024];

        try(FileInputStream fis = new FileInputStream(f1);
            FileOutputStream fos = new FileOutputStream(f2)){

            while(true){
                int len = fis.read(buf);
                if(len == -1)
                    break;
                fos.write(buf, 0, len);
                fos.flush();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
