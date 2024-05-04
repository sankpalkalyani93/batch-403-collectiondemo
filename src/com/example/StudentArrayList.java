package com.example;

import java.util.ArrayList;

public class StudentArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> studentsList = new ArrayList<>();
		studentsList.add(new Student(1, "akash", "mechanical"));
		studentsList.add(new Student(2, "shrikant", "animation"));
		Student s1 = new Student();
		s1.setId(3);
		s1.setName("deepika");
		s1.setCourse("mba");
		studentsList.add(s1);
		
		System.out.println("Student List : " + studentsList);
	}

}
