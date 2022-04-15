package com.training.mars;

public class SavingsAccount extends Account
	implements DomesticAccount{
	
	//Inherited class should have same visibility for
	//Abstract methods
	public double getBalanceAmount() {
		return 100000;
	}
	
	//abstract class's implemented from interface is 
	// always public, we cannot reduce its visibility.
	public void getLocation() {
		System.out.println("Chennai");
	}
	

}

/* Collections ike set or list or Queue, date is stored
 * as value only but in maps, its stored as <k.v> pairs
 * 
 * set- Unique value
 * SortedSet - set values naturally sorted
 * list - list of values, can have duplicates
 * Queue
 * TreeSet is for sorted set of values
 * TreeMap is for sorted set of Mapped values, sorted based on Keys
 * 
 */
