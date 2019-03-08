package com.wanchenyang.learn;

import java.text.SimpleDateFormat;
import java.util.SimpleTimeZone;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-08 08:46
 * @description
 **/
public class Test01ClockTest
{
    public static void main(String[] args)
    {
//        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
//       while (true)
//       {
//           System.out.println(dateFormat.format(System.currentTimeMillis()));
//           try
//           {
//               Thread.sleep(1000);
//           }
//           catch (InterruptedException e)
//           {
//               e.printStackTrace();
//           }
//       }

        Test01Clock clock = new Test01Clock(8,58,20);
        while (true)
        {
            try
            {
                clock.startClock();
                System.out.println("小时:"+clock.getHourHand()+" 分钟："+clock.getMinuteHand()+" 秒针："+clock.getSecondHand());
                Thread.sleep(100);
            }
            catch (Exception e)
            {
                System.exit(0);
            }

        }
    }
}
