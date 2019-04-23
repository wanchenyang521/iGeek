package com.wanchenyang.homework.level2_02;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-26 15:38
 * @description
 **/
public class Son extends Father
{
//    @Override
//    public void eat() throws TonguePainException
//    {
//        throw new TonguePainException();
//    }


//    @Override
//    public void eat() throws PainExecption
//    {
//        super.eat();
//    }


//    @Override
//    public void eat() throws ToothPainException
//    {
//        super.eat();
//    }


//    @Override
////    public void eat() throws BigToothPainException
////    {
////        throw new BigToothPainException();
////    }


//    @Override
//    public void eat() throws ToothPainException,FrontToothPainExcption
//    {
//
//        super.eat();
//        throw new BigToothPainException();
//    }


//    @Override
//    public void drink()
//    {
//        super.drink();
//        throw new BigToothPainException();
//    }


    @Override
    public void drink()
    {

        try
        {
            System.out.println("喝到了100度的水");
            throw new TonguePainException();
        }
        catch (TonguePainException e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws TonguePainException, BigToothPainException
    {
        Son son = new Son();
//        son.eat();
    }
}
