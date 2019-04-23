package homeWork.guanka2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-01 20:51
 * @description
 **/
public class Test05
{
    public static void main(String[] args)
    {
        String[] strings = {"a","b","c","d"};
        reverse(strings);
        System.out.println(Arrays.toString(strings));
        Integer[] integers = {1,2,3,4,5,6};
        reverse(integers);
        System.out.println(Arrays.toString(integers));


    }
    public static  <T>  void reverse(T[] arr)
    {
        Collections.reverse(Arrays.asList(arr));
    }
}
