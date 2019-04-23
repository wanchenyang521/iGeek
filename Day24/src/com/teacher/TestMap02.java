package com.teacher;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @author zx
 * @date 2019年4月9日
 * @version 1.0
 * @description:
 * 
 * 		第1种遍历方式是，使用Map集合的keySet()方法 
 * 		A:思路： 通过keySet()方法获取所有键的集合
 *                 遍历键的集合，获取到每一个键 根据键找值
 *                 
 *      用法:
*  		创建对象时,要分别制定键的泛型与值的泛型
*  
*  		Map(HashMap)的使用：创建对象时加入两个泛型。
*  		Map<k,v>
*  		key - 此映射所维护的键的类型
*  		value - 映射值的类型
*  
*  		常用方法：
*  			public V put(K key,V value)		//加入元素，则新值会覆盖掉旧值
*  			public V get(Object key)		//根据键找值
*  			public Set<K> keySet()			//返回所有键的集合
*  			public Collection<V> values()  	//返回所有值的集合
*  
*  	Map没有迭代器方法,最常用的遍历方法:先获取所有键的集合,迭代该集合,依次获取每一个键.通过键找值.
 * 
 */
public class TestMap02 {

	public static void main(String[] args) {
		// 创建集合对象
		HashMap<String, String> map = new HashMap<String, String>();

		// 向集合中添加元素
		map.put("及时雨", "宋江");
		map.put("玉麒麟", "卢俊义");
		map.put("智多星", "高俅");
		map.put("智多星", "吴用");
		
		System.out.println(map);
		
		//通过keySet()方法获取所有键的集合
		Set<String> keySet = map.keySet();
		System.out.println(keySet);
		//通过迭代器遍历
		Iterator<String> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			//通过键找值,记住这里使用map集合通过键找值
			String value = map.get(key);
			System.out.println("key:"+key+";value:"+value);
		}
		

	}

}
