package com.lihztest.middle.file;

import java.io.File;

public class TraverseFolder2 {

    public static void main(String[] args) {

        File minFile = getMinFile("c:/Windows");
        System.out.println("the min file`s name is " + minFile.getAbsolutePath() + "length is " + minFile.length());
    }

    private static   File getMinFile(String path){

        File file = new File(path);
        if(!file.exists()){
            System.out.println(path + "file is not exist");
        }

        File [] fs = file.listFiles();
        if(fs == null || fs.length == 0){
            return null;
        }
        File minFile = fs[0];
        File tmpFile = null;
        for(File f :fs){
            if(f.isDirectory()){
                tmpFile = getMinFile(f.getAbsolutePath());
                if(tmpFile != null && tmpFile.length() < minFile.length()){
                    minFile = tmpFile;
                }
            }
            if(minFile.length() == 0)
            {
                minFile = f;
            }
            if(f.length() != 0 && f.length() < minFile.length()){
                minFile = f;
            }
        }
        return minFile;
    }
}
