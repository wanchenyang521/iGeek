package com.wanchenyang.supermark;

import javax.swing.text.html.CSS;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-20 08:49
 * @description
 **/
public class ShoppingReceipt
{
    static ArrayList<GoodsItem> goodsItems = new ArrayList<GoodsItem>();
    public static void main(String[] args)
    {
//        初始化数据
        ShoppingReceipt.intiData();
        System.out.println("欢迎使用晨阳家的购物系统");
        System.out.println("--------------------");
        while (true)
        {
            System.out.println("1输入数量 2.打印下票 3.退出系统");
            Scanner scanner = new Scanner(System.in);
            int optNumber = scanner.nextInt();
            switch (optNumber)
            {
                case 1:
                    enterNum();
                    break;
                case 2:
                    printReceipt();
                    break;
                case 3:
                    System.out.println("--------------------");
                    System.out.println("欢迎再次使用");
                    System.out.println("--------------------");
                    System.exit(0);
                    break;
                    default:
                        System.out.println("输入错误");
            }
        }


    }

    private static void printReceipt()
    {
        System.out.println("\t\t欢迎光临");
        System.out.println("品名\t\t\t\t售价\t\t数量\t总价");
        System.out.println("--------------------------");
        double totalMoney = 0;
        int totalNum = 0;
        for (int i = 0; i < goodsItems.size(); i++)
        {
            String name = goodsItems.get(i).getName();
            String id = goodsItems.get(i).getId();
            double price = goodsItems.get(i).getPrice();
            int number = goodsItems.get(i).getNumber();
            String unit = goodsItems.get(i).getUnit();
            double money = goodsItems.get(i).getMoney();
            System.out.println(name+"("+id+")"+"\t"+price+"\t"+number+"\t"+money);
            totalMoney += money;
            totalNum += number;
        }
        System.out.println("--------------------------");
        System.out.println(goodsItems.size()+"项商品\t共计："+totalNum+"件");
        System.out.println("总计："+totalMoney);
        System.out.println("任凭小票换取发票");
    }

    private static void enterNum()
    {
        for (int i = 0; i < goodsItems.size(); i++)
        {
            System.out.print(goodsItems.get(i).getName()+"购买数量：");
            Scanner scanner = new Scanner(System.in);
            int numGoods = scanner.nextInt();
            goodsItems.get(i).setNumber(numGoods);
            double total = numGoods*goodsItems.get(i).getPrice();
            goodsItems.get(i).setMoney(total);
        }
        System.out.println("录入完成");
    }

    //    赋值
    public static void intiData()
    {
        GoodsItem item = new GoodsItem("iphoneX", "2018", 4000, 0, "部", 0);
        GoodsItem item2 = new GoodsItem("iphoneXs", "2019", 6000, 0, "部", 0);
        goodsItems.add(item);
        goodsItems.add(item2);

    }
}
