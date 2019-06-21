package com.lihztest.middle.file;

import java.io.*;

public class SteamTest3 {

    public static void main(String[] args) {


    }

    private static void encrypt(){

        File f1 =  new File("D:/testFile/1.txt");
        char [] chars = new char[100];
        try(FileReader fr1 = new FileReader(f1);) {
            fr1.read(chars);
            System.out.println("befor encrypt:"+chars);
            for(char c: chars)
            {
                if(c=='9'){

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
