package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-19 14:24
 * @description
 **/
public class IGeekLecturer extends IGeekTeacher
{
    @Override
    public void work()
    {
        System.out.println("在讲课");
    }

    public IGeekLecturer()
    {
    }

    public IGeekLecturer(String id, String name)
    {
        super(id, name);
    }
}
