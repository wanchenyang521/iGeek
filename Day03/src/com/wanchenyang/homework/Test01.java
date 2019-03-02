package com.wanchenyang.homework;

import java.util.Scanner;

/**
 * 
 * @author: 晨阳
 * @date:   2019年3月1日 下午4:01:01   
 * @version V1.0 
 * @Description:
 * 键盘录入学生考试成绩，判断学生等级:
 * 90-100	优秀
 * 80-90	好
 * 70-80	良
 * 60-70	及格
 * 60以下	不及格
 */
public class Test01
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("请输入学生成绩：");
		int score = input.nextInt();
		if(score>=90&&score<=100) 
		{
			System.out.println("优秀");
		}
		else if(score>=80&&score<90) 
		{
			System.out.println("好");
		}
		else if(score>=70&&score<80) 
		{
			System.out.println("良");
		}
		else if(score>=60&&score<70) 
		{
			System.out.println("及格");
		}
		else if(score>=0&&score<60) 
		{
			System.out.println("不及格");
		}
		else 
		{
			System.out.println("非法成绩");
		}
		

	}

}






