package com.lihztest.middle.file;

import java.io.File;
import java.io.IOException;

public class FileProperties2 {

    public static void main(String[] args) {

        File file = new File("d:/");
        //Return all files the current folder as an array of string (excluding subfiles and subfolders)
        file.list();

        //Return all files the current folder as an array of files (excluding subfiles and subfolders)
        File[] fs = file.listFiles();

        //Return the current folder as a string
        //  The pathname string of the parent directory named by this
        //     *          abstract pathname, or <code>null</code> if this pathname
        //     *          does not name a parent
        //Return the parent directory name  as a String
        file.getParent();

        // Return the parent directory name as a file
        file.getParentFile();

        //Create folder, if the parent directory does not exist, create cancel
        file.mkdir();

        //Create folder, if the parent directory does not exist , create the parent directory
        file.mkdirs();

        //Create an empty file.
        try {
            boolean newFile = file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Create the parent directory before create a new file
        //So before you create a new file, you usually create the parent directory
        file.getParentFile().mkdirs();

        file.listRoots();

        //delete file
        file.delete();

        file.deleteOnExit();


    }
}
