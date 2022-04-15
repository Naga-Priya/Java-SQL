package com.training.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UniqueCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student Anitha = new Student ("Anitha", 12,"B");
		Student Arthi = new Student ("Arthi", 14,"B");
		Student Anitha1 = new Student ("Anitha", 21,"B");
		Student Banu = new Student ("Banu", 1,"B");
		
		Set<Student> studentRoll = new HashSet<>();
		studentRoll.add(Banu);
		studentRoll.add(Anitha);
		studentRoll.add(Arthi);
		studentRoll.add(Anitha1);
		
		//Sort will not accept set as input as we have tree set to do the same.
		//Collections.sort(studentRoll);
		for(Student student:studentRoll) {
			System.out.println(student.getName());
		}
		
		Set<Student> studentTM = new TreeSet<>();
		studentTM.add(Banu);
		studentTM.add(Arthi);
		studentTM.add(Anitha);
		
		for(Student student:studentTM) {
			System.out.println(student.getName()+" "+
					student.getRollNo());
		}
		
		List<Student> NameList = new ArrayList<>();
		NameList.add(Banu);
		NameList.add(Anitha);
		NameList.add(Arthi);
		NameList.add(Anitha1);
		
		Collections.sort(NameList, new NameComparator());
		System.out.println("Sorted Collection");
		System.out.println("-----------------");
		//Sort will not accept set as input as we have tree set to do the same.
		//Collections.sort(studentRoll);
		for(Student student:NameList) {
			System.out.println(student.getName());
		}

	}

}
