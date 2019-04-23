package com.learn;

import java.io.File;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-11 15:38
 * @description
 **/
public class Test02
{
    public static void main(String[] args)
    {
        String path = "D:\\WorkSpace\\Java\\Day26\\cy.jpg";
        File file = new File(path);
        System.out.println(file.length());

        file = new File("D:\\WorkSpace\\Java\\Day26","cy.jpg");
        System.out.println(file.length());
        file = new File("D:/WorkSpace/Java/Day26","cy.jpg");
        System.out.println(file.length());
        file = new File("D:/WorkSpace/Java","Day26/cy.jpg");
        System.out.println(file.length());

        file = new File(new File("D:\\WorkSpace\\Java\\Day26"),"cy.jpg");
        System.out.println(file.length());

        file = new File("Day26","cy.jpg");
        System.out.println(file.getAbsolutePath());

    }
}
