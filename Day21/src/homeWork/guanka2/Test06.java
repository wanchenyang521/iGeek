package homeWork.guanka2;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-02 09:11
 * @description
 **/
public class Test06
{
    public static void main(String[] args)
    {
        Integer[] integers = {1,2,3,4};
        printArr(integers);

        String[] strings = {"12","12121","155"};
        printArr(strings);
    }
    public static  <T>  void printArr(T[] arr)
    {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++)
        {
            if(i==arr.length-1)
            {
                System.out.println(arr[i]+"]");
                break;
            }

            System.out.print(arr[i]+",");
        }

    }

}
