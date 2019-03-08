package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-08 19:15
 * @description
 **/
public class Extend01User
{
    private String username;
    private String password;
    private String birthday;
    private String hobby;

    public Extend01User()
    {
    }

    public Extend01User(String username, String password, String birthday, String hobby)
    {
        this.username = username;
        this.password = password;
        this.birthday = birthday;
        this.hobby = hobby;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getBirthday()
    {
        return birthday;
    }

    public void setBirthday(String birthday)
    {
        this.birthday = birthday;
    }

    public String getHobby()
    {
        return hobby;
    }

    public void setHobby(String hobby)
    {
        this.hobby = hobby;
    }
}
