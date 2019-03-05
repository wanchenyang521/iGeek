package com.wanchenyang.learn;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-05 14:01
 * @description
 * 测试数组的拷贝
 **/
public class TestArrayCopy
{
    public static void main(String[] args)
    {
        String[] s1 = {"aa","bb","cc","dd","ee"};
        String[] s2 = new String[10];
//
//        System.arraycopy(s1, 1, s1, 0, 2);
//        System.arraycopy(src,srcPos,dest,destPos,length);
//        System.arraycopy(s1, 1, s2, 2, 2);
//        for (int i = 0; i < s2.length; i++)
//        {
//            System.out.println(s2[i]);
//            System.out.println(s1[i]);
//        }
        testCopy();
    }


    /**
     * 从数组中删除某个元素
     */
    public static void testCopy()
    {
        String[] s1 = {"aa","bb","cc","dd"};
        System.arraycopy(s1, 2, s1, 1, 2);
        s1[s1.length-1]=null;
        for (int i = 0; i < s1.length; i++)
        {
            System.out.println(s1[i]);
        }


    }


}
