package com.wanchenyang.homework.guanka02;

import java.beans.beancontext.BeanContext;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-03 21:22
 * @description
 * 编写一个程序，键盘录入多个数字,直到录入-1结束.将录入的重复数据去除,计算这些不重复数据的总和和平均值
 **/
public class Test09
{
    public static void main(String[] args)
    {
//        1.	创建Scanner对象,用于键盘录入
        Scanner scanner = new Scanner(System.in);
//2.	创建HashSet.用于去除重复的数字
        HashSet<Integer> integerHashSet = new HashSet<Integer>();
//3.	不停循环,让用户输入数字
        System.out.println("请输入");
        while (true)
        {
//4.	调用Scanner的nextInt()方法,让用户输入一个数字
            int temp = scanner.nextInt();
            if(temp == -1)
            {
                break;
            }
            integerHashSet.add(temp);
//5.	如果用户输入-1,跳出循环
//6.	不是-1将数字添加到HashSet
        }

//7.	定义求和变量sum
        int sum = 0;
//8.	使用增强for获取HashSet中的每个元素
        for (int temp:
             integerHashSet)
        {
            sum+=temp;
        }
//9.	将每个数字添加到sum中
//10.	输出求和的结果
        System.out.println("求和"+sum);
//11.	输出平均值,平均值 = 总数 / 个数
        System.out.println("平均值"+(sum/integerHashSet.size()));
    }
}
