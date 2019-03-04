package com.wanchenyang.learn;

import java.util.Random;

public class TestRandom01
{
    public static void main(String[] args)
    {
        Random random = new Random();
        int i = random.nextInt(100)+1;
        System.out.println(i);
    }
}
