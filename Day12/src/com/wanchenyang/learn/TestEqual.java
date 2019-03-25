package com.wanchenyang.learn;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-15 16:21
 * @description
 **/
public class TestEqual
{



    public static void main(String[] args)
    {
        TestObject testObject = new TestObject();
        TestObject testObject2 = new TestObject();
        System.out.println(testObject);
        System.out.println(testObject2);
        System.out.println(testObject==testObject2);
        System.out.println(1==1);
        System.out.println(1==2);
        System.out.println("---------");
        System.out.println(testObject.equals(testObject2));
        String strings = "111";
        String strings2 = "111";
        String string3 = new String("111");
        String string4 = new String("111");
        System.out.println(strings.equals(strings2));
        System.out.println(strings==strings2);
        System.out.println("==========");
        System.out.println(string3.equals(string4));
        System.out.println(string3==string4);


    }
}
