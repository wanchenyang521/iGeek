package com.wanchenyang.anonymous;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-22 15:25
 * @description
 *
 **/
public class TestAnonymous
{
//    定义并创建该父类的子类对象，并用多态的方式赋值给父类引用变量
    Person p = new Person()
    {
        @Override
        public void eat()
        {
            System.out.println("我吃了");
        }
    };
}
