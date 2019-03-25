package com.wanchenyang.exception;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-25 10:06
 * @description
 * 如果方法可能抛出异常，需要在函数头部加以声明throws
 * 可以声明并不会真的抛出异常
 * 抛出子类异常，会被父类异常catch给捕捉到
 * catch(Exception e)
 * {}
 * e..printStackTrace();
 *
 * 总结：
 * 如果调用一个声明会抛出异常的函数
 * 1.把函数的调用放在try块中，catch来捕捉所有有可能会抛出的异常
 * 2.声明自己会抛出的无法处理的异常throws
 * ArrayIndexOutOfBoundsException这种的异常是会不要声明的
 * 但是如果没有适当的机制来捕获，会导致程序终止
 *
 *
 **/

class OpenExceptions extends Exception
{

}
class CloseExceptions extends OpenExceptions
{

}

public class ArrayIndex04
{
    public static void main(String[] args)
    {
        try
        {
            readFile();
        }
        catch (OpenExceptions openExceptions)
        {
            openExceptions.printStackTrace();
        }

    }


    public static int open()
    {
        return -1;
    }


    public static void readFile() throws OpenExceptions,CloseExceptions
    {
        if(open()==-1)
        {
            throw new OpenExceptions();
        }
        throw new CloseExceptions();

    }
}

