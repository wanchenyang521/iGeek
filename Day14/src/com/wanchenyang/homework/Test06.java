package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-20 20:53
 * @description
 **/
public class Test06
{
    public static void main(String[] args)
    {
        Phone phone = new Phone("iPhone", 8000);
        Person person = new Person();
        person.setName("羽凡");
        Person baiBaiHe = new Person("白百合", 38, phone);

        System.out.print(baiBaiHe.getAge()+"岁的"+baiBaiHe.getName()+"使用"+phone.getPrice()+
                "元的"+phone.getBrand()+"的手机");
        baiBaiHe.callTo(person);
    }
}
