package com.wanchenyang.learn;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-07 10:14
 * @description
 **/
public class PhoneDemo
{
    public static void main(String[] args)
    {
        Phone phone = new Phone();
        phone.playGame();
        phone.color="骚粉";
        phone.brand="iPhone6s";
        phone.os="ios";
        phone.price=4000;

        Phone phone1 = phone;
        phone.brand="iPhone Xs";
        System.out.println(phone.brand);

    }

}
