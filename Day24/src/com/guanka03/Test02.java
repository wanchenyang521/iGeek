package com.guanka03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-09 20:42
 * @description
 **/
public class Test02
{
    public static void main(String[] args)
    {
        HashMap<String,HashMap<String,String>> igeek = new HashMap<>();

        HashMap<String,String> class1 = new HashMap<>();
        class1.put("001", "李晨");
        class1.put("002", "范冰冰");
        HashMap<String,String> class2 = new HashMap<>();
        class2.put("001", "马云");
        class2.put("002", "马化腾");
        igeek.put("Java基础班", class1);
        igeek.put("Java就业班", class2);

        Set<String> strings = igeek.keySet();
        for (String thisString:
             strings)
        {
            System.out.println(thisString);
            System.out.println(igeek.get(thisString));


        }

        Set<Map.Entry<String, HashMap<String, String>>> entries = igeek.entrySet();
        Iterator<Map.Entry<String, HashMap<String, String>>> iterator = entries.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }



    }
}
