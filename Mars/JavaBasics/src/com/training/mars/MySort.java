package com.training.mars;

import java.util.Scanner;

public class MySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number of inputs: ");
		
		int size = scanner.nextInt();
		
		int[] input = new int[size];
		
		int index = 0;
		
		while(index<size) {
			
			System.out.println("Enter Value: ");
			input[index++] = scanner.nextInt();
		}
		
		System.out.println("Input is: ");
		for(int value:input) {
			System.out.print(value+", ");
		}
		
		index = 0;
		for (int i=0; i<size-1;i++) {
			
			int high = input[0];
			for(int j=1;j<size-index;j++) {
				if(input[j]>high) {
					high = input[j];
					
				}
				else {
					//int low = input[j];
					input[j-1] = input[j];
					input[j] = high;
				}
			}
			index++;
		}
		
		/*
		 * 3,6,2,1
		 * 3,6 - 6,2 - 6,1: 3,<2,6>1 : 3,2<1,6>
		 * 
		 */
		
		System.out.println("Output: ");
		for(int value:input) {
			System.out.print(value+", ");
		}
		
		scanner.close();

	}

}
