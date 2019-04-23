package com.wanchenyang.learn;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author zx
 * @date 2019年4月3日
 * @version 1.0
 * @description:
 * 
 *  HashSet，不包含重复元素相同元素，且无序，
 *       不提供索引，所以不能通过索引获取元素，只能通过迭代器访问数据。
 */
public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		//添加
		set.add("C");
		set.add("Java");
		set.add("C++");
		set.add("javascript");
		set.add("python");
		set.add("mysql");
		set.add("java");
		set.add("java");
		set.add("java");

		System.out.println(set);
		
		System.out.println("##########");
		//借助迭代器遍历HashSet
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}
		
		System.out.println("##########");
		//借助foreach循坏遍历
		for(String name : set) {
			System.out.println(name);
		}
		

	}

}
