package com.wanchenyang.learn;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-15 14:07
 * @description
 * 继承
 * extends
 * 子类 extends 父类
 * java中只有单继承，接口可以多继承
 * 子类可以继承父类的方法和属性，不一定全部使用，private
 * 创建一个类的时候，没有显性继承父类Object
 * instanceof
 * instanceof关键字的作用是判断一个对象是否是一个具体类的实例
 * 父类抽取了共性的内容。子类在此基础上拓展属性与方法
 *
 **/
public class TestExtends01
{
    public static void main(String[] args)
    {
        Student student = new Student();
        student.setName("万晨阳");
        student.setAge(21);
        student.setId("1602370122");
        student.eat();
        System.out.println(student instanceof Student);
        System.out.println(new Person() instanceof Student);
        System.out.println(student instanceof Person);
    }

}
//定义人类
class Person
{
    private String name;
    private int age;
    private int height;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public int getHeight()
    {
        return height;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    public Person(String name, int age, int height)
    {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public Person()
    {
    }

    public void eat()
    {
        System.out.println("Person eat();");
    }
}
//定义学生类
class Student extends Person
{

    private String id;


    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public Student(String id)
    {
        this.id = id;
    }

    public Student()
    {
    }

//    public void eat()
//    {
//        System.out.println("Student eat();");
//    }
}
