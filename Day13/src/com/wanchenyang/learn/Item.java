package com.wanchenyang.learn;

import java.util.Timer;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-18 09:54
 * @description
 **/
public class Item
{
    public String title;
    private String artist;
    private int playingTime;
    private boolean isgotIt;
    private String comment;

    public Item()
    {
    }

    public Item(String title)
    {
        this.title =title;
    }

    public Item(String title, String artist, int playingTime)
    {
        this.title = title;
        this.artist = artist;
        this.playingTime = playingTime;

    }

    public void print()
    {
        System.out.println(
                "title:"+title+"\t"
                        +"artist:"+artist+"\t"
                        +"playingTime:"+playingTime+"\t"
                        +"isgotIt:"+isgotIt+"\t"
                        +"comment:"+comment
        );
    }
}
