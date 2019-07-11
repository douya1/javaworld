package com.lihztest.middle.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StreamTest4 {
    public static void main(String[] args) {

    }

    public static void search(File file, String search){
        if(file.isFile()){
            if(file.getName().toLowerCase().endsWith(".java")){
                String fileContent = readFileConent(file);
                if(fileContent.contains(search)){
                    System.out.printf("找到目标文件%s, %s",file.getAbsolutePath(), search);
                }
            }
        }
        if(file.isDirectory()){
            File[] fileList = file.listFiles();
            for(File f: fileList){
                search(f, search);
            }
        }
    }

    private static String readFileConent(File file) {

        try(FileReader fr = new FileReader(file)) {
            char[] all = new char[(int) file.length()];
            fr.read(all);
            return new String(all);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
