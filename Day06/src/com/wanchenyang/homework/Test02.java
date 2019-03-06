package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-06 19:13
 * @description 计算出5位数的回文数和7位数的回文数相差了多少个
 **/
public class Test02
{
    public static void main(String[] args)
    {
        int num5 = getNumPalindrome(5);
        int num7 = getNumPalindrome(7);
        int result = Math.abs(num5-num7);
        System.out.println(num5);
        System.out.println(num7);
        System.out.println("相差：" + result);

    }


    public static int getNumPalindrome(int num)
    {
        int sum = 0;
        double start = Math.pow(10, num);
        double end = Math.pow(10, num + 1);
        for (int i = (int) start; i < (int) end; i++)
        {
            if (isPalindrome(i))
            {
                sum++;
            }
        }
        return sum;
    }


    public static boolean isPalindrome(int num)
    {
        String s = num + "";
        for (int i = 0; i < s.length() / 2; i++)
        {
            if (s.charAt(i) != s.charAt(s.length() - i - 1))
            {
                return false;
            }
        }
        return true;
    }

}
