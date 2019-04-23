package com.wanchenyang.homework.guanka03;

import java.util.HashSet;
import java.util.Random;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-03 21:58
 * @description
 * 双色球规则:双色球每注投注号码由6个红色球号码和1个蓝色球号码组成。
 * 红色球号码从1—33中选择；蓝色球号码从1—16中选择.请随机生成一注双色球号码
 **/
public class Test01
{
    public static void main(String[] args)
    {
        HashSet<Integer> integerHashSet = new HashSet<Integer>();
        Random random = new Random();
        for (int i = 0; i < 6; i++)
        {
            int temp = random.nextInt(33)+1;
            integerHashSet.add(temp);
        }
        int temp = random.nextInt(16)+1;
        integerHashSet.add(temp);
        System.out.println(integerHashSet);
    }
}
