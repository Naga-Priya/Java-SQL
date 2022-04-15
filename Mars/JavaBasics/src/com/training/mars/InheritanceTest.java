package com.training.mars;

public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car toyota = new Car();
		
		toyota.getValues();
		
		Vehicle car2 = new Car();
		
		//This gives compilation error because at compile time
		// car2's type is Vehicle, so getValues() method is not
		// present in base class.
		//car2.getValues();
		
		//at runtime, the 'car2' object is of type child class hence
		// child's getTopSpeed() will be called
		// At runtime Java decides which class's method to use, this
		// is called Dynamic Polymorphism
		car2.getTopSpeed();
		
		Account newAcc = new SavingsAccount();
		
		System.out.println(newAcc.getBalanceAmount());
		
	}

}
