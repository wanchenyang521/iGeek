package com.wanchenyang.learn;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-01 09:19
 * @description
 **/
public class TestMyclassType
{
    public static void main(String[] args)
    {
        MyClassType<String> myClassType = new MyClassType<String>();
        myClassType.setMyFiled("Jack");
        String  name = myClassType.getMyFiled();
        System.out.println(name);

    }


}
