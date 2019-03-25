package com.wanchenyang.project01;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-22 09:10
 * @description
 **/
public class Chinese
{
//    静态变量
    public static String nationality = "中国";
    private String name;
    private int age;
    private String profession;



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

    public String getProfession()
    {
        return profession;
    }

    public void setProfession(String profession)
    {
        this.profession = profession;
    }

    public Chinese()
    {
    }

    public Chinese(String name, int age, String profession)
    {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }
}
