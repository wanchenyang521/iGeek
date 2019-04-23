package com.teacher;

import java.util.Arrays;
import java.util.List;

/**
 * @author zx
 * @date 2019年4月9日
 * @version 1.0
 * @description:数组转集合
 * public static <T> List<T> asList(T... a)
 */
public class ArrayToCollection {

	public static void main(String[] args) {
		 //public static <T> List<T> asList(T... a)
	     List<String> stooges = Arrays.asList("Larry", "Moe", "Curly");
	     System.out.println(stooges);
	     //java.lang.UnsupportedOperationException
	     //数组转成集合之后，该集合不支持添加或者删除操作，否则会抛出
//	     stooges.add("Hi");
	     System.out.println(stooges);


	}

}
