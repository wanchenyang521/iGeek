package com.wanchenyang.learn;

import java.util.LinkedList;

/**
 * @author zx
 * @date 2019年4月3日
 * @version 1.0
 * @description:
 * stack栈结构:先进后出
*  
*  LinkedList是支持栈结构的.

*  	对应的方法
*  		push压栈
*  		pop弹栈
*  		peek查询出即将要弹出的是哪个元素,检查有没有要弹出的元素
*  
*  java提供了一个专门用于栈结构的类,Stack

 */
public class StackDemo {
	
	public static void main(String[] args) {
		LinkedList<String> stack = new LinkedList<String>();
		
		stack.push("Java");
		stack.push("C");
		stack.push("Oc");
		stack.push("C#");
		
		System.out.println(stack);
		
		System.out.println(stack.pop());
		
		System.out.println(stack);
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
		System.out.println("#################");
		//查询出即将要弹出的是哪个元素,检查有没有要弹出的元素
		//Retrieves, but does not remove, the head (first element) of this list.
		System.out.println(stack.peek());
		System.out.println(stack);
		
		
		
	}

}
