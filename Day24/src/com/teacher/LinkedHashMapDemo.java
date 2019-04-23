package com.teacher;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/**
 * @author zx
 * @date 2019年4月9日
 * @version 1.0
 * @description: LinkedHashMap: Linked链表结构,保证元素有顺序 Hash结构保证元素唯一 以上约束对键起作用
 */
public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<String, String> map = new LinkedHashMap<>();

		map.put("近平", "丽媛");
		map.put("路人甲", "路人乙");
		map.put("Jack", "Rose");
		map.put("Jack", "Lily");

		System.out.println(map);

		Set<String> keySet = map.keySet();

		// 通过迭代器遍历
		/*Iterator<String> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			// 通过键找值,记住这里使用map集合通过键找值
			String value = map.get(key);
			System.out.println("key:" + key + ";value:" + value);
		}*/

		for (String key : keySet) {
			String value = map.get(key);
			System.out.println(key + ";" + value);
		}

	}

}
