package com.wanchenyang.enumTest;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-22 11:04
 * @description
 * 枚举
 * enum 枚举民
 * {
 *     枚举体
 * }
 **/
public class TestEnum01
{
    public static void main(String[] args)
    {
        Season season = Season.spring;
        switch (season)
        {
            case spring:
                System.out.println("春天");
                break;
            case summer:
            case autumn:
            case winter:
                break;
        }
    }
}
enum Season
{
    spring,summer,autumn,winter
}
enum Week
{
    MON, TUE, WED, THU, FRI, SAT, SUN
}