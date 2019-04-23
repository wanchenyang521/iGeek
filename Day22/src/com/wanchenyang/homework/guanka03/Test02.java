package com.wanchenyang.homework.guanka03;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-03 22:02
 * @description
 **/
public class Test02
{
    public static void main(String[] args)
    {
        ArrayList<Student> classes1 = new ArrayList<Student>();
        classes1.add(new Student("w1", 18));
        classes1.add(new Student("w2", 18));
        classes1.add(new Student("w3", 18));
        ArrayList<Student> classes2 = new ArrayList<Student>();
        classes2.add(new Student("c1", 181));
        classes2.add(new Student("c2", 181));
        classes2.add(new Student("c3", 181));
        ArrayList<ArrayList<Student>> study = new ArrayList<ArrayList<Student>>();
        study.add(classes1);
        study.add(classes2);

        for (ArrayList<Student> classes:
             study)
        {
            for (Student student:
                 classes)
            {
                System.out.println(student);
            }
        }

        System.out.println("==========");
        Iterator<ArrayList<Student>> arrayListIterator = study.listIterator();
        while (arrayListIterator.hasNext())
        {
            ArrayList arrayList = arrayListIterator.next();
            Iterator<Student> studentIterator =arrayList.iterator();
            while (studentIterator.hasNext())
            {
                System.out.println(studentIterator.next());
            }
        }

    }
}
