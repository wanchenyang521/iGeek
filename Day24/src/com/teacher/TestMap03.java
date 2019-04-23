package com.teacher;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author zx
 * @date 2019年4月9日
 * @version 1.0
 * @description:
 * 
 * Map集合的第二种遍历方式:
*  
*  		Set<Map.Entry<K,V>> entrySet()    方法用于返回某个集合所有的键值对对象。
*  		Entry将键值对对应关系封装成了对象。可以从一个Entry对象中中获取一个键值对的键与值。
*  
*  		Map.Entry是一个内部接口
*  
*  		Entry中的方法如下：
*  			K getKey()		获取键
*  			V getValue()	获取值

 */
public class TestMap03 {

	public static void main(String[] args) {
		//创建集合对象
		HashMap<String, String> map = new HashMap<String, String>();
			
		//向集合中添加元素
		map.put("及时雨", "宋江");
		map.put("玉麒麟", "卢俊义");
		map.put("智多星", "吴用");
		
		Set<Entry<String, String>> entrySet = map.entrySet();
		
		for(Entry<String, String> entry : entrySet) {
			//获取键值
			String key = entry.getKey();
			//获取value
			String value = entry.getValue();
			System.out.println(key+";"+value);
		}


	}

}
