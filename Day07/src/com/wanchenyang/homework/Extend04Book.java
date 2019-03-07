package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-07 19:24
 * @description
 **/
public class Extend04Book
{
    private String bookId;
    private String bookName;
    private double price;

    public Extend04Book()
    {
    }

    public Extend04Book(String bookId, String bookName, double price)
    {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
    }

    public String getBookId()
    {
        return bookId;
    }

    public void setBookId(String bookId)
    {
        this.bookId = bookId;
    }

    public String getBookName()
    {
        return bookName;
    }

    public void setBookName(String bookName)
    {
        this.bookName = bookName;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }
}
