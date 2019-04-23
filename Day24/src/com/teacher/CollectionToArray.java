package com.teacher;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zx
 * @date 2019年4月9日
 * @version 1.0
 * @description:
 * 	集合ArrayList转数组使用的是，ArrayList中的toArray()方法。
	该方法是重载的方法：
	public Object[] toArray()
	public <T> T[] toArray(T[] a)
 */
public class CollectionToArray {

	public static void main(String[] args) {
		List<Integer>list = new ArrayList<Integer>();
		
		list.add(2);
		list.add(7);
		list.add(6);
		list.add(10);
		list.add(9);
		
		//集合转成对象数组
		Object[] objectArr = list.toArray();
		System.out.println(objectArr);
		
		Integer object = (Integer)objectArr[0];
		System.out.println(object.intValue());
		
		//如果参数数组足够放下集合中所有元素,就放入参数数组中,返回参数数组
		//如果参数数组无法放下集合中所有元素,则参数数组只起到确定类型作用,方法逻辑会自动创建新数组存储集合内容,并返回.
		Integer[] newArr = new Integer[2];
		Integer[] integerArr = list.toArray(newArr);
		System.out.println(integerArr);
		
		Integer i = integerArr[0];


	}

}
