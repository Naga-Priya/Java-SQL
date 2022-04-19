package com.training.mars;

import java.util.Scanner;

//Problem Statement : 
//
//Provide a code solution to calculate electricity bill payment 
//for group of consumers based on the electric consumption over 
//a period based on Java 9 code solution of array etc features. 
//
//Description: National Electricity Corporation (NEC) charges 
//monthly electricity charges based on consumption of its consumers. 
//The rate of charge is as follows: 
//
//Up to 200 units every consumer must pay flat an amount $50. 
//
//From 201 to 500 units rate is $1.25/unit. 
//
//From 501 to 1000 units’ rate is $1.00/unit. 
//
//From 1001 units and above rate is $0.75/unit. 
//
//Consumption unit must be in whole number. 
//
//The computer operator of NEC normally accepts consumer’s details 
//like consumer number, name, unit consumption in a comma(,) separate 
//String to generate bill (eg: 653,Steve Jones,754). The operator 
//normally generates bill for number of consumers at a time. So before
//starting operation, the operator asks for number of consumers’ bill 
//to prepare. All bills are stored in an array. Finally display the 
//contains of array, all decimal figures must show 2 decimal places. 
//
//If number of Units is less than 50, the application should throw 
//MinimumUnitsException and display a message “No of units can not be less than 50” 

public class CalculateBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number of bills to calculate: ");
		int batchCount = scan.nextInt();
		scan.nextLine(); // to consume \n at the end of batch number input
		
		Consumer[] billDetails = new Consumer[batchCount];
		int i=0;
		while(batchCount > 0) {
			
			System.out.println("Enter Consumer details: ");
			
			String detail = scan.nextLine();
			System.out.println();
			
			//System.out.println("Scanned: "+detail);
			String[] data = detail.split(",");
			billDetails[i] = new Consumer(Integer.parseInt(data[0].trim()),data[1],Integer.parseInt(data[2].trim()));
			//System.out.println(data[0]+"-"+data[1]+"-"+data[2]);
			
			batchCount--;
			i++;
		}
		System.out.println("Calculating...");
		if(i>0) {
			System.out.println("[Customer ID, Name\t, Units, Due Amount]");
		}
		for(Consumer consumer:billDetails) {
//			System.out.println("Name: "+consumer.name);
//			System.out.println("Id: "+consumer.consumerNumber);
//			System.out.println("units: "+consumer.unitConsumption);
//			System.out.println("Due: "+consumer.due);
			System.out.println(consumer);
			System.out.println();
		}
		
		
		scan.close();

	}

}
