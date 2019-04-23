package com.wanchenyang.learn;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-01 08:47
 * @description
 **/
public class TestGeneric
{
    public static void main(String[] args)
    {
//        MyCollection myCollection = new MyCollection();
//        myCollection.setE("wcy", 0);
//        myCollection.setE(true, 1);
//        myCollection.setE(12, 2);
//        myCollection.setE('v', 3);
//        myCollection.setE(12.3, 4);
//        Object i0 =myCollection.getObject(0);
//        Object i1 =myCollection.getObject(1);
//        Object i2 =myCollection.getObject(2);
//        Object i3 =myCollection.getObject(3);
//        Object i4 =myCollection.getObject(4);n
////        Integer i2 = (Integer) myCollection.getObject(2);
//        System.out.println(i0);
//        System.out.println(i1);
////        System.out.println(i2);
//        System.out.println(i3);
//        System.out.println(i4);


        MyCollection<String> stringMyCollection = new MyCollection<String>();
        stringMyCollection.setE("qq0", 0);
        stringMyCollection.setE("qq1", 1);
        stringMyCollection.setE("qq2", 2);
        stringMyCollection.setE("qq3", 3);
//        stringMyCollection.setE(12, 4);
        System.out.println(stringMyCollection.getE(0));
        System.out.println(stringMyCollection.getE(1));
        System.out.println(stringMyCollection.getE(2));
        System.out.println(stringMyCollection.getE(3));




    }
}
//
//class MyCollection
//{
//    Object[] objects = new Object[5];
//
//    public void setObjects(Object object,int index)
//    {
//        objects[index] = object;
//    }
//
//    public Object getObject(int index)
//    {
//        return objects[index];
//    }
//}

class MyCollection<E>
{
    Object[] objects = new Object[5];

    public void setE(E object,int index)
    {
        objects[index] = object;
    }

    public E getE(int index)
    {
        return (E) objects[index];
    }
}
