package com.wanchenyang.exercise;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-18 16:44
 * @description
 **/
public class Test
{
    public static void main(String[] args)
    {
        Manager manager = new Manager("zs",10000,5000);
        Waiter waiter1 = new Waiter("w1", 1000);
        Waiter waiter2 = new Waiter("w2", 1000);
        Cooker cooker = new Cooker("c3", 1000);
        double sum = getSum(manager,waiter1,waiter2,cooker);
        System.out.println(sum);

        employeeWork(manager);
        employeeWork(waiter1);
        employeeWork(waiter2);
        employeeWork(cooker);

    }

    private static double getSum(Manager manager, Waiter waiter1, Waiter waiter2, Cooker cooker)
    {
        return manager.getBounds()+manager.getSalary()+waiter1.getSalary()+waiter2.getSalary()+cooker.getSalary();
    }

    private static void employeeWork(Employee employee)
    {
        employee.work();
    }
}
