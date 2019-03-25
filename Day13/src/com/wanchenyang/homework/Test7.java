package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-19 11:23
 * @description
 **/
public class Test7
{
    public static void main(String[] args)
    {
        Clothes clothes = new Clothes("白色", "李宁");
        Gril gril = new Gril("欧阳青青", "18", "1.6", "瓜子脸");
        Boy boy = new Boy("慕容紫英", "20", "1.75", gril);
        gril.wash(clothes);
        boy.walking();
        boy.say("我会守护你一生一世");
        gril.say("有你在我就安心");

    }
}
