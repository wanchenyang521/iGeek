package com.wanchenyang.homework.level2;

import javax.swing.*;
import java.util.Arrays;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-27 15:16
 * @description
 *  192.168.105.27 按照  . 号切割字符串
 *  18 22 40 65 按照空格切割字符串
 *  提示: 由于 . 号 在正则表达式中用于匹配除换行符以外的任意字符,
 *  会把字符串切的连渣都不剩,此处使用 . 号需要转义; 使用\\.作为切割使用正则表达式
 **/
public class Test15
{
    public static void main(String[] args)
    {
        String str1 = "192.168.105.27";
        String[] strings1 = str1.split("\\.");
        System.out.println(Arrays.toString(strings1));

        String str2 = "18 22 40 65";
        String[] strings2 = str2.split("\\s+");
        System.out.println(Arrays.toString(strings2));

    }
}
