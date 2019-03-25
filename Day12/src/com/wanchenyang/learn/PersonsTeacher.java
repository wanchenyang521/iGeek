package com.wanchenyang.learn;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-15 15:40
 * @description
 **/
public class PersonsTeacher extends Persons
{
    @Override
    public void sleep()
    {
//        super.sleep();
        System.out.println("睡个屁呀，作业写完了吗！！");
    }
    public void teacherSkills()
    {
        System.out.println("叫家长");
    }
}
