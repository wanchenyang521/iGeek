package com.wanchenyang.exception;

import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-25 16:22
 * @description
 **/
public class CustomExceptionDemo
{
    public static void main(String[] args) {

        //年龄小于18岁,产生异常
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年龄：");
        int age = sc.nextInt();
        if(age < 18) {
            //产生异常
            //创建异常对象
            U18Exception u18 = new U18Exception("年龄小于18岁");
            //抛出异常
            try {
                throw u18;
            } catch (U18Exception e) {
                System.out.println("年龄不满足婚恋网站年龄");
                e.printStackTrace();
            }
        }
        //可以直接手动创建异常对象
        try {
            throw new RuntimeException("我产生了一个运行时异常");
        } catch (Exception e) {
            System.out.println("直接创建了一个RuntimeException对象");
        }

        System.out.println("后边的代码");
    }

}
