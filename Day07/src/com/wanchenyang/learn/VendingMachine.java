package com.wanchenyang.learn;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-07 11:00
 * @description 成员变量定义初始化：
 * 成员变量在定义初始化的地方就可以给出初始值
 * 没有初始值的成员变量会自动加上默认值
 * 定义初始化可以调用函数
 *
 * 封装 继承 多态
 **/
public class VendingMachine
{
//    int price = 20; //价格
    private int price; //价格
//    int balance = f();//余额
    private int balance;//余额

    public int getPrice()
    {
        return price;
    }

    public void setPrice(int price)
    {
        if(price<=0)
        {
            price = 0;
        }
        this.price = price;
    }

    public int getBalance()
    {
        return balance;
    }

    public void setBalance(int balance)
    {
        if (balance<=0)
        {
            balance = 11;
        }
        this.balance = balance;
    }

    public int getTotal()
    {
        return total;
    }

    public void setTotal(int total)
    {
        this.total = total;
    }

    private int total;//销售额

//    int f()
//    {
//        return 10;
//    }


    //    构造函数
//    方法名与类名一致，无返回值
    public VendingMachine()
    {
        System.out.println("无参");
    }
    public VendingMachine(int price)
    {
//        this();先调用无参构造，只能放在第一行
        System.out.println("1参");
        this.price = price;
    }


    public VendingMachine(int balance, int total)
    {
        this.balance = balance;
        this.total = total;
        System.out.println("2参");
    }

    public VendingMachine(int price, int balance, int total)
    {
        this.price = price;
        this.balance = balance;
        this.total = total;
        System.out.println("3参");
    }

    /**
     * 支付
     */
    private void insertMoney(int money)
    {

        balance += money;
    }

    void getFood()
    {
        if (balance >= price)
        {
            System.out.println("here you are!");
            balance = balance - price;
            total += price;
        }
    }

    void showPrompt()
    {
        System.out.println("welcome");
    }

    void showMeseeage()
    {
        System.out.println("price " + price);
        System.out.println("balance " + balance);
        System.out.println("total " + total);
    }


    public static void main(String[] args)
    {
        VendingMachine vm = new VendingMachine(10);
        vm.showPrompt();
        vm.insertMoney(100);
        vm.getFood();
        vm.showMeseeage();
        VendingMachine vm2 = new VendingMachine(100,20);
        vm2.showPrompt();
        vm2.insertMoney(100);
        vm2.getFood();
        vm2.showMeseeage();
    }
}
