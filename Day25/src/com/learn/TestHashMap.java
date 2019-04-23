package com.learn;

public class TestHashMap {
	
	Node[] table;	//位桶数组
	int size;		//存放键值对的个数
	
	static final int DEFAULT_INITIAL_CAPACITY = 1 << 4;
	
	public TestHashMap() {
		table = new Node[DEFAULT_INITIAL_CAPACITY];
	}
	
	public void put(Object key,Object value) {
		
		//数组扩容
		
		Node newNode = new Node();
		newNode.hash = myHash(key.hashCode(), table.length);
		newNode.key = key;
		newNode.value = value;
		newNode.next = null;
		
		Node temp = table[newNode.hash];
		
		Node iterLast = null;//遍历到的最后一个结点
		boolean keyRepeat = false;
		
		if(temp == null) {
			//此处数据元素的空的，就把新节点放进去
			table[newNode.hash] = newNode;
		}else {
			
			//此处数据元素是非空的，遍历链表
			while(temp != null) {
				
				//key重复，覆盖值
				if(temp.key.equals(key)) {
					keyRepeat = true;
					temp.value = value;
					break;
				}else {
					//key不重复，查找下一个结点
					iterLast = temp;
					temp = temp.next;
				}
			}
			//没有重复key,添加到链表的最后
			if(!keyRepeat) {
				iterLast.next = newNode;
			}
			
			
		}
		size++;
		
	}
	
	public Object get(Object key) {
		int hash = myHash(key.hashCode(), table.length);
		Object value = null;
		if(table[hash] != null) {
			Node temp = table[hash];
			while(temp != null) {
				//如果key相等的，就是需要的键值对，返回相应的value
				if(temp.key.equals(key)) {
					value = temp.value;
					break;
				}else {
					temp = temp.next;
				}
			}
		}
		return value;
	}
	
	public int size() {
        return size;
    }
	
	@Override
	public String toString() {
		//[]
		StringBuilder sb = new StringBuilder("[");
		//遍历table
		for (int i = 0; i < table.length; i++) {
			Node node = table[i];
			//遍历链表
			while(node != null) {
				sb.append(node.key+":"+node.value+",");
				node = node.next;
			}
		}
		sb.setCharAt(sb.length()-1, ']');
		return sb.toString();
	}
	
	public static void main(String[] args) {
		TestHashMap hashMap = new TestHashMap();
		hashMap.put(10, "aa");
		hashMap.put(20, "bb");
		hashMap.put(30, "cc");
		hashMap.put(20, "dddd");
		hashMap.put(53, "eeee");
		hashMap.put(69, "ffff");
		hashMap.put(85, "gggg");
		
		System.out.println(hashMap);
		
		System.out.println(hashMap.get(20));
		
		System.out.println(hashMap.size());
		
	}
	
	public static int myHash(int v,int length) {
		return v%length;
	}
	
	

}
