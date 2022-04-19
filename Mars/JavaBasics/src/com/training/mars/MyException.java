package com.training.mars;

public class MyException extends Exception{
	
	static int x = 0;
	int y = 0;
	public MyException(String str) {
		super(str);
		System.out.println(x+": In constructor");
	}
	protected void calculate() {
		System.out.println("Protected function");
	}
	
//	public static void add () {
	//Static methods cannot refer to non-static variables
//		System.out.println(x+y);
//	}

}
