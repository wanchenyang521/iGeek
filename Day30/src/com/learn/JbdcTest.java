package com.learn;

import java.sql.*;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-23 09:01
 * @description
 **/
public class JbdcTest
{
    public static void main(String[] args) throws ClassNotFoundException, SQLException
    {
//        1.注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
//        2.获取连接
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?characterEncoding=utf8&useSSL=true&serverTimezone=Asia/Shanghai", "root", "123456");
//        3.获得执行语句
        Statement statement = connection.createStatement();
//        4.执行SQL
        ResultSet resultSet = statement.executeQuery("select * from category");
//        5.处理resultSet
        while (resultSet.next())
        {
//            获得一行数据
            Integer cid = resultSet.getInt("cid");
            String cname = resultSet.getString("cname");
            System.out.println("cid:"+cid);
            System.out.println("cname:"+cname);
        }

        while (resultSet.previous())
        {
//            获得一行数据
            Integer cid = resultSet.getInt("cid");
            String cname = resultSet.getString("cname");
            System.out.println("cid:"+cid);
            System.out.println("cname:"+cname);
        }
//        释放资源
        resultSet.close();
        statement.close();
        connection.close();

    }
}
