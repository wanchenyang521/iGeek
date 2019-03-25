package com.wanchenyang.learn;

import javax.swing.text.html.CSS;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-18 08:40
 * @description 资料库 存放CD
 *
 *子类和子类型
 * 1.类定义了类型
 * 2.子类定义了子类型
 * 3.子类的对象当作父类的对象使用
 * 3.1 赋值给父类的对象
 * 3.2 传递给需要的父类对象的函数
 * 3.3 放进存放父类对象的容器中去
 *
 * 4.父类的对象不能赋值给子类的变量
 *
 *
 *
 * 当拿一个子类的对象当父类的对象来用的时候
 * 向上造型是默认的
 * 向上造型总是安全的
 **/
public class TestDB
{
    static ArrayList<Item> items = new ArrayList<Item>();
    public static void main(String[] args) throws IOException
    {
//        Scanner scanner = new Scanner(System.in);
//        ArrayList<CD> cdArrayList = new ArrayList<CD>();
//        ArrayList<DVD> dvdArrayList = new ArrayList<DVD>();
//
//        addCD(cdArrayList);
//        printCDList(cdArrayList);
//
//        addDVD(dvdArrayList);
//        printDVDList(dvdArrayList);

        CD cd = new CD("sad", "asd", 10, true, "sda");
        Item item = new Item("0");
        item = cd;

        TestDB testDB = new TestDB();
        testDB.add(new DVD("1", "2", "2", 12, 12, true));
        testDB.add(new CD("12", "231", 2, true, "sda"));
        testDB.add(new Games("213", "32", "32324", 12, 13, true, "ff", "ff"));
        testDB.printList(items);

    }




//    //    添加一个cd
//    public static void addCD(ArrayList<CD> cdArrayList)
//    {
//        CD cd = new CD();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入title");
//        cd.setTitle(scanner.nextLine());
//        System.out.println("请输入artist");
//        cd.setArtist(scanner.nextLine());
//        System.out.println("请输入playingTime");
//        cd.setPlayingTime(scanner.nextInt());
//        scanner.nextLine();
//        System.out.println("请输入isgotIt(true/false)");
//        cd.setIsgotIt(scanner.nextBoolean());
//        scanner.nextLine();
//        System.out.println("请输入comment");
//        cd.setComment(scanner.nextLine());
//        cdArrayList.add(cd);
//    }
//    //    添加一个cd
//    public static void addDVD(ArrayList<DVD> dvdArrayList)
//    {
//
////            private String title;
////    private String director;
////    private String comment;
////    private int playingTime;
////    private int numofTracks;
////    private boolean isgotIt;
//        DVD dvd = new DVD();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入title");
//        dvd.setTitle(scanner.nextLine());
//
//        System.out.println("请输入director");
//        dvd.setDirector(scanner.nextLine());
//        System.out.println("请输入comment");
//        dvd.setComment(scanner.nextLine());
//        System.out.println("请输入playingTime");
//        dvd.setPlayingTime(scanner.nextInt());
//        scanner.nextLine();
//        System.out.println("请输入numofTracks");
//        dvd.setNumofTracks(scanner.nextInt());
//        scanner.nextLine();
//        System.out.println("请输入isgotIt");
//        dvd.setIsgotIt(scanner.nextBoolean());
//        dvdArrayList.add(dvd);
//    }
//
//    //    打印ArrayList
//    public static void printCDList(ArrayList<CD> cdArrayList)
//    {
//        for (CD cd :
//                cdArrayList)
//        {
//            cd.printCd();
//        }
//    }
//    //    打印ArrayListDVD
//    public static void printDVDList(ArrayList<DVD> dvdArrayList)
//    {
//        for (DVD dvd:
//                dvdArrayList)
//        {
//            dvd.printDVD();
//        }
//    }

    public void add(Item item)
    {
        items.add(item);
    }
    public void printList(ArrayList<Item> items)
    {
        for(Item item:items)
        {
            item.print();
        }
    }
}
