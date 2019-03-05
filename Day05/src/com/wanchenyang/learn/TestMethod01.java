package com.wanchenyang.learn;

import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-05 08:41
 * @description
 * 修饰符 返回值类型 方法名（参数类型 参数名1）
 * {
 *     方法体；
 *     return 返回值；
 * }
 **/
public class TestMethod01
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入：");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        TestMethod01 addObject = new TestMethod01();
        System.out.println("sum："+sum(num1,num2));

        System.out.println("add:"+addObject.add(num1,num2));
        System.out.println("sum1:"+num1);
        System.out.println("sum2:"+num2);
    }

//    static修饰的成员变量和成员方法习惯上称为静态变量和静态方法，
//    可以直接通过类名来访问，访问语法为：
//　　类名.静态方法名(参数列表...)
//　　类名.静态变量名
    public static int sum(int num1,int num2)
    {
        return num1+num2;
    }
//    需要通过创建对象来调用。
    int add(int num1,int num2)
    {
//        形参的值是一个copy的操作，创建一个副本，与外面同名无关
        num1++;
        num2++;
        return num1+num2;
    }


}
