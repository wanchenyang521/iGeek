package com.wanchenyang.learn;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-07 15:34
 * @description
 **/
public class VendingMachineTest
{

    public static void main(String[] args)
    {
        VendingMachine test = new VendingMachine(100,10);
        test.showMeseeage();
//        test.insertMoney();private 无法使用
        System.out.println(test.getBalance());
        test.setBalance(-2);
        System.out.println(test.getBalance());
    }
}
