package com.learn;

import java.sql.*;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-23 10:04
 * @description
 * jdbc 工具类
 **/
public class JdbcUtil
{

    private static String driver = "com.mysql.cj.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3306/mydb?characterEncoding=utf8&useSSL=true&serverTimezone=Asia/Shanghai";
    private static String user = "root";
    private static String password = "123456";

    /**
     * 注册驱动
     */
    static
    {
        try
        {
            Class.forName(driver);
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }

    /**
     * 获取连接
     * @return
     */
    public static Connection getConnection()
    {
        Connection connection = null;
        try
        {
            connection= DriverManager.getConnection(url, user, password);
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return connection;
    }

    /**
     * 释放资源
     */
    public static void closeResource(Connection connection, Statement statement, ResultSet resultSet)
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
