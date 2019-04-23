package com.wanchenyang.homework.level1_10;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-25 19:50
 * @description
 **/
public class Test10
{
    public static char charAt(String str, int index) throws Exception
    {
       if(str==null)
       {
           throw new Exception("字符串不能为null");
       }
       if(str.equals(""))
       {
           throw new Exception("字符串不能为空");
       }
       if(index<0||index>=str.length())
       {
           throw new Exception("索引越界");
       }
       return str.charAt(index);
    }

    public static void testThrows() throws Exception
    {
        char temp;
//        temp = charAt(null, 0);
        temp = charAt("", 0);
//        temp = charAt("abc",4);
//        temp = charAt("abc",1);
        System.out.println(temp);
    }
    public static void testTryCatch()
    {
        char temp;

        try
        {
//        temp = charAt(null, 0);
//
//        temp = charAt("abc",4);
            temp = charAt("", 0);
//            temp = charAt("abc",1);
        }
        catch (Exception e)
        {
            System.out.println("异常哇");
            e.printStackTrace();
        }
        System.out.println("emmm...");
    }

    public static void main(String[] args) throws Exception
    {
//        testThrows();
        testTryCatch();
    }
}
