package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-21 15:13
 * @description
 **/
public class Boy
{
    private String name;
    private int age;

    private Gril fbb = new Gril("范冰冰", 20);

    public void walk()
    {
        System.out.println(age+"岁的大男孩"+name+"有一个"+fbb.getAge()+"岁的女友("+fbb.getName()
                +"),"+name+"在逛街(和"+fbb.getName()+")");
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

    public Boy()
    {
    }

    public Boy(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
}
