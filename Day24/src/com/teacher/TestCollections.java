package com.teacher;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollections {
	
	public static void main(String[] args) {
		List<String> arrList = new ArrayList<>();
		
		for(int i =0;i<10;i++) {
			arrList.add("a"+i);
		}
		
		System.out.println(arrList);
		//shuffle();随机
		Collections.shuffle(arrList);
		System.out.println(arrList);
		//reverse();逆序
		Collections.reverse(arrList);
		System.out.println(arrList);
		//sort();排序
		Collections.sort(arrList);
		System.out.println(arrList);
		//binarySearch();二分查找
		System.out.println(Collections.binarySearch(arrList, "a6"));
		//Replaces all of the elements of the specified list with the specified element. 
		//fill():替换
		Collections.fill(arrList, "hi");
		System.out.println(arrList);
		
	}
}
