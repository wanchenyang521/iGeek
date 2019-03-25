package com.wanchenyang.acess;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-22 10:44
 * @description
 * 同包的访问权限测试
 **/
public class TestAccess
{
    public static void main(String[] args)
    {
        AccessClass accessClass = new AccessClass();
//        accessClass.methd1();同包private 私有
        accessClass.methd2();
        accessClass.methd3();
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
