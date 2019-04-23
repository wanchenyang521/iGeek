package com.teacher;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author zx
 * @date 2019年4月9日
 * @version 1.0
 * @description:
 * Collections中有一个方法可以一次加入多个元素
	public static <T> boolean addAll(Collection<? super T> c,T... elements)
	该方法使用到了可变参数，即定义时并不知道要传入多少个实际参数。此时定义成...的方式，此时可以在调用该方法时，一次传入多个参数。传入的多个数将被自动组织成数组，我们只要操作生成的数组即可。
	注：可变参数只能放在最后定义。可变参数方法的参数本质是数组，所以不可以与数组类型参数重载。

 */
public class TestAddAll {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		
		Collections.addAll(arr, "Jack","Rose","Java");
		System.out.println(arr);
		int sum = add(1,2,3,4,5,6,7);
		System.out.println("sum:"+sum);
	}
	
	//可变参数的本质就是个数组
	public static int add(int... elements) {
		int sum = 0;
		
		for(int i=0;i<elements.length;i++) {
			sum += elements[i];
		}
		
		return sum;
	}

}
