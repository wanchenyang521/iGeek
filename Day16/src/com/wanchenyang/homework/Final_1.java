package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-23 11:24
 * @description
 * 验证:final修饰类不可以被继承，但是可以继承其他类
 **/
public class Final_1
{

}

final class FinalClass extends Final_1
{
//被final的修饰类可以继承其他类
}
//class Sub extends FinalClass
//{
//    被final修饰的类不能被继承
//}