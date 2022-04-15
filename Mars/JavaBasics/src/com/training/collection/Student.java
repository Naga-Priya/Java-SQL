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
	
	
	
	
}
