package com.wanchenyang.learn;


/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-22 08:40
 * @description
 **/
public class User
{
    int id;
    String username;
    String password;
//static修饰就是静态变量，类变量
    static String school = "泰职";

    public User(String username, int id)
    {
        this.username = username;
        this.id = id;
    }

//    没有static修饰就是一个普通的成员变量
    public void login()
    {
//        login（）调用非静态成员，编译器会报错
//        System.out.println("登录"+ username);
        System.out.println("登录"+ username);

    }
//    静态方法要调用静态的方法，不能是普通的成员变量
    public static void printSchool()
    {
//        login();
        System.out.println(school);
    }

    public static void main(String[] args)
    {
        User user = new User("www", 1602370122);
//        静态属性、方法建议使用通过类名来调用
        User.printSchool();
        System.out.println(User.school);
        user.login();
    }

}
