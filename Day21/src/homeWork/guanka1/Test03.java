package homeWork.guanka1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-01 19:10
 * @description
 * 往ArrayList添加以下元素”abc1”, ”abc2”, ”abc3”, ”abc4”.使用迭代器获取ArrayList集合中的元素
 **/
public class Test03
{
    public static void main(String[] args)
    {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("abc1");
        arrayList.add("abc2");
        arrayList.add("abc3");
        arrayList.add("abc4");

//        获取该集合的迭代器
        Iterator<String> stringIterator= arrayList.iterator();
//         用来判断集合中是否有下一个元素可以迭代hasNext()，并把指针指向后一位
        System.out.print("迭代器：");
        while (stringIterator.hasNext())
        {
            String string = stringIterator.next();
            System.out.println(string);
        }

    }
}
