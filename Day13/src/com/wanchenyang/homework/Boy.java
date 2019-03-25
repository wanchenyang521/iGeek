package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-19 11:21
 * @description
 **/
public class Boy extends Person
{
    private Gril girlFriend;

    public Gril getGirlFriend()
    {
        return girlFriend;
    }

    public void setGirlFriend(Gril girlFriend)
    {
        this.girlFriend = girlFriend;
    }

    public Boy()
    {
    }

    public Boy(String name, String age, String height, Gril girlFriend)
    {
        super(name, age, height);
        this.girlFriend = girlFriend;
    }

    @Override
    public void say(String content)
    {
        System.out.println(super.getName()+"用带有阳刚之气的声音对"+girlFriend.getName()+":"+content);
    }
    public void walking()
    {
        System.out.println(super.getName()+"和"+girlFriend.getName()+"在河边的林荫小道上手牵着手散步");
    }
}
