package com.wanchenyang.learn;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-11 09:14
 * @description
 **/
public class TestObjectArray02
{
    public static void main(String[] args)
    {
        Phone[] phones = new Phone[3];
        phones[0] = new Phone("6s", "ios", 4000);
        Phone huawei = new Phone("p20", "android", 4000);
        Phone xiaomi = new Phone("9", "miui", 4000);
        phones[1] = huawei;
        phones[2] = xiaomi;
        for (int i = 0; i < phones.length; i++)
        {
            if(phones!=null)
            {
                System.out.println(phones[i].getId());
            }
        }
    }
}
