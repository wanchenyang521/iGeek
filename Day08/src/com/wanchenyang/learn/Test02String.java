package com.wanchenyang.learn;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-08 10:42
 * @description
 **/
public class Test02String
{
    public static void main(String[] args)
    {
        String s1 = "abc";
        System.out.println(s1);

        char[] data = {'a','b','c'};
        String str = new String(data);
        System.out.println(str);


        String string = new String("Hello");
        System.out.println(string);

        String s3 = new String(data,1,2);
        System.out.println(s3);





    }
}
