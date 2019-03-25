package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-23 15:56
 * @description
 **/
public class TestPlayer
{
    public static void join(Player player)
    {
        player.playBasketball();
        player.playFootball();
        player.playVolleyball();
    }

    public static void main(String[] args)
    {
        join(new Player()
        {
            @Override
            public void playBasketball()
            {
                System.out.println("在打篮球");
            }

            @Override
            public void playFootball()
            {
                System.out.println("在踢足球");
            }

            @Override
            public void playVolleyball()
            {
                System.out.println("在打排球");
            }
        });



    }
}
