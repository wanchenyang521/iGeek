package com.teacher;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author zx
 * @date 2019年4月9日
 * @version 1.0
 * @description:
 * Collections:集合工具类,包含了众多集合的方法
*  
*  public static void shuffle(List<?> list)				//打乱元素顺序
*   
*  	有顺序(有序):第一个元素是多少,第二个元素是多少,第几个元素对应的是第几,顺序不变.
*  	排序:不管是第几个放的,只要到集合中(以Integer集合为例),就按照一定的顺序重新排列了.

 */
public class CollectionsDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		list.add(2);
		list.add(7);
		list.add(6);
		list.add(10);
		list.add(9);
		
		System.out.println(list);
		Collections.shuffle(list);
		System.out.println(list);

		

	}

}
