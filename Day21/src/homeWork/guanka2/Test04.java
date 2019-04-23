package homeWork.guanka2;

import java.util.Arrays;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-01 20:38
 * @description
 **/
public class Test04
{
    public static void main(String[] args)
    {
        String[] strings = {"a","b","c","d"};
        swap(strings, 1, 2);
        System.out.println(Arrays.toString(strings));
        Integer[] integers = {1,2,3,4,5,6};
        swap(integers, 3, 2);
        System.out.println(Arrays.toString(integers));

    }
    public static  <T>  void swap(T[] arr,int pos1,int pos2)
    {
        T temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }
}
