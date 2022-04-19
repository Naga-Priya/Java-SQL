package com.training.mars;

public class MyClass {

	static int age;
	
	
	//public static void main(String args[]) throws MyException {
	public static void main(String args[]) {
		System.out.println("My First Java Program");
		//sysout
		
		
		//typecasting is needed while assigning large data types to smaller data types
			int intValue = 89;
		byte newByte = (byte) intValue;
		
		System.out.println("Byte Value is: "+newByte);
		
		//int age;
		
		System.out.println("Age is: "+age);
		
		Person p1 = new Person();
		p1.setHeight(170);
		p1.setWeight(80);
		System.out.println(p1.getPersonInfo());
		
		Person p2 = new Person();
//		p2.height = 120;
//		p2.weight = 75;
		
		System.out.println();
		
//		Person p1 = new Person();
//		p1.setHeight(170);
//		p1.setWeight(80);
		System.out.println(p1.getPersonInfo());
		
		System.out.println(p2.getPersonInfo());
		
//		if(p1.getWeight()>75) {
//			throw new MyException("Threshold weight reached");
//		}
		
		// instead of throwing the exception and handling it as checked exception
		// we can throw them inside try anc catch block
		
		//Lets change the threshold limit to check if finally is
		//executed when there is no exception
		//Yes: even if throw statement is not executed still finally
		//block is exceuted.
		try {
			if(p1.getWeight()>75) {
				throw new MyException("Threshold weight reached");
			}
		}
		catch(MyException e) {
			System.out.println("Weight > 75!! Invalid");
		}
		finally {
			//Thisblock will always Execute whether or npt
			// an exception occurs
			//this block can be used to perform clean up activities
			System.out.println("Perform Clean up here");
			MyException me = new MyException("New Exception");
			me.calculate();
		}
		
		}
}
/*Concepts:
Access Specifiers - public, private, protected

static: In java we need an object to access a class methods.
when we declare a method as static, we can call it without an object.
main method is static. Jvm looks for main method to start an application.

primitive vs non-primitive default values

variable - named memory location that contains data
types of variables: local / instance/ static
local - available only inside a block, have to be initialized before use
instance- available for that object, initialized to default values by Java.
static - shared across objects and is accessed without instance.

memory management - garbage collector finds unused variables and free up memory space

reference variables are treated as pointers in java

heap - objects reside in heap
stack - primitives and reference types reside here

variable name:starts with char or (_ or $), camelCase,

*/