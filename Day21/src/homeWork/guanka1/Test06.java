package homeWork.guanka1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-01 19:24
 * @description
 * 往ArrayList添加以下元素” abc”, ” igeek”,
 * 练习ArrayList不加泛型和加泛型2种情况迭代出ArrayList中的元素.获取元素的长度.并说出泛型的好处
 **/
public class Test06
{
    public static void main(String[] args)
    {
        method1();
        System.out.println();
        method2();
    }
    public static void method1()
    {
        ArrayList arrayList = new ArrayList();
        arrayList.add("abc");
        arrayList.add("igeek");
        Iterator<Integer> integerIterator= arrayList.iterator();
        System.out.println("迭代器：");
        while (integerIterator.hasNext())
        {
            String string = String.valueOf(integerIterator.next());
            System.out.println(string.length());
        }
    }
    public static void method2()
    {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("abc");
        arrayList.add("igeek");
        Iterator<String> stringIterator= arrayList.iterator();
        System.out.println("迭代器：");
        while (stringIterator.hasNext())
        {
            String string = String.valueOf(stringIterator.next());
            System.out.println(string.length());
        }
    }


}
