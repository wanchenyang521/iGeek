package com.wanchenyang.exception;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-25 15:02
 * @description
 *
 * 常见的异常可以通过逻辑解决
 **/
public class RunTimeException
{
    public static void main(String[] args)
    {

        try
        {
            System.out.println(10/0);
        }
        catch (Exception e)
        {
            System.out.println("分母不能为0");
        }
        try
        {
            method();
        }
        catch (ArithmeticException e)
        {
            System.out.println("不能为0");
        }
    }
    public static void method() throws ArithmeticException
    {
        System.out.println(10/0);
    }


}
