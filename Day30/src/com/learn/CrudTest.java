package com.learn;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-23 10:18
 * @description 增删改查
 * executeQuery
 * 查
 *
 * executeUpdate
 *增删改
 *
 *
 **/
public class CrudTest
{
    public static void main(String[] args)
    {
        test04();

    }
//  插入
    public static void test01()
    {
//        null 如果主键设置了自增
//        insert into tableName values (null,'value')
        Connection connection =null;
        Statement statement = null;
        try
        {
            connection= JdbcUtil.getConnection();
            statement = connection.createStatement();
            int i = statement.executeUpdate("insert into category values (null,'test')");
            System.out.println(i);
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }finally
        {
            JdbcUtil.closeResource(connection, statement, null);
        }
    }
//    更新
    public static void test02()
    {
        //update table set column='value' where condition
        Connection connection =null;
        Statement statement = null;
        try
        {
            connection= JdbcUtil.getConnection();
            statement = connection.createStatement();
            statement.executeUpdate("update category set cname = 'test02' where cid = '4' ");
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }finally
        {
            JdbcUtil.closeResource(connection, statement, null);
        }
    }
//    删除
    public static void test03()
    {
//        delete from tableName [where condition]
        Connection connection =null;
        Statement statement = null;
        try
        {
            connection= JdbcUtil.getConnection();
            statement = connection.createStatement();
            statement.executeUpdate("delete from category where cid =4");
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }finally
        {
            JdbcUtil.closeResource(connection, statement, null);
        }
    }
//    查询
    public static void test04()
    {
        Connection connection =null;
        Statement statement = null;
        ResultSet resultSet = null;
        try
        {
            connection= JdbcUtil.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from category");
            while (resultSet.next())
           {
               Integer cid = resultSet.getInt("cid");
               String cname = resultSet.getString("cname");
               System.out.println(cid+":"+cname);
           }

        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }finally
        {
            JdbcUtil.closeResource(connection, statement, resultSet);
        }
    }


}
