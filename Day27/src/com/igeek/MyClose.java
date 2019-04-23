package com.igeek;

public class MyClose implements AutoCloseable {
	
	public void name() {
		System.out.println("hi~");
	}

	@Override
	public void close() throws Exception {
		System.out.println("close");
	}
	
	public static void main(String[] args) throws Exception {
		try(MyClose cls = new MyClose()){
			cls.name();
		}
	}

}
