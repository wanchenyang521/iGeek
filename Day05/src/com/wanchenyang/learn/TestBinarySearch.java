package com.wanchenyang.learn;

import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-05 15:17
 * @description
 * 二分查找
 **/
public class TestBinarySearch
{
    public static void main(String[] args)
    {
        int[] arr = {2, 12, 14, 23, 30, 31, 31, 46, 51, 84};
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入");
        int temp = scanner.nextInt();
        int result = binarySearch(arr,temp);
        System.out.println(result);


    }
    public static int binarySearch(int[] arr,int num)
    {
        int left = 0;
        int right = arr.length-1;
        int mid;
        while (left<=right)
        {
            mid = (left+right)/2;
            System.out.print("left:"+left);
            System.out.print("\tmid:"+mid);
            System.out.print("\tright:"+right);
            System.out.println();
            if(num==arr[mid])
            {
                return mid;
            }
            else
            {
                if(num>arr[mid])
                {
                   left = mid+1;
                }
                else
                {
                    right = mid-1;
                }
            }
        }
        return -1;

    }

}
