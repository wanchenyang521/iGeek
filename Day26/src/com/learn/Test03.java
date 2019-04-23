package com.learn;

import java.io.File;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-11 15:44
 * @description
 * 1.绝对路径
 * 2.相对路径
 **/
public class Test03
{
    public static void main(String[] args)
    {
        String path = "D:\\WorkSpace\\Java\\Day26\\cy.jpg";
        File file = new File(path);
        System.out.println(file.getAbsolutePath());

        file = new File("cy.jpg");
        System.out.println(file.getAbsolutePath());

        System.out.println(System.getProperty("user.dir"));
//        不存在
        file = new File("ee/ee.jpg");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.length());
    }
}
