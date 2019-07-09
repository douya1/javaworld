package com.lihztest.middle.file;

import java.io.*;

public class SteamTest3 {

    public static void main(String[] args) {

       encrypt();
    }

    private static void encrypt(){



        File f1 =  new File("D:/testFile/1.txt");

        try(FileReader fr1 = new FileReader(f1);) {
            char [] chars = new char[(int)f1.length()];
            fr1.read(chars);
            System.out.println("befor encrypt:"+chars);
            char [] chars2 = new char[(int)f1.length()];
            System.out.println();
            for(int i=0;i<chars.length;i++)
            {
                System.out.print(chars[i]);
                if(chars[i] == '9')
                    chars2[i] = '0';
                else if(chars[i] == 'Z')
                    chars2[i] = 'A';
                else if(chars[i] == 'z')
                    chars2[i] = 'a';
                else if(chars[i]>= '0' && chars[i]<'9')
                    chars2[i] = (char) (chars[i]+1);
                else if(chars[i]>= 'a' && chars[i]<'z')
                    chars2[i] = (char) (chars[i]+1);
                else if(chars[i]>= 'A' && chars[i]<'Z')
                    chars2[i] = (char) (chars[i]+1);
                else
                    chars2[i] = chars[i];
            }
            System.out.println();
          /*  for(char c:chars2){
                System.out.print(c);
            }*/

          File f2 =  new File("D:/testFile/2.txt");
          try(FileWriter wf = new FileWriter(f2);) {
                wf.write(chars2);
          }catch (IOException e) {
              e.printStackTrace();
          }
//            wf.write(chars2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
