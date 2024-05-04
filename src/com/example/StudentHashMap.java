package com.example;

import java.util.HashMap;

public class StudentHashMap {
	
	public static void main(String [] args) {
		
		HashMap<Integer, Student> studentMap = new HashMap<>();
		
		Student s1 = new Student();
		s1.setId(1);
		s1.setName("shrikant");
		s1.setCourse("animation");
		Student s2 = new Student(2, "deepika", "mba");
		
		studentMap.put(1, s1);
		studentMap.put(2, s2);
		studentMap.put(3, new Student(3, "akash", "deign and drafts"));
		
		System.out.println("Student Map : " + studentMap);
		
	}
}
