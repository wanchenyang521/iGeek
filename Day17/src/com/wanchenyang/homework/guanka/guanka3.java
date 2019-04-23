package com.wanchenyang.homework.guanka;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-26 16:15
 * @description
 * 每一张借记卡(DebitCard)都有账号(accountNumber):和余额(money); 余额永远不能为负数
 * 要求:当借记卡的余额为负数的时候需要抛出自定的异常
 **/
public class guanka3
{
    public static void main(String[] args) throws noMoneyException
    {
        DebitCard debitCard = new DebitCard();
//        debitCard.setMoney(-1);
        debitCard.setMoney(100);
        debitCard.setAccountNumber("wcy");
        System.out.println(debitCard.getAccountNumber());
        System.out.println(debitCard.getMoney());
    }
}
