package com.wanchenyang.homework.level2_03;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-26 15:56
 * @description
 **/
public class Person
{
    private String name;
    private int lifeValue;
    public Person() {
        super();
    }
    public Person(String name,int lifeValue) {
        setName(name);
        setLifeValue(lifeValue);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getLifeValue() {
        return lifeValue;
    }
    public void setLifeValue(int lifeValue) {
        if(lifeValue<=0)
        {
            throw new NoClassDefFoundError("生命值不能为负数:"+lifeValue);
        }
        else
        {
            this.lifeValue = lifeValue;
        }

    }

}
