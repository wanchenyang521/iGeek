package com.wanchenyang.homework;

import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-06 19:47
 * @description
 * 定义一个方法,实现同时求出两个整数的加、减、乘、除的结果,
 * 并同时把这个四个结果返回(把四个数放入到一个数组中并返回)
 **/
public class Test05
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入num1：");
        int num1 = scanner.nextInt();
        System.out.println("请输入num2：");
        int num2 = scanner.nextInt();
        int[] result = getResult(num1, num2);
        System.out.println(num1+" + "+num2+" = "+result[0]);
        System.out.println(num1+" - "+num2+" = "+result[1]);
        System.out.println(num1+" * "+num2+" = "+result[2]);
        System.out.println(num1+" / "+num2+" = "+result[3]);


    }
    public static int[] getResult(int num1,int num2)
    {
        int[] result = new int[4];
        result[0] = num1+num2;
        result[1] = num1-num2;
        result[2] = num1*num2;
        result[3] = num1/num2;
        return result;
    }
}
