package com.training.collection;

import java.util.HashSet;
import java.util.Set;

public class UniqueCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student Anitha = new Student ("Anitha", 1,"B");
		Student Arthi = new Student ("Arthi", 1,"B");
		Student Anitha1 = new Student ("Anitha", 1,"B");
		
		Set<Student> studentRoll = new HashSet<>();
		studentRoll.add(Anitha);
		studentRoll.add(Arthi);
		studentRoll.add(Anitha1);
		
		for(Student student:studentRoll) {
			System.out.println(student.getName());
		}

	}

}
