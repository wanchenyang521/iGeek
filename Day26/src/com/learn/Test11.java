package com.learn;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-12 09:44
 * @description
 **/
public class Test11
{
    public static void main(String[] args) throws UnsupportedEncodingException
    {
//        编码：字节数组
        String string = "晨阳";
        byte[] bytes = string.getBytes();//默认的工程字符集charset
        System.out.println(bytes.length);

//        bytes = string.getBytes("GBK");
//        System.out.println(bytes.length);
//        解码
//        string = new String(bytes, 0, bytes.length,"utf-8");
//        string = new String(bytes, 0, bytes.length, "GBK");//上面用的是GBK编码
//        System.out.println(string);
//        乱码

//        1.字节数不够
        string = new String(bytes, 0, bytes.length-1, StandardCharsets.UTF_8);
        System.out.println(string);
        string = new String(bytes, 0, bytes.length, StandardCharsets.UTF_8);
        System.out.println(string);
//        2.字符集用的不对
        string = new String(bytes, 0, bytes.length, "GBK");
        System.out.println(string);

    }
}
