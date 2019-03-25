package com.wanchenyang.learn;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-15 15:39
 * @description
 **/
public class PersonsIt extends Persons
{
    @Override
    public void eat()
    {
//        super.eat();
        System.out.println("吃饭?bug写完了吗？");
    }
    public void itSkill()
    {
        System.out.println("遁入此门，妹纸更你有关系吗？");
    }
}
