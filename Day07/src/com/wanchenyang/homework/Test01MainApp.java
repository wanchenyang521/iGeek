package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-07 16:29
 * @description
 **/
public class Test01MainApp
{
    public static void main(String[] args)
    {
        Test01Teacher teacher1 = new Test01Teacher("t001","薛之谦","男",26,"Java");
        Test01Teacher teacher2 = new Test01Teacher("t002","张碧晨","女",24,"IOS");
        Test01Teacher teacher3 = new Test01Teacher("t003","张杰","男",28,"Java");
        Test01Subject subject1 = new Test01Subject("s001","Java","2007-02-08","Java学科，包含JavaSE和JavaEE");
        Test01Subject subject2 = new Test01Subject("s002","IOS","2007-02-09","IOS系统开发");
        System.out.println("教师编号\t姓名\t   性别\t 年龄  科目");
        System.out.println(teacher1.getTeacherId()+"\t"+teacher1.getTeacherName()+"\t"+teacher1.getTeacherSex()+"\t"+teacher1.getTeacherAge()+"\t  "+teacher1.getTeacherSubject());
        System.out.println(teacher2.getTeacherId()+"\t"+teacher2.getTeacherName()+"\t"+teacher2.getTeacherSex()+"\t"+teacher2.getTeacherAge()+"\t  "+teacher2.getTeacherSubject());
        System.out.println(teacher3.getTeacherId()+"\t"+teacher3.getTeacherName()+"\t\t"+teacher3.getTeacherSex()+"\t"+teacher3.getTeacherAge()+"\t  "+teacher3.getTeacherSubject());
        System.out.println("课程编号\t名称\t  创建时间\t\t课程描述");
        System.out.println(subject1.getSubjectId()+"\t"+subject1.getSubjectName()+"\t"+subject1.getSubjectDate()+"\t"+subject1.getSubjectDescribe());
        System.out.println(subject2.getSubjectId()+"\t"+subject2.getSubjectName()+"\t\t"+subject2.getSubjectDate()+"\t"+subject2.getSubjectDescribe());
    }
}
