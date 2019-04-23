package com.teacher;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author zx
 * @date 2019年4月9日
 * @version 1.0
 * @description:
 * public static <T> int binarySearch(List<?>list,T key)	//查找元素索引
*  二分法查找:在一个集合当中,查找一个指定元素的索引是多少,如果不存在该元素,就返回负数索引
*  二分法查询必须要求集合中的元素排好顺序

 */
public class CollectionsDemo03 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(2);
		list.add(7);
		list.add(6);
		list.add(10);
		list.add(9);
		
		System.out.println(list);
		//排好顺序
		Collections.sort(list);
		System.out.println(list);
		int index = Collections.binarySearch(list, 10);
		System.out.println(index);


	}

}
