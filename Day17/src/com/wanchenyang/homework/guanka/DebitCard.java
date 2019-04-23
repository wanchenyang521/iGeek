package com.wanchenyang.homework.guanka;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-26 16:15
 * @description
 * 每一张借记卡(DebitCard)都有账号(accountNumber):和余额(money); 余额永远不能为负数
 **/
public class DebitCard
{
    private String accountNumber;
    private int money;

    public String getAccountNumber()
    {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public int getMoney()
    {
        return money;
    }

    public void setMoney(int money) throws noMoneyException
    {
        if(money>=0)
            this.money = money;
        else
            throw new noMoneyException("余额永远不能为负数");
    }

    public DebitCard()
    {
    }

    public DebitCard(String accountNumber, int money)
    {
        this.accountNumber = accountNumber;
        this.money = money;
    }
}
