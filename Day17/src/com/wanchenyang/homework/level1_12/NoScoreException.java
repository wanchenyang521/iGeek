package com.wanchenyang.homework.level1_12;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-25 20:24
 * @description
 **/
public class NoScoreException extends RuntimeException
{
    public NoScoreException(String message)
    {
//        super(message);
        System.out.println(message);
    }

    public NoScoreException()
    {
    }
}
