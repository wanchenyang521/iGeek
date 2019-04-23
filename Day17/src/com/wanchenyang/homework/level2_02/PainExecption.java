package com.wanchenyang.homework.level2_02;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-26 15:33
 * @description
 * a)	定义PainExecption(疼异常)类继承Exception
 * i.	提供空参和有参构造,注意有参构造必须调用父类的有参构造
 **/
public class PainExecption extends Exception
{
    public PainExecption(String message)
    {
        super(message);
    }

    public PainExecption()
    {
    }
}
