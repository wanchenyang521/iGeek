package com.wanchenyang.homework;

import java.util.Scanner;

/**
 * 
 * @author: 晨阳
 * @date:   2019年2月28日 下午6:59:32   
 * @version V1.0 
 * @Description:键盘录入一个学生成绩(int类型)
 * 				如果成绩大于等于60输出”及格”,如果成绩小于60输出”不及格”
 */
public class Test02
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("请输入成绩：");
		int score = input.nextInt();
		String result = (score>=60)?"及格":"不及格";
		System.out.println(result);

	}

}
