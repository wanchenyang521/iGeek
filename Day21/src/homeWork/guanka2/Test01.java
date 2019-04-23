package homeWork.guanka2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-01 20:01
 * @description
 * 获取每个学生信息.统计总分,平均分,最高分,最低分并输出
 **/
public class Test01
{
    public static void main(String[] args)
    {
        ArrayList<Student> arrayList = new ArrayList<Student>();
        arrayList.add(new Student("wcy1", 18, 100));
        arrayList.add(new Student("wcy2", 12, 89));
        arrayList.add(new Student("wcy3", 14, 98));
        arrayList.add(new Student("wcy4", 16, 20));
        arrayList.add(new Student("wcy5", 17, 30));
        Iterator<Student> studentIterator = arrayList.iterator();
        int sum=0;
        int height = 0;
        int low=1000;
        while (studentIterator.hasNext())
        {
            Student student = studentIterator.next();
            if(student.getGroup()>height)
            {
                height = student.getGroup();
            }
            if(student.getGroup()<low)
            {
                low = student.getGroup();
            }
            sum += student.getGroup();
        }
        System.out.println("总分"+sum);
        System.out.println("最高分"+height);
        System.out.println("最低分"+low);
        System.out.println("平均分"+(sum/arrayList.size()));
    }
}
