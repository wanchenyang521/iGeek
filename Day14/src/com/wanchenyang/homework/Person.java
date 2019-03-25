package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-20 20:24
 * @description
 **/
public class Person
{
    private String name;
    private int age;
    private Phone phone;

    public void washClothes(Clothes clothes)
    {
        System.out.println(age+"岁的"+name+"正在洗一件"+clothes.getColor()+"的"+clothes.getBand()+"牌的衣服");
    }

    public Person(String name, int age, Phone phone)
    {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public Phone getPhone()
    {
        return phone;
    }

    public void setPhone(Phone phone)
    {
        this.phone = phone;
    }

    public void sing(String song)
    {
        System.out.println("正在演唱"+song+"歌曲");
    }

    public void readBook(Book book)
    {
        System.out.println("正在看"+book.getName()+"小说");
    }
    public Person(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public Person()
    {
    }

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void usePhone(Phone phone)
    {
        System.out.println("在使用"+phone.getBrand()+"手机玩游戏");
    }

    public Phone sellPhone()
    {

        return new Phone();
    }
    public void callTo(Person p)
    {
        phone.call(p.getName());
    }


}
