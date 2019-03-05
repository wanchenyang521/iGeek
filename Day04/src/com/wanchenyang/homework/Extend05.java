package com.wanchenyang.homework;

import java.util.Random;
import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-04 18:46
 * @description 1.基础班考试要进行分组, 键盘录入该班级总共多少组?以及每组的学生数量?
 * 2.根据录入的组数及每组学员的数量创建二维数组
 * 3.利用随机数产生0-100的成绩(包含0和100)
 * 4.要求:
 * (1)打印该班级中每组的不及格人数
 * (2)打印该班级中每组的平均分
 * (3)打印组的最高平均分
 * (4)打印班级中的不及格人数
 * (5)打印班级平均分
 * (6)演示格式如下:
 * 请输入班级总组数:3
 * 请输入班级中每组的人数:10
 * 控制台输出:
 * 第1组不及格人数为: 6 人
 * 第1组平均分为: 52
 * 第2组不及格人数为: 7 人
 * 第2组平均分为: 46
 * 第3组不及格人数为: 3 人
 * 第3组平均分为: 69
 * 班级中单组最高平均分为:69
 * 班级中不及格人数为: 16 人
 * 班级总平均分为: 56
 **/
public class Extend05
{
    public static void main(String[] args)
    {
//        1.基础班考试要进行分组, 键盘录入该班级总共多少组?以及每组的学生数量?
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int numGroup, numStudent;
        System.out.print("请输入班级总组数:");
        numGroup = input.nextInt();
        System.out.print("请输入班级中每组的人数:");
        numStudent = input.nextInt();
//        2.根据录入的组数及每组学员的数量创建二维数组
        int[][] arrStudent = new int[numGroup][numStudent];
//        3.利用随机数产生0-100的成绩(包含0和100)
        for (int i = 0; i < arrStudent.length; i++)
        {
            for (int j = 0; j < arrStudent.length; j++)
            {
                arrStudent[i][j] = random.nextInt(101);
            }
        }
        int sumClassFailStudent = 0; //班级不及格总数
        int failStudent = 0;//不及格人数
        int sumScore = 0;        //每组成绩
        int average = 0;      //平均分
        int sumClassAverage = 0; //班级总平均分
        int heightAverage = 0; //单组最高平均分

//        (1)打印该班级中每组的不及格人数
        for (int i = 0; i < arrStudent.length; i++)
        {
            for (int j = 0; j < arrStudent[i].length; j++)
            {
                if (arrStudent[i][j] < 60)
                {
                    failStudent++;
                }
                sumScore += arrStudent[i][j];
            }
//             求总不及格人数
            sumClassFailStudent += failStudent;
//            单组平均分
            average = sumScore / arrStudent[i].length;
//          班级平均分总和
            sumClassAverage += average;
//            通过比较获取最高单组平均分
            if (heightAverage < average)
            {
                heightAverage = average;
            }
            System.out.println("第" + (i + 1) + "组不及格人数为:" + failStudent + "人");
            System.out.println("第" + (i + 1) + "组平均分为:" + average);
//            单组变量初始化
            failStudent = 0;
            sumScore = 0;
            average = 0;
        }
//      班级中单组最高平均分为:69
//  	班级中不及格人数为: 16 人
//  	班级总平均分为: 56
        System.out.println("班级中单组最高平均分为:" + heightAverage);
        System.out.println("班级中不及格人数为: " + sumClassFailStudent);
        System.out.println("班级总平均分为: " + sumClassAverage / arrStudent.length);

    }
}
