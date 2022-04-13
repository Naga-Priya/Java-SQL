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
				//leap year
				System.out.println(monthNames[month-1] +" "+year+ " has 29 days!");
			}
			else {
				System.out.println(monthNames[month-1] +" "+year+ " has 28 days!");
			}
		}
		
		scanner.close();
		
	}

}
