package com.wanchenyang.learn;
import java.util.Scanner;


public class PrintCalendarDemo {
    //用户输入的年份
    public static int year = Integer.MIN_VALUE;
    //用户输入的月份
    public static int month = Integer.MIN_VALUE;
    /** 对应天数*/
    public static int[] dayofMonth = {31,28,31,30,31,30,31,31,30,31,30,31};

    public static void main(String[] args) {
        PrintCalendar();
    }
    /**
     * 打印日历的核心方法
     */
    public static void PrintCalendar() {
        //1.让用户输入年份和月份
        InputYearAndMonth();
        //2.计算1900-1-1到用户年份月份的总天数（year=2017,mon=7      2017-7-1）
        // 2-1计算各年的总天数
        // 2-2计算各月的总天数
        int sum = getSumDayOfYear();
        sum += getsumOfMonth();
        //到下一个月的一号
        sum++;
        //3.用英文的方式打印年份和月份
        //4.打印月份的标题（星期一到星期日）
        PrintMonthTitle();
        //5.根据某月1日是星期几打印日历内容
        PrintCalendarContent(sum%7);
    }

    /**
     * 每月一号是星期几
     * @param dayOfWeek
     */
    private static void PrintCalendarContent(int dayOfWeek)
    {
        //dayOfWeek 0--6
        int sepCount = dayOfWeek;
        if(sepCount == 0)
        {
            sepCount = 6;
        }
        else
        {
            sepCount = dayOfWeek-1;
        }

        for (int i = 0; i <sepCount; i++)
        {
            System.out.print("\t");
        }
        for(int i = 0; i<dayofMonth[month-1];i++)
        {
            System.out.print(i+1);
            if((dayOfWeek+i)%7==0)
            {
                //这是一个周日
                System.out.println();
            }
            else
            {
                System.out.print("\t");
            }
        }


    }






    /**
     * 用英文的方式打印年份和月份
     */
    private static void PrintMonthTitle()
    {
        String[] monthName = {"January 一月"," February 二月"," March 三月",
                " April 四月"," May 五月","June 六月",
                "July 七月","August 八月","September 九月",
                "October 十月","November 十一月","December 十二月"
        };
        System.out.println("\t"+"\t"+year+"\t"+monthName[month-1]);
        String[] weekdays= {"月曜日","火曜日","水曜日","木曜日","金曜日","土曜日","日曜日"};
        for (int i = 0; i < weekdays.length; i++) {
            System.out.print(weekdays[i]+"\t");
        }
        System.out.println();
    }



    /**
     * 获得1900-year的总天数
     * @return
     */
    private static int getSumDayOfYear()
    {
        int sum = 0;
        //需要判断用户是否输入正确的年份
        if(year==Integer.MIN_VALUE)
        {
            System.out.println("Error：输入错误，重新输入");
            InputYearAndMonth();
        }
        for (int i = 1900; i < year; i++) {
            sum +=365; //每一年累加365天
            if(isLeapYear(i))
            {
                sum++; 	//闰年加1
            }
        }
        return sum;
    }

    private static int getsumOfMonth()
    {
        int sum = 0;
        for (int i = 0; i < month-1; i++) {
            sum+=dayofMonth[i];
        }
        //如果year是闰年&&month>=3
        if(isLeapYear(year)&&month>=3)
        {
            sum++;
        }
        return sum;

    }





    /**
     * 用来判断传入的year是否是闰年
     * @param year
     * @return 闰年返回true
     */
    private static boolean isLeapYear(int year)
    {
        return year % 400 == 0 || year % 4 == 0 && year%100!=0 ;
    }




    /**
     * 接收用户输入的年份和月份
     */
    private static void InputYearAndMonth()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入年份");
        year = input.nextInt();
        System.out.println("请输入月份");
        month = input.nextInt();
        input.close();
        input = null;
    }


}
