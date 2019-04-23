package com.wanchenyang.exception;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-25 15:24
 * @description
 * 当我们重写函数的时候，子类是不饿能声明抛出的父类的函数更多的异常
 * 在子类的构造函数中，必须要声明父类可能抛出的全部异常
 *
 *
 * 如果父类抛出了多个异常，子类覆盖父类方法时，只能抛出相同的异常
 * 或者他的子集，只能少不能多
 *
 * 父类方法没有抛出异常，子类覆盖父类该方法时也不可抛出异常，此时子类产生该异常，只能捕获处理，不能声明抛出
 * 现实开发中，一般子类重写的方法抛出的异常与父类方法抛出的异常是一样的，不存在不一样的情况
 **/
class OpenException05 extends Exception
{

}
class CloseException05 extends OpenException05
{

}


public class ArrayIndex05
{
    public ArrayIndex05() throws OpenException05
    {

    }
    public void f() throws OpenException05, NewException
    {

    }

}
class NewClass extends ArrayIndex05
{
    public NewClass() throws OpenException05
    {
        super();
    }

    public void f() throws NewException
    {

    }
}
class NewException extends  Exception
{

}

