package homeWork.guanka1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-01 19:07
 * @description
 * Iterator迭代器概述
 **/
public class Test02
{
    public static void main(String[] args)
    {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        System.out.print("for循环：");
        for (int i = 0; i < arrayList.size(); i++)
        {
            System.out.print(arrayList.get(i));
        }
        System.out.println();

//        获取该集合的迭代器
        Iterator<Integer> integerIterator= arrayList.iterator();
//         用来判断集合中是否有下一个元素可以迭代hasNext()，并把指针指向后一位
        System.out.print("迭代器：");
        while (integerIterator.hasNext())
        {
            Integer integer = integerIterator.next();
            System.out.print(integer);
        }





    }
}
