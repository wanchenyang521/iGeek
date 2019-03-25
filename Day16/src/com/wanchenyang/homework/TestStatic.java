package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-23 11:21
 * @description
 **/
public class TestStatic
{
    static
    {
        System.out.println("Test 静态代码块");
    }
    public TestStatic()
    {
        System.out.println("Test 构造方法");
    }
    public static void main(String[] args)
    {
        System.out.println("Test main方法");
        TestStatic t = new TestStatic();
    }

}
