package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-23 11:26
 * @description
 * 2.	final修饰的方法不可以被覆盖,但父类中没有被final修饰方法，子类覆盖后可以加final
 **/
public class Final_2
{
    final void finalMethod(){}
    void normalMethod(){}
}
class Sub extends Final_2
{
//    void finalMethod()
//    {
// final修饰方法不能被覆盖(重写);
//    }
    @Override
    final void normalMethod()
    {
//        父类中没有被final修饰方法，子类覆盖后可以加final
        super.normalMethod();
    }
}
