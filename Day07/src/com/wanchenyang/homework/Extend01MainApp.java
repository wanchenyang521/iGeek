package com.wanchenyang.homework;

import java.util.WeakHashMap;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-07 19:00
 * @description
 **/
public class Extend01MainApp
{
    public static void main(String[] args)
    {
        Extend01Manager manager = new Extend01Manager("Wcy", "520", 150000, 6000);
        manager.work();

        Extend01Coder coder = new Extend01Coder();
        coder.setId("521");
        coder.setName("晨阳");
        coder.setSalary(9999);
        coder.work();
    }
}
