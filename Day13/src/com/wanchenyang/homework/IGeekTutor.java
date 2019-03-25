package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-19 14:24
 * @description
 **/
public class IGeekTutor extends IGeekTeacher
{
    @Override
    public void work()
    {
        System.out.println("在帮助学生解决问题");
    }

    public IGeekTutor()
    {
    }

    public IGeekTutor(String id, String name)
    {
        super(id, name);
    }
}
