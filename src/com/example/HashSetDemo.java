package com.example;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> fruits = new HashSet<>();
		
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("kiwi");
		fruits.add("pine-apple");
		fruits.add("orange");
		
		System.out.println("Fruits set : " + fruits);
		fruits.add("kiwi");
		System.out.println("Fruits set : " + fruits); // duplicate elements are not allowed
	
		System.out.println("is apple available in the set? " + fruits.contains("apple"));
		System.out.println("is papaya available in the set? " + fruits.contains("papaya"));
		
		fruits.remove("orange");
		System.out.println("fruits set after removal of elements : "+ fruits);
		
		
	}
}
