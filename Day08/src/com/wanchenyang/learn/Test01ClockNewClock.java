package com.wanchenyang.learn;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-08 09:54
 * @description
 **/
public class Test01ClockNewClock
{
    private Test01ClockNew hour = new Test01ClockNew(23);
    private Test01ClockNew minute = new Test01ClockNew(59);
    private Test01ClockNew second = new Test01ClockNew(59);
    public void start()
    {
        hour.setValue(23);
        minute.setValue(58);
        while (true)
        {
            try
            {
                second.increase();
                if(second.getValue()==0)
                {
                    minute.increase();
                    if(minute.getValue() == 0)
                    {
                        hour.increase();
                    }
                }
                System.out.println(hour.getValue()+" ："+minute.getValue()+" ："+second.getValue());
                Thread.sleep(100);



            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }


        }
    }


    public static void main(String[] args)
    {
        Test01ClockNewClock clockNewClock = new Test01ClockNewClock();
        clockNewClock.start();
    }

}
