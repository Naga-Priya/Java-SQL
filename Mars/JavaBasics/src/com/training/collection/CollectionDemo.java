package com.training.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> values = new HashSet<>();
		
		List<String> names = new ArrayList<>();
		
		values.add(2);
		values.add(6);
		values.add(8);
		values.add(3);
		values.add(2);
		
		System.out.println(values);
		
		for(int num: values) {
			System.out.println(num);
		}
		
		names.add("Apple");
		names.add("Orange");
		names.add("Strawberry");
		
		System.out.println(names);
		
		for(String name: names) {
			System.out.println(name);
		}
		
		Student Anitha = new Student ("Anitha", 1,"B");
		Student Anu = new Student ("Anu", 1,"A");
		Student Banu = new Student ("Banu", 1,"B");
		Student Durga = new Student ("Durga", 1,"A");
		
		List <Student> studentList = new ArrayList<Student>();
		
		studentList.add(Anitha);
		studentList.add(Anu);
		studentList.add(Banu);
		studentList.add(Durga);
		
		for(Student obj:studentList) {
			System.out.println(obj.getName());
		}
		
		Map <String,Student> studentRoll = new HashMap<>();
		studentRoll.put("Anitha", Anitha);
		studentRoll.put("Anu", Anu);
		studentRoll.put("Banu",Banu);
		studentRoll.put("Durga",Durga);
		
		System.out.println(studentRoll);
		

//What are the changes need to be done
//in order to let java consider 
//two objects same if their content is same
		
	}

}
