package homeWork.guanka1;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-01 15:33
 * @description
 * Collection基本方法
 **/
public class Test01
{
    public static void main(String[] args)
    {
        Collection collection = new ArrayList();
        collection.add("11");
        collection.add("12");
        collection.add("13");
        System.out.println(collection);
        collection.remove("11");
        System.out.println(collection);
        int size = collection.size();
        System.out.println("大小"+size);
        collection.clear();
        System.out.println(collection);




    }
}
