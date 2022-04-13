package com.training.mars;

public class JavaStrings {
	
	public static void main(String[] args) {
		
		String name = "John"; //String literal
		
		String myName = "John"; //Since same literal exist myName points to same address
		
		System.out.println("Ref compare: ");
		System.out.println(name==myName);//compares references
		
		System.out.println("Val compare: ");
		System.out.println(name.equals(myName));
		
		String name1 = new String("John"); //String Obj 1
		
		String name2 = new String("John"); //String Obj 2
		
		System.out.println("Obj Ref compare: ");
		System.out.println(name1==name2); //String object's references are compared
		
		System.out.println("Obj Val compare: ");
		System.out.println(name1.equals(name2));
		
		name.concat(" Doe");
		System.out.println("After Concat: "+name);
		
		name1.concat(" Doe");
		System.out.println("After Concat: "+name1);
		
	}
	
}

/*
 * Stacks store Primitives
 * Heap is for objects
 * Heap has string literal pool or constant pool, that stores uniwue literals.
 * If to Strings have same literal, internally they have same reference.
 * 
 * String is immutable
 * */