package com.training.mars;

import java.util.Scanner;



/**
 * @author rajarambalakrishnan
 *
 */
public class BasicsDemo {
	
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
//		System.out.println("Enter Age: ");
//		int age = scanner.nextInt();
//		
//		System.out.println("Enter your name: ");
//		
//		String name = scanner.next();
//		
//		if(age <18) {
//			System.out.println(name+", You are not eligible to vote!");
//		}
//		else {
//			System.out.println(name+", You are eligible to vote!");
//		}
		
		//LuckyNumberGuess(scanner);
		//pattern(5);
		//newpattern(5);
		
		//int num[][] = { {1,2,3,4},{5,6},{7,8,9}};
		
		//Declare-B
		int num[][] = new int[3][4];
		//int num1[][] = { {1,2,3,4},{5,6},{7,8,9}};
		//num = num1;
		
		/*for (int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				System.out.println("[][]"+i+"-"+j+" is "+num[i][j]);
			}
		}
		
		System.out.println("[1][3] is "+num[1][3]);
		*/
		
		int[] arr = new int[6];
		
		for(int i=0;i<6;i++) {
			System.out.println("Enter a value: ");
			arr[i]=scanner.nextInt();
		}
		
		oddEven(arr);
		scanner.close();
	}
	
	public static void oddEven(int[] arr) {
		
		int odd=0, even = 0;
		for(int val:arr) {
			if((val%2)==0) {
				even ++;
			}
			else
				odd++;
		}
		System.out.println("No. of odd No: "
				+odd+ "No. of Even No: "+even);
	}
	
	public static void newpattern(int n) {
		int i=1;
		int val =1;
		for(;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(val+"\t");
				val++;
			}
			System.out.println();
		}
	}
	
	public static void pattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+"\t");
			}
			System.out.println();
		}
	}
	
	
	
	public static void LuckyNumberGuess(Scanner scanner) {
		int attempts = 0;
		
		double rand = Math.random();
		
		int luckyNo = (int) Math.ceil(rand*10);
		
		boolean found = false;
		
		do {
			System.out.println("Enter Your Guess: ");
			int ip = scanner.nextInt();
			
			if(ip == luckyNo) {
				attempts++;
				found = true;
				System.out.println ("You found the lucky number in "+ attempts +" attempts!");
				break;
				
			}
			else {
				attempts++;
				System.out.println("Try again");
			}
		}while(false == found);
	}
}
