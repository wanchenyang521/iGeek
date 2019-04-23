package com.guanka02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-09 19:41
 * @description
 **/
public class Test10
{
    public static void main(String[] args) throws IOException
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        HashMap<String,Integer> hashMap = new HashMap<>();
        while (hashMap.size()<5)
        {
            System.out.println("请输入");
            String name = scanner.nextLine();
            int score = random.nextInt(101);
            hashMap.put(name, score);
        }
        Set<String> strings = hashMap.keySet();
        Iterator<String> iterator = strings.iterator();
        int sumScore = 0;
        int heightScore = hashMap.get(iterator.next());
        int lowScore = heightScore;
        for (String thisString:
             strings)
        {
            sumScore += hashMap.get(thisString);
            if(heightScore< hashMap.get(thisString))
            {
                heightScore =  hashMap.get(thisString);
            }
            if(lowScore> hashMap.get(thisString))
            {
                lowScore= hashMap.get(thisString);
            }
        }
        System.out.println(hashMap);
        double aveScore = (double) sumScore/(double) hashMap.size();
        StringBuilder  stringBuilder = new StringBuilder();
        stringBuilder.append("总分="+sumScore+",最高分="+heightScore+",最低分="+lowScore+",平均分="+aveScore);
        System.out.println(stringBuilder);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\WorkSpace\\Java\\Day24\\src\\com\\guanka02\\score.txt"));
        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.close();


    }
}
