package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-07 19:26
 * @description
 **/
public class Extend04MainApp
{
    public static void main(String[] args)
    {
        Extend04Book book1 = new Extend04Book("book01", "Java编程思想", 66);
        Extend04Book book2 = new Extend04Book("book02", "Java核心技术", 99);
        Extend04Book book3 = new Extend04Book();
        book3.setBookId("book03");
        book3.setBookName("深入理解JVM");
        book3.setPrice(88);

        Extend04Book book = printPrice(book1, book2, book3);
        System.out.println("图书编号："+book.getBookId());
        System.out.println("图书书名："+book.getBookName());
        System.out.println("图书价格："+book.getPrice());



    }
    public static Extend04Book printPrice( Extend04Book book1, Extend04Book book2, Extend04Book book3)
    {

        double result = (((book1.getPrice()>book2.getPrice())?book1.getPrice():book2.getPrice())>book3.getPrice())?((book1.getPrice()>book2.getPrice())?book1.getPrice():book2.getPrice()):book3.getPrice();
        if(result==book1.getPrice())
        {
            return book1;
        }
        else if(result == book2.getPrice())
        {
            return book2;
        }
        else
        {
            return book3;
        }

    }
}
