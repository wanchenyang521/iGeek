package com.wanchenyang.homework;

import com.sun.xml.internal.bind.v2.model.core.ID;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-23 15:37
 * @description
 **/
public class TestEmployee
{
    public static void main(String[] args)
    {
       Employee employee = new Employee()
       {
           @Override
           void work()
           {
               System.out.println("工号为"+this.getId()+"的员工"+this.getName()+"在努力的敲代码");
           }
       };
       employee.setId("001");
       employee.setName("范冰冰");
       employee.work();
    }
}
