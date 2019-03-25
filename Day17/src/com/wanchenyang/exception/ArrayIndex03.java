package com.wanchenyang.exception;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-25 09:48
 * @description
 **/


class OpenException extends Throwable
{

}

public class ArrayIndex03
{
    public static void main(String[] args)
    {
        try
        {
            readFile();
        }
        catch (OpenException e)
        {
            e.printStackTrace();
        }
    }


    public static int open()
    {
        return -1;
    }


    public static void readFile() throws OpenException
    {
        if(open()==-1)
        {
            throw new OpenException();
        }

    }
}

