package com.wanchenyang.learn;

import java.lang.annotation.ElementType;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-08 08:38
 * @description
 **/
public class Test01Clock
{
    private int hourHand;   //时针
    private int minuteHand; //分针
    private int secondHand; //秒针

    public Test01Clock()
    {
    }

    public Test01Clock(int hourHand, int minuteHand, int secondHand)
    {
        this.hourHand = hourHand;
        this.minuteHand = minuteHand;
        this.secondHand = secondHand;
    }

    public int getHourHand()
    {
        return hourHand;
    }

    public void setHourHand(int hourHand)
    {
        this.hourHand = hourHand;
    }

    public int getMinuteHand()
    {
        return minuteHand;
    }

    public void setMinuteHand(int minuteHand)
    {
        this.minuteHand = minuteHand;
    }

    public int getSecondHand()
    {
        return secondHand;
    }

    public void setSecondHand(int secondHand)
    {
        this.secondHand = secondHand;
    }


    private void addsecondHand()
    {



//        if(secondHand==60)
//        {
//            addminuteHand();
//            secondHand = 0;
//        }
//        else
//        {
//            secondHand++;
//        }
    }
    private void addminuteHand()
    {
        if(minuteHand==59)
        {
            addhourHand();
            minuteHand = 0;
        }
        else
        {
            minuteHand++;
        }
    }
    private void addhourHand()
    {
        if(hourHand==23)
        {
            hourHand = 0;
        }
        else
        {
            hourHand++;
        }
    }
    public void startClock()
    {
        addsecondHand();
    }








}
