package com.wanchenyang.learn;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-06 14:17
 * @description 5位数中的所有回文数
 **/
public class TestDemo01
{
    public static void main(String[] args)
    {
        int sum = 0;
        for (int i = 10000; i < 100000; i++)
        {
            if(isPalindrome(i))
            {
                System.out.print(i+" ");
                sum++;
                if(sum%20==0)
                {
                    sum=0;
                    System.out.println();
                }
            }

        }

    }

    public static boolean isPalindrome(int num)
    {
        String s = num + "";
        for (int i = 0; i < s.length()/2; i++)
        {
            if (s.charAt(i) != s.charAt(s.length() - i - 1))
            {
                return false;
            }
        }
        return true;
    }

}
