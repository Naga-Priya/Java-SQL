package com.training.mars;

public class Vehicle {
	
	public Vehicle() {
		System.out.println("Vehicle Constructed");
	}
	
	String braketype ;
	int speed ;
	String color ;
	String make;
	String model;
	
	
	void getTopSpeed() {
		System.out.println("Top speed is "+speed);
	}

}
