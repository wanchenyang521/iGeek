package homeWork.guanka3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-01 10:39
 * @description
 * 准备牌
 * 牌可以设计为一个ArrayList<String>,每个字符串为一张牌。
 * 每张牌由花色、数字两部分组成，我们可以使用花色集合与数字集合嵌套迭代完成每张牌的组装。
 * 牌由Collections类的shuffle方法进行随机排序
 * ♣♦♠♥大☺小☺
 **/
public class Associate
{
    public static void main(String[] args)
    {
        ArrayList<String> victory = victory();
        Collections.shuffle(victory);
        System.out.println("打乱后");
        print(victory);
        System.out.println();
        ArrayList<ArrayList<String>> persons = new ArrayList<>();

        ArrayList<String> temp =victory;
        persons.add(fapai(temp));
        persons.add(fapai(temp));
        persons.add(fapai(temp));
        persons.add(fapai(temp));
        System.out.println(persons);
        System.out.println(maxValue(persons));
    }


//    打印玩家中2张牌加起来最大的点数
//    A=1,J=11,Q=12,K=13
    public static int maxValue(ArrayList<ArrayList<String>> arrayList)
    {
        int result = 0;
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();

        Iterator<ArrayList<String>> iterator = arrayList.iterator();
        while (iterator.hasNext())
        {
            ArrayList<String> arrayList2 = iterator.next();
            char c1 = arrayList2.get(0).charAt(1);
            char c2 = arrayList2.get(1).charAt(1);
            result = sum(c1,c2);
            arrayList1.add(result);
        }
        System.out.println(arrayList1);
        return Collections.max(arrayList1);
    }

    public static int sum(char c1,char c2)
    {

        int num1;
        int num2;
        if(c1=='A') { num1 = 1; }
        else if(c1=='J') { num1 = 11; }
        else if(c1=='Q') { num1 = 12; }
        else if(c1=='K') { num1 = 13; }
        else
            {
                num1 = c1-'0';
            }
        if(c2=='A') { num2 = 1; }
        else if(c2=='J') { num2 = 11; }
        else if(c2=='Q') { num2 = 12; }
        else if(c2=='K') { num2 = 13; }
        else
        {
            num2 = c2-'0';
        }



        return num1+num2;
    }

//    发牌
    public static ArrayList<String> fapai(ArrayList<String> victory)
    {
        ArrayList<String> person = new ArrayList<>();
        Random random = new Random();
       while (person.size()<2)
       {
           int i =random.nextInt(52);
           if(i>victory.size())
           {
               System.out.println(i);
               continue;
           }
           person.add(victory.get(i));
           victory.remove(i);
       }
       return person;
    }

//    打印扑克牌
    public static void print(ArrayList<String> victory)
    {
        int temp = 0;
        Iterator<String> stringIterator = victory.iterator();
        while (stringIterator.hasNext())
        {
            if(temp%18==0&&temp!=0)
            {
                System.out.println();
                temp=0;
            }
            String string = stringIterator.next();
            System.out.print(string+"\t");
            temp++;
        }

    }

//  生成扑克牌
    public static ArrayList<String> victory()
    {
        ArrayList<String> victory = new ArrayList<String>();
//        牌型
        String[] victoryType = {"♣","♦","♠","♥"};
//        String[] victoryKing = {"大☺","小☺"};
//     牌号
        String[] victoryNum={"A","2","3",
                             "4","5","6",
                             "7","8","9",
                             "10", "J","Q","K"};

        for (int i = 0; i < 13; i++)
        {
            String v ="";
            for (int j = 0; j < 4; j++)
            {
                v=victoryType[j]+victoryNum[i];
                victory.add(v);
            }
        }
        return victory;
    }
}
