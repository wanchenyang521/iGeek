package homeWork.guanka2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-01 20:16
 * @description
 **/
public class Test02
{
    public static void main(String[] args)
    {
        ArrayList<Person> personArrayList = new ArrayList<Person>();
        personArrayList.add(new Person("wcy1", 21, 181));
        personArrayList.add(new Person("wcy2", 22, 182));
        personArrayList.add(new Person("wcy3", 23, 183));
        personArrayList.add(new Person("wcy4", 24, 184));
        personArrayList.add(new Person("wcy5", 25, 185));
        Iterator<Person> personIterator = personArrayList.iterator();
        Person personheight = new Person("height", 0, 0);
        Person personlow = new Person("low", 0, 200);
        while (personIterator.hasNext())
        {
            Person person = personIterator.next();
            if(person.getHeight()>personheight.getHeight())
            {
                personheight = person;
            }
            if(person.getHeight()<personlow.getHeight())
            {
                personlow = person;
            }
        }
        System.out.println("最高的人是"+personheight.getName()+",身高"+personheight.getHeight());
        System.out.println("最矮的人是"+personlow.getName()+",身高"+personlow.getHeight());



    }
}
