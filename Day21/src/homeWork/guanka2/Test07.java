package homeWork.guanka2;

import java.util.ArrayList;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-02 09:15
 * @description
 **/
public class Test07
{
    public static void main(String[] args)
    {
        String arr[]={"abc","bad","abc","aab","bad","cef","jhi"};
        ArrayList<String> stringArrayList = new ArrayList<String>();
        for (String string:
             arr)
        {
            if(!stringArrayList.contains(string))
            {
                stringArrayList.add(string);
            }
        }
        System.out.println(stringArrayList);
    }
}
