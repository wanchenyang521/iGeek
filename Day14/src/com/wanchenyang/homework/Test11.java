package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-21 15:25
 * @description
 **/
public class Test11
{
    public static void main(String[] args)
    {
        Employee waiter = new Waiter(18,"景甜");
        Employee cook = new Cook(30,"秦俊杰");
        print(waiter);
        System.out.println();
        print(cook);
    }
    public static void print(Employee employee)
    {
        if(employee instanceof Waiter)
        {
            System.out.print(employee.getAge()+"岁的服务员"+employee.getName()+",");
            employee.speek();
            employee.work();
        }
        if(employee instanceof Cook)
        {
            System.out.print(employee.getAge()+"岁的厨师"+employee.getName()+",");
            employee.speek();
            employee.work();
        }


    }
}
