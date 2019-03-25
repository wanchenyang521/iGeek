package com.wanchenyang.learn;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-15 15:42
 * @description
 **/
public class PersonsWorker extends Persons
{
    @Override
    public void eat()
    {
        System.out.println("吃饱了才有力气~~~~");
    }
    public void workerSkills()
    {
        System.out.println("大力出奇迹，我就要喝大力。不喝大力浑身难受");
    }
}
