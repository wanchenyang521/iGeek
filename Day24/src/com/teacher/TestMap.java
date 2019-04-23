package com.teacher;

import java.util.HashMap;

/**
 * @author zx
 * @date 2019年4月9日
 * @version 1.0
 * @description:
 * 
 * Map:双列集合,每个元素分为键与值两部分,是一个键值得对应关系.我们经常使用键找值
* 
* 	最常用的Map集合是HashMap:键是唯一的且无序
* 
* 	用法:
* 		put(key, value);
* 		get(key);  

 */
public class TestMap {

	public static void main(String[] args) {
		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("name", "陈哲");
		hashMap.put("年龄", "20");
		hashMap.put("性别", "男");
		hashMap.put("name","王博");
		
		System.out.println(hashMap);
		String name = hashMap.get("name");
		System.out.println(name);
		

	}

}
