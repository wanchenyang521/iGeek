package com.learn;

import java.io.*;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-15 09:53
 * @description
 **/
public class OutputStreamAppend
{
    public static void main(String[] args) throws IOException
    {
        FileOutputStream fileOutputStream = new FileOutputStream("test03.txt", true);
        byte[] bytes = {99,98};
        byte[] bytes2 = {99,98,97};
        fileOutputStream.write(bytes);
        fileOutputStream.write(bytes2);
        fileOutputStream.flush();
        fileOutputStream.close();


    }

}
