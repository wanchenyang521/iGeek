package Victory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

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
        System.out.println("原始扑克牌");
        print(victory);
        Collections.shuffle(victory);
        System.out.println("\n打乱后");
        print(victory);
        System.out.println();
//        三人列表及底牌
        ArrayList<ArrayList<String>> persons = person(victory);
        System.out.println("发牌后");
        for (int i = 0; i < persons.size()-1; i++)
        {
            System.out.print("第"+(i+1)+"位");
            print(persons.get(i));
            System.out.println();
        }
        System.out.print("底牌:");
        print(persons.get(persons.size()-1));

    }

//    发牌
    public static ArrayList<ArrayList<String>> person(ArrayList<String> victory)
    {
        ArrayList<ArrayList<String>> personVictory = new ArrayList<>();
        ArrayList<String> person1 = new ArrayList<String>();
        ArrayList<String> person2= new ArrayList<String>();
        ArrayList<String> person3 = new ArrayList<String>();
        ArrayList<String> dipai = new ArrayList<String>();

        for (int i = victory.size()-1; i>=victory.size()-3; i--)
        {
            dipai.add(victory.get(i));
        }

        for (int i = 0; i < victory.size()-3; i++)
        {
            if(i%3==0)
            {
                person1.add(victory.get(i));
            }
            if(i%3==1)
            {
                person2.add(victory.get(i));
            }
            if(i%3==2)
            {
                person3.add(victory.get(i));
            }
        }

        personVictory.add(person1);
        personVictory.add(person2);
        personVictory.add(person3);
        personVictory.add(dipai);
        return personVictory;
        
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



//        for (int i = 0; i < victory.size(); i++)
//        {
//            if(i%17==0&&i!=0)
//            {
//                System.out.println();
//            }
//            System.out.print(victory.get(i)+"\t");
//        }
    }

//  生成扑克牌
    public static ArrayList<String> victory()
    {
        ArrayList<String> victory = new ArrayList<String>();
//        牌型
        String[] victoryType = {"♣","♦","♠","♥"};
        String[] victoryKing = {"大☺","小☺"};
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
        victory.add(victoryKing[0]);
        victory.add(victoryKing[1]);
        return victory;
    }
}
