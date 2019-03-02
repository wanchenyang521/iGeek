package com.wanchenyang.learn;

public class TestContinue
{
	public static void main(String[] args)
	{
		for (int i = 1; i < 11; i++)
		{
			if (i == 3)
			{
				continue;
			}
			System.out.println(i);
		}
	}
}
