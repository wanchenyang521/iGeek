package com.learn.test03;

import java.io.DataOutputStream;
import java.util.*;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-18 09:36
 * @description
 **/
public class TestList
{
    public static void main(String[] args)
    {
        Student student1 = new Student("w1", "class1", 80);
        Student student2 = new Student("w2", "class1", 80);
        Student student3 = new Student("c1", "class2", 90);
        Student student4 = new Student("c2", "class3", 90);

//        所有学生
        ArrayList<Student> studentArrayList = new ArrayList<>();
        Collections.addAll(studentArrayList, student1,student2,student3,student4);

        ArrayList<Student> class1 = new ArrayList<>();
        ArrayList<Student> class2 = new ArrayList<>();
        for (Student thisStudent:
             studentArrayList)
        {
            if(thisStudent.getClass_number().equals("class1"))
            {
                class1.add(thisStudent);
            }
            else
            {
                class2.add(thisStudent);
            }

        }
        HashMap<String,Classroom> stringClassroomHashMap = new HashMap<>();
        Classroom classroom1 = new Classroom("class1", class1);
        Classroom classroom2 = new Classroom("class2", class2);
        stringClassroomHashMap.put("classroom1", classroom1);
        stringClassroomHashMap.put("classroom2", classroom2);
        Set<String> classNum = stringClassroomHashMap.keySet();
        for (String key:
             classNum)
        {
            Classroom classroom = stringClassroomHashMap.get(key);
            System.out.println(classroom.getClassNumber());
//            求分
            calc(classroom);

        }
    }

    public static void calc(Classroom classroom)
    {
        double sum = 0;
        double avg = 0;
        ArrayList<Student> studentArrayList = classroom.getStudentArrayList();
        for (Student thisStudent:
                studentArrayList)
        {
            sum+=thisStudent.getScore();
        }
        avg = sum/studentArrayList.size();
        System.out.println("总分"+sum);
        System.out.println("平均分"+avg);
    }
}
