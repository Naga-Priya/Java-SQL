package com.training.java8;

import java.util.function.Function;

public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function method=(a)-> {int b= 5+(int)a; return b;};
		
		int result = (int)method.apply(2);
		
		System.out.println(result);
	}

}

/*
* We have an interface but we are not implementing it in any classes
* instead we use Lambda expression
* 
* stream 
* map
*/