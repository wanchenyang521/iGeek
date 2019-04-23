package com.learn;

import java.util.*;
import java.util.Map.Entry;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-09 11:12
 * @description victory  原始扑克牌
 * integerStringHashMap  原始扑克牌与数字的映射
 * xipaiArrayList 存放了打乱后的数字，实现洗牌
 **/
public class playingCards
{
    public static void main(String[] args)
    {
//        生成原始扑克牌
        ArrayList<String> victory = victory();
//        完成数字与纸牌的映射关系
        HashMap<Integer, String> integerStringHashMap = hashMapCard(victory);
        System.out.println("原始扑克牌：");
        printArrayList(victory);
        System.out.println("映射关系：");
        System.out.println(integerStringHashMap);

//        进行扑克牌的洗牌
        ArrayList<Integer> xipaiArrayList = xipai(integerStringHashMap);
        System.out.println("\n打乱后");
        printArrayList(xipaiArrayList);


        System.out.println();
//       发牌 三人列表及底牌
        ArrayList<ArrayList<Integer>> persons = personCard(xipaiArrayList);

//        进行看牌操作
        System.out.println("发牌后");
        for (int i = 0; i < persons.size() - 1; i++)
        {
            System.out.print("第" + (i + 1) + "位");
            printCard(persons.get(i), integerStringHashMap);
        }
        System.out.print("底牌:");
        printCard(persons.get(3), integerStringHashMap);

    }

    //    洗牌
//    通过获取到的键 然后打乱完成洗牌
    public static ArrayList<Integer> xipai(HashMap<Integer, String> integerStringHashMap)
    {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Set<Entry<Integer, String>> entrySet = integerStringHashMap.entrySet();
        for (Entry<Integer, String> thisEntrySet :
                entrySet)
        {
            Integer key = thisEntrySet.getKey();
            arrayList.add(key);
        }
//打乱
        Collections.shuffle(arrayList);
        return arrayList;
    }


    //    发牌
    public static ArrayList<ArrayList<Integer>> personCard(ArrayList<Integer> xipaiArrayList)
    {
        ArrayList<ArrayList<Integer>> personVictory = new ArrayList<>();

        ArrayList<Integer> person1 = new ArrayList<Integer>();
        ArrayList<Integer> person2 = new ArrayList<Integer>();
        ArrayList<Integer> person3 = new ArrayList<Integer>();
        ArrayList<Integer> dipai = new ArrayList<Integer>();

        for (int i = xipaiArrayList.size() - 1; i >= xipaiArrayList.size() - 3; i--)
        {
            dipai.add(xipaiArrayList.get(i));
        }

        for (int i = 0; i < xipaiArrayList.size() - 3; i++)
        {
            if (i % 3 == 0)
            {
                person1.add(xipaiArrayList.get(i));
            }
            if (i % 3 == 1)
            {
                person2.add(xipaiArrayList.get(i));
            }
            if (i % 3 == 2)
            {
                person3.add(xipaiArrayList.get(i));
            }
        }

        personVictory.add(person1);
        personVictory.add(person2);
        personVictory.add(person3);
        personVictory.add(dipai);
        return personVictory;

    }

    //    打印扑克牌ArrayList
    public static void printArrayList(ArrayList<?> victory)
    {
        int temp = 0;
        Iterator<?> stringIterator = victory.iterator();
        while (stringIterator.hasNext())
        {

            if (temp % 18 == 0 && temp != 0)
            {
                System.out.println();
                temp = 0;
            }
            Object object = stringIterator.next();
            System.out.print(object + "\t");
            temp++;
        }
        System.out.println();

    }

    //    看牌
    public static void printCard(ArrayList<Integer> person, HashMap<Integer, String> integerStringHashMap)
    {
//        1.进行排序
        Collections.sort(person);
//        打印
        StringBuilder stringBuilder = new StringBuilder("[");
        Set<Entry<Integer, String>> entrySet = integerStringHashMap.entrySet();
        for (int i = 0; i < person.size(); i++)
        {
            Integer temp = person.get(i);

            for (Entry<Integer, String> thisEntrySet :
                    entrySet)
            {
                if (temp == thisEntrySet.getKey())
                {
                    String value = thisEntrySet.getValue();
                    stringBuilder.append(value + ",");
                }
            }

        }
        stringBuilder.setCharAt(stringBuilder.length() - 1, ']');
        System.out.println(stringBuilder);

    }

    //  生成扑克牌
    public static ArrayList<String> victory()
    {
        ArrayList<String> victory = new ArrayList<String>();
//        牌型
        String[] victoryType = {"♣", "♦", "♠", "♥"};
        String[] victoryKing = {"小☺", "大☺"};
//     牌号
        String[] victoryNum = {"3",
                "4", "5", "6",
                "7", "8", "9",
                "10", "J", "Q", "K", "A", "2"};

        for (int i = 0; i < 13; i++)
        {
            String v = "";
            for (int j = 0; j < 4; j++)
            {
                v = victoryType[j] + victoryNum[i];
                victory.add(v);
            }
        }
        victory.add(victoryKing[0]);
        victory.add(victoryKing[1]);
        return victory;
    }

    //数字与纸牌
    public static HashMap hashMapCard(ArrayList<String> arrayList)
    {
        HashMap<Integer, String> integerStringHashMap = new HashMap<>();
        for (int i = 0; i < arrayList.size(); i++)
        {
            integerStringHashMap.put(i, arrayList.get(i));
        }
        return integerStringHashMap;
    }
}
