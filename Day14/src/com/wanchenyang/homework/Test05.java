package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-20 20:44
 * @description
 **/
public class Test05
{
    public static void main(String[] args)
    {
        Person person = new Person("小王");
        Phone phone = person.sellPhone();
        phone.setBrand("iPhone");
        phone.setPrice(6000);
        System.out.println(person.getName()+"卖出一部价值"+phone.getPrice()+"的"+phone.getBrand()+"手机");

    }
}
