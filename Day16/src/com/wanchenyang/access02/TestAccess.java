package com.wanchenyang.access02;

import com.wanchenyang.acess.AccessClass;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-22 10:44
 * @description
 * 同包的访问权限测试
 **/
public class TestAccess extends AccessClass
{
    public static void main(String[] args)
    {
        AccessClass accessClass = new AccessClass();
//        accessClass.methd1();跨包private 私有
//        accessClass.methd2();默认权限方法
//        accessClass.methd3();受保护的方法protected
        accessClass.methd4();
    }


//    public void methodTest()
//    {
//        super.method1();
//        super.method1();
//        super.method3();
//        super.method4();
//    }

}
