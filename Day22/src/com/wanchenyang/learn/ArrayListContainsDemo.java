package com.wanchenyang.learn;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author zx
 * @date 2019年4月3日
 * @version 1.0
 * @description:
 * 
 * ArrayList中contains方法
 * 
 */
public class ArrayListContainsDemo {

	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		ArrayList<String> list2 = new ArrayList<String>();
		
		HashSet<Person> list3 = new HashSet<Person>();
		
		list2.add("戴宗一");
		list2.add("张恒");
		list2.add("陈哲");
		
		System.out.println(list2);
		System.out.println(list2.contains("陈哲"));
		
		
		//添加数据
		Person p1 = new Person("王博", 20);
		Person p2 = new Person("李子贤", 20);
		Person p3 = new Person("张金虎", 18);
				
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		list3.add(p1);
		list3.add(p2);
		list3.add(p3);
		list3.add(new Person("张金虎", 18));
		System.out.println("list3:"+list3);
		
		//System.out.println(list.contains(new Person("张金虎", 20)));
		

	}

}
