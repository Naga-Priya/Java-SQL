package com.training.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create list of numbers
		List<Integer> numbers = Arrays.asList(2,4,3,8,6);
		
		//Create Stream on our list collection
		Stream<Integer> numberStream = numbers.stream();
		
		//call map on list entries
		Stream<Integer> squaredStream = numberStream.map((a)->a*(a));

		List<Integer> updatedNumbers = squaredStream.collect(Collectors.toList());
	
		
		List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());
		
		List<Integer> sortedSqNumbers = numbers.stream().map(a->a*a).sorted().collect(Collectors.toList());
		
		numbers.stream().filter(x-> (x%2==0) ).forEach(System.out::println);
		
		int sumEven = numbers.stream().filter(x-> (x%2==0) ).reduce(0,(ans,y)->ans+y);
		
		System.out.println(sortedNumbers);
		System.out.println(updatedNumbers);
		System.out.println(sortedSqNumbers);
		System.out.println(sumEven);
		
		/* String collections*/
		List<String> Names = Arrays.asList("John Joe","Steve Jobs","D Trump");
		
		//Create Stream on our list collection
		Stream<String> stringStream = Names.stream();
		
		//call map on name string and convert case
		Stream<String> capsStream = stringStream.map((a)->a.toUpperCase());

		List<String> output = capsStream.collect(Collectors.toList());
		
		System.out.println(output);
		
		//Stream<String> sortStream = stringStream.sorted();
		
		
		output =Names.stream().sorted().collect(Collectors.toList());
		//output = sortStream.collect(sortStream.toList());
		
		System.out.println(output);
				
		
		Names.stream().filter(x-> (x.contains("o")) ).forEach(System.out::println);
		
		String concatedOutput = Names.stream().filter(x-> (x.contains("o")) ).reduce("",(ans,y)->ans+y);
		
		System.out.println(concatedOutput);
				
		//for(String str:Names) System.out.println(str);
		
	}

}

/*
* convert array to list using asList();
* 
*Intermediate Operation:map,filter,sorted
*
*Terminal Operation: collect, forEach,reduce
*
*Autoboxing: java automatically converts Generic types like Integer to primitive type int.
*
*/