package com.homework.guanka01;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-15 15:50
 * @description
 **/
public class Test12
{
    public static void main(String[] args)
    {
        String src = "D:\\WorkSpace\\Java\\Day27\\cy.jpg";
        String dest06 = "D:\\WorkSpace\\Java\\Day27\\src\\com\\homework\\cy06.jpg";
        String dest07 = "D:\\WorkSpace\\Java\\Day27\\src\\com\\homework\\cy07.jpg";
        String dest10 = "D:\\WorkSpace\\Java\\Day27\\src\\com\\homework\\cy10.jpg";
        String dest11 = "D:\\WorkSpace\\Java\\Day27\\src\\com\\homework\\cy11.jpg";
        long startTime06=System.currentTimeMillis();
        Test06.copyFile(src,dest06);
        long endTime06=System.currentTimeMillis();
        System.out.println("执行时间："+(endTime06-startTime06));

        long startTime07=System.currentTimeMillis();
        Test07.copyFile(src,dest07);
        long endTime07=System.currentTimeMillis();
        System.out.println("执行时间："+(endTime07-startTime07));

        long startTime10=System.currentTimeMillis();
        Test10.copyFile(src,dest10);
        long endTime10=System.currentTimeMillis();
        System.out.println("执行时间："+(endTime10-startTime10));

        long startTime11=System.currentTimeMillis();
        Test11.copyFile(src,dest11);
        long endTime11=System.currentTimeMillis();
        System.out.println("执行时间："+(endTime11-startTime11));








    }

}
