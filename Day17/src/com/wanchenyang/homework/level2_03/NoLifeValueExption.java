package com.wanchenyang.homework.level2_03;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-26 15:49
 * @description
 **/
public class NoLifeValueExption extends RuntimeException
{
    public NoLifeValueExption()
    {
    }

    public NoLifeValueExption(String message)
    {
        super(message);
    }
}
