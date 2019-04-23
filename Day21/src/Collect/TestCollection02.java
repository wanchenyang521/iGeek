package Collect;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-02 08:52
 * @description
 **/
public class TestCollection02
{
    public static void main(String[] args)
    {
        Collection<String> collection1 = new ArrayList<>();
        collection1.add("aa");
        collection1.add("bb");
        collection1.add("cc");

        Collection<String> collection2 = new ArrayList<>();
        collection2.add("aa");
        collection2.add("bb");


        System.out.println("collection1:"+collection1);
        System.out.println("collection2:"+collection2);
//          添加
//        collection1.addAll(collection2);
//        System.out.println("collection1:添加2"+collection1);
//          删除
//        collection1.removeAll(collection2);
//        System.out.println("collection1:删除2"+collection1);
////        保留 交集
//        collection1.retainAll(collection2);
//        System.out.println("collection1:保留2"+collection1);

//         B链表是不是A链表的子集
        System.out.println(collection1.containsAll(collection2));



    }
}
