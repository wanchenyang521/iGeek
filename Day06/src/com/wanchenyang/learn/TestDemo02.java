package com.wanchenyang.learn;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-06 14:37
 * @description
 * Fibonacci
 * 斐波那契数列
 * 有一只兔子，从出生后第3个月起每个月都生只兔子，
 * 小兔子长到第三个月后每个月又生一只兔子，
 * 假如兔子都不死，问每个月的兔子总数为多少？
 * 1 1月 1.1
 * 1 2月 1.2
 * 2 3月 1.3+1.1
 * 3 4月 1.4+1.2+1.1
 * 5 5月 1.5+1.3+1.2+1.1+1.1
 * 8 6月 1.6+1.4+1.3+1.2+1.2+1.1+1.1+1.1
 **/
public class TestDemo02
{
    public static void main(String[] args)
    {
        System.out.println(fibonacci(20));
    }
    public static int fibonacci(int month)
    {
        if(month==1||month==2)
        {
            return 1;
        }
        return fibonacci(month-1)+fibonacci(month-2);
    }
}
