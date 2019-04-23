package com.homework.guanka01;

import java.io.File;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-12 10:32
 * @description
 **/
public class Test01
{
    public static void main(String[] args)
    {
        File file1 = new File("D:\\WorkSpace\\Java\\Day26\\cy.jpg");
        System.out.println(file1.getName());
        File file2 = new File("D:\\WorkSpace\\Java\\Day26","cy.jpg");
        System.out.println(file2.getName());


    }
}
