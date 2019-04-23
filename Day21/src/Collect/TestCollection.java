package Collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-02 08:40
 * @description
 * 测试Collection接口
 **/
public class TestCollection
{
    public static void main(String[] args)
    {
        Collection<String> collection = new ArrayList<>();
        System.out.println(collection.size());
        System.out.println(collection.isEmpty());

        collection.add("12");
        collection.add("asd");
        collection.add("asd1");

        System.out.println(collection);
        System.out.println(collection.size());
//        判断是否存在
        System.out.println(collection.contains("12"));

        Object[] objects = collection.toArray();
        System.out.println(Arrays.toString(objects));

        collection.remove("12");
        System.out.println(collection);

        collection.clear();
        System.out.println(collection);

        System.out.println(collection.contains("12"));
    }
}
