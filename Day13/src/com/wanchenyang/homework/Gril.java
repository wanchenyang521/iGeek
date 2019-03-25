package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-19 11:17
 * @description
 **/
public class Gril extends Person
{
    private String face;

    public String getFace()
    {
        return face;
    }

    public void setFace(String face)
    {
        this.face = face;
    }

    public Gril()
    {
    }

    public Gril(String name, String age, String height, String face)
    {
        super(name, age, height);
        this.face = face;
    }

    @Override
    public void say(String content)
    {
        System.out.println(super.getName()+"微笑着用于甜美的声音对慕容紫英说:"+content);
    }
    public void wash(Clothes c)
    {
        System.out.println(super.getName()+"在洗一件"+c.getColor()+"的"+c.getBrand()+"牌子的衣服");
    }
}
