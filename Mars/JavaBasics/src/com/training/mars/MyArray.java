package com.training.mars;

import java.util.Scanner;

public class MyArray {
	
	static int[] list = new int[5];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		int i=0;
		boolean cond = true;
		while(cond) {
			System.out.println("Enter a value");
			
			try {
				list[i++]=scan.nextInt();
			} catch (ArrayIndexOutOfBoundsException e) {
				
				System.out.println(e.getMessage()); 
				System.out.println("Sorry!! Space Limit exceeded");
				cond = false;
			}
		}
		
		
		scan.close();
	}

}
