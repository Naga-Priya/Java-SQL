package com.training.mars;

public class Person {
	
	private int height;
	
	private int weight;
	
	public Person() {
		System.out.println("Object created ");
	}
	
	public Person(int height,int weight) {
		
		this.setHeight(height);
		this.setWeight(weight);
		System.out.println("Object created with"
				+ "height "+this.getHeight()
				+ " weignt"+this.getWeight());
	}
	
//	public int getHeight() {
//		return this.height;
//	}
//	
//	public void setHeight(int height) {
//		this.height=height;
//	}
	
	public void setHeight(int height) {
		this.height = height;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}


	public int getHeight() {
		return height;
	}


	public int getWeight() {
		return weight;
	}


	public String getPersonInfo() {
		return "Person's height is: "+height
				+ " and weight is: "+weight;
	}

}
