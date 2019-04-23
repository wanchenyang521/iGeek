package com.wanchenyang.homework.level1_11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-25 20:13
 * @description
 **/
public class Test11
{
    public static void write(String content)
    {
//        a)	定义字符缓冲输出流变量BufferedWriter bw;初始值为null
        BufferedWriter bufferedWriter = null;
//        b)	写一个try{   }catch(IOException e){  }finally{ }代码块

            try
            {
                bufferedWriter = new BufferedWriter(new FileWriter("content.txt"));
                bufferedWriter.write("content");
            }
            catch (IOException e)
            {
                System.out.println(e);
                e.printStackTrace();
            }
            finally
            {
                try
                {
                    if(bufferedWriter!=null)
                    {
                        bufferedWriter.close();
                    }
                }
                catch (IOException e)
                {
                    System.out.println(e);
                    e.printStackTrace();
                }
            }
    }

    public static void main(String[] args)
    {
        write("emmmm");
    }
}
