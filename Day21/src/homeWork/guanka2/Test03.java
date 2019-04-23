package homeWork.guanka2;

import java.util.ArrayList;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-01 20:24
 * @description
 **/
public class Test03
{
    public static void main(String[] args)
    {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("c");
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("b");
        arrayList.add("b");
        arrayList.add("a");
        System.out.println(frequency(arrayList,"b"));

    }
    public static int frequency(ArrayList<String> arr, String key)
    {
        int count = 0;
        for (String s:
             arr)
        {
            if(key.equals(s))
            {
                count++;
            }
        }
        return count;
    }
}
