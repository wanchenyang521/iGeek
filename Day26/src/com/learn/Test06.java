package com.learn;

import java.io.File;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-12 08:40
 * @description
 **/
public class Test06
{
    public static void main(String[] args)
    {
        String path = "D:\\WorkSpace\\Java\\Day26\\cy.jpg";
        File file = new File(path);
        System.out.println(file.length());

        path = "D:\\WorkSpace\\Java\\Day26";
        file = new File(path);
        System.out.println(file.length());
    }
}
