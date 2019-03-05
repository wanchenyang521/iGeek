package com.wanchenyang.homework;

import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-05 19:00
 * @description 分析以下需求，并用代码实现
 * 1.键盘录入长方形的长和宽
 * 定义方法计算该长方形的周长,并在main方法中打印周长
 * 2.键盘录入长方形的长和宽
 * 定义方法计算该长方形的面积,并在main方法中打印面积
 * 3.键盘录入圆的半径
 * 定义方法计算该圆的周长,并在main方法中打印周长
 * 4.键盘录入圆的半径
 * 定义方法计算该圆的面积,并在main方法中打印面积
 **/
public class Extend02
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int length, width, radius;
        System.out.println("请输入矩形长：");
        length = scanner.nextInt();
        System.out.println("请输入矩形宽：");
        width = scanner.nextInt();
        System.out.println("矩形周长：" + rectanglePerimeter(length, width));
        System.out.println("矩形面积：" + rectangleArea(length, width));
        System.out.println("请输入圆半径：");
        radius = scanner.nextInt();
        System.out.println("圆周长：" + circularPerimeter(radius));
        System.out.println("圆面积：" + circularArea(radius));


    }

    //    矩形周长
    public static int rectanglePerimeter(int length, int width)
    {
        return 2 * length * width;
    }

    //    矩形面积
    public static int rectangleArea(int length, int width)
    {
        return length * width;
    }

    //    圆周长
    public static double circularPerimeter(int radius)
    {
        return 2 * Math.PI * radius;
    }

    //    圆面积
    public static double circularArea(int radius)
    {
        return Math.PI * Math.pow(radius, 2);
    }


}
