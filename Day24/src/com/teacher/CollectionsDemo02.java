package com.teacher;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author zx
 * @date 2019年4月9日
 * @version 1.0
 * @description: public static <T> void sort(List<T> list) //排序
 *               1.排序:不管是第几个放的,只要到集合中(以Integer集合为例),就按照一定的顺序重新排列了.
 * 
 */
public class CollectionsDemo02 {

	public static void main(String[] args) {
		// 准备集合及元素
		List<Integer> list = new ArrayList<Integer>();

		list.add(2);
		list.add(7);
		list.add(6);
		list.add(10);
		list.add(9);

		System.out.println(list);
		// 将集合排好顺序(Integer数字的自然顺序是从小到大排列)
		Collections.sort(list);
		System.out.println(list);
		System.out.println("################");
		// 如果放字符串(字符串的顺序是字母排序.)
		List<String> list2 = new ArrayList<String>();

		list2.add("a");
		list2.add("d");
		list2.add("c");
		list2.add("b");
		System.out.println(list2);
		Collections.sort(list2);
		System.out.println(list2);
		//如果放Person对象(人这个自定义数据类型的对象没有比较顺序,
		//不知道什么样的人叫大,什么样的人叫小,所以人不能比较.就不能排序)
		List<Person> list3 = new ArrayList<>();
		Person p = new Person("Jack",18);
		Person p2 = new Person("Rose",20);
		Person p3 = new Person("Adda",24);
		
		list3.add(p);
		list3.add(p2);
		list3.add(p3);
		System.out.println(list3);
		
//		Collections.sort(list3);


	}

}
