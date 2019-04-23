package com.learn;

import java.sql.*;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-23 10:00
 * @description
 **/
public class JbdcTest02
{
    public static void main(String[] args)
    {
        Connection connection =null;
        Statement statement = null;
        ResultSet resultSet = null;
//        1.注册驱动
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
//        2.获取连接
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?characterEncoding=utf8&useSSL=true&serverTimezone=Asia/Shanghai", "root", "123456");
//        3.获得执行语句
            statement=connection.createStatement();
//        4.执行SQL
            resultSet = statement.executeQuery("select * from category");

//        5.处理resultSet
            while (resultSet.next())
            {
//            获得一行数据
                Integer cid = resultSet.getInt("cid");
                String cname = resultSet.getString("cname");
                System.out.println("cid:"+cid);
                System.out.println("cname:"+cname);
            }
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        finally
        {

//        释放资源
            try
            {
                if(resultSet!=null)
                {
                    resultSet.close();
                }

            }
            catch (SQLException e)
            {
                e.printStackTrace();
            }
            try
            {
                if(statement!=null)
                {
                    statement.close();
                }
            }
            catch (SQLException e)
            {
                e.printStackTrace();
            }
            try
            {
                if(connection!=null)
                {
                    connection.close();
                }
            }
            catch (SQLException e)
            {
                e.printStackTrace();
            }
        }



    }
}
