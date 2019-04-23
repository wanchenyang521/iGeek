package com.wanchenyang.homework.level2_04;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-26 16:00
 * @description
 **/
public class Test
{
    private String username="wcy";
    private String password="123123";
    public void login(String username, String password)
    {
        if(!username.equals(this.username))
        {
            try
            {
                throw new LoginException("用户名不存在");
            }
            catch (LoginException e)
            {
                e.printStackTrace();
            }
        }
        else if(!password.equals(this.password))
        {
            try
            {
                throw new LoginException("密码错误");
            }
            catch (LoginException e)
            {
                e.printStackTrace();
            }
        }
        else
         {
            System.out.println("欢迎"+this.username);
         }

    }

    public static void main(String[] args)
    {
        Test test = new Test();
//        test.login("wcy", "12");
        test.login("wcy", "123123");

    }

}
