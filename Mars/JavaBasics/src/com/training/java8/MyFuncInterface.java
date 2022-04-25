package com.training.java8;

@FunctionalInterface
public interface MyFuncInterface {
	// A functional interface should always contain 
	// only one abstract method
	public int getValue(int a);
}
