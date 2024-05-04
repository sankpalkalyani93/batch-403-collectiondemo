package com.example;

import java.util.HashSet;

public class StudentHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Student> studentSet = new HashSet<>();
		Student s1 = new Student();
		s1.setId(1);
		s1.setName("shrikant");
		s1.setCourse("animation");
		Student s2 = new Student(2, "deepika", "mba");
		
		studentSet.add(s1);
		studentSet.add(s2);
	
		studentSet.add(new Student(3, "kalyani", "information-technology"));
		
		System.out.println("Student Set: " + studentSet);
	}

}
