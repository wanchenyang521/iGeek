package com.wanchenyang.learn;

import java.util.Timer;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-18 08:39
 * @description
 **/
public class CD extends Item
{
    private String artist;
    private int playingTime;
    private boolean isgotIt;
    private String comment;


    public void print()
    {
        System.out.println(
                "title:"+super.title+"\t"
                +"artist:"+artist+"\t"
                +"playingTime:"+playingTime+"\t"
                +"isgotIt:"+isgotIt+"\t"
                +"comment:"+comment
        );

    }


    public CD(String title,String artist, int playingTime, boolean isgotIt, String comment)
    {
        super(title);
        this.title = title;
        this.artist = artist;
        this.playingTime = playingTime;
        this.isgotIt = isgotIt;
        this.comment = comment;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getArtist()
    {
        return artist;
    }

    public void setArtist(String artist)
    {
        this.artist = artist;
    }

    public int getPlayingTime()
    {
        return playingTime;
    }

    public void setPlayingTime(int playingTime)
    {
        this.playingTime = playingTime;
    }

    public boolean isIsgotIt()
    {
        return isgotIt;
    }

    public void setIsgotIt(boolean isgotIt)
    {
        this.isgotIt = isgotIt;
    }

    public String getComment()
    {
        return comment;
    }

    public void setComment(String comment)
    {
        this.comment = comment;
    }
}
