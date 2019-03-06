package com.wanchenyang.learn;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-06 15:32
 * @description
 * 求和 个位十位不包含7，只能为偶数
 **/
public class TestDemo03
{

    public static void main(String[] args)
    {
        int[] arr = {171,72,19,16,118,51,210,7,18};
        int result = getNum(arr);
        System.out.println(result);
    }


    public static int getNum(int[] arr)
    {
        int num1,num2;  //num1个位 num2十位
        int result = 0;
        for (int i = 0; i < arr.length; i++)
        {
            num1 = arr[i]%10;
            num2 = arr[i]/10%10;
            if(num1!=7&&num2!=7&&arr[i]%2==0)
            {
                System.out.println(arr[i]);
                result += arr[i];
            }
        }
        return result;
    }
}
