package com.wanchenyang.homework.guanka;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-26 16:17
 * @description
 **/
public class noMoneyException extends Exception
{
    public noMoneyException()
    {
    }

    public noMoneyException(String message)
    {
        super(message);

    }
}
