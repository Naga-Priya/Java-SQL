package com.training.collection;

import java.util.Objects;

public class Student {

	private String name;
	private int rollNo;
	private String grade;
	
	public Student(String name, int rollNo, String grade) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(grade, name, rollNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Student))
			return false;
		Student other = (Student) obj;
		return Objects.equals(grade, other.grade) && Objects.equals(name, other.name) && rollNo == other.rollNo;
	}
	
//When a class "implements Comparable", It has to override CompareTo
//function. but these  implementation makes the class bulkier.
//we can move these comparision out side the class by crating new
//class called "Name comparator" that implements "Comparable" and
// lets implement the comparison there. To sort, we can pass an object
// of this "Name comparator" class
	
// implements Comparable<Student>
//	@Override
//	public int compareTo(Student o) {
//		
//		return this.getName().compareTo(o.getName());
//		
//		//Student other = (Student)o;
////		this.getName().compareTo(o.getName());
////		return 0;
//		
////		if(this.getRollNo() > o.getRollNo()) {
////			return 1;
////		}
////		else if(this.getRollNo() < o.getRollNo()) {
////			return -1;
////		}
////		else {
////			return 0;
////		}
//	}
	
	
}

//Add JDBC driver to class path. This driver library will reside in local memory. Also it has to be moved to productino environment/
//To avoid errors during deployment, we can use tool to download jar files and add to class path

