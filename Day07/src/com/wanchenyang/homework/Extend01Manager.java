package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-07 16:58
 * @description
 **/
public class Extend01Manager
{
    private String name;
    private String id;
    private int salary;
    private int bonus;

    public Extend01Manager()
    {
    }

    public Extend01Manager(String name, String id, int salary, int bonus)
    {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.bonus = bonus;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public int getSalary()
    {
        return salary;
    }

    public void setSalary(int salary)
    {
        this.salary = salary;
    }

    public int getBonus()
    {
        return bonus;
    }

    public void setBonus(int bonus)
    {
        this.bonus = bonus;
    }
//    工号为123基本工资为15000奖金为6000的项目经理
//    正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....
    public void work()
    {
        System.out.println("工号为"+id+"基本工资为"+salary+"奖金为"+bonus+"的项目经理正在努力的做着管理工作," +
                "分配任务,检查员工提交上来的代码.....");
    }





}
