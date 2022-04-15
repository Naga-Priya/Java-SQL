package com.training.mars;

public abstract class Account {
	
	
	
	//Abstract methods in base class can only be
	// oublic or protected 
	public abstract double getBalanceAmount() ;

	public String accountType() {
		return "Savings";
	}

}
