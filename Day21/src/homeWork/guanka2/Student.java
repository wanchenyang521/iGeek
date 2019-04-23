package homeWork.guanka2;

import java.io.PrintStream;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-01 20:02
 * @description
 **/
public class Student
{
    private String name;
    private int age;
    private int group;

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

    public int getGroup()
    {
        return group;
    }

    public void setGroup(int group)
    {
        this.group = group;
    }

    public Student()
    {
    }

    public Student(String name, int age, int group)
    {
        this.name = name;
        this.age = age;
        this.group = group;
    }
}
