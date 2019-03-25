package com.wanchenyang.acess;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-22 10:33
 * @description
 **/
public class AccessClass
{
    private void methd1()
    {
        System.out.println("私有化的方法");
    }
    void methd2()
    {
        System.out.println("默认权限方法");
    }
    protected void methd3()
    {
        System.out.println("受保护的方法");
    }
    public void methd4()
    {
        System.out.println("公共方法");
    }

    public static void main(String[] args)
    {
//        本类中的权限测试
        AccessClass accessClass = new AccessClass();
        accessClass.methd1();
        accessClass.methd2();
        accessClass.methd3();
        accessClass.methd4();
    }
}
