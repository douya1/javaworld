package com.lihztest.middle.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamTest1 {

    public static void main(String[] args) {

        try {
            File f = new File("d:/testFile/123.txt");
            File paraFolder = f.getParentFile();
            if(!paraFolder.exists())
            {
                paraFolder.mkdirs();
            }
            byte data[] = {88,89};
            FileOutputStream fos =  new FileOutputStream(f);
            fos.write(data);
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
