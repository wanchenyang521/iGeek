package com.wanchenyang.learn;

import java.util.HashSet;

/**
 * @author zx
 * @date 2019年4月3日
 * @version 1.0
 * @description:
 * 	求一个字符串"aiodjl;hriWFUADJSVUEHiowfjnivowe"
 * 	中一共有几个不重复的字母,区分大小写,如a,A算两个字符
* 
* 	分析：
* 		将字符串拆分成一个个单个字符
* 		判断字符是否为字母
* 		如果是字母,放到一个HashSet集合中
* 		查看集合长度
 */
public class HashSetTest {

	public static void main(String[] args) {
//		String s = "aiodjl;hriWFUADJSVUEHiowfjnivowe";
		String s = "abcdefgABCabcdefg23;";
		
		char[] charArray = s.toCharArray();
		HashSet<Character> set = new HashSet<Character>();
		
		for(char ch : charArray) {
			if( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') ) {
				//若果是字母，添加到集合中去
				set.add(ch);
			}
			
		}
		
		System.out.println("共有几个不重复的字母:"+set.size());
		

	}

}
