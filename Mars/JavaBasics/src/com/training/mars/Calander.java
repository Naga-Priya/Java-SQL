package com.training.mars;

import java.util.Scanner;

public class Calander {
	
	public static void main(String args[]) {
		
		int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		String[] monthNames = {"January",
								"February",
								"March",
								"April",
								"May",
								"June",
								"July",
								"August",
								"September",
								"October",
								"November",
								"December"
							};
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Input a number month: ");
		int month= scanner.nextInt();
		
		System.out.println("Input a Year: ");
		int year= scanner.nextInt();
		
		if(month!=2) {
			System.out.println(monthNames[month-1] +" "+year+ " has "+days[month-1]+" days!");
		}
		else {
			if((year%4)==0) {
				if((year%100)==0&&(year%400)!=0) {
					//Special case: Century years 1700 and 1900 are not leap years
					System.out.println(monthNames[month-1] +" "+year+ " has 28 days!");
				}
				else {
					//leap year
					System.out.println(monthNames[month-1] +" "+year+ " has 29 days!");
				}
			}
			else {
				System.out.println(monthNames[month-1] +" "+year+ " has 28 days!");
			}
		}
		
		scanner.close();
		
	}

}

/*//Concepts
 * 1. Arrays in Java are fixed size, Java script arrays are dynamic
 * int[] days = {31,28,31,30,31,30,31,31,30,31,30,31}; //java
 * 
 * int days = [31,28,31,30,31,30,31,31,30,31,30,31]; //java script
 * 
 * 2. using new operator to create an array in Java script will introduce holes.
 * Java prefers declaration using new operator when size is known but data is unknown.
 * 
 * 3. for each in and of are two variant in java script
 * java has only one variant, for each
 * 
 * 4. using for each is faster, using traditional for loop gives control
 * 
 * 
 * Take N no of int values from users and sort them in ascending order and display them
 * 
 * 
 * 
 * */
