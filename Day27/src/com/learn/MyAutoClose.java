package com.learn;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-15 14:28
 * @description
 **/
public class MyAutoClose implements AutoCloseable
{

    @Override
    public void close() throws Exception
    {
        System.out.println("close...");
    }
    public static void name()
    {
        System.out.println("hello autoClose");
    }

    public static void main(String[] args)
    {
        try(MyAutoClose myAutoClose = new MyAutoClose())
        {
            myAutoClose.name();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
