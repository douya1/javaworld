package com.lihztest.middle.file;

import java.io.File;

public class TraverseFolder {

    public static void main(String[] args) {

        File file = new File("c:/Windows");

        File [] fs = file.listFiles();

        File minFile = fs[0];
        File mxFile = fs[0];

        for(File f: fs){
            if(f.isDirectory())
                continue;
            if(minFile.length() == 0)
            {
                minFile = f;
            }
            if(f.length() > mxFile.length())
                mxFile = f;
            if(f.length() != 0 && f.length() < minFile.length()){
                minFile = f;
            }
        }
        System.out.println("the max file`s name  of windows if "+ mxFile.getName() + "and length is :" + mxFile.length());
        System.out.println("the min file`s name  of windows if "+ minFile.getName() + "and length is :" + minFile.length());

    }
}
