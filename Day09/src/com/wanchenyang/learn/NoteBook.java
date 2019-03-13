package com.wanchenyang.learn;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-11 14:28
 * @description
 **/
public class NoteBook
{
    private int id;
    private String string ="";

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public NoteBook(int id, String string)
    {
        this.id = id;
        this.string = string;
    }


    public String getString()
    {
        return string;
    }

    public void setString(String string)
    {
        this.string += string;
    }

    public NoteBook()
    {
    }

    public NoteBook(String string)
    {
        this.string = string;
    }
}
