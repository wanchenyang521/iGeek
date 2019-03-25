package com.wanchenyang.homework;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-13 20:44
 * @description
 * 5+5
 * 150-25
 * 155*155
 * 2555/5
 **/
public class Extend03
{
    public static void main(String[] args) throws IOException
    {
        ArrayList<String> fristNum = new ArrayList<String>();
        ArrayList<String> secondNum = new ArrayList<String>();
        ArrayList<String> flag = new ArrayList<String>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\WorkSpace\\Java\\Day10\\src\\com\\wanchenyang\\homework\\txt\\questions.txt"));
        String temp;
        String[] tempArr = new String[3];
        while((temp=bufferedReader.readLine())!=null)
        {
            for (int i = 0; i < temp.length(); i++)
            {

                if(temp.charAt(i)=='+'||
                        temp.charAt(i)=='-'||
                        temp.charAt(i)=='*'||
                        temp.charAt(i)=='/')
                {

//                    String flagTemp ="\\\\"+String.valueOf(temp.charAt(i));
////                    tempArr = temp.split("\\\\"+String.valueOf(temp.charAt(i)));
////                    tempArr[2] = flagTemp;
////                    System.out.println(temp.split("\\\\"+String.valueOf(temp.charAt(i))));
                    tempArr[0] = temp.substring(0, i);
                    tempArr[1] = temp.substring(i+1);
                    tempArr[2] = String.valueOf(temp.charAt(i));
                    break;
                }
            }
            fristNum.add(tempArr[0]);
            flag.add(tempArr[2]);
            secondNum.add((tempArr[1]));
        }
        ArrayList<String> resultList = arrayListResult(fristNum, secondNum, flag);


//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\WorkSpace\\Java\\Day10\\src\\com\\wanchenyang\\homework\\txt\\result.txt"));
//        String line;
//        for (int i = 0; i < resultList.size(); i++)
//        {
//            bufferedWriter.write(resultList.get(i));
//            bufferedWriter.newLine();
//            bufferedWriter.flush();
//        }

//        同一个文件操作
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\WorkSpace\\Java\\Day10\\src\\com\\wanchenyang\\homework\\txt\\questions.txt"));
        String line;
        for (int i = 0; i < resultList.size(); i++)
        {
            bufferedWriter.write(resultList.get(i));
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }

        bufferedReader.close();
    }
    //计算
    public static ArrayList<String> arrayListResult(ArrayList<String> fristNum, ArrayList<String> secondNum,ArrayList<String> flag)
    {
        ArrayList<String> resultList = new ArrayList<String>();
        double result=0;
        for (int i = 0; i < fristNum.size(); i++)
        {
            switch (flag.get(i))
            {
                case "+":
                    result = Integer.valueOf(fristNum.get(i))+Integer.valueOf(secondNum.get(i));
                    break;
                case "-":
                    result = Integer.valueOf(fristNum.get(i))-Integer.valueOf(secondNum.get(i));
                    break;
                case "*":
                    result = Integer.valueOf(fristNum.get(i))*Integer.valueOf(secondNum.get(i));
                    break;
                case "/":
                    result = Integer.valueOf(fristNum.get(i))/Integer.valueOf(secondNum.get(i));
                    break;
            }

            resultList.add(fristNum.get(i)+flag.get(i)+secondNum.get(i)+"="+String.valueOf(result));
        }

        return resultList;
    }


}
