package com.wanchenyang.learn;

import java.util.LinkedList;

/**
 * @author zx
 * @date 2019年4月3日
 * @version 1.0
 * @description:
 * queue队列结构:先进先出
* 
* 	LinkedList是支持队列结构的
* 
* 	对应的方法
* 		offer加入队列
* 		poll离开队列
* 		peek查询出即将要离开队列的是哪个元素,检查有没有要离开队列的元素
 */
public class QueueDemo {

	public static void main(String[] args) {
		LinkedList<String> queqe = new LinkedList<String>();
		
		queqe.offer("Java");
		queqe.offer("Python");
		queqe.offer("PHP");
		
		System.out.println(queqe);
		
		String name = queqe.poll();
		System.out.println(name);
		System.out.println(queqe);
		
		System.out.println(queqe.peek());

	}

}
