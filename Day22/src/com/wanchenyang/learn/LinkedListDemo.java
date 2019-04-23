package com.wanchenyang.learn;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author zx
 * @date 2019年4月3日
 * @version 1.0
 * @description:
 * 
 * LinkedList是方便添加删除的List。
*      提供了大量首尾操作
*  
*  public void addFirst(E e)	添加首个元素
*  public void addLast(E e)		添加最后元素
*  public E getFirst()			获取首个元素
*  public E getLast()			获取最后元素

 * 
 */
public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		//添加元素
		list.add("Hello");
		list.add("java");
		list.add("C");
		
		System.out.println(list);
		
		//获取元素
		System.out.println(list.get(0));
		System.out.println("############");
		//遍历
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("############");
		for (String element : list) {
			System.out.println(element);
		}
		System.out.println("############");
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("############");
		System.out.println(list.size());
		
		//添加首个元素
		list.addFirst("Python");
		System.out.println(list);
		//添加最后元素
		list.addLast("Swift");
		System.out.println(list);
		
		System.out.println(list.getFirst());
		System.out.println(list.getLast());

	}

}
