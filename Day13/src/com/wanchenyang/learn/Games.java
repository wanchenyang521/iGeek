package com.wanchenyang.learn;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-18 10:12
 * @description
 **/
public class Games extends Item
{
    private String title;
    private String director;
    private String comment;
    private int playingTime;
    private int numofTracks;
    private boolean isgotIt;
    private String type;
    private String platform;


    public void print()
    {
        System.out.println(
                "title:"+title+"\t"
                        +"director:"+director+"\t"
                        +"comment:"+comment+"\t"
                        +"playingTime:"+playingTime+"\t"
                        +"numofTracks:"+numofTracks+"\t"
                        +"isgotIt:"+isgotIt
        );
    }
    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getDirector()
    {
        return director;
    }

    public void setDirector(String director)
    {
        this.director = director;
    }

    public String getComment()
    {
        return comment;
    }

    public void setComment(String comment)
    {
        this.comment = comment;
    }

    public int getPlayingTime()
    {
        return playingTime;
    }

    public void setPlayingTime(int playingTime)
    {
        this.playingTime = playingTime;
    }

    public int getNumofTracks()
    {
        return numofTracks;
    }

    public void setNumofTracks(int numofTracks)
    {
        this.numofTracks = numofTracks;
    }

    public boolean isIsgotIt()
    {
        return isgotIt;
    }

    public void setIsgotIt(boolean isgotIt)
    {
        this.isgotIt = isgotIt;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public String getPlatform()
    {
        return platform;
    }

    public void setPlatform(String platform)
    {
        this.platform = platform;
    }

    public Games(String title, String director, String comment, int playingTime, int numofTracks, boolean isgotIt, String type, String platform)
    {
        this.title = title;
        this.director = director;
        this.comment = comment;
        this.playingTime = playingTime;
        this.numofTracks = numofTracks;
        this.isgotIt = isgotIt;
        this.type = type;
        this.platform = platform;
    }

    public Games()
    {
    }
}
