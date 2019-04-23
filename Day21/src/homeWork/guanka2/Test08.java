package homeWork.guanka2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-02 09:23
 * @description
 **/
public class Test08
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
        while (personIterator.hasNext())
        {
            Person person = personIterator.next();
            person.setAge(person.getAge()+2);
        }
        for (Person person:
                personArrayList)
        {
            System.out.println(person.toString());
        }
    }
}
