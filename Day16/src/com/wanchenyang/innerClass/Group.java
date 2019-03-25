package com.wanchenyang.innerClass;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-22 14:22
 * @description
 **/
public class Group
{
    private int age;

    public class Student
    {
        String name;

        public Student(String name,int a)
        {
            super();
            this.name = name;
            age = a;
        }

        public void output()
        {
            System.out.println("姓名"+this.name+"年龄"+age);
        }
    }

//    定义外部类的成员方法
    public void output()
    {
//        创建一个内部类对象
        Student student = new Student("wcy", 21);
//        通过stu调用内部类的成员方法
        student.output();
    }


    public static void main(String[] args)
    {
        Group group = new Group();
        group.output();
    }

}
