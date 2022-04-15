package com.training.mars;

public class Car extends Vehicle{
	
	public Car() {
		System.out.println("Car Constructed");
	}
	static int noOfWheels;
	
	public void getValues() {
		braketype = "Disk";
		speed = 150;
		color = "Blue";
		//getTopSpeed();
	}
	
	@Override
	void getTopSpeed() {
		System.out.println("Car's top Speed");
	}

}
