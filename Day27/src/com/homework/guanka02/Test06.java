package com.homework.guanka02;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Random;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-16 16:08
 * @description
 * 使用集合存储10个1-50(含50)的随机偶数元素,要求数字不能重复
 * 按指定格式输出到C盘的num.txt中,
 * 例如: 48,44,40,38,34,30,26......
 **/
public class Test06
{
    public static void main(String[] args) throws IOException
    {
//        1.	创建集合对象HashSet
//2.	创建随机数对象Random
//3.	使用循环随机生成10个1-50(含50)的偶数
//4.	将生成的偶数添加到集合中
//5.	创建高效流关联目标文件，将集中的元素按指定格式拼接成字符串输出到文件中。

        HashSet<Integer> integerHashSet = new HashSet<>();
        Random random = new Random();
        while (integerHashSet.size()<=10)
        {
            int temp = random.nextInt(50)+1;
            if(temp%2==0)
            {
                integerHashSet.add(temp);
            }
        }
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("D:\\WorkSpace\\Java\\Day27\\src\\com\\homework\\guanka02\\num"));
        StringBuilder stringBuilder = new StringBuilder();
        for (Integer thisNum:
             integerHashSet)
        {
            stringBuilder.append(thisNum).append(",");
        }
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        bufferedOutputStream.write(stringBuilder.toString().getBytes());
        bufferedOutputStream.flush();
        bufferedOutputStream.close();

    }
}
